package cn.edu.guet.springbootdemo.bean;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * @Author 李冰冰
 * @Date 2023/02/12
 * @Version 17.0.5
 */

public class Company {
    int id;
    String ownCompanyName;
    Date createTime;
    String createBy;
    Date lastUpdateTime;
    String lastUpdateBy;

    public Company(){

    }
    public Company(int id, String ownCompanyName, Date createTime, String createBy, Date lastUpdateTime, String lastUpdateBy) {
        this.id = id;
        this.ownCompanyName = ownCompanyName;
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

    public String getOwnCompanyName() {
        return ownCompanyName;
    }

    public void setOwnCompanyName(String ownCompanyName) {
        this.ownCompanyName = ownCompanyName;
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
