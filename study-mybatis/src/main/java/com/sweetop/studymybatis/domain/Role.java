package com.sweetop.studymybatis.domain;

/**
 * Created with IntelliJ IDEA.
 * User: lastsweetop
 * Date: 2018/8/24
 * Time: 下午12:00
 * To change this template use File | Settings | File Templates.
 */
public class Role {
    private int id;
    private int roleId;
    private String roleName;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "Role [ id=" + id + ",roleId=" + roleId+",roleName=" + roleName + "]";
    }
}
