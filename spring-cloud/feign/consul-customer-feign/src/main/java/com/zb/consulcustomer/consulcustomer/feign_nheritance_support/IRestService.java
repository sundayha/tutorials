package com.zb.consulcustomer.consulcustomer.feign_nheritance_support;

import com.zb.consulcustomer.consulcustomer.controller.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 张博【zhangb@lianliantech.cn】
 * 使用 feign 对继承的支持更好的整合 API
 */
public interface IRestService {

    /**
     * 创建人：张博【zhangb@lianliantech.cn】
     * 时间：2018/5/29 上午11:45
     * @param name 名字
     * @return String
     * @apiNote consul service ‘zb-consul’ 中 GET 请求 API
     */
    @RequestMapping(value = "/discoveryPingForGet/{name}", method = RequestMethod.GET)
    String discoveryPingForGetRestService(@PathVariable("name") String name);

    /**
     * 创建人：张博【zhangb@lianliantech.cn】
     * 时间：2018/5/29 上午11:46
     * @param user user 对象
     * @return String
     * @apiNote consul service ‘zb-consul’ 中 POST 请求 API
     */
    @RequestMapping(value = "/discoveryPingForPost", method = RequestMethod.POST)
    String discoveryPingForPostRestService(@RequestBody User user);
}
