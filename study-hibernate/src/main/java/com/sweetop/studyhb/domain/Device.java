package com.sweetop.studyhb.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: lastsweetop
 * Date: 2018/8/26
 * Time: 下午1:22
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "t_device")
public class Device {
    private int id;
    private User user;
    private String dcode;
    private String name;


    @Id
    @GeneratedValue(generator = "xxx")
    @GenericGenerator(name = "xxx", strategy = "native")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userid")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDcode() {
        return dcode;
    }

    public void setDcode(String dcode) {
        this.dcode = dcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
