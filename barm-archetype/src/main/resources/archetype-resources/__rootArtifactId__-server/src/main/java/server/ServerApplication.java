#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @description Server启动类
 * @author Allen
 * @version 1.0.0
 * @create 2020/3/2 14:43
 * @e-mail allenalan@139.com
 * @copyright 版权所有 (C) 2020 barm
 */
@SpringBootApplication
@EnableTransactionManagement
@ComponentScan(value = "com.barm")
public class ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }

}