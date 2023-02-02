package cn.edu.guet.springbootdemo.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 李冰冰
 * @Date 2023/2/1
 * @Version 1.0
 */

public class Permission {
    private int perId;
    private String name;
    private String url;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    private String icon;
    private int type;
    private int parentId;
    private String parentName;

    private List<Permission> childs=new ArrayList<>();

    public Permission() {
    }

    public Permission(int perId, String name, String url, String icon, int type, int parentId, String parentName, List<Permission> childs) {
        this.perId = perId;
        this.name = name;
        this.url = url;
        this.icon = icon;
        this.type = type;
        this.parentId = parentId;
        this.parentName = parentName;
        this.childs = childs;
    }

    public int getPerId() {
        return perId;
    }

    public void setPerId(int perId) {
        this.perId = perId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public List<Permission> getChilds() {
        return childs;
    }

    public void setChilds(List<Permission> childs) {
        this.childs = childs;
    }
}
