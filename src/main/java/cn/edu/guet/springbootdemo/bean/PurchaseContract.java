package cn.edu.guet.springbootdemo.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * @Author 钟荣钊
 * @Date 2023/02/12
 * @Version 1.0
 * 采购合同
 */
public class PurchaseContract {
    private int id;
    private String purchaseContractNo;
    private String customerEnterpriseName;
    private String ownCompanyName;
    private String squeezeSeason;
    private Date inboundTime;
    private String goodsName;
    private BigDecimal goodsCount;
    private String goodsUnit;
    private BigDecimal goodsUnitPrice;
    private BigDecimal paymentAmount;
    private BigDecimal unpaidAmount;
    private String contractPhoto;
    private int pigeonhole;
    private int relationPaymentExistState;
    private int relationPaymentAuditState;
    private int relationLogisticsExistState;
    private Timestamp createTime;
    private String createBy;
    private Timestamp lastUpdateTime;
    private String lastUpdateBy;

    public PurchaseContract(){

    }

    public PurchaseContract(int id, String purchaseContractNo, String customerEnterpriseName, String ownCompanyName, String squeezeSeason, Date inboundTime, String goodsName, BigDecimal goodsCount, String goodsUnit, BigDecimal goodsUnitPrice, BigDecimal paymentAmount, BigDecimal unpaidAmount, String contractPhoto, int pigeonhole, int relationPaymentExistState, int relationPaymentAuditState, int relationLogisticsExistState, Timestamp createTime, String createBy, Timestamp lastUpdateTime, String lastUpdateBy) {
        this.id = id;
        this.purchaseContractNo = purchaseContractNo;
        this.customerEnterpriseName = customerEnterpriseName;
        this.ownCompanyName = ownCompanyName;
        this.squeezeSeason = squeezeSeason;
        this.inboundTime = inboundTime;
        this.goodsName = goodsName;
        this.goodsCount = goodsCount;
        this.goodsUnit = goodsUnit;
        this.goodsUnitPrice = goodsUnitPrice;
        this.paymentAmount = paymentAmount;
        this.unpaidAmount = unpaidAmount;
        this.contractPhoto = contractPhoto;
        this.pigeonhole = pigeonhole;
        this.relationPaymentExistState = relationPaymentExistState;
        this.relationPaymentAuditState = relationPaymentAuditState;
        this.relationLogisticsExistState = relationLogisticsExistState;
        this.createTime = createTime;
        this.createBy = createBy;
        this.lastUpdateTime = lastUpdateTime;
        this.lastUpdateBy = lastUpdateBy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPurchaseContractNo() {
        return purchaseContractNo;
    }

    public void setPurchaseContractNo(String purchaseContractNo) {
        this.purchaseContractNo = purchaseContractNo;
    }

    public String getCustomerEnterpriseName() {
        return customerEnterpriseName;
    }

    public void setCustomerEnterpriseName(String customerEnterpriseName) {
        this.customerEnterpriseName = customerEnterpriseName;
    }

    public String getOwnCompanyName() {
        return ownCompanyName;
    }

    public void setOwnCompanyName(String ownCompanyName) {
        this.ownCompanyName = ownCompanyName;
    }

    public String getSqueezeSeason() {
        return squeezeSeason;
    }

    public void setSqueezeSeason(String squeezeSeason) {
        this.squeezeSeason = squeezeSeason;
    }

    public Date getInboundTime() {
        return inboundTime;
    }

    public void setInboundTime(Date inboundTime) {
        this.inboundTime = inboundTime;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public BigDecimal getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(BigDecimal goodsCount) {
        this.goodsCount = goodsCount;
    }

    public String getGoodsUnit() {
        return goodsUnit;
    }

    public void setGoodsUnit(String goodsUnit) {
        this.goodsUnit = goodsUnit;
    }

    public BigDecimal getGoodsUnitPrice() {
        return goodsUnitPrice;
    }

    public void setGoodsUnitPrice(BigDecimal goodsUnitPrice) {
        this.goodsUnitPrice = goodsUnitPrice;
    }

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public BigDecimal getUnpaidAmount() {
        return unpaidAmount;
    }

    public void setUnpaidAmount(BigDecimal unpaidAmount) {
        this.unpaidAmount = unpaidAmount;
    }

    public String getContractPhoto() {
        return contractPhoto;
    }

    public void setContractPhoto(String contractPhoto) {
        this.contractPhoto = contractPhoto;
    }

    public int getPigeonhole() {
        return pigeonhole;
    }

    public void setPigeonhole(int pigeonhole) {
        this.pigeonhole = pigeonhole;
    }

    public int getRelationPaymentExistState() {
        return relationPaymentExistState;
    }

    public void setRelationPaymentExistState(int relationPaymentExistState) {
        this.relationPaymentExistState = relationPaymentExistState;
    }

    public int getRelationPaymentAuditState() {
        return relationPaymentAuditState;
    }

    public void setRelationPaymentAuditState(int relationPaymentAuditState) {
        this.relationPaymentAuditState = relationPaymentAuditState;
    }

    public int getRelationLogisticsExistState() {
        return relationLogisticsExistState;
    }

    public void setRelationLogisticsExistState(int relationLogisticsExistState) {
        this.relationLogisticsExistState = relationLogisticsExistState;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Timestamp getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Timestamp lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    @Override
    public String toString() {
        return "PurchaseContract{" +
                "id=" + id +
                ", purchaseContractNo='" + purchaseContractNo + '\'' +
                ", customerEnterpriseName='" + customerEnterpriseName + '\'' +
                ", ownCompanyName='" + ownCompanyName + '\'' +
                ", squeezeSeason='" + squeezeSeason + '\'' +
                ", inboundTime=" + inboundTime +
                ", goodsName='" + goodsName + '\'' +
                ", goodsCount=" + goodsCount +
                ", goodsUnit='" + goodsUnit + '\'' +
                ", goodsUnitPrice=" + goodsUnitPrice +
                ", paymentAmount=" + paymentAmount +
                ", unpaidAmount=" + unpaidAmount +
                ", contractPhoto='" + contractPhoto + '\'' +
                ", pigeonhole=" + pigeonhole +
                ", relationPaymentExistState=" + relationPaymentExistState +
                ", relationPaymentAuditState=" + relationPaymentAuditState +
                ", relationLogisticsExistState=" + relationLogisticsExistState +
                ", createTime=" + createTime +
                ", createBy='" + createBy + '\'' +
                ", lastUpdateTime=" + lastUpdateTime +
                ", lastUpdateBy='" + lastUpdateBy + '\'' +
                '}';
    }
}
