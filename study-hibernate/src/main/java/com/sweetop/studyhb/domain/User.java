package com.sweetop.studyhb.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lastsweetop
 * Date: 2018/8/26
 * Time: 下午12:00
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "t_user")
public class User {
    private int id;
    private String email;
    private List<Device> devices;

    @Id
    @GeneratedValue(generator = "xxx")
    @GenericGenerator(name = "xxx", strategy = "native")
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


    @OneToMany(mappedBy = "user")
    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }
}

