package com.hyy.ifm.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created by macro on 2019/4/8.
 */
@Configuration
@MapperScan({"com.hyy.ifm.mbg.mapper","com.hyy.ifm.dao"})
public class MyBatisConfig {
}
