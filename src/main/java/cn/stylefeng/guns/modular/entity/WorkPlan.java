package cn.stylefeng.guns.modular.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (WorkPlan)实体类
 *
 * @author makejava
 * @since 2020-04-29 17:05:46
 */
public class WorkPlan implements Serializable {
    private static final long serialVersionUID = -38968996942008196L;
    
    private Long id;
    
    private String workPlan;

    private String planDes;

    /**
    * 1：已审核 2：未审核
    */
    private Long auditStatus;
    
    private Long auditPeople;
    
    private Date auditTime;
    /**
    * 1:工作牌 2：操作票
    */
    private String typeName;
    /**
    * 项目id
    */
    private Long mgrId;

    private String auditStatusName;

    private String auditPeopleName;

    public String getAuditPeopleName() {
        return auditPeopleName;
    }

    public void setAuditPeopleName(String auditPeopleName) {
        this.auditPeopleName = auditPeopleName;
    }

    public String getAuditStatusName() {
        return auditStatusName;
    }

    public void setAuditStatusName(String auditStatusName) {
        this.auditStatusName = auditStatusName;
    }

    public String getPlanDes() {
        return planDes;
    }

    public void setPlanDes(String planDes) {
        this.planDes = planDes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWorkPlan() {
        return workPlan;
    }

    public void setWorkPlan(String workPlan) {
        this.workPlan = workPlan;
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