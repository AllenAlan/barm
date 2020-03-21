#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @description AsyncConfig 异步线程池配置
 * @author Allen
 * @version 1.0.0
 * @create 2020/2/26 21:27
 * @e-mail allenalan@139.com
 * @copyright 版权所有 (C) 2020 barm
 */
@EnableAsync
@Configuration
public class AsyncConfig {

    private static final int corePoolSize = 10;
    private static final int maxPoolSize = 50;
    private static final int keepAliveTime = 10;
    private static final int queueCapacity = 100000;
    private static final String threadNamePrefix = "Async-Executor-";

    @Bean
    public ThreadPoolTaskExecutor getAsyncExecutor(){
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(corePoolSize);
        executor.setMaxPoolSize(maxPoolSize);
        executor.setQueueCapacity(queueCapacity);
        executor.setKeepAliveSeconds(keepAliveTime);
        executor.setThreadNamePrefix(threadNamePrefix);
        // 线程池对拒绝任务的处理策略
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        // 初始化
        executor.initialize();
        return executor;
    }

}