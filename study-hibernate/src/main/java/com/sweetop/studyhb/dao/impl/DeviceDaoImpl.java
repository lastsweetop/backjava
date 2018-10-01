package com.sweetop.studyhb.dao.impl;

import com.sweetop.studyhb.dao.DeviceDao;
import com.sweetop.studyhb.domain.Device;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lastsweetop
 * Date: 2018/8/26
 * Time: 下午8:28
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class DeviceDaoImpl implements DeviceDao {
    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.openSession();
    }

    @Override
    public List<Device> selectAllDevices() {
        return getSession().createQuery("FROM Device").list();
    }
}
