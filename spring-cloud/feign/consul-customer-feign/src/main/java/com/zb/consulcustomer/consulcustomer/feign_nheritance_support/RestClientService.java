package com.zb.consulcustomer.consulcustomer.feign_nheritance_support;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @author 张博【zhangb@lianliantech.cn】
 * 使用 feign 对继承的支持
 */
@FeignClient(name = "zb-consul", fallback = RestServiceRequestFallback.class)
public interface RestClientService extends IRestService {
}
