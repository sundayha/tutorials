package com.zb.consulcustomer.consulcustomer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import javax.naming.ServiceUnavailableException;

/**
 * @author 张博【zhangb@lianliantech.cn】
 */
@RestController
public class DiscoveryClientController {
    /**
     * 注入 DiscoveryClient ，来发现可用的服务
     */
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 创建人：张博【zhangb@lianliantech.cn】
     * 时间：2018/5/28 下午3:29
     * @param name 姓名
     * @apiNote 客户端负载均衡 GET 请求
     */
    @RequestMapping(value = "/discoveryPingForGet/{name}", method = RequestMethod.GET)
    @ResponseBody
    public String discoveryPingForGet(@PathVariable("name") String name) throws RestClientException, ServiceUnavailableException {
        String url = "http://zb-consul/discoveryPingForGet/".concat(name);
        System.out.println(url);
        return restTemplate.getForEntity(url, String.class).getBody();
    }

    /**
     * 创建人：张博【zhangb@lianliantech.cn】
     * 时间：2018/5/28 下午3:29
     * @param name 姓名
     * @apiNote 客户端负载均衡 POST 请求
     */
    @RequestMapping(value = "/discoveryPingForPost/{name}", method = RequestMethod.GET)
    public String discoveryPingForPost(@PathVariable("name") String name) {
        String url = "http://zb-consul/discoveryPingForPost";
        System.out.println(url);
        User user = new User();
        user.setName(name);
        return restTemplate.postForEntity(url, user, String.class).getBody();
    }

    @RequestMapping(value = "/getConfigFromValue", method = RequestMethod.GET)
    public String getConfigFromValue() {
        String url = "http://zb-consul/getConfigFromValue";
        return restTemplate.getForEntity(url, String.class).getBody();
    }

    @GetMapping("/myHealthCheck")
    public ResponseEntity<String> myCustomCheck() {
        String message = "Testing my healh check function";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
