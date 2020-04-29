package cn.stylefeng.guns.modular.entity;

import java.io.Serializable;

/**
 * (AuditDanger)实体类
 *
 * @author makejava
 * @since 2020-04-29 17:05:45
 */
public class AuditDanger implements Serializable {
    private static final long serialVersionUID = 281348884792335698L;
    
    private Long id;
    
    private String dangerPoint;
    /**
    * work_people人员id
    */
    private Long auditPeople;
    /**
    * 1：已审核 2：未审核
    */
    private Long auditStatus;
    /**
    * 审核补充
    */
    private String auditAdd;
    /**
    * 1:工作票 2：操作票
    */
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

    public String getDangerPoint() {
        return dangerPoint;
    }

    public void setDangerPoint(String dangerPoint) {
        this.dangerPoint = dangerPoint;
    }

    public Long getAuditPeople() {
        return auditPeople;
    }

    public void setAuditPeople(Long auditPeople) {
        this.auditPeople = auditPeople;
    }

    public Long getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Long auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getAuditAdd() {
        return auditAdd;
    }

    public void setAuditAdd(String auditAdd) {
        this.auditAdd = auditAdd;
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