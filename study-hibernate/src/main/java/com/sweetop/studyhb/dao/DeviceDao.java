package com.sweetop.studyhb.dao;

import com.sweetop.studyhb.domain.Device;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lastsweetop
 * Date: 2018/8/26
 * Time: 下午8:27
 * To change this template use File | Settings | File Templates.
 */
public interface DeviceDao {

    List<Device> selectAllDevices();
}
