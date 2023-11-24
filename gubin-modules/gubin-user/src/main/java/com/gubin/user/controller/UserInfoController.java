package com.gubin.user.controller;

import com.gubin.common.core.domain.R;
import com.gubin.user.domain.UserInfo;
import com.gubin.user.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author GuBin
 */
@RestController
@RequestMapping("userInfo")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @PostMapping("getById")
    public R<UserInfo> getById(Integer id) {
        return R.ok(userInfoService.getById(id));
    }

    @PostMapping("updateUserAccount")
    public R<Boolean> updateUserAccount(@RequestBody Map<String, Object> userAccountReq) {
        return R.ok(userInfoService.updateUserAccount(userAccountReq));
    }
}
