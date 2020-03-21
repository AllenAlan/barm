package com.barm.tree.core;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author Allen
 * @version 1.0.0
 * @description LeafConfiguration
 * @create 2020/3/20 17:52
 * @e-mail allenalan@139.com
 * @copyright 版权所有 (C) 2020 allennote
 */
@Data
@Component
@PropertySource(value= "classpath:leaf.properties", ignoreResourceNotFound=true)
public class LeafConfiguration {
    @Value("${leaf.jdbc.password}")
    private String password;
    @Value("${leaf.jdbc.url}")
    private String url;
    @Value("${leaf.jdbc.username}")
    private String username;
    @Value("${leaf.name}")
    private String name;
    @Value("${leaf.segment.enable}")
    private Boolean segmentEnable;
    @Value("${leaf.snowflake.enable}")
    private Boolean snowflakeEnable;
    @Value("${leaf.snowflake.port}")
    private Integer zkPort;
    @Value("${leaf.snowflake.zk.address}")
    private String zkIp;

}
