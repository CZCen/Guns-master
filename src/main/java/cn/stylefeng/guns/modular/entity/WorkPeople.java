package cn.stylefeng.guns.modular.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (WorkPeople)实体类
 *
 * @author makejava
 * @since 2020-04-29 17:05:46
 */
public class WorkPeople implements Serializable {
    private static final long serialVersionUID = 761650861468374088L;
    
    private Long id;
    
    private String name;
    
    private String mobile;
    /**
    * 描述：设备部、基建部、安监部、调度部门、供电所负责人
    */
    private String description;
    
    private String ege;
    /**
    * 资质
    */
    private String ziZhi;
    /**
    * 1：已审核 2：未审核
    */
    private Long auditStatus;
    /**
    * 审核人员id
    */
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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEge() {
        return ege;
    }

    public void setEge(String ege) {
        this.ege = ege;
    }

    public String getZiZhi() {
        return ziZhi;
    }

    public void setZiZhi(String ziZhi) {
        this.ziZhi = ziZhi;
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