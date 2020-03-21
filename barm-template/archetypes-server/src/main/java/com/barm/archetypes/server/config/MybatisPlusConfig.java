package com.barm.archetypes.server.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @description MybatisPlus配置
 * @author Allen
 * @version 1.0.0
 * @create 2020/2/24 18:42
 * @e-mail allenalan@139.com
 * @copyright 版权所有 (C) 2020 barm
 */

@Configuration
@MapperScan(basePackages = "com.barm.archetypes.data.*")
public class MybatisPlusConfig {

}