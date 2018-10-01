package com.sweetop.studyhb.service.impl;

import com.sweetop.studyhb.dao.UserDao;
import com.sweetop.studyhb.domain.User;
import com.sweetop.studyhb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lastsweetop
 * Date: 2018/8/26
 * Time: 下午6:53
 * To change this template use File | Settings | File Templates.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getAllUsers() {
        return userDao.selectAllUsers();
    }
}
