package cn.edu.guet.springbootdemo.bean;

import java.sql.Timestamp;

/**
 * @Author 钟荣钊
 * @Date 2023/02/13
 * @Version 1.0
 */
public class PurchaseDirectorState {
    private int id;
    private int purchasePaymentContractId;
    private int userId;
    private int state;
    private Timestamp createTime;
    private String createBy;
    private Timestamp lastUpdateTime;
    private String lastUpdateBy;

    public PurchaseDirectorState() {
    }

    public PurchaseDirectorState(int id, int purchasePaymentContractId, int userId, int state, Timestamp createTime, String createBy, Timestamp lastUpdateTime, String lastUpdateBy) {
        this.id = id;
        this.purchasePaymentContractId = purchasePaymentContractId;
        this.userId = userId;
        this.state = state;
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

    public int getPurchasePaymentContractId() {
        return purchasePaymentContractId;
    }

    public void setPurchasePaymentContractId(int purchasePaymentContractId) {
        this.purchasePaymentContractId = purchasePaymentContractId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
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
        return "PurchaseDirectorState{" +
                "id=" + id +
                ", purchasePaymentContractId=" + purchasePaymentContractId +
                ", userId=" + userId +
                ", state=" + state +
                ", createTime=" + createTime +
                ", createBy='" + createBy + '\'' +
                ", lastUpdateTime=" + lastUpdateTime +
                ", lastUpdateBy='" + lastUpdateBy + '\'' +
                '}';
    }
}
