package cn.stylefeng.guns.modular.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (AuditBottom)实体类
 *
 * @author makejava
 * @since 2020-04-29 17:05:45
 */
public class AuditBottom implements Serializable {
    private static final long serialVersionUID = 358734224700323921L;
    
    private Long id;
    /**
    * 描述
    */
    private String des;
    /**
    * 1：已审核 2：未审核
    */
    private Long auditStatus;
    
    private Long auditPeople;
    
    private Date auditTime;
    
    private String typeName;
    /**
    * 项目id
    */
    private Long mgrId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Long getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Long auditStatus) {
        this.auditStatus = auditStatus;
    }

    public Long getAuditPeople() {
        return auditPeople;
    }

    public void setAuditPeople(Long auditPeople) {
        this.auditPeople = auditPeople;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Long getMgrId() {
        return mgrId;
    }

    public void setMgrId(Long mgrId) {
        this.mgrId = mgrId;
    }

}