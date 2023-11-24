package com.gubin.user.service.impl;

import com.gubin.user.domain.UserInfo;
import com.gubin.user.mapper.UserAccountMapper;
import com.gubin.user.mapper.UserInfoMapper;
import com.gubin.user.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Map;

/**
 * @author GuBin
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;
    @Resource
    private UserAccountMapper userAccountMapper;

    @Override
    public UserInfo getById(Integer id) {
        return userInfoMapper.selectById(id);
    }

    @Override
    public Boolean updateUserAccount(Map<String, Object> userAccountReq) {
        return userAccountMapper.updateUserAccount(Integer.valueOf(userAccountReq.get("userId").toString()), new BigDecimal(userAccountReq.get("changeAmount").toString()));
    }
}
