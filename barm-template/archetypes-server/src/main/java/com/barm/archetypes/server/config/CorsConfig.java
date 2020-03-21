package com.barm.archetypes.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;  
import org.springframework.web.cors.CorsConfiguration;  
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;  
import org.springframework.web.filter.CorsFilter;  

/**
 * @description 跨域配置
 * @author Allen
 * @version 1.0.0
 * @create 2020/3/19 17:34
 * @e-mail allenalan@139.com
 * @copyright 版权所有 (C) 2020 allennote
 */
@Configuration  
public class CorsConfig {  
    private CorsConfiguration buildConfig() {  
        CorsConfiguration corsConfiguration = new CorsConfiguration();  
        corsConfiguration.addAllowedOrigin("*");
        corsConfiguration.addAllowedHeader("*");
        corsConfiguration.addAllowedMethod("*");
        return corsConfiguration;  
    }  
  
    @Bean  
    public CorsFilter corsFilter() {  
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();  
        source.registerCorsConfiguration("/**", buildConfig());
        return new CorsFilter(source);  
    }  
}