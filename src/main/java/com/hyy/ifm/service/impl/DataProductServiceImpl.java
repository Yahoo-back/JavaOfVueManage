package com.hyy.ifm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.util.StringUtil;
import com.hyy.ifm.common.utils.DateUtil;
import com.hyy.ifm.dao.DataProductDao;
import com.hyy.ifm.dto.DataProductChartParam;
import com.hyy.ifm.dto.DataProductParam;
import com.hyy.ifm.mbg.mapper.DcProductMapper;
import com.hyy.ifm.mbg.model.DcProduct;
import com.hyy.ifm.service.DataProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 产品访问统计Service实现类
 * Created by macro on 2018/4/26.
 */
@Service
public class DataProductServiceImpl implements DataProductService {
    private static final Logger LOGGER = LoggerFactory.getLogger(DataProductServiceImpl.class);
    @Autowired
    private DataProductDao dataProductDao;
    @Autowired
    private DcProductMapper dcProductMapper;

    @Override
    public List<Map<String, Object>> qryDataProductListBy1(DataProductParam dcProductParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        return dataProductDao.qryDataProductListBy1(dcProductParam);
    }

    @Override
    public List<Map<String, Object>> qryDataProductListBy2(DataProductParam dcProductParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        return dataProductDao.qryDataProductListBy2(dcProductParam);
    }

    @Override
    public List<Map<String, Object>> exportDataProductList (DataProductParam dcProductParam) {
        return dataProductDao.exportDataProductList(dcProductParam);
    }

    @Override
    public List<Map<String, Object>> qryDataEchartsProductById (DataProductChartParam dcProductParam) {
        try {
            StringBuffer cnd = new StringBuffer();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH");
            String daysFrom = dcProductParam.getDaysFrom();
            String daysTo = dcProductParam.getDaysTo();
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
                Date date1 = null;
                date1 = format.parse(daysFrom);
                Date date2 = format.parse(daysTo);
                int bew = DateUtil.hoursBetween(date1, date2);
                for(int i=1; i<bew; i++) {
                    cnd.append(" SELECT date_sub(date_format('" + daysTo +"','%y-%m-%d %H'), interval " + i +" HOUR) as click_date union all ");
                }
                cnd.append(" SELECT date_sub(date_format('" + daysTo +"','%y-%m-%d %H'), interval " + bew +" HOUR) as click_date ");
            }
            List<Map<String, Object>> records = dataProductDao.qryDataEchartsProductById(dcProductParam,cnd.toString());
            DcProduct dcProduct = dcProductMapper.selectByPrimaryKey(Integer.valueOf(dcProductParam.getProductId()));
            for(Map<String, Object> record : records) {
                record.put("productName", dcProduct.getName());
            }
            return records;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }


}
