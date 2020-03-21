#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.server.config;

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
@MapperScan(basePackages = "${package}.data.*")
public class MybatisPlusConfig {

}