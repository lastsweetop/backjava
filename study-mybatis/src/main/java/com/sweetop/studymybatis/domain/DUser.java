package com.sweetop.studymybatis.domain;

import com.alibaba.druid.support.json.JSONUtils;

/**
 * Created with IntelliJ IDEA.
 * User: lastsweetop
 * Date: 2018/8/25
 * Time: 下午12:44
 * To change this template use File | Settings | File Templates.
 */
public class DUser {
    private int id;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
