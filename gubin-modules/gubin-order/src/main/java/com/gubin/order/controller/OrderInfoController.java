package com.gubin.order.controller;

import com.gubin.common.core.domain.R;
import com.gubin.order.domain.OrderInfo;
import com.gubin.order.service.OrderInfoService;
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
@RequestMapping("orderInfo")
public class OrderInfoController {

    @Autowired
    private OrderInfoService orderInfoService;

    @PostMapping("getById")
    public R<OrderInfo> getById(Integer id) {
        return R.ok(orderInfoService.getById(id));
    }

    @PostMapping("createOrder")
    public R<Boolean> createOrder(@RequestBody Map<String,Object> req){
        return orderInfoService.createOrder(req);
    }
}
