package com.zb.consulcustomer.consulcustomer.feign_nheritance_support;

import com.zb.consulcustomer.consulcustomer.controller.User;
import org.springframework.context.annotation.Configuration;

/**
 * @author 张博【zhangb@lianliantech.cn】
 */
@Configuration
public class RestServiceRequestFallback implements RestClientService {

    @Override
    public String discoveryPingForGetRestService(String name) {
        return "discoveryPingForGet 熔断....";
    }

    @Override
    public String discoveryPingForPostRestService(User user) {
        return "discoveryPingForPost 熔断....";
    }
}
