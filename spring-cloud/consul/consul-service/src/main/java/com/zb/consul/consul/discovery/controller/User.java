package com.zb.consul.consul.discovery.controller;

import java.io.Serializable;

/**
 * @author 张博【zhangb@lianliantech.cn】
 */
public class User implements Serializable {

    private static final long serialVersionUID = -7882159252326623134L;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
