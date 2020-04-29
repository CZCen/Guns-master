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
    
    private Long rencaiFengxian;
    
    private Long xingweiFengxian;
    
    private Long guanliFengxian;
    
    private Long jishuFengxian;
    
    private Long jingjiFengxian;
    
    private String rencaiPingjia;
    
    private String xingweiPingjia;
    
    private String guanliPingjia;
    
    private String jishuPingjia;
    
    private String jingjiPingjia;
    
    private Long createUser;
    /**
    * 评价人
    */
    private Long pingjiaRen;
    /**
    * 风险预估人
    */
    private Long fengxianRen;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getRencaiPingjia() {
        return rencaiPingjia;
    }

    public void setRencaiPingjia(String rencaiPingjia) {
        this.rencaiPingjia = rencaiPingjia;
    }

    public String getXingweiPingjia() {
        return xingweiPingjia;
    }

    public void setXingweiPingjia(String xingweiPingjia) {
        this.xingweiPingjia = xingweiPingjia;
    }

    public String getGuanliPingjia() {
        return guanliPingjia;
    }

    public void setGuanliPingjia(String guanliPingjia) {
        this.guanliPingjia = guanliPingjia;
    }

    public String getJishuPingjia() {
        return jishuPingjia;
    }

    public void setJishuPingjia(String jishuPingjia) {
        this.jishuPingjia = jishuPingjia;
    }

    public String getJingjiPingjia() {
        return jingjiPingjia;
    }

    public void setJingjiPingjia(String jingjiPingjia) {
        this.jingjiPingjia = jingjiPingjia;
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public Long getPingjiaRen() {
        return pingjiaRen;
    }

    public void setPingjiaRen(Long pingjiaRen) {
        this.pingjiaRen = pingjiaRen;
    }

    public Long getFengxianRen() {
        return fengxianRen;
    }

    public void setFengxianRen(Long fengxianRen) {
        this.fengxianRen = fengxianRen;
    }

}