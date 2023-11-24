package com.gubin.order.service.user;

import com.gubin.common.core.constant.ServiceNameConstants;
import com.gubin.common.core.domain.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

/**
 * @author GuBin
 */
@FeignClient(contextId = "userAccountService", value = ServiceNameConstants.USER_SERVICE)
public interface UserAccountService {

    @PostMapping("/userInfo/updateUserAccount")
    public R<Boolean> updateUserAccount(@RequestBody Map<String, Object> req);
}
