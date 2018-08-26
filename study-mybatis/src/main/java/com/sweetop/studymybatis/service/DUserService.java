package com.sweetop.studymybatis.service;

import com.sweetop.studymybatis.domain.DUser;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lastsweetop
 * Date: 2018/8/25
 * Time: 下午12:49
 * To change this template use File | Settings | File Templates.
 */
public interface DUserService {
    DUser getDUserById(int id);

    List<DUser> getAllDUser();
}
