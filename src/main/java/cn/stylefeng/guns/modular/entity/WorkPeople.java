package cn.stylefeng.guns.modular.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (WorkPeople)实体类
 *
 * @author makejava
 * @since 2020-04-29 17:05:46
 */

@Data
@TableName("work_people")
public class WorkPeople implements Serializable {
    private static final long serialVersionUID = 761650861468374088L;

    @TableId(value = "ID", type = IdType.ID_WORKER)
    private Long id;

    @TableId(value = "NAME")
    private String name;

    @TableId(value = "MOBILE")
    private String mobile;
    /**
    * 描述：设备部、基建部、安监部、调度部门、供电所负责人
    */
    @TableId(value = "DESCRIPTION")
    private String description;

    @TableId(value = "EGE")
    private String ege;
    /**
    * 资质
    */
    @TableId(value = "ZI_ZHI")
    private String ziZhi;
    /**
    * 1：已审核 2：未审核
    */
    @TableId(value = "AUDIT_STATUS")
    private Long auditStatus;
    /**
    * 审核人员id
    */
    @TableId(value = "AUDIT_PEOPLE")
    private Long auditPeople;

    @TableId(value = "AUDIT_TIME")
    private Date auditTime;
    /**
    * 1:工作牌 2：操作票
    */
    @TableId(value = "TYPE_NAME")
    private String typeName;
    /**
    * 项目id
    */
    @TableId(value = "MGR_ID")
    private Long mgrId;


}