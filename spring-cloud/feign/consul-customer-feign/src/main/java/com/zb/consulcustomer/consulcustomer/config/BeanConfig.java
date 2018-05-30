package com.zb.consulcustomer.consulcustomer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author 张博【zhangb@lianliantech.cn】
 */
@Configuration
public class BeanConfig {

    /**
     * 创建人：张博【zhangb@lianliantech.cn】
     * 时间：2018/5/25 下午2:58
     * @apiNote 负载均衡 + http客户端
     */
    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
