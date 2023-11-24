package com.gubin.commodity.service.impl;

import com.gubin.commodity.domain.CommodityInfo;
import com.gubin.commodity.mapper.CommodityInfoMapper;
import com.gubin.commodity.service.CommodityInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author GuBin
 */
@Service
public class CommodityInfoServiceImpl implements CommodityInfoService {

    @Resource
    private CommodityInfoMapper commodityInfoMapper;

    @Override
    public CommodityInfo getById(Integer id) {
        return commodityInfoMapper.selectById(id);
    }

    @Override
    public void updateSaleNum(Map<String, Object> req) {
        commodityInfoMapper.updateSaleNum(Integer.valueOf(req.get("commodityId").toString()), Integer.valueOf(req.get("saleNum").toString()));
    }
}
