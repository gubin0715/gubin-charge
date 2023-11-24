package com.gubin.order.service;

import com.gubin.common.core.domain.R;
import com.gubin.order.domain.OrderInfo;

import java.util.Map;

/**
 * @author GuBin
 */
public interface OrderInfoService {

    public OrderInfo getById(Integer id);

    R<Boolean> createOrder(Map<String, Object> req);
}
