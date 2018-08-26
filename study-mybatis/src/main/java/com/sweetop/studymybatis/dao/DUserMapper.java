package com.sweetop.studymybatis.dao;

import com.sweetop.studymybatis.domain.DUser;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lastsweetop
 * Date: 2018/8/25
 * Time: 下午12:44
 * To change this template use File | Settings | File Templates.
 */
public interface DUserMapper {
    @Select("select * from t_user where id=#{id}")
    DUser getDUserById(int id);

    @Select("select * from t_user")
    List<DUser> getAllDUser();
}
