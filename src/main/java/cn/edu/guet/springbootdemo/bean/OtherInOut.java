package cn.edu.guet.springbootdemo.bean;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author 李冰冰
 * @Date 2023/02/14
 * @Version 17.0.5
 * 外商仓库出入库流水 (主要用于采购单部分）
 */

public class OtherInOut {
    private int id;  // 外商仓库出入库流水ID
    private int otherWarehouseId; // 外商仓库ID
    private int inOutType; // 出入库类型（出库0，入库1）
    private String inOutContractNo; // 采购合同编号/物流单合同编号
    private String inOutGoodsName;// 出入库货物名称
    private BigDecimal inOutGoodsCount ; // 出入库货物数量
    private String inOutGoodsUnit ;// 出入库货物单位
    private BigDecimal inOutGoodsUnitPrice;  // 采购货物单价（即采购单入库时才需填写）
    private Date inOutTime; //  出入库日期
    private Date createTime;
    private String createBy;  // 创建者名称
    private Date lastUpdateTime; //最新更新时间
    private String lastUpdateBy;
    private OtherWarehouse otherWarehouse; // 外商仓库

    public OtherWarehouse getOtherWarehouse() {
        return otherWarehouse;
    }

    public void setOtherWarehouse(OtherWarehouse otherWarehouse) {
        this.otherWarehouse = otherWarehouse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOtherWarehouseId() {
        return otherWarehouseId;
    }

    public void setOtherWarehouseId(int otherWarehouseId) {
        this.otherWarehouseId = otherWarehouseId;
    }

    public int getInOutType() {
        return inOutType;
    }

    public void setInOutType(int inOutType) {
        this.inOutType = inOutType;
    }

    public String getInOutContractNo() {
        return inOutContractNo;
    }

    public void setInOutContractNo(String inOutContractNo) {
        this.inOutContractNo = inOutContractNo;
    }

    public String getInOutGoodsName() {
        return inOutGoodsName;
    }

    public void setInOutGoodsName(String inOutGoodsName) {
        this.inOutGoodsName = inOutGoodsName;
    }

    public BigDecimal getInOutGoodsCount() {
        return inOutGoodsCount;
    }

    public void setInOutGoodsCount(BigDecimal inOutGoodsCount) {
        this.inOutGoodsCount = inOutGoodsCount;
    }

    public OtherInOut() {
    }

    public String getInOutGoodsUnit() {
        return inOutGoodsUnit;
    }

    public void setInOutGoodsUnit(String inOutGoodsUnit) {
        this.inOutGoodsUnit = inOutGoodsUnit;
    }

    public BigDecimal getInOutGoodsUnitPrice() {
        return inOutGoodsUnitPrice;
    }

    public void setInOutGoodsUnitPrice(BigDecimal inOutGoodsUnitPrice) {
        this.inOutGoodsUnitPrice = inOutGoodsUnitPrice;
    }

    public Date getInOutTime() {
        return inOutTime;
    }

    public void setInOutTime(Date inOutTime) {
        this.inOutTime = inOutTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    public OtherInOut(int id, int otherWarehouseId, int inOutType, String inOutContractNo, String inOutGoodsName, BigDecimal inOutGoodsCount, String inOutGoodsUnit, BigDecimal inOutGoodsUnitPrice, Date inOutTime, Date createTime, String createBy, Date lastUpdateTime, String lastUpdateBy, OtherWarehouse otherWarehouse) {
        this.id = id;
        this.otherWarehouseId = otherWarehouseId;
        this.inOutType = inOutType;
        this.inOutContractNo = inOutContractNo;
        this.inOutGoodsName = inOutGoodsName;
        this.inOutGoodsCount = inOutGoodsCount;
        this.inOutGoodsUnit = inOutGoodsUnit;
        this.inOutGoodsUnitPrice = inOutGoodsUnitPrice;
        this.inOutTime = inOutTime;
        this.createTime = createTime;
        this.createBy = createBy;
        this.lastUpdateTime = lastUpdateTime;
        this.lastUpdateBy = lastUpdateBy;
        this.otherWarehouse = otherWarehouse;
    }
}
