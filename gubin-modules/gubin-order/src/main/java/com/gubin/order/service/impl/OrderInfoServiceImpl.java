package com.gubin.order.service.impl;

import com.gubin.common.core.domain.R;
import com.gubin.order.domain.OrderInfo;
import com.gubin.order.mapper.OrderInfoMapper;
import com.gubin.order.mapper.OrderItemMapper;
import com.gubin.order.service.OrderInfoService;
import com.gubin.order.service.commodity.CommodityService;
import com.gubin.order.service.user.UserAccountService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

/**
 * @author GuBin
 */
@Service
public class OrderInfoServiceImpl implements OrderInfoService {

    @Resource
    private OrderInfoMapper orderInfoMapper;
    @Autowired
    private UserAccountService userAccountService;
    @Autowired
    private CommodityService commodityService;

    @Override
    public OrderInfo getById(Integer id) {
        return orderInfoMapper.selectById(id);
    }

    @Override
    @Transactional
    @GlobalTransactional
    public R<Boolean> createOrder(Map<String, Object> req) {
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setUserId(1);
        orderInfo.setOrderNo("O123456789");
        orderInfo.setOrderAmount(new BigDecimal("1000"));
        orderInfo.setPayAmount(new BigDecimal("899"));
        orderInfo.setOrderStatus(1);
        orderInfo.setCreateTime(new Date());
        orderInfo.setUpdateTime(new Date());
        orderInfoMapper.insert(orderInfo);
        req.put("userId", 1);
        req.put("changeAmount", 10.00);
        userAccountService.updateUserAccount(req);
        req.put("commodityId", 1);
        req.put("saleNum", 1);
        commodityService.updateSaleNum(req);
        int a = 1/0;
        return R.ok();
    }
}
