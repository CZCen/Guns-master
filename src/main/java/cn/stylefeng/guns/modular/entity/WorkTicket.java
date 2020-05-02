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

/**
 * (WorkTicket)实体类
 *
 * @author makejava
 * @since 2020-04-29 17:05:46
 */

@TableName("work_ticket")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WorkTicket extends Model<WorkTicket> implements Serializable {

    private static final long serialVersionUID = -29333755643037813L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    @TableField("work_place")
    private String workPlace;
    /**
    * 工作时间
    */
    @TableField("work_time")
    private String workTime;
    /**
    * 工作内容
    */
    @TableField("work_content")
    private String workContent;
    /**
    * 设备
    */

    private String equipment;
    /**
    * 材料
    */
    private String material;
    /**
    * 工作票评价
    */
    @TableField("ping_jia")
    private String pingJia;
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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    public String getWorkContent() {
        return workContent;
    }

    public void setWorkContent(String workContent) {
        this.workContent = workContent;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPingJia() {
        return pingJia;
    }

    public void setPingJia(String pingJia) {
        this.pingJia = pingJia;
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