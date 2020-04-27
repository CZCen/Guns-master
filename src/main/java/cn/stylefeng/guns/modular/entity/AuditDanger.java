package cn.stylefeng.guns.modular.entity;

public class AuditDanger {
    private Long id;

    private String dangerPoint;

    private Long auditPeople;

    private Long auditStatus;

    private String auditAdd;

    private String typeName;

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
        this.dangerPoint = dangerPoint == null ? null : dangerPoint.trim();
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
        this.auditAdd = auditAdd == null ? null : auditAdd.trim();
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public Long getMgrId() {
        return mgrId;
    }

    public void setMgrId(Long mgrId) {
        this.mgrId = mgrId;
    }
}