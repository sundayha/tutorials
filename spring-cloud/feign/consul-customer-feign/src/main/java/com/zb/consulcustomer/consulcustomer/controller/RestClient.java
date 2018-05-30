package com.zb.consulcustomer.consulcustomer.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author 张博【zhangb@lianliantech.cn】
 * 哪一个 service 使用 feign 作为 httpclient
 * 接口与 service 的 rest 中 API 保持一致就行
 * feign 集成了 ribbon 所以自带客户端负载均衡无需配置
 */
@Configuration
@FeignClient(name = "zb-consul", fallback = ServiceRequestFallback.class)
public interface RestClient {

    /**
     * 创建人：张博【zhangb@lianliantech.cn】
     * 时间：2018/5/29 上午11:46
     *
     * @return ResponseEntity<String>
     * @apiNote consul service ‘zb-consul’ 中的 API
     */
    @GetMapping("/myHealthCheck")
    ResponseEntity<String> myHealthCheck();

    /**
     * 创建人：张博【zhangb@lianliantech.cn】
     * 时间：2018/5/29 上午11:45
     *
     * @return String
     * @apiNote consul service ‘zb-consul’ 中 GET 请求 API
     */
    @RequestMapping(value = "/discoveryPingForGet/{name}", method = RequestMethod.GET)
    String discoveryPingForGet(@PathVariable("name") String name);

    /**
     * 创建人：张博【zhangb@lianliantech.cn】
     * 时间：2018/5/29 上午11:46
     *
     * @return String
     * @apiNote consul service ‘zb-consul’ 中 POST 请求 API
     */
    @RequestMapping(value = "/discoveryPingForPost", method = RequestMethod.POST)
    String discoveryPingForPost(@RequestBody User user);

    /**
     * 创建人：张博【zhangb@lianliantech.cn】
     * 时间：2018/5/29 上午11:45
     *
     * @return String
     * @apiNote consul service ‘zb-consul’ 中 consul key/value 使用 GET 请求
     */
    @RequestMapping(value = "/getConfigFromValue", method = RequestMethod.GET)
    String getConfigFromValue();
}
