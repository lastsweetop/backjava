package com.sweetop.studymybatis.sqlprovider;

import com.sweetop.studymybatis.domain.Role;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: lastsweetop
 * Date: 2018/8/24
 * Time: 下午4:04
 * To change this template use File | Settings | File Templates.
 */
public class RoleProvider {
    public String selectRole(@Param("roleId") int roleId) {
        return "select * from userroletbl where roleId=#{roleId}";
    }
}
