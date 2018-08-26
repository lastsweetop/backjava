package com.sweetop.studymybatis.sqlprovider;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;

/**
 * Created with IntelliJ IDEA.
 * User: lastsweetop
 * Date: 2018/8/24
 * Time: 下午5:10
 * To change this template use File | Settings | File Templates.
 */
public class UserProvider {
    public String selectUser(@Param("id") int id) {
        return new SQL() {
            {
                SELECT("*");
                FROM("usertbl");
                WHERE("id=#{id}");
            }
        }.toString();

    }
}
