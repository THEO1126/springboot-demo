package cn.edu.guet.springbootdemo.bean;

import java.util.Date;

/**
 * @Author 李冰冰
 * @Date 2023/02/14
 * @Version 17.0.5
 * 外商仓库 （主要用在 采购单部分）
 */

public class OtherWarehouse {
    private int id; // 外商仓库ID
    private String factoryName; // 厂名
    private String goodsName; // 存储货物名称
    private int goodsCount; // 存储货物库存量
    private String goodsUnit;// 存储货物单位  斤
    private Date createTime;
    private String createBy;  // 创建者名称
    private Date lastUpdateTime; //最新更新时间
    private String lastUpdateBy;

    public OtherWarehouse(int id, String factoryName, String goodsName, int goodsCount, String goodsUnit, Date createTime, String createBy, Date lastUpdateTime, String lastUpdateBy) {
        this.id = id;
        this.factoryName = factoryName;
        this.goodsName = goodsName;
        this.goodsCount = goodsCount;
        this.goodsUnit = goodsUnit;
        this.createTime = createTime;
        this.createBy = createBy;
        this.lastUpdateTime = lastUpdateTime;
        this.lastUpdateBy = lastUpdateBy;
    }

    public OtherWarehouse() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public int getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(int goodsCount) {
        this.goodsCount = goodsCount;
    }

    public String getGoodsUnit() {
        return goodsUnit;
    }

    public void setGoodsUnit(String goodsUnit) {
        this.goodsUnit = goodsUnit;
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
}
