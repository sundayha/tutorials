package com.zb.consulcustomer.consulcustomer.controller;

import java.io.Serializable;

/**
 * @author 张博【zhangb@lianliantech.cn】
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1233311973556625426L;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
