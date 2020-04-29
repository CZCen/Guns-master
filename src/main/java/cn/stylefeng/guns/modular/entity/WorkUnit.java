package cn.stylefeng.guns.modular.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (WorkUnit)实体类
 *
 * @author makejava
 * @since 2020-04-29 17:05:46
 */
public class WorkUnit implements Serializable {
    private static final long serialVersionUID = 812559341653378614L;
    
    private Long id;
    
    private String unitName;
    /**
    * 资质
    */
    private String ziZhi;
    
    private String mobile;
    
    private Date createTime;
    
    private Long createUser;
    /**
    * 负责人
    */
    private Long principal;
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

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getZiZhi() {
        return ziZhi;
    }

    public void setZiZhi(String ziZhi) {
        this.ziZhi = ziZhi;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public Long getPrincipal() {
        return principal;
    }

    public void setPrincipal(Long principal) {
        this.principal = principal;
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