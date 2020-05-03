package cn.stylefeng.guns.modular.entity;

import java.io.Serializable;

/**
 * (Mgr)实体类
 *
 * @author makejava
 * @since 2020-04-29 17:05:45
 */
public class Mgr implements Serializable {
    private static final long serialVersionUID = 524770746919903552L;
    
    private Long id;

    private String mgrNo;

    private String mgrName;
    
    private Long rencaiFengxian;
    
    private Long xingweiFengxian;
    
    private Long guanliFengxian;
    
    private Long jishuFengxian;
    
    private Long jingjiFengxian;
    
    private String pingjia;

    private Long createUser;

    private Long pingjiaRen;

    private Long fengxianRen;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMgrNo() {
        return mgrNo;
    }

    public void setMgrNo(String mgrNo) {
        this.mgrNo = mgrNo;
    }

    public String getMgrName() {
        return mgrName;
    }

    public void setMgrName(String mgrName) {
        this.mgrName = mgrName;
    }

    public Long getRencaiFengxian() {
        return rencaiFengxian;
    }

    public void setRencaiFengxian(Long rencaiFengxian) {
        this.rencaiFengxian = rencaiFengxian;
    }

    public Long getXingweiFengxian() {
        return xingweiFengxian;
    }

    public void setXingweiFengxian(Long xingweiFengxian) {
        this.xingweiFengxian = xingweiFengxian;
    }

    public Long getGuanliFengxian() {
        return guanliFengxian;
    }

    public void setGuanliFengxian(Long guanliFengxian) {
        this.guanliFengxian = guanliFengxian;
    }

    public Long getJishuFengxian() {
        return jishuFengxian;
    }

    public void setJishuFengxian(Long jishuFengxian) {
        this.jishuFengxian = jishuFengxian;
    }

    public Long getJingjiFengxian() {
        return jingjiFengxian;
    }

    public void setJingjiFengxian(Long jingjiFengxian) {
        this.jingjiFengxian = jingjiFengxian;
    }

    public String getPingjia() {
        return pingjia;
    }

    public void setPingjia(String pingjia) {
        this.pingjia = pingjia;
    }
}