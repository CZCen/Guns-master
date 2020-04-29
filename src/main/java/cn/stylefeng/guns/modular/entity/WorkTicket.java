package cn.stylefeng.guns.modular.entity;

import java.io.Serializable;

/**
 * (WorkTicket)实体类
 *
 * @author makejava
 * @since 2020-04-29 17:05:46
 */
public class WorkTicket implements Serializable {
    private static final long serialVersionUID = -29333755643037813L;
    
    private Long id;
    
    private String workPlace;
    /**
    * 工作时间
    */
    private String workTime;
    /**
    * 工作内容
    */
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
    private String pingJia;
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