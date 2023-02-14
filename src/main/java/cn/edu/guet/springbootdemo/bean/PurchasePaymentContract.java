package cn.edu.guet.springbootdemo.bean;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * @Author 钟荣钊
 * @Date 2023/02/13
 * @Version 1.0
 */
public class PurchasePaymentContract {
    private int id;
    private String purchaseContractNo;
    private String cashier;
    private BigDecimal paymentCount;
    private Date paymentTime;
    private String paymentPhoto;
    private String financeStaff;
    private int financeState;
    private Timestamp createTime;
    private String createBy;
    private Timestamp lastUpdateTime;
    private String lastUpdateBy;

    public PurchasePaymentContract() {}

    public PurchasePaymentContract(int id, String purchaseContractNo, String cashier, BigDecimal paymentCount, Date paymentTime, String paymentPhoto, String financeStaff, int financeState, Timestamp createTime, String createBy, Timestamp lastUpdateTime, String lastUpdateBy) {
        this.id = id;
        this.purchaseContractNo = purchaseContractNo;
        this.cashier = cashier;
        this.paymentCount = paymentCount;
        this.paymentTime = paymentTime;
        this.paymentPhoto = paymentPhoto;
        this.financeStaff = financeStaff;
        this.financeState = financeState;
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

    public String getCashier() {
        return cashier;
    }

    public void setCashier(String cashier) {
        this.cashier = cashier;
    }

    public BigDecimal getPaymentCount() {
        return paymentCount;
    }

    public void setPaymentCount(BigDecimal paymentCount) {
        this.paymentCount = paymentCount;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public String getPaymentPhoto() {
        return paymentPhoto;
    }

    public void setPaymentPhoto(String paymentPhoto) {
        this.paymentPhoto = paymentPhoto;
    }

    public String getFinanceStaff() {
        return financeStaff;
    }

    public void setFinanceStaff(String financeStaff) {
        this.financeStaff = financeStaff;
    }

    public int getFinanceState() {
        return financeState;
    }

    public void setFinanceState(int financeState) {
        this.financeState = financeState;
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
        return "PurchasePaymentContract{" +
                "id=" + id +
                ", purchaseContractNo='" + purchaseContractNo + '\'' +
                ", cashier='" + cashier + '\'' +
                ", paymentCount=" + paymentCount +
                ", paymentTime=" + paymentTime +
                ", paymentPhoto='" + paymentPhoto + '\'' +
                ", financeStaff='" + financeStaff + '\'' +
                ", financeState=" + financeState +
                ", createTime=" + createTime +
                ", createBy='" + createBy + '\'' +
                ", lastUpdateTime=" + lastUpdateTime +
                ", lastUpdateBy='" + lastUpdateBy + '\'' +
                '}';
    }
}
