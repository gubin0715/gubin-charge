package com.gubin.commodity.service;

import com.gubin.commodity.domain.CommodityInfo;

import java.util.Map;

/**
 * @author GuBin
 */
public interface CommodityInfoService {

    public CommodityInfo getById(Integer id);

    void updateSaleNum(Map<String, Object> req);
}
