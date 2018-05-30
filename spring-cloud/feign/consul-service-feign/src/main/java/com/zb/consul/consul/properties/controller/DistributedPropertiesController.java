package com.zb.consul.consul.properties.controller;

import com.zb.consul.consul.properties.MyProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张博【zhangb@lianliantech.cn】
 */
@RestController
public class DistributedPropertiesController {
    @Value("${my.prop}")
    String value;

    @Autowired
    private MyProperties properties;

    /**
     * 创建人：张博【zhangb@lianliantech.cn】
     * 时间：2018/5/25 下午3:58
     * @apiNote 得到 consul 中的预定好的 key/value 中的 value
     * @return string
     */
    @GetMapping("/getConfigFromValue")
    public String getConfigFromValue() {
        return value;
    }

    @GetMapping("/getConfigFromProperty")
    public String getConfigFromProperty() {
        return properties.getProp();
    }
}
