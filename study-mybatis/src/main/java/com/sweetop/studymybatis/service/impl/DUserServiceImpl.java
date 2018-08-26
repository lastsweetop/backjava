package com.sweetop.studymybatis.service.impl;

import com.sweetop.studymybatis.dao.DUserMapper;
import com.sweetop.studymybatis.domain.DUser;
import com.sweetop.studymybatis.service.DUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lastsweetop
 * Date: 2018/8/25
 * Time: 下午12:51
 * To change this template use File | Settings | File Templates.
 */
@Service("dUserService")
public class DUserServiceImpl implements DUserService {

    @Autowired
    private DUserMapper dUserMapper;

    @Override
    public DUser getDUserById(int id) {
        return dUserMapper.getDUserById(id);
    }

    @Override
    public List<DUser> getAllDUser() {
        return dUserMapper.getAllDUser();
    }


}
