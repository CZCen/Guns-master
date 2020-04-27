package cn.stylefeng.guns.modular.entity;

public class Mgr {
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

    private Long pingjiaRen;

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
        this.rencaiPingjia = rencaiPingjia == null ? null : rencaiPingjia.trim();
    }

    public String getXingweiPingjia() {
        return xingweiPingjia;
    }

    public void setXingweiPingjia(String xingweiPingjia) {
        this.xingweiPingjia = xingweiPingjia == null ? null : xingweiPingjia.trim();
    }

    public String getGuanliPingjia() {
        return guanliPingjia;
    }

    public void setGuanliPingjia(String guanliPingjia) {
        this.guanliPingjia = guanliPingjia == null ? null : guanliPingjia.trim();
    }

    public String getJishuPingjia() {
        return jishuPingjia;
    }

    public void setJishuPingjia(String jishuPingjia) {
        this.jishuPingjia = jishuPingjia == null ? null : jishuPingjia.trim();
    }

    public String getJingjiPingjia() {
        return jingjiPingjia;
    }

    public void setJingjiPingjia(String jingjiPingjia) {
        this.jingjiPingjia = jingjiPingjia == null ? null : jingjiPingjia.trim();
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