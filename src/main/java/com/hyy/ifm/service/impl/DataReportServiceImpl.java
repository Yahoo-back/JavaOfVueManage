package com.hyy.ifm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hyy.ifm.common.api.CommonPage;
import com.hyy.ifm.common.utils.DateUtil;
import com.hyy.ifm.common.utils.StringUtil;
import com.hyy.ifm.common.utils.ZfSignUtil;
import com.hyy.ifm.dao.DataClannelDao;
import com.hyy.ifm.dao.DataSourceDao;
import com.hyy.ifm.dto.DataReportParam;
import com.hyy.ifm.mbg.mapper.DcProductMapper;
import com.hyy.ifm.mbg.model.DcDict;
import com.hyy.ifm.service.ConfigDictService;
import com.hyy.ifm.service.DataReportService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;

/**
 * 财务统计Service实现类
 * Created by macro on 2018/4/26.
 */
@Service
public class DataReportServiceImpl implements DataReportService {
    private static final Logger LOGGER = LoggerFactory.getLogger(DataReportServiceImpl.class);
    @Autowired
    private DcProductMapper dcProductMapper;
    @Autowired
    private DataSourceDao dataSourceDao;
    @Autowired
    private DataClannelDao dataClannelDao;
    @Autowired
    private ConfigDictService configDictService;

    @Override
    public CommonPage<Map<String, Object>> qryDataFinanceReportList(DataReportParam dataSourceParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        List<Map<String,Object>> sourceAll = new ArrayList<>();
        Map<String,Object> record = new HashMap<>();
        if (!"".equals(dataSourceParam.getSource_cnd())&& null!=dataSourceParam.getSource_cnd()){
            record.put("source",dataSourceParam.getSource_cnd());
            sourceAll.add(record);
        }else {
            sourceAll =  dataSourceDao.qrySourceAll();
        }
        //将第一次查询到的pageinfo信息保存下来
        PageInfo<Map<String, Object>> pageInfo = new PageInfo<>(sourceAll);
        List<Map<String,Object>> list = new ArrayList<>();

        for (Map<String,Object> source : sourceAll) {
            dataSourceParam.setSource_cnd(source.get("source").toString());
            Map<String,Object> map = new HashMap<>();
            map.put("source",source.get("source")); //渠道来源
            String withholdPay = findWithholdPayBySource(dataSourceParam);
            map.put("withholdPay",withholdPay); // 已扣款金额
            double clickPay = 0.00;
            List<Map<String,Object>> clickList = dataClannelDao.findClickCpaPayBySource(dataSourceParam);
            for (Map<String,Object> click : clickList) {
                clickPay = clickPay +  Double.parseDouble(click.get("count").toString()) * Double.parseDouble(click.get("cpa").toString());
            }
            map.put("clickPay",clickPay);  //点击cpa金额
            String count =  String.valueOf(dataClannelDao.findUserBySource(dataSourceParam).size()); //渠道应扣款注册数
            int oughtPay = Integer.parseInt(count) * 299; //应扣款金额
            String payPercent=new DecimalFormat("0.00").format(Double.parseDouble(withholdPay)/Double.parseDouble(String.valueOf(oughtPay)));//设置保留位数
            map.put("payPercent", oughtPay == 0? 0.00 :payPercent);  //扣款转化率
            Map<String, Object> mapCount = dropList(dataSourceParam,source.get("source").toString());
            Map<String,Object> payCpa = dataClannelDao.findPayCpaPayBySource(dataSourceParam);
            double uvcpaPay = 0;
            double cpaPay = 0;
            if (payCpa.get("cpaType").toString().equals("0")){
                uvcpaPay = Double.parseDouble(mapCount.get("uv").toString()) * Double.parseDouble(payCpa.get("cpa").toString());
                String cpaPercent=new DecimalFormat("0.00").format(uvcpaPay/Double.parseDouble(withholdPay));//设置保留位数
                map.put("cpaPercent",Double.parseDouble(withholdPay) == 0 ?0.00:cpaPercent);  //cpa转化率
            }
            if (payCpa.get("cpaType").toString().equals("1")){
                cpaPay = Double.parseDouble(mapCount.get("count").toString()) * Double.parseDouble(payCpa.get("cpa").toString());
                String cpaPercent=new DecimalFormat("0.00").format(cpaPay/Double.parseDouble(withholdPay));//设置保留位数
                map.put("cpaPercent",Double.parseDouble(withholdPay) == 0 ?0.00:cpaPercent);  //cpa转化率
            }
            map.put("uvPay",uvcpaPay);  //支付cpa金额
            map.put("cpaPay",cpaPay);  //支付cpa金额
            double profit = clickPay + Double.parseDouble(withholdPay) - cpaPay - uvcpaPay ;
            map.put("profit",profit);  //利润
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

                if("2000-00-00 00:00:00".equals(StringUtil.nvl(dataSourceParam.getVisit_time_FROM_cnd())) && "2200-00-00 00:00:00".equals(StringUtil.nvl(dataSourceParam.getVisit_time_TO_cnd())) ) {
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

    public static int getInt(double number){
        BigDecimal bd=new BigDecimal(number).setScale(0, BigDecimal.ROUND_HALF_UP);
        return Integer.parseInt(bd.toString());
    }
}
