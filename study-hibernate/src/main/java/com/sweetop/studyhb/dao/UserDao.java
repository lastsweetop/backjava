package com.sweetop.studyhb.dao;

import com.sweetop.studyhb.domain.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lastsweetop
 * Date: 2018/8/26
 * Time: 下午6:56
 * To change this template use File | Settings | File Templates.
 */
public interface UserDao {
    
    List<User> selectAllUsers();
}
