package cn.stylefeng.guns.modular.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * (Word1)实体类
 *
 * @author makejava
 * @since 2020-05-08 19:34:21
 */
public class Word1 extends Model<Word1> implements Serializable {
    private static final long serialVersionUID = -68339713922560830L;
    
    private Long id;
    /**
    * 工作内容
    */
    private String workcontent;
    
    private String workplan;
    
    private String mgrno;
    
    private String mgrname;
    
    private Long countpeople;
    /**
    * 1:工作牌 2：操作票
    */
    private String typeName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWorkcontent() {
        return workcontent;
    }

    public void setWorkcontent(String workcontent) {
        this.workcontent = workcontent;
    }

    public String getWorkplan() {
        return workplan;
    }

    public void setWorkplan(String workplan) {
        this.workplan = workplan;
    }

    public String getMgrno() {
        return mgrno;
    }

    public void setMgrno(String mgrno) {
        this.mgrno = mgrno;
    }

    public String getMgrname() {
        return mgrname;
    }

    public void setMgrname(String mgrname) {
        this.mgrname = mgrname;
    }

    public Long getCountpeople() {
        return countpeople;
    }

    public void setCountpeople(Long countpeople) {
        this.countpeople = countpeople;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

}