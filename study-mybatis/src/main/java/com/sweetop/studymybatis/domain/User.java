package com.sweetop.studymybatis.domain;

/**
 * Created with IntelliJ IDEA.
 * User: lastsweetop
 * Date: 2018/8/23
 * Time: 下午7:14
 * To change this template use File | Settings | File Templates.
 */
public class User {
    private int id;
    private String username;
    private String usrPubID;
    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getUsrPubID() {
        return usrPubID;
    }

    public void setUsrPubID(String usrPubID) {
        this.usrPubID = usrPubID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ",username=" + username + ",usrPubID=" + usrPubID + ",role=" + role + "]";
    }
}
