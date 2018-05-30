package com.zb.consulcustomer.consulcustomer.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * @author 张博【zhangb@lianliantech.cn】
 */
@Configuration
public class ServiceRequestFallback implements RestClient {

    @Override
    public ResponseEntity<String> myHealthCheck() {
        return new ResponseEntity<>("熔断ok", HttpStatus.OK);
    }

    @Override
    public String discoveryPingForGet(String name) {
        return "discoveryPingForGet 熔断";
    }

    @Override
    public String discoveryPingForPost(User user) {
        return "discoveryPingForPost 熔断";
    }

    @Override
    public String getConfigFromValue() {
        return "getConfigFromValue 熔断";
    }
}
