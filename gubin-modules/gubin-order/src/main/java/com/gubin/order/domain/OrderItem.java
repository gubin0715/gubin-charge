package com.gubin.order.domain;

import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author GuBin
 */
@TableName("order_item")
public class OrderItem {
    private Integer id;

    private Integer orderId;

    private Integer commodityId;

    private String commodityName;

    private BigDecimal commodityPrice;

    private Integer commoditySpecId;

    private String commoditySpecName;

    private BigDecimal commoditySpecPrice;

    public Integer buyNum;

    public BigDecimal itemAmount;

    public BigDecimal itemPayAmount;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public BigDecimal getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(BigDecimal commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public Integer getCommoditySpecId() {
        return commoditySpecId;
    }

    public void setCommoditySpecId(Integer commoditySpecId) {
        this.commoditySpecId = commoditySpecId;
    }

    public String getCommoditySpecName() {
        return commoditySpecName;
    }

    public void setCommoditySpecName(String commoditySpecName) {
        this.commoditySpecName = commoditySpecName;
    }

    public BigDecimal getCommoditySpecPrice() {
        return commoditySpecPrice;
    }

    public void setCommoditySpecPrice(BigDecimal commoditySpecPrice) {
        this.commoditySpecPrice = commoditySpecPrice;
    }

    public Integer getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
    }

    public BigDecimal getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(BigDecimal itemAmount) {
        this.itemAmount = itemAmount;
    }

    public BigDecimal getItemPayAmount() {
        return itemPayAmount;
    }

    public void setItemPayAmount(BigDecimal itemPayAmount) {
        this.itemPayAmount = itemPayAmount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
