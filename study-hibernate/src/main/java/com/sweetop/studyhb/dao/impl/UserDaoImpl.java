package com.sweetop.studyhb.dao.impl;

import com.sweetop.studyhb.dao.UserDao;
import com.sweetop.studyhb.domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lastsweetop
 * Date: 2018/8/26
 * Time: 下午6:56
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.openSession();
    }

    @Override
    public List<User> selectAllUsers() {
        return getSession().createQuery("FROM User").list();
    }
}
