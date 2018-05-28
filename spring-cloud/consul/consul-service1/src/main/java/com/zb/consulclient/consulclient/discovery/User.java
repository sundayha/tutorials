package com.zb.consulclient.consulclient.discovery;

import java.io.Serializable;

/**
 * @author 张博【zhangb@lianliantech.cn】
 */
public class User implements Serializable {

    private static final long serialVersionUID = -4920103314251434109L;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
