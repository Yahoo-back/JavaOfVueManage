package com.hyy.ifm.service.impl;

import com.github.pagehelper.PageHelper;
import com.hyy.ifm.common.api.CommonResult;
import com.hyy.ifm.common.utils.JwtTokenUtil;
import com.hyy.ifm.common.utils.StringUtil;
import com.hyy.ifm.common.utils.UserUtils;
import com.hyy.ifm.dao.UmsAdminRoleRelationDao;
import com.hyy.ifm.dao.UserDao;
import com.hyy.ifm.dto.UserManageParam;
import com.hyy.ifm.dto.UserParam;
import com.hyy.ifm.mbg.mapper.IfmSysLoginMapper;
import com.hyy.ifm.mbg.mapper.IfmSysUserMapper;
import com.hyy.ifm.mbg.mapper.IfmSysUserOperateMapper;
import com.hyy.ifm.mbg.model.*;
import com.hyy.ifm.service.UmsAdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * UmsAdminService实现类
 * Created by macro on 2018/4/26.
 */
@Service
public class UmsAdminServiceImpl implements UmsAdminService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UmsAdminServiceImpl.class);
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Value("${jwt.tokenHead}")
    private String tokenHead;
    @Autowired
    private IfmSysLoginMapper ifmSysLoginMapper;
    @Autowired
    private UmsAdminRoleRelationDao adminRoleRelationDao;
    @Autowired
    private IfmSysUserMapper ifmSysUserMapper;
    @Autowired
    private IfmSysUserOperateMapper ifmSysUserOperateMapper;
    @Autowired
    private UserDao userDao;

    @Override
    public IfmSysLogin getAdminByUsername(String username) {
        IfmSysLoginExample example = new IfmSysLoginExample();
        example.createCriteria().andUserCodeEqualTo(username);
        List<IfmSysLogin> adminList = ifmSysLoginMapper.selectByExample(example);
        if (adminList != null && adminList.size() > 0) {
            return adminList.get(0);
        }
        return null;
    }

    @Override
    public IfmSysUser fetchUserByLngid(String loginId) {
        IfmSysUserExample example = new IfmSysUserExample();
        example.createCriteria().andLgnIdEqualTo(loginId);
        List<IfmSysUser> ifmSysUser = ifmSysUserMapper.selectByExample(example);
        if (ifmSysUser != null && ifmSysUser.size() > 0) {
            return ifmSysUser.get(0);
        }
        return null;
    }

    @Override
    public IfmSysLogin register(IfmSysLogin ifmSysLogin) {
        IfmSysLogin umsAdmin = new IfmSysLogin();
        BeanUtils.copyProperties(ifmSysLogin, umsAdmin);
        umsAdmin.setRegisterDate(new Date());
        //查询是否有相同用户名的用户
        IfmSysLoginExample example = new IfmSysLoginExample();
        example.createCriteria().andUserCodeEqualTo(umsAdmin.getUserCode());
        List<IfmSysLogin> umsAdminList = ifmSysLoginMapper.selectByExample(example);
        if (umsAdminList.size() > 0) {
            return null;
        }
        //将密码进行加密操作
        String encodePassword = passwordEncoder.encode(umsAdmin.getPassword());
        umsAdmin.setPassword(encodePassword);
        ifmSysLoginMapper.insert(umsAdmin);
        return umsAdmin;
    }

    @Override
    public String login(String username, String password) {
        String token = null;
        try {
            UserDetails userDetails = userDetailsService.loadUserByUsername(username);
            if (!StringUtil.MD5(password).equals(userDetails.getPassword())) {
                throw new BadCredentialsException("密码不正确");
            }
            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);
            token = jwtTokenUtil.generateToken(userDetails);
        } catch (AuthenticationException e) {
            LOGGER.warn("登录异常:{}", e.getMessage());
        }
        return token;
    }

    @Override
    public List<IfmSysMuen> getPermissionList(Long userId) {
        return adminRoleRelationDao.getPermissionList(userId);
    }

    @Override
    public List<Map<String,Object>> qryUserList(UserManageParam user, Integer pageSize,Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        return adminRoleRelationDao.qryUserList(user);
    }

    @Override
    public Map<String,Object> qryUserByLgnId(Long userId) {
        IfmSysLogin login = ifmSysLoginMapper.selectByPrimaryKey(userId.intValue());
        IfmSysUser user = fetchUserByLngid(userId.toString());
        Map<String, Object> tokenMap = new HashMap<>();
        tokenMap.put("login", login);
        tokenMap.put("user", user);
        return tokenMap;
    }

    @Override
    public int updateUserStatus(Integer id, String status) {
        IfmSysUser user = fetchUserByLngid(id.toString());
        user.setStatus(status);
        int count = ifmSysUserMapper.updateByPrimaryKeySelective(user);

        IfmSysUserOperate ifmUserOperate = new IfmSysUserOperate();
        ifmUserOperate.setIfmUserId(UserUtils.getCurrentHr().getUserid());
        ifmUserOperate.setAddress(UserUtils.getCurrentHr().getAddress());
        ifmUserOperate.setOperateDate(new Date());
        ifmUserOperate.setOperate("更新人员状态");
        ifmSysUserOperateMapper.insertSelective(ifmUserOperate);

        return count;
    }

    @Override
    public CommonResult saveUser(UserParam user) {
        int count;
        boolean f = "".equals(user.getId()) ? true : false;
        IfmSysLoginExample example = new IfmSysLoginExample();
        IfmSysLoginExample.Criteria criteria = example.createCriteria();
        criteria.andUserCodeEqualTo(user.getUserCode());
        if(!f) {
            criteria.andUserCodeEqualTo(user.getUserCode()).andLgnidNotEqualTo(StringUtil.parseInt(user.getId()));
        }
        List<IfmSysLogin> temp = ifmSysLoginMapper.selectByExample(example);
        if(null != temp && temp.size() > 0) {
            return CommonResult.failed("该用户名已经被使用，建议使用姓名拼音，若有重复后面加数字区分");
        }

        IfmSysLogin login = new IfmSysLogin();
        login.setRegisterDate(new Date());
        login.setUserCode(StringUtil.nvl(user.getUserCode()));

        IfmSysUserOperate ifmUserOperate = new IfmSysUserOperate();
        ifmUserOperate.setIfmUserId(UserUtils.getCurrentHr().getUserid());
        ifmUserOperate.setAddress(UserUtils.getCurrentHr().getAddress());

        if (f) {
            login.setPassword(StringUtil.MD5("123456"));
            ifmSysLoginMapper.insertSelective(login);

            ifmUserOperate.setOperateDate(new Date());
            ifmUserOperate.setOperate("添加用户");
            ifmSysUserOperateMapper.insertSelective(ifmUserOperate);
        } else {
            int appr_id = StringUtil.parseInt(user.getId());
            IfmSysLogin log = ifmSysLoginMapper.selectByPrimaryKey(StringUtil.parseInt(user.getId()));
            login.setPassword(log.getPassword());
            login.setLgnid(appr_id);
            ifmSysLoginMapper.updateByPrimaryKeySelective(login);

            ifmUserOperate.setOperateDate(new Date());
            ifmUserOperate.setOperate("更新用户");
            ifmSysUserOperateMapper.insertSelective(ifmUserOperate);
        }
        IfmSysUser sysUser = new IfmSysUser();
        sysUser.setCompanyEmail(StringUtil.nvl(user.getCompanyEmail()));
        sysUser.setCreatDate(new Date());
        sysUser.setIdentityCard(StringUtil.nvl(user.getIdentityCard()));
        sysUser.setLiveAddr(StringUtil.nvl(user.getLiveAddr()));
        sysUser.setLgnId(login.getLgnid() + "");
        sysUser.setPersonalEmail(StringUtil.nvl(user.getPersonalEmail()));
        sysUser.setPhone(StringUtil.nvl(user.getPhone()));
        sysUser.setDegree(StringUtil.nvl(user.getDegree()));
        sysUser.setUserName(StringUtil.nvl(user.getUserName()));
        sysUser.setSex(StringUtil.nvl(user.getSex()));
        sysUser.setJobNum(StringUtil.nvl(user.getJobNum()));
        sysUser.setOnjobdate(user.getOnjobDate());
        sysUser.setQq(user.getQq());
        sysUser.setWeixin(user.getWeixin());
        IfmSysUser iuser = fetchUserByLngid(login.getLgnid() + "");
        if (null != iuser) {
            sysUser.setStatus(StringUtil.nvl(iuser.getStatus()));
            sysUser.setUserid(StringUtil.parseInt(iuser.getUserid()));
            ifmSysUserMapper.updateByPrimaryKeySelective(sysUser);
        }else {
            sysUser.setStatus("2");
            ifmSysUserMapper.insertSelective(sysUser);
        }
        count = 1;
        return CommonResult.success(count);
    }

    @Override
    public int resetPassword(Integer id) {
        int count;
        IfmSysUser user = ifmSysUserMapper.selectByPrimaryKey(id);
        IfmSysLogin ifmSysLogin = new IfmSysLogin();
        ifmSysLogin.setLgnid(Integer.valueOf(user.getLgnId()));
        ifmSysLogin.setPassword(StringUtil.MD5("123456"));
        ifmSysLoginMapper.updateByPrimaryKeySelective(ifmSysLogin);

        IfmSysUserOperate ifmUserOperate = new IfmSysUserOperate();
        ifmUserOperate.setIfmUserId(UserUtils.getCurrentHr().getUserid());
        ifmUserOperate.setAddress(UserUtils.getCurrentHr().getAddress());
        ifmUserOperate.setOperateDate(new Date());
        ifmUserOperate.setOperate("重置密码");
        ifmSysUserOperateMapper.insertSelective(ifmUserOperate);
        count = 1;
        return count;
    }

    @Override
    public Map<String,Object> qryUserlogin() {
        List<Map<String, Object>> userLogin = userDao.qryUserlogin(UserUtils.getCurrentHr().getUserid());
        String address = "";
        try {
            address = getAddresses("ip=" + userLogin.get(0).get("address"), "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }Map<String, Object> user = new HashMap<>();
        user.put("user",userLogin.get(0).get("userName") );
        user.put("role", userLogin.get(0).get("role"));
        user.put("loginTime", userLogin.get(0).get("loginTime"));
        user.put("loginAddress", address);
        return user;
    }

    /**
     * 3      * @param content
     * 请求的参数 格式为：name=xxx&pwd=xxx
     *
     * @param encoding 服务器端请求编码。如GBK,UTF-8等
     * @return
     * @throws UnsupportedEncodingException
     */
    public static String getAddresses(String content, String encodingString) throws UnsupportedEncodingException {
        // 这里调用pconline的接口
        String urlStr = "http://ip.taobao.com/service/getIpInfo.php";
        // 从http://whois.pconline.com.cn取得IP所在的省市区信息
        String returnStr = getResult(urlStr, content, encodingString);
        if (returnStr != null) {
            // 处理返回的省市区信息
            String[] temp = returnStr.split(",");
            if (temp.length < 3) {
                return "0";                                        //无效IP，局域网测试
            }
            String region = (temp[5].split(":"))[1].replaceAll("\"", "");
            region = decodeUnicode(region);                        // 省

            String country = "";
            String area = "";
            // String region = "";
            String city = "";
            String county = "";
            String isp = "";
            for (int i = 0; i < temp.length; i++) {
                switch (i) {
                    //如果使用的是新浪的接口，那这里的需要修改，case:3 4 5分别对应国家，省，市区
                    case 1:
                        country = (temp[i].split(":"))[2].replaceAll("\"", "");
                        country = decodeUnicode(country);            // 国家
                        break;
                    case 4:
                        area = (temp[i].split(":"))[1].replaceAll("\"", "");
                        area = decodeUnicode(area);                // 地区
                        break;
                    case 5:
                        region = (temp[i].split(":"))[1].replaceAll("\"", "");
                        region = decodeUnicode(region);            // 省份
                        break;
                    case 7:
                        city = (temp[i].split(":"))[1].replaceAll("\"", "");
                        city = decodeUnicode(city);                // 市区
                        break;
                    case 9:
                        county = (temp[i].split(":"))[1].replaceAll("\"", "");
                        county = decodeUnicode(county);            // 地区
                        break;
                    case 11:
                        isp = (temp[i].split(":"))[1].replaceAll("\"", "");
                        isp = decodeUnicode(isp);                 // ISP公司
                        break;
                }
            }
            return region;
        }
        return null;
    }

    /**
     * @param urlStr   请求的地址
     * @param content  请求的参数 格式为：name=xxx&pwd=xxx
     * @param encoding 服务器端请求编码。如GBK,UTF-8等
     * @return
     */
    private static String getResult(String urlStr, String content, String encoding) {
        URL url = null;
        HttpURLConnection connection = null;
        try {
            url = new URL(urlStr);
            connection = (HttpURLConnection) url.openConnection();    // 新建连接实例
            connection.setConnectTimeout(2000);                     // 设置连接超时时间，单位毫秒
            connection.setReadTimeout(2000);                        // 设置读取数据超时时间，单位毫秒
            connection.setDoOutput(true);                           // 是否打开输出流 true|false
            connection.setDoInput(true);                            // 是否打开输入流true|false
            connection.setRequestMethod("POST");                    // 提交方法POST|GET
            connection.setUseCaches(false);                         // 是否缓存true|false
            connection.connect();                                   // 打开连接端口
            DataOutputStream out = new DataOutputStream(connection.getOutputStream());// 打开输出流往对端服务器写数据
            out.writeBytes(content);                                // 写数据,也就是提交你的表单 name=xxx&pwd=xxx
            out.flush();                                            // 刷新
            out.close();                                            // 关闭输出流
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), encoding));// 往对端写完数据对端服务器返回数据 ,以BufferedReader流来读取
            StringBuffer buffer = new StringBuffer();
            String line = "";
            while ((line = reader.readLine()) != null) {
                buffer.append(line);
            }
            reader.close();
            return buffer.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.disconnect();                            // 关闭连接
            }
        }
        return null;
    }

    /**
     * unicode 转换成 中文
     *
     * @param theString
     * @return
     * @author fanhui 2007-3-15
     */
    public static String decodeUnicode(String theString) {
        char aChar;
        int len = theString.length();
        StringBuffer outBuffer = new StringBuffer(len);
        for (int x = 0; x < len; ) {
            aChar = theString.charAt(x++);
            if (aChar == '\\') {
                aChar = theString.charAt(x++);
                if (aChar == 'u') {
                    int value = 0;
                    for (int i = 0; i < 4; i++) {
                        aChar = theString.charAt(x++);
                        switch (aChar) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                value = (value << 4) + aChar - '0';
                                break;
                            case 'a':
                            case 'b':
                            case 'c':
                            case 'd':
                            case 'e':
                            case 'f':
                                value = (value << 4) + 10 + aChar - 'a';
                                break;
                            case 'A':
                            case 'B':
                            case 'C':
                            case 'D':
                            case 'E':
                            case 'F':
                                value = (value << 4) + 10 + aChar - 'A';
                                break;
                            default:
                                throw new IllegalArgumentException(
                                        "Malformed  encoding.");
                        }
                    }
                    outBuffer.append((char) value);
                } else {
                    if (aChar == 't') {
                        aChar = '\t';
                    } else if (aChar == 'r') {
                        aChar = '\r';
                    } else if (aChar == 'n') {
                        aChar = '\n';
                    } else if (aChar == 'f') {
                        aChar = '\f';
                    }
                    outBuffer.append(aChar);
                }
            } else {
                outBuffer.append(aChar);
            }
        }
        return outBuffer.toString();
    }

    @Override
    public List<Map<String,Object>> qryDataEchartsLogin() {
        StringBuffer cnd = new StringBuffer();
        cnd.append(" SELECT date_sub(date_format(now(),'%y-%m-%d %'), interval 0 DAY) as login_date union all ");
        for(int i=1; i<7; i++) {
            cnd.append(" SELECT date_sub(date_format(now(),'%y-%m-%d %'), interval " + i +" DAY) as login_date union all ");
        }
        cnd.append(" SELECT date_sub(date_format(now(),'%y-%m-%d'), interval 7 DAY) as login_date ");

        return userDao.qryDataEchartsLogin(UserUtils.getCurrentHr().getUserid(),cnd.toString());
    }

}
