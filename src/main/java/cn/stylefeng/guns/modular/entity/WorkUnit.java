package cn.stylefeng.guns.modular.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * (WorkUnit)实体类
 *
 * @author makejava
 * @since 2020-04-29 17:05:46
 */
@TableName("work_unit")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WorkUnit extends Model<WorkUnit> implements Serializable {
    private static final long serialVersionUID = 812559341653378614L;

    public WorkUnit(Long id) {
        this.id = id;
    }

    @TableId(type = IdType.AUTO)
    private Long id;

    @TableField("unit_name")
    private String unitName;
    /**
    * 资质
    */
    @TableField("zi_zhi")
    private String ziZhi;


    private String mobile;

    @TableField("create_time")
    private Date createTime;

    @TableField("create_user")
    private Long createUser;
    /**
    * 负责人
    */
    private Long principal;
    /**
    * 1:工作牌 2：操作票
    */
    @TableField("type_name")
    private String typeName;
    /**
    * 项目id
    */
    @TableField("mgr_id")
    private Long mgrId;

    @TableField("unit_type")
    private String unitType;


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

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }
}