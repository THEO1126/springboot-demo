package cn.edu.guet.springbootdemo.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author liwei
 * @Date 2022/12/29 10:59
 * @Version 1.0
 */
public class Permission {

    private int perId;
    private String name;
    private String url;
    private String target;
    private String icon;
    private String isParent;
    private Integer parentId;
    private List<Permission> childs=new ArrayList<>();
    //private Permission parent;

    public Permission() {
    }

    public Permission(int perId, String name, String url, String target, String icon, String isParent, Integer parentId, List<Permission> childs) {
        this.perId = perId;
        this.name = name;
        this.url = url;
        this.target = target;
        this.icon = icon;
        this.isParent = isParent;
        this.parentId = parentId;
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

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIsParent() {
        return isParent;
    }

    public void setIsParent(String isParent) {
        this.isParent = isParent;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public List<Permission> getChilds() {
        return childs;
    }

    public void setChilds(List<Permission> childs) {
        this.childs = childs;
    }
}