package com.zb.consulcustomer.consulcustomer.feign_nheritance_support;

import com.zb.consulcustomer.consulcustomer.controller.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 张博【zhangb@lianliantech.cn】
 */
@RestController
public class RestServiceImpl implements IRestService {

    /**
     * 使用 feign 的 fallback 时，spring 不知道选择注入哪个been 所以 @FeignClient 默认为 primary true
     */
    @Autowired
    private RestClientService restClient;


    /**
     * 创建人：张博【zhangb@lianliantech.cn】
     * 时间：2018/5/28 下午3:29
     * @param name 姓名
     * @apiNote 使用feign客户端负载均衡 GET 请求
     */
    @RequestMapping(value = "/discoveryPingForGetRestService/{name}", method = RequestMethod.GET)
    @ResponseBody
    @Override
    public String discoveryPingForGetRestService(@PathVariable("name") String name) {
        return restClient.discoveryPingForGetRestService(name);
    }

    /**
     * 创建人：张博【zhangb@lianliantech.cn】
     * 时间：2018/5/28 下午3:29
     * @param user 用户对象
     * @apiNote 使用feign客户端负载均衡 POST 请求
     */
    @RequestMapping(value = "/discoveryPingForPostRestService", method = RequestMethod.POST)
    @Override
    public String discoveryPingForPostRestService(@RequestBody User user) {
        return restClient.discoveryPingForPostRestService(user);
    }
}
