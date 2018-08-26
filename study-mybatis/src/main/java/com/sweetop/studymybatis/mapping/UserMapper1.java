package com.sweetop.studymybatis.mapping;

import com.sweetop.studymybatis.domain.Role;
import com.sweetop.studymybatis.domain.User;
import com.sweetop.studymybatis.sqlprovider.RoleProvider;
import com.sweetop.studymybatis.sqlprovider.UserProvider;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.cache.decorators.FifoCache;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;
import java.util.Map;
import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * User: lastsweetop
 * Date: 2018/8/24
 * Time: 上午10:31
 * To change this template use File | Settings | File Templates.
 */
@CacheNamespace(flushInterval = 60000, size = 512, eviction = FifoCache.class, readWrite = false)
public interface UserMapper1 {

    @Insert("insert into usertbl (username,UsrPubID) values (#{username},#{usrPubID})")
    int add(User user);

    @Update("update usertbl set username=#{username},UsrPubID=#{usrPubID} where id=#{id}")
    int update(User user);


    @Delete("delete from usertbl where id=#{id}")
    int deleteById(int id);

    @Select("select * from usertbl")
    List<User> getAll();

    //    @Select("select * from usertbl where id=#{id}")
    @SelectProvider(type = UserProvider.class, method = "selectUser")
    @Results({
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "username", property = "username"),
            @Result(column = "usrPubID", property = "usrPubID"),
            @Result(column = "roleId", property = "role", one = @One(
                    select = "com.sweetop.studymybatis.mapping.UserMapper1.getRole", fetchType = FetchType.LAZY
            ))
    })
    User getById(@Param("id") int id);


    @Select("select * from userroletbl where roleId=#{roleId}")
    Role getRole(@Param("roleId") int roleId);
}
