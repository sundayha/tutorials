package com.zb.consulcustomer.consulcustomer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author 张博【zhangb@lianliantech.cn】
 */
@RestController
public class DiscoveryClientController {

    /**
     * 使用 feign 的 fallback 时，spring 不知道选择注入哪个been 所以 @FeignClient 默认为 primary true
     */
    @Autowired
    private RestClient restClient;


    /**
     * 创建人：张博【zhangb@lianliantech.cn】
     * 时间：2018/5/28 下午3:29
     * @param name 姓名
     * @apiNote 使用feign客户端负载均衡 GET 请求
     */
    @RequestMapping(value = "/discoveryPingForGet/{name}", method = RequestMethod.GET)
    @ResponseBody
    public String discoveryPingForGet(@PathVariable("name") String name) {
        return restClient.discoveryPingForGet(name);
    }
    /**
     * 创建人：张博【zhangb@lianliantech.cn】
     * 时间：2018/5/28 下午3:29
     * @param name 姓名
     * @apiNote 使用feign客户端负载均衡 POST 请求
     */
    @RequestMapping(value = "/discoveryPingForPost/{name}", method = RequestMethod.GET)
    public String discoveryPingForPost(@PathVariable("name") String name) {
        User user = new User();
        user.setName(name);
        return restClient.discoveryPingForPost(user);
    }

    @RequestMapping(value = "/getConfigFromValue", method = RequestMethod.GET)
    public String getConfigFromValue() {
        return restClient.getConfigFromValue();
    }

    @RequestMapping(value = "/myHealthCheckF", method = RequestMethod.GET)
    public ResponseEntity<String>  myHealthCheck() {
        return restClient.myHealthCheck();
    }

    @GetMapping("/myHealthCheck")
    public ResponseEntity<String> myCustomCheck() {
        String message = "Testing my healh check function";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
