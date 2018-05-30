package com.zb.consulclient.consulclient.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * @author 张博【zhangb@lianliantech.cn】
 */
@RefreshScope
@Configuration
@ConfigurationProperties("my")
public class MyProperties {
    private String prop;

    public String getProp() {
        return prop;
    }

    public void setProp(String prop) {
        this.prop = prop;
    }
}
