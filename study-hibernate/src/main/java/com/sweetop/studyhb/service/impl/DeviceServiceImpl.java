package com.sweetop.studyhb.service.impl;

import com.sweetop.studyhb.dao.DeviceDao;
import com.sweetop.studyhb.domain.Device;
import com.sweetop.studyhb.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lastsweetop
 * Date: 2018/8/26
 * Time: 下午8:31
 * To change this template use File | Settings | File Templates.
 */
@Service
public class DeviceServiceImpl implements DeviceService {

    @Autowired
    private DeviceDao deviceDao;

    @Override
    public List<Device> getAllDevices() {
        return deviceDao.selectAllDevices();
    }
}
