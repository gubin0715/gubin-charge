package com.gubin.order.service.commodity;

import com.gubin.common.core.constant.ServiceNameConstants;
import com.gubin.common.core.domain.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

/**
 * @author GuBin
 */
@FeignClient(contextId = "commodityService", value = ServiceNameConstants.COMMODITY_SERVICE)
public interface CommodityService {
    @PostMapping("/commodityInfo/updateSaleNum")
    public R<Boolean> updateSaleNum(@RequestBody Map<String, Object> req);
}
