package com.gubin.system.controller;

import com.gubin.common.core.domain.R;
import com.gubin.common.log.annotation.Log;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author GuBin
 */
@RestController
@RequestMapping("test")
public class TestController {
    @PostMapping("api")
    @Log(key = "testApi", name = "测试api")
    public R<Map<String, Object>> testApi(@RequestBody Map<String, Object> param) {
        Map<String, Object> result = new HashMap<>();
        result.put("data", "aaaa");
        return R.ok(result);
    }
}
