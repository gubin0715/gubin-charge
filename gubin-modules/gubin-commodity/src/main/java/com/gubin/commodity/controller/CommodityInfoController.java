package com.gubin.commodity.controller;

import com.gubin.commodity.domain.CommodityInfo;
import com.gubin.commodity.service.CommodityInfoService;
import com.gubin.common.core.domain.R;
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
@RequestMapping("commodityInfo")
public class CommodityInfoController {

    @Autowired
    private CommodityInfoService commodityInfoService;

    @PostMapping("getById")
    public R<CommodityInfo> getById(Integer id) {
        return R.ok(commodityInfoService.getById(id));
    }

    @PostMapping("updateSaleNum")
    public R<Boolean> updateSaleNum(@RequestBody Map<String,Object> req){
        commodityInfoService.updateSaleNum(req);
        return R.ok();
    }
}
