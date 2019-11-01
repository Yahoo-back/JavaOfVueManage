package com.hyy.ifm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import com.hyy.ifm.common.api.CommonPage;
import com.hyy.ifm.common.api.CommonResult;
import com.hyy.ifm.common.utils.DateUtil;
import com.hyy.ifm.common.utils.UserUtils;
import com.hyy.ifm.common.utils.ZfSignUtil;
import com.hyy.ifm.dao.CustomerDao;
import com.hyy.ifm.dao.DataClannelDao;
import com.hyy.ifm.dao.DataSourceDao;
import com.hyy.ifm.dto.*;
import com.hyy.ifm.mbg.mapper.IfmSysLoginMapper;
import com.hyy.ifm.mbg.mapper.IfmSysUserMapper;
import com.hyy.ifm.mbg.mapper.IfmSysUserOperateMapper;
import com.hyy.ifm.mbg.mapper.SlQdaoMapper;
import com.hyy.ifm.mbg.model.*;
import com.hyy.ifm.service.ConfigDictService;
import com.hyy.ifm.service.DataSourceService;
import com.hyy.ifm.service.UmsAdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 点击来源Service实现类
 * Created by macro on 2018/4/26.
 */
@Service
public class DataSourceServiceImpl implements DataSourceService {
    private static final Logger LOGGER = LoggerFactory.getLogger(DataSourceServiceImpl.class);
    @Autowired
    private DataSourceDao dataSourceDao;
    @Autowired
    private CustomerDao customerDao;
    @Autowired
    private IfmSysUserMapper ifmSysUserMapper;
    @Autowired
    private IfmSysLoginMapper ifmSysLoginMapper;
    @Autowired
    private ConfigDictService configDictService;
    @Autowired
    private SlQdaoMapper slQdaoMapper;
    @Autowired
    private UmsAdminService umsAdminService;
    @Autowired
    private IfmSysUserOperateMapper ifmSysUserOperateMapper;
    @Autowired
    private DataClannelDao dataClannelDao;


    @Override
    public List<Map<String, Object>> qrySourceAll() {
        return dataSourceDao.qrySourceAll();
    }

    @Override
    public List<Map<String, Object>> qryDataSourceList(DataSourceParam dataSourceParam,Integer pageSize,Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);

        if (dataSourceParam.getSource_cnd() !=null && !dataSourceParam.getSource_cnd().equals("")){
            return dataSourceDao.qryDataRoorList(dataSourceParam,"AND dvl.source = '" + dataSourceParam.getSource_cnd() + "'"," and du.create_time <= '"+ dataSourceParam.getVisit_time_TO_cnd() +"' "+" and du.create_time >= '"+ dataSourceParam.getVisit_time_FROM_cnd() +"' ");
        }else {
            return dataSourceDao.qryDataRoorList1(dataSourceParam," and du.create_time <= '"+ dataSourceParam.getVisit_time_TO_cnd() +"' "+" and du.create_time >= '"+ dataSourceParam.getVisit_time_FROM_cnd() +"' ");
        }
    }

    @Override
    public List<Map<String, Object>> qryDataSourceSum(DataSourceParam dataSourceParam) {
        int noneCount = 0;
        int faceCount = 0;
        int perCount = 0;
        int bankCount = 0;
        int concatCount = 0;
        int yunCount = 0;
        Double money = 0.00;
        DataSourceParam dataSourceParam1 = new DataSourceParam();
        BeanUtils.copyProperties(dataSourceParam, dataSourceParam1);
        if(!"".equals(dataSourceParam.getVisit_time_FROM_cnd())) {
            dataSourceParam1.setVisit_time_FROM_cnd(dataSourceParam.getVisit_time_FROM_cnd() +":00:00");
        }else {
            dataSourceParam1.setVisit_time_FROM_cnd("2000-00-00 00:00:00");
        }
        if(!"".equals(dataSourceParam.getVisit_time_TO_cnd())) {
            dataSourceParam1.setVisit_time_TO_cnd(dataSourceParam.getVisit_time_TO_cnd() +":00:00");
        }else {
            dataSourceParam1.setVisit_time_TO_cnd("2200-00-00 00:00:00");
        }
        Map<String, Object> records = dataSourceDao.qryRegisterAndUvCount(dataSourceParam1);
        List<Map<String,Object>> resCount = new ArrayList<>();
        Map<String,Object> mapCount = new HashMap<>();
        CustomerParam customerParam = new CustomerParam();
        customerParam.setSource_cnd(dataSourceParam.getSource_cnd());
        customerParam.setCreate_time_FROM_cnd(dataSourceParam.getVisit_time_FROM_cnd());
        customerParam.setCreate_time_TO_cnd(dataSourceParam.getVisit_time_TO_cnd());
        List<Map<String, Object>> res = customerDao.qryCustomerMoneyAll(customerParam);
        for (Map<String, Object> re : res) {
            money =  Double.parseDouble(re.get("pay_amt").toString());
        }
        for (int i = 0; i < 6; i++) {
            customerParam.setUser_auth_cnd(String.valueOf(i));
            if (customerParam !=null){
                if (customerParam.getUser_auth_cnd()!=null && customerParam.getUser_auth_cnd().equals("0")){
                    noneCount = customerDao.countCustomerListNone(customerParam);
                }else {
                    if (i == 1){
                        faceCount = customerDao.countCustomerList(customerParam);
                    }else if(i == 2){
                        perCount = customerDao.countCustomerList(customerParam);
                    }else if(i == 3){
                        bankCount = customerDao.countCustomerList(customerParam);
                    } else if(i == 4){
                        concatCount = customerDao.countCustomerList(customerParam);
                    }else if(i == 5){
                        yunCount = customerDao.countCustomerList(customerParam);
                    }
                }
            }
        }

        mapCount.put("countCount",records.get("countCount"));
        mapCount.put("countUvCount",records.get("countUvCount"));
        mapCount.put("noneCount",noneCount);
        mapCount.put("faceCount",faceCount);
        mapCount.put("perCount",perCount);
        mapCount.put("bankCount",bankCount);
        mapCount.put("concatCount",concatCount);
        mapCount.put("yunCount",yunCount);
        mapCount.put("uvCount",records.get("uvCount"));
        mapCount.put("pay",money);
        resCount.add(mapCount);
        return resCount;
    }

    @Override
    public List<Map<String, Object>> qryDataEchartsSourceBySource(DataSourceChartParam dataSourceParam) {
        try {
            String source = dataSourceParam.getSource();
            String daysFrom = dataSourceParam.getDaysFrom();
            String daysTo = dataSourceParam.getDaysTo();

            StringBuffer cnd = new StringBuffer();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH");
            if(StringUtil.isEmpty(daysFrom) && StringUtil.isEmpty(daysTo)) {
                //页面载入 默认展示7小时内的折线图
                cnd.append(" SELECT date_sub(date_format(now(),'%y-%m-%d %H'), interval 0 HOUR) as click_date union all ");
                for(int i=1; i<7; i++) {
                    cnd.append(" SELECT date_sub(date_format(now(),'%y-%m-%d %H'), interval " + i +" HOUR) as click_date union all ");
                }
                cnd.append(" SELECT date_sub(date_format(now(),'%y-%m-%d %H'), interval 7 HOUR) as click_date ");
            } else if(StringUtil.isNotEmpty(daysFrom) && StringUtil.isNotEmpty(daysTo)) {
                //时间选择
                cnd.append(" SELECT date_sub(date_format('" + daysTo +"','%y-%m-%d %H'), interval 0 HOUR) as click_date union all ");
                Date date1 = format.parse(daysFrom);
                Date date2 = format.parse(daysTo);
                int bew = DateUtil.hoursBetween(date1, date2);
                for(int i=1; i<bew; i++) {
                    cnd.append(" SELECT date_sub(date_format('" + daysTo +"','%y-%m-%d %H'), interval " + i +" HOUR) as click_date union all ");
                }
                cnd.append(" SELECT date_sub(date_format('" + daysTo +"','%y-%m-%d %H'), interval " + bew +" HOUR) as click_date ");
            }
            List<Map<String, Object>> records = dataSourceDao.qryDataEchartsSourceBySource(dataSourceParam, cnd.toString());
            for(Map<String, Object> record : records) {
                record.put("source", source);
            }
            return records;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;

    }

    @Override
    public List<Map<String, Object>> qryQuDaoDataSourceSum(DataSourceParam dataSourceParam) {
        if(StringUtils.isEmpty(dataSourceParam.getVisit_time_FROM_cnd())) {
            dataSourceParam.setVisit_time_FROM_cnd("2000-00-00 00:00:00");
        }
        if(StringUtils.isEmpty(dataSourceParam.getVisit_time_TO_cnd())) {
            dataSourceParam.setVisit_time_TO_cnd("2200-00-00 00:00:00");
        }
        List<Map<String, Object>> qDaoCountList = dropList(dataSourceParam);
        int countCount = 0;
        int countUvCount = 0;
        int uvCount = 0;
        int noneCount = 0;
        int faceCount = 0;
        int perCount = 0;
        int bankCount = 0;
        int concatCount = 0;
        int yunCount = 0;
        for (Map<String, Object> map : qDaoCountList) {
            countCount = Integer.parseInt(map.get("count").toString()) + countCount;
            uvCount = Integer.parseInt(map.get("uv").toString()) + uvCount;
            countUvCount = Integer.parseInt(map.get("count_uv").toString()) + countUvCount;
            noneCount = Integer.parseInt(map.get("none").toString()) + noneCount;
            faceCount = Integer.parseInt(map.get("face").toString()) + faceCount;
            perCount = Integer.parseInt(map.get("per").toString()) + perCount;
            bankCount = Integer.parseInt(map.get("bank").toString()) + bankCount;
            concatCount = Integer.parseInt(map.get("concat").toString()) + concatCount;
            yunCount = Integer.parseInt(map.get("yun").toString()) + yunCount;
        }

        Map<String,Object> mapCount = new HashMap<>();
        List<Map<String,Object>> qDaoCount = new ArrayList<>();
        mapCount.put("count",countCount);
        mapCount.put("uv",uvCount);
        mapCount.put("count_uv",countUvCount);
        mapCount.put("none",noneCount);
        mapCount.put("face",faceCount);
        mapCount.put("per",perCount);
        mapCount.put("bank",bankCount);
        mapCount.put("concat",concatCount);
        mapCount.put("yun",yunCount);
        IfmSysUser ifmUser = ifmSysUserMapper.selectByPrimaryKey(UserUtils.getCurrentHr().getUserid());
        if(null == ifmUser.getLoanrate() || "".equals(ifmUser.getLoanrate())){
            ifmUser.setLoanrate("0.05");
        }
        List<Map<String, Object>> qDaoloanList = loanList(dataSourceParam);
        if(0 == yunCount){
            mapCount.put("pay",0);
        }else if(ZfSignUtil.div(Double.parseDouble(qDaoloanList.get(0).get("count").toString()),countCount) > Double.parseDouble(ifmUser.getLoanrate())){//放款/注册
            mapCount.put("pay",(int)ZfSignUtil.mul(yunCount, Double.parseDouble(ifmUser.getLoanrate())));
        }else{
            mapCount.put("pay",qDaoloanList.get(0).get("count"));
        }
        qDaoCount.add(mapCount);
        return qDaoCount;
    }

    public  List<Map<String,Object>> dropList(DataSourceParam dataSourceParam){
        IfmSysLogin ifmLogin = ifmSysLoginMapper.selectByPrimaryKey(UserUtils.getCurrentHr().getUserid());
        List<Map<String,Object>> qdaoSls = null;
        String quantity = "";
        qdaoSls = dataSourceDao.qryQuDaoSl(dataSourceParam.getSource_cnd());
        List<Map<String, Object>> dateQdaoList = DateUtil.getDateQdaoList(qdaoSls,dataSourceParam);
        Collections.reverse(dateQdaoList);
        List<DcDict> payOrderList = configDictService.qryDictByDataType("QUANTITY");
        for (DcDict dcDict : payOrderList) {
            quantity = dcDict.getItemValue();
        }
        int countCount = 0;
        int countUvCount = 0;
        int uvCount = 0;
        int noneCount = 0;
        int faceCount = 0;
        int perCount = 0;
        int bankCount = 0;
        int concatCount = 0;
        int yunCount = 0;


        int countCount2 = 0;
        int countUvCount2 = 0;
        int uvCount2 = 0;
        int noneCount2 = 0;
        int faceCount2 = 0;
        int perCount2 = 0;
        int bankCount2 = 0;
        int concatCount2 = 0;
        int yunCount2 = 0;
        List<Map<String,Object>> qDaoCount = new ArrayList<>();
        List<Map<String,Object>> dataSumAlls= dataSourceDao.qryDataSumList(ifmLogin.getUserCode(),"2000-00-00 00:00:00","2200-00-00 00:00:00");
        int uvCountAll = 0;
        List<Map<String,Object>> dataSumAll = new ArrayList<>();
        Collections.reverse(dataSumAlls);
        for (Map<String,Object> record : dataSumAlls) {
            Map<String,Object> re = new HashMap();
            uvCountAll =  uvCountAll + Integer.parseInt(record.get("uv").toString());
            re.put("visit_time",record.get("visit_time"));
            if (uvCountAll > Integer.parseInt(quantity) ){
                re.put("uv",uvCountAll-Integer.parseInt(quantity));
                re.put("vi",new BigDecimal((float)(uvCountAll-Integer.parseInt(quantity))/Integer.parseInt(record.get("uv").toString())).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
                dataSumAll.add(re);
                break;
            }else {
                re.put("uv",record.get("uv"));
                re.put("vi","1");
                dataSumAll.add(re);
            }
        }
        for (Map<String, Object> map : dateQdaoList) {
            List<Map<String,Object>> dataSum = null;
            dataSum = dataSourceDao.qryDataSumList(ifmLogin.getUserCode(),map.get("startTime").toString(),map.get("endTime").toString());
            Collections.reverse(dataSum);
            for (Map<String,Object> record : dataSum) {

                if("2000-00-00 00:00:00".equals(dataSourceParam.getVisit_time_FROM_cnd()) && "2200-00-00 00:00:00".equals(dataSourceParam.getVisit_time_TO_cnd()) ) {
                    if (Integer.parseInt(record.get("uv").toString())<Integer.parseInt(quantity)&&uvCount2<Integer.parseInt(quantity)
                            &&Integer.parseInt(record.get("uv").toString())+uvCount2<Integer.parseInt(quantity)){
                        countCount =  Integer.parseInt(record.get("count").toString());
                        countUvCount =  Integer.parseInt(record.get("count_uv").toString());
                        uvCount =  Integer.parseInt(record.get("uv").toString());
                        noneCount =  Integer.parseInt(record.get("none").toString());
                        faceCount =  Integer.parseInt(record.get("face").toString());
                        perCount =  Integer.parseInt(record.get("per").toString());
                        bankCount =  Integer.parseInt(record.get("bank").toString());
                        concatCount =  Integer.parseInt(record.get("concat").toString());
                        yunCount =  Integer.parseInt(record.get("yun").toString());
                    }else if (uvCount2>Integer.parseInt(quantity)){
                        countCount =  getInt(ZfSignUtil.mul(Double.parseDouble(record.get("count").toString()),Double.parseDouble(map.get("sl").toString())));
                        countUvCount =  getInt(ZfSignUtil.mul(Double.parseDouble(record.get("count_uv").toString()),Double.parseDouble( map.get("sl").toString())));
                        uvCount = getInt(ZfSignUtil.mul(Double.parseDouble(record.get("uv").toString()),Double.parseDouble( map.get("sl").toString())));
                        noneCount =getInt(ZfSignUtil.mul(Double.parseDouble(record.get("none").toString()),Double.parseDouble( map.get("sl").toString())));
                        faceCount = getInt(ZfSignUtil.mul(Double.parseDouble(record.get("face").toString()),Double.parseDouble( map.get("sl").toString())));
                        perCount = getInt(ZfSignUtil.mul(Double.parseDouble(record.get("per").toString()),Double.parseDouble( map.get("sl").toString())));
                        bankCount =  getInt(ZfSignUtil.mul(Double.parseDouble(record.get("bank").toString()),Double.parseDouble( map.get("sl").toString())));
                        concatCount = getInt(ZfSignUtil.mul(Double.parseDouble(record.get("concat").toString()),Double.parseDouble( map.get("sl").toString())));
                        yunCount =  getInt(ZfSignUtil.mul(Double.parseDouble(record.get("yun").toString()),Double.parseDouble( map.get("sl").toString())));
                    }else if(uvCount2<Integer.parseInt(quantity) &&Integer.parseInt(record.get("uv").toString())+uvCount2>Integer.parseInt(quantity)){
                        int sum = Integer.parseInt(record.get("uv").toString()) + uvCount2;
                        int i = sum - Integer.parseInt(quantity);//需要扣量
                        int i1 = Integer.parseInt(record.get("uv").toString()) - i; // 不需要扣量
                        uvCount =  i1+ getInt(ZfSignUtil.mul(i,Double.parseDouble( map.get("sl").toString())));

                        double iv =  new BigDecimal((float)uvCount/Integer.parseInt(record.get("uv").toString())).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
                        countCount =  getInt(ZfSignUtil.mul(Double.parseDouble(record.get("count").toString()),iv));
                        countUvCount = getInt(ZfSignUtil.mul(Double.parseDouble(record.get("count_uv").toString()),iv));
                        noneCount =getInt(ZfSignUtil.mul(Double.parseDouble(record.get("none").toString()),iv));
                        faceCount = getInt(ZfSignUtil.mul(Double.parseDouble(record.get("face").toString()),iv));
                        perCount = getInt(ZfSignUtil.mul(Double.parseDouble(record.get("per").toString()),iv));
                        bankCount =  getInt(ZfSignUtil.mul(Double.parseDouble(record.get("bank").toString()),iv));
                        concatCount = getInt(ZfSignUtil.mul(Double.parseDouble(record.get("concat").toString()),iv));
                        yunCount =  getInt(ZfSignUtil.mul(Double.parseDouble(record.get("yun").toString()),iv));
                    }
                    countCount2 = countCount+countCount2;
                    countUvCount2 = countUvCount+countUvCount2;
                    uvCount2 = uvCount+uvCount2;
                    noneCount2 = noneCount+noneCount2;
                    faceCount2 = faceCount+faceCount2;
                    perCount2 = perCount+perCount2;
                    bankCount2 = bankCount+bankCount2;
                    concatCount2 = concatCount+concatCount2;
                    yunCount2 = yunCount+yunCount2;


                }else {
                    for (Map<String,Object> record1 : dataSumAll) {
                        if (record1.get("visit_time").equals(record.get("visit_time"))){
                            uvCount =  Integer.parseInt(record.get("uv").toString())-Integer.parseInt(record1.get("uv").toString())+ getInt(ZfSignUtil.mul(Double.parseDouble(record1.get("uv").toString()),Double.parseDouble(record1.get("vi").toString())));
                            double vi = new BigDecimal((float) (uvCount / Integer.parseInt(record1.get("uv").toString()))).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
                            countCount =  getInt(ZfSignUtil.mul(Double.parseDouble(record.get("count").toString()),vi));
                            countUvCount = getInt(ZfSignUtil.mul(Double.parseDouble(record.get("count_uv").toString()),vi));
                            noneCount =getInt(ZfSignUtil.mul(Double.parseDouble(record.get("none").toString()),vi));
                            faceCount = getInt(ZfSignUtil.mul(Double.parseDouble(record.get("face").toString()),vi));
                            perCount = getInt(ZfSignUtil.mul(Double.parseDouble(record.get("per").toString()),vi));
                            bankCount =  getInt(ZfSignUtil.mul(Double.parseDouble(record.get("bank").toString()),vi));
                            concatCount = getInt(ZfSignUtil.mul(Double.parseDouble(record.get("concat").toString()),vi));
                            yunCount =  getInt(ZfSignUtil.mul(Double.parseDouble(record.get("yun").toString()),vi));
                        }else {
                            countCount =  getInt(ZfSignUtil.mul(Double.parseDouble(record.get("count").toString()),Double.parseDouble(map.get("sl").toString())));
                            countUvCount =  getInt(ZfSignUtil.mul(Double.parseDouble(record.get("count_uv").toString()),Double.parseDouble( map.get("sl").toString())));
                            uvCount = getInt(ZfSignUtil.mul(Double.parseDouble(record.get("uv").toString()),Double.parseDouble( map.get("sl").toString())));
                            noneCount =getInt(ZfSignUtil.mul(Double.parseDouble(record.get("none").toString()),Double.parseDouble( map.get("sl").toString())));
                            faceCount = getInt(ZfSignUtil.mul(Double.parseDouble(record.get("face").toString()),Double.parseDouble( map.get("sl").toString())));
                            perCount = getInt(ZfSignUtil.mul(Double.parseDouble(record.get("per").toString()),Double.parseDouble( map.get("sl").toString())));
                            bankCount =  getInt(ZfSignUtil.mul(Double.parseDouble(record.get("bank").toString()),Double.parseDouble( map.get("sl").toString())));
                            concatCount = getInt(ZfSignUtil.mul(Double.parseDouble(record.get("concat").toString()),Double.parseDouble( map.get("sl").toString())));
                            yunCount =  getInt(ZfSignUtil.mul(Double.parseDouble(record.get("yun").toString()),Double.parseDouble( map.get("sl").toString())));
                        }
                    }

                }

                Map<String,Object> mapCount = new HashMap<>();
                mapCount.put("count",countCount);
                mapCount.put("source",record.get("source"));
                mapCount.put("visit_time",String.valueOf(record.get("visit_time")));
                mapCount.put("uv",uvCount);
                mapCount.put("count_uv",countUvCount);
                mapCount.put("none",noneCount);
                mapCount.put("face",faceCount);
                mapCount.put("per",perCount);
                mapCount.put("bank",bankCount);
                mapCount.put("concat",concatCount);
                mapCount.put("yun",yunCount);
                qDaoCount.add(mapCount);
            }
        }
        return  qDaoCount ;
    }

    public static int getInt(double number){
        BigDecimal bd=new BigDecimal(number).setScale(0, BigDecimal.ROUND_HALF_UP);
        return Integer.parseInt(bd.toString());
    }

    public  List<Map<String,Object>> loanList(DataSourceParam dataSourceParam){
        IfmSysLogin ifmLogin = ifmSysLoginMapper.selectByPrimaryKey(UserUtils.getCurrentHr().getUserid());
        List<Map<String,Object>> qdaoSls = dataSourceDao.qryQuDaoLoan(ifmLogin.getUserCode(),dataSourceParam.getVisit_time_TO_cnd(),dataSourceParam.getVisit_time_FROM_cnd());
        return  qdaoSls ;
    }

    @Override
    public List<Map<String, Object>> qryQuDaoDataSourceList(DataSourceParam dataSourceParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        if(StringUtils.isEmpty(dataSourceParam.getVisit_time_FROM_cnd())) {
            dataSourceParam.setVisit_time_FROM_cnd("2000-00-00 00:00:00");
        }
        if(StringUtils.isEmpty(dataSourceParam.getVisit_time_TO_cnd())) {
            dataSourceParam.setVisit_time_TO_cnd("2200-00-00 00:00:00");
        }
        List<Map<String, Object>> qDaoCount = dropList(dataSourceParam);
        return qDaoCount;
    }

    @Override
    public List<Map<String, Object>> qryQuDaoSl(DataSourceParam dataSourceParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        if(StringUtils.isEmpty(dataSourceParam.getVisit_time_FROM_cnd())) {
            dataSourceParam.setVisit_time_FROM_cnd("2000-00-00 00:00:00");
        }
        if(StringUtils.isEmpty(dataSourceParam.getVisit_time_TO_cnd())) {
            dataSourceParam.setVisit_time_TO_cnd("2200-00-00 00:00:00");
        }
        List<Map<String, Object>> qdaoSls = dataSourceDao.qryQuDaoSlAllSource(dataSourceParam,UserUtils.getCurrentHr().getUserid());
        return qdaoSls;
    }

    @Override
    public Map<String, Object> qrySourceByLgnId(Integer id) {
        Map<String, Object> re = new HashMap<>();
        SlQdao qdaoSl = slQdaoMapper.selectByPrimaryKey(id);
        IfmSysUser user = umsAdminService.fetchUserByLngid(qdaoSl.getLoginId().toString());
        re.put("login", user);
        re.put("user", qdaoSl);
        return re;
    }

    @Override
    public CommonResult saveQdaoSlList(QudaoSlParam slQdao) {
        int count;
        try {
            boolean f1 = "".equals(slQdao.getId()) || null == slQdao.getId()? true : false;
            boolean f = "".equals(slQdao.getUserName()) || null == slQdao.getUserName()? true : false;

            DateFormat format = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss");
            Date updateTime = format.parse(slQdao.getUpdateTime());

            Calendar cal1 = Calendar.getInstance();
            cal1.setTime(updateTime);
            cal1.set(Calendar.MINUTE, 0);
            cal1.set(Calendar.SECOND, 0);
            cal1.set(Calendar.MILLISECOND, 0);

            SlQdaoExample example = new SlQdaoExample();
            SlQdaoExample.Criteria criteria = example.createCriteria();
            criteria.andSourceEqualTo(slQdao.getUserCode());
            if (!f) {
                criteria.andUpdateTimeEqualTo(cal1.getTime());
                criteria.andSlEqualTo(Double.parseDouble(slQdao.getSl()));
            }
            List<SlQdao> qdaoSl = slQdaoMapper.selectByExample(example);
            if (null != qdaoSl && qdaoSl.size() > 0 ) {
                return CommonResult.failed("该渠道改时间段已是该百分比");
            }

            SlQdao qdaoSl2 = new SlQdao();
            qdaoSl2.setSl(Double.parseDouble(slQdao.getSl()));
            Calendar cal12 = Calendar.getInstance();
            cal12.setTime(new Date());
            cal12.set(Calendar.MINUTE, 0);
            cal12.set(Calendar.SECOND, 0);
            cal12.set(Calendar.MILLISECOND, 0);
            qdaoSl2.setUpdateTime(cal12.getTime());
            qdaoSl2.setSource(slQdao.getUserCode());
            IfmSysLoginExample example1 = new IfmSysLoginExample();
            IfmSysLoginExample.Criteria criteria1 = example1.createCriteria();
            criteria1.andUserCodeEqualTo(slQdao.getUserCode());
            List<IfmSysLogin> ifmLogin = ifmSysLoginMapper.selectByExample(example1);
            qdaoSl2.setLoginId(ifmLogin.get(0).getLgnid());

            IfmSysUserOperate ifmUserOperate = new IfmSysUserOperate();
            ifmUserOperate.setIfmUserId(UserUtils.getCurrentHr().getUserid());
            ifmUserOperate.setAddress(UserUtils.getCurrentHr().getAddress());

            if (f1) {
                count = slQdaoMapper.insertSelective(qdaoSl2);
                ifmUserOperate.setOperateDate(new Date());
                ifmUserOperate.setOperate("添加渠道缩量"+ slQdao.getUserCode()+","+qdaoSl2);
                ifmSysUserOperateMapper.insertSelective(ifmUserOperate);
            } else {
                SlQdao qdaoSl1 = slQdaoMapper.selectByPrimaryKey(slQdao.getId());
                qdaoSl1.setSl(Double.parseDouble(slQdao.getSl()));
                count = slQdaoMapper.updateByPrimaryKeySelective(qdaoSl1);

                ifmUserOperate.setOperateDate(new Date());
                ifmUserOperate.setOperate("更新渠道缩量" + qdaoSl1.getSource() +"," + slQdao.getSl());
                ifmSysUserOperateMapper.insertSelective(ifmUserOperate);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return CommonResult.failed("保存或者更新失败");
        }
        return CommonResult.success(count);
    }

    @Override
    public CommonPage<Map<String, Object>> qryMyChannelList(DataSourceParam dataSourceParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        DataReportParam dataReportParam = new DataReportParam();
        BeanUtils.copyProperties(dataSourceParam, dataReportParam);
        List<Map<String, Object>> sourceAll = new ArrayList<>();
        Map<String, Object> record = new HashMap<>();
        if (!"".equals(dataSourceParam.getSource_cnd())&& null!=dataSourceParam.getSource_cnd()){
            record.put("source",dataSourceParam.getSource_cnd());
            sourceAll.add(record);
        }else {
            sourceAll = dataClannelDao.fetchOpenLogin(UserUtils.getCurrentHr().getUserid());
        }
        //将第一次查询到的pageinfo信息保存下来
        PageInfo<Map<String, Object>> pageInfo = new PageInfo<>(sourceAll);
        List<Map<String,Object>> list = new ArrayList<>();
        for (Map<String,Object> source : sourceAll) {
            dataReportParam.setSource_cnd(source.get("source").toString());
            Map<String,Object> map = new HashMap<>();
            String withholdPay = findWithholdPayBySource(dataReportParam);
            Map<String,Object> payCpa = dataClannelDao.findPayCpaPayBySource(dataReportParam);
            Map<String, Object> mapCount = dropList(dataReportParam,source.get("source").toString());
            double cpaPay = 0;
            int dropUv = Integer.parseInt(mapCount.get("uv").toString());
            int dropCount = Integer.parseInt(mapCount.get("count").toString());

            if (payCpa.get("cpaType").toString().equals("0")){
                cpaPay = Double.parseDouble(String.valueOf(dropUv)) * Double.parseDouble(payCpa.get("cpa").toString());
            }
            if (payCpa.get("cpaType").toString().equals("1")){
                cpaPay = Double.parseDouble(String.valueOf(dropCount)) * Double.parseDouble(payCpa.get("cpa").toString());
            }
            List<Map<String, Object>> res = dataSourceDao.qryDataRoorList(dataSourceParam , "AND dvl.source = '" + source.get("source").toString() + "'"," and du.create_time <= '"+ dataSourceParam.getVisit_time_TO_cnd() +"' "+" and du.create_time >= '"+ dataSourceParam.getVisit_time_FROM_cnd() +"' ");
            String uv ="0";
            String count= "0";
            int order = 0;
            if (res.size()> 0){
                uv = res.get(0).get("uv").toString();
                count = res.get(0).get("count").toString();
                order = Integer.parseInt(res.get(0).get("bank").toString()) + Integer.parseInt(res.get(0).get("concat").toString()) + Integer.parseInt(res.get(0).get("yun").toString());
            }
            String orderLead=Integer.parseInt(count)==0?"0":new DecimalFormat("0.00").format(order/Double.parseDouble(count));//设置保留位数
            map.put("source",source.get("source")); //渠道来源
            map.put("uv",uv); //实际点击数
            map.put("count",count); //实际注册数
            map.put("dropUv",dropUv); //缩量点击数
            map.put("dropCount",dropCount); //缩量注册数
            map.put("cpaPay",cpaPay); //cpa金额
            map.put("withholdPay",withholdPay); // 扣款金额
            map.put("order",order); // 认证数
            map.put("orderLead",orderLead); // 认证率
            list.add(map);
        }
        //将前面分页的信息保存下来复制到新的对象中
        PageInfo<Map<String, Object>> page= new PageInfo<>(list);
        BeanUtils.copyProperties(pageInfo,page);
        page.setList(list);
        CommonPage<Map<String, Object>> result = new CommonPage<Map<String, Object>>();
        result.setTotalPage(page.getPages());
        result.setPageNum(page.getPageNum());
        result.setPageSize(page.getPageSize());
        result.setTotal(page.getTotal());
        result.setList(page.getList());

        return result;
    }

    public String findWithholdPayBySource(DataReportParam dataSourceParam) {
        Map<String, Object> withholdPayBySource = dataClannelDao.findWithholdPayBySource(dataSourceParam);
        String withholdPay= "";
        if (null!=withholdPayBySource.get("pay")&&""!=withholdPayBySource.get("pay")){
            withholdPay = dataClannelDao.findWithholdPayBySource(dataSourceParam).get("pay").toString();
        }
        return withholdPay;
    }

    public Map<String,Object> dropList(DataReportParam dataSourceParam,String source){
        List<Map<String,Object>> qdaoSls = null;
        String quantity = "";
        qdaoSls = dataSourceDao.qryQuDaoSl(source);
        List<Map<String, Object>> dateQdaoList = DateUtil.getDateQdaoList(qdaoSls,dataSourceParam);
        Collections.reverse(dateQdaoList);
        List<DcDict> payOrderList = configDictService.qryDictByDataType("QUANTITY");
        for (DcDict dcDict : payOrderList) {
            quantity = dcDict.getItemValue();
        }
        int countCount = 0;
        int countUvCount = 0;
        int uvCount = 0;
        int countCount2 = 0;
        int countUvCount2 = 0;
        int uvCount2 = 0;
        List<Map<String,Object>> qDaoCount = new ArrayList<>();
        List<Map<String,Object>> dataSumAlls= dataSourceDao.qryDataSumList(source,"2000-00-00 00:00:00","2200-00-00 00:00:00");
        int uvCountAll = 0;
        List<Map<String,Object>> dataSumAll = new ArrayList<>();
        Collections.reverse(dataSumAlls);
        for (Map<String,Object> record : dataSumAlls) {
            Map<String,Object> re = new HashMap<>();
            uvCountAll =  uvCountAll + Integer.parseInt(record.get("uv").toString());
            re.put("visit_time",record.get("visit_time"));
            if (uvCountAll > Integer.parseInt(quantity) ){
                re.put("uv",uvCountAll-Integer.parseInt(quantity));
                re.put("vi",new BigDecimal((float)(uvCountAll-Integer.parseInt(quantity))/Integer.parseInt(record.get("uv").toString())).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
                dataSumAll.add(re);
                break;
            }else {
                re.put("uv",record.get("uv"));
                re.put("vi","1");
                dataSumAll.add(re);
            }
        }
        for (Map<String, Object> map : dateQdaoList) {
            List<Map<String,Object>> dataSum = null;
            dataSum = dataSourceDao.qryDataSumList(source,map.get("startTime").toString(),map.get("endTime").toString());
            Collections.reverse(dataSum);
            for (Map<String,Object> record : dataSum) {

                if("2000-00-00 00:00:00".equals(com.hyy.ifm.common.utils.StringUtil.nvl(dataSourceParam.getVisit_time_FROM_cnd())) && "2200-00-00 00:00:00".equals(com.hyy.ifm.common.utils.StringUtil.nvl(dataSourceParam.getVisit_time_TO_cnd())) ) {
                    if (Integer.parseInt(record.get("uv").toString())<Integer.parseInt(quantity)&&uvCount2<Integer.parseInt(quantity)
                            &&Integer.parseInt(record.get("uv").toString())+uvCount2<Integer.parseInt(quantity)){
                        countCount =  Integer.parseInt(record.get("count").toString());
                        countUvCount =  Integer.parseInt(record.get("count_uv").toString());
                        uvCount =  Integer.parseInt(record.get("uv").toString());

                    }else if (uvCount2>Integer.parseInt(quantity)){
                        countCount =  getInt(ZfSignUtil.mul(Double.parseDouble(record.get("count").toString()),Double.parseDouble(map.get("sl").toString())));
                        countUvCount =  getInt(ZfSignUtil.mul(Double.parseDouble(record.get("count_uv").toString()),Double.parseDouble( map.get("sl").toString())));
                        uvCount = getInt(ZfSignUtil.mul(Double.parseDouble(record.get("uv").toString()),Double.parseDouble( map.get("sl").toString())));
                    }else if(uvCount2<Integer.parseInt(quantity) &&Integer.parseInt(record.get("uv").toString())+uvCount2>Integer.parseInt(quantity)){
                        int sum = Integer.parseInt(record.get("uv").toString()) + uvCount2;
                        int i = sum - Integer.parseInt(quantity);//需要扣量
                        int i1 = Integer.parseInt(record.get("uv").toString()) - i; // 不需要扣量
                        uvCount =  i1+ getInt(ZfSignUtil.mul(i,Double.parseDouble( map.get("sl").toString())));

                        double iv =  new BigDecimal((float)uvCount/Integer.parseInt(record.get("uv").toString())).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
                        countCount =  getInt(ZfSignUtil.mul(Double.parseDouble(record.get("count").toString()),iv));
                        countUvCount = getInt(ZfSignUtil.mul(Double.parseDouble(record.get("count_uv").toString()),iv));

                    }
                    countCount2 = countCount+countCount2;
                    countUvCount2 = countUvCount+countUvCount2;
                    uvCount2 = uvCount+uvCount2;


                }else {
                    for (Map<String, Object> record1 : dataSumAll) {
                        if (record1.get("visit_time").equals(record.get("visit_time"))){
                            double vi = 1;
                            uvCount =  Integer.parseInt(record.get("uv").toString())-Integer.parseInt(record1.get("uv").toString())+ getInt(ZfSignUtil.mul(Double.parseDouble(record1.get("uv").toString()),Double.parseDouble(record1.get("vi").toString())));
                            if (!record1.get("uv").toString().equals("0") ){
                                vi = new BigDecimal((float) (uvCount / Integer.parseInt(record1.get("uv").toString()))).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
                            }

                            countCount =  getInt(ZfSignUtil.mul(Double.parseDouble(record.get("count").toString()),vi));
                            countUvCount = getInt(ZfSignUtil.mul(Double.parseDouble(record.get("count_uv").toString()),vi));

                        }else {
                            countCount =  getInt(ZfSignUtil.mul(Double.parseDouble(record.get("count").toString()),Double.parseDouble(map.get("sl").toString())));
                            countUvCount =  getInt(ZfSignUtil.mul(Double.parseDouble(record.get("count_uv").toString()),Double.parseDouble( map.get("sl").toString())));
                            uvCount = getInt(ZfSignUtil.mul(Double.parseDouble(record.get("uv").toString()),Double.parseDouble( map.get("sl").toString())));
                        }
                    }

                }
                Map<String,Object> mapCount = new HashMap<>();
                mapCount.put("count",countCount);
                mapCount.put("source",record.get("source"));
                mapCount.put("visit_time",String.valueOf(record.get("visit_time")));
                mapCount.put("uv",uvCount);
                mapCount.put("count_uv",countUvCount);
                qDaoCount.add(mapCount);
            }
        }



        int countCountSum = 0;
        int uvCountSum = 0;
        for (Map<String, Object> map : qDaoCount) {
            countCountSum = Integer.parseInt(map.get("count").toString()) + countCountSum;
            uvCountSum = Integer.parseInt(map.get("uv").toString()) + uvCountSum;
        }
        Map<String,Object> mapCount = new HashMap<>();
        mapCount.put("count",countCountSum);
        mapCount.put("uv",uvCountSum);
        return  mapCount;
    }
}
