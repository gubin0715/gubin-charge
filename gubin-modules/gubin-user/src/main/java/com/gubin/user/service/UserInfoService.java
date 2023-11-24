package com.gubin.user.service;

import com.gubin.user.domain.UserInfo;

import java.util.Map;

/**
 * @author GuBin
 */
public interface UserInfoService {

    public UserInfo getById(Integer id);

    Boolean updateUserAccount(Map<String, Object> userAccountReq);
}
