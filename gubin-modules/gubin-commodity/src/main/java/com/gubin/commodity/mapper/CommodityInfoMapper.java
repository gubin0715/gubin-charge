package com.gubin.commodity.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gubin.commodity.domain.CommodityInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author GuBin
 */
@Mapper
public interface CommodityInfoMapper extends BaseMapper<CommodityInfo> {

    void updateSaleNum(@Param("id") Integer id, @Param("saleNum") Integer saleNum);
}
