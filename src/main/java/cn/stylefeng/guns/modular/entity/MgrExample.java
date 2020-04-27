package cn.stylefeng.guns.modular.entity;

import java.util.ArrayList;
import java.util.List;

public class MgrExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MgrExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRencaiFengxianIsNull() {
            addCriterion("rencai_fengxian is null");
            return (Criteria) this;
        }

        public Criteria andRencaiFengxianIsNotNull() {
            addCriterion("rencai_fengxian is not null");
            return (Criteria) this;
        }

        public Criteria andRencaiFengxianEqualTo(Long value) {
            addCriterion("rencai_fengxian =", value, "rencaiFengxian");
            return (Criteria) this;
        }

        public Criteria andRencaiFengxianNotEqualTo(Long value) {
            addCriterion("rencai_fengxian <>", value, "rencaiFengxian");
            return (Criteria) this;
        }

        public Criteria andRencaiFengxianGreaterThan(Long value) {
            addCriterion("rencai_fengxian >", value, "rencaiFengxian");
            return (Criteria) this;
        }

        public Criteria andRencaiFengxianGreaterThanOrEqualTo(Long value) {
            addCriterion("rencai_fengxian >=", value, "rencaiFengxian");
            return (Criteria) this;
        }

        public Criteria andRencaiFengxianLessThan(Long value) {
            addCriterion("rencai_fengxian <", value, "rencaiFengxian");
            return (Criteria) this;
        }

        public Criteria andRencaiFengxianLessThanOrEqualTo(Long value) {
            addCriterion("rencai_fengxian <=", value, "rencaiFengxian");
            return (Criteria) this;
        }

        public Criteria andRencaiFengxianIn(List<Long> values) {
            addCriterion("rencai_fengxian in", values, "rencaiFengxian");
            return (Criteria) this;
        }

        public Criteria andRencaiFengxianNotIn(List<Long> values) {
            addCriterion("rencai_fengxian not in", values, "rencaiFengxian");
            return (Criteria) this;
        }

        public Criteria andRencaiFengxianBetween(Long value1, Long value2) {
            addCriterion("rencai_fengxian between", value1, value2, "rencaiFengxian");
            return (Criteria) this;
        }

        public Criteria andRencaiFengxianNotBetween(Long value1, Long value2) {
            addCriterion("rencai_fengxian not between", value1, value2, "rencaiFengxian");
            return (Criteria) this;
        }

        public Criteria andXingweiFengxianIsNull() {
            addCriterion("xingwei_fengxian is null");
            return (Criteria) this;
        }

        public Criteria andXingweiFengxianIsNotNull() {
            addCriterion("xingwei_fengxian is not null");
            return (Criteria) this;
        }

        public Criteria andXingweiFengxianEqualTo(Long value) {
            addCriterion("xingwei_fengxian =", value, "xingweiFengxian");
            return (Criteria) this;
        }

        public Criteria andXingweiFengxianNotEqualTo(Long value) {
            addCriterion("xingwei_fengxian <>", value, "xingweiFengxian");
            return (Criteria) this;
        }

        public Criteria andXingweiFengxianGreaterThan(Long value) {
            addCriterion("xingwei_fengxian >", value, "xingweiFengxian");
            return (Criteria) this;
        }

        public Criteria andXingweiFengxianGreaterThanOrEqualTo(Long value) {
            addCriterion("xingwei_fengxian >=", value, "xingweiFengxian");
            return (Criteria) this;
        }

        public Criteria andXingweiFengxianLessThan(Long value) {
            addCriterion("xingwei_fengxian <", value, "xingweiFengxian");
            return (Criteria) this;
        }

        public Criteria andXingweiFengxianLessThanOrEqualTo(Long value) {
            addCriterion("xingwei_fengxian <=", value, "xingweiFengxian");
            return (Criteria) this;
        }

        public Criteria andXingweiFengxianIn(List<Long> values) {
            addCriterion("xingwei_fengxian in", values, "xingweiFengxian");
            return (Criteria) this;
        }

        public Criteria andXingweiFengxianNotIn(List<Long> values) {
            addCriterion("xingwei_fengxian not in", values, "xingweiFengxian");
            return (Criteria) this;
        }

        public Criteria andXingweiFengxianBetween(Long value1, Long value2) {
            addCriterion("xingwei_fengxian between", value1, value2, "xingweiFengxian");
            return (Criteria) this;
        }

        public Criteria andXingweiFengxianNotBetween(Long value1, Long value2) {
            addCriterion("xingwei_fengxian not between", value1, value2, "xingweiFengxian");
            return (Criteria) this;
        }

        public Criteria andGuanliFengxianIsNull() {
            addCriterion("guanli_fengxian is null");
            return (Criteria) this;
        }

        public Criteria andGuanliFengxianIsNotNull() {
            addCriterion("guanli_fengxian is not null");
            return (Criteria) this;
        }

        public Criteria andGuanliFengxianEqualTo(Long value) {
            addCriterion("guanli_fengxian =", value, "guanliFengxian");
            return (Criteria) this;
        }

        public Criteria andGuanliFengxianNotEqualTo(Long value) {
            addCriterion("guanli_fengxian <>", value, "guanliFengxian");
            return (Criteria) this;
        }

        public Criteria andGuanliFengxianGreaterThan(Long value) {
            addCriterion("guanli_fengxian >", value, "guanliFengxian");
            return (Criteria) this;
        }

        public Criteria andGuanliFengxianGreaterThanOrEqualTo(Long value) {
            addCriterion("guanli_fengxian >=", value, "guanliFengxian");
            return (Criteria) this;
        }

        public Criteria andGuanliFengxianLessThan(Long value) {
            addCriterion("guanli_fengxian <", value, "guanliFengxian");
            return (Criteria) this;
        }

        public Criteria andGuanliFengxianLessThanOrEqualTo(Long value) {
            addCriterion("guanli_fengxian <=", value, "guanliFengxian");
            return (Criteria) this;
        }

        public Criteria andGuanliFengxianIn(List<Long> values) {
            addCriterion("guanli_fengxian in", values, "guanliFengxian");
            return (Criteria) this;
        }

        public Criteria andGuanliFengxianNotIn(List<Long> values) {
            addCriterion("guanli_fengxian not in", values, "guanliFengxian");
            return (Criteria) this;
        }

        public Criteria andGuanliFengxianBetween(Long value1, Long value2) {
            addCriterion("guanli_fengxian between", value1, value2, "guanliFengxian");
            return (Criteria) this;
        }

        public Criteria andGuanliFengxianNotBetween(Long value1, Long value2) {
            addCriterion("guanli_fengxian not between", value1, value2, "guanliFengxian");
            return (Criteria) this;
        }

        public Criteria andJishuFengxianIsNull() {
            addCriterion("jishu_fengxian is null");
            return (Criteria) this;
        }

        public Criteria andJishuFengxianIsNotNull() {
            addCriterion("jishu_fengxian is not null");
            return (Criteria) this;
        }

        public Criteria andJishuFengxianEqualTo(Long value) {
            addCriterion("jishu_fengxian =", value, "jishuFengxian");
            return (Criteria) this;
        }

        public Criteria andJishuFengxianNotEqualTo(Long value) {
            addCriterion("jishu_fengxian <>", value, "jishuFengxian");
            return (Criteria) this;
        }

        public Criteria andJishuFengxianGreaterThan(Long value) {
            addCriterion("jishu_fengxian >", value, "jishuFengxian");
            return (Criteria) this;
        }

        public Criteria andJishuFengxianGreaterThanOrEqualTo(Long value) {
            addCriterion("jishu_fengxian >=", value, "jishuFengxian");
            return (Criteria) this;
        }

        public Criteria andJishuFengxianLessThan(Long value) {
            addCriterion("jishu_fengxian <", value, "jishuFengxian");
            return (Criteria) this;
        }

        public Criteria andJishuFengxianLessThanOrEqualTo(Long value) {
            addCriterion("jishu_fengxian <=", value, "jishuFengxian");
            return (Criteria) this;
        }

        public Criteria andJishuFengxianIn(List<Long> values) {
            addCriterion("jishu_fengxian in", values, "jishuFengxian");
            return (Criteria) this;
        }

        public Criteria andJishuFengxianNotIn(List<Long> values) {
            addCriterion("jishu_fengxian not in", values, "jishuFengxian");
            return (Criteria) this;
        }

        public Criteria andJishuFengxianBetween(Long value1, Long value2) {
            addCriterion("jishu_fengxian between", value1, value2, "jishuFengxian");
            return (Criteria) this;
        }

        public Criteria andJishuFengxianNotBetween(Long value1, Long value2) {
            addCriterion("jishu_fengxian not between", value1, value2, "jishuFengxian");
            return (Criteria) this;
        }

        public Criteria andJingjiFengxianIsNull() {
            addCriterion("jingji_fengxian is null");
            return (Criteria) this;
        }

        public Criteria andJingjiFengxianIsNotNull() {
            addCriterion("jingji_fengxian is not null");
            return (Criteria) this;
        }

        public Criteria andJingjiFengxianEqualTo(Long value) {
            addCriterion("jingji_fengxian =", value, "jingjiFengxian");
            return (Criteria) this;
        }

        public Criteria andJingjiFengxianNotEqualTo(Long value) {
            addCriterion("jingji_fengxian <>", value, "jingjiFengxian");
            return (Criteria) this;
        }

        public Criteria andJingjiFengxianGreaterThan(Long value) {
            addCriterion("jingji_fengxian >", value, "jingjiFengxian");
            return (Criteria) this;
        }

        public Criteria andJingjiFengxianGreaterThanOrEqualTo(Long value) {
            addCriterion("jingji_fengxian >=", value, "jingjiFengxian");
            return (Criteria) this;
        }

        public Criteria andJingjiFengxianLessThan(Long value) {
            addCriterion("jingji_fengxian <", value, "jingjiFengxian");
            return (Criteria) this;
        }

        public Criteria andJingjiFengxianLessThanOrEqualTo(Long value) {
            addCriterion("jingji_fengxian <=", value, "jingjiFengxian");
            return (Criteria) this;
        }

        public Criteria andJingjiFengxianIn(List<Long> values) {
            addCriterion("jingji_fengxian in", values, "jingjiFengxian");
            return (Criteria) this;
        }

        public Criteria andJingjiFengxianNotIn(List<Long> values) {
            addCriterion("jingji_fengxian not in", values, "jingjiFengxian");
            return (Criteria) this;
        }

        public Criteria andJingjiFengxianBetween(Long value1, Long value2) {
            addCriterion("jingji_fengxian between", value1, value2, "jingjiFengxian");
            return (Criteria) this;
        }

        public Criteria andJingjiFengxianNotBetween(Long value1, Long value2) {
            addCriterion("jingji_fengxian not between", value1, value2, "jingjiFengxian");
            return (Criteria) this;
        }

        public Criteria andRencaiPingjiaIsNull() {
            addCriterion("rencai_pingjia is null");
            return (Criteria) this;
        }

        public Criteria andRencaiPingjiaIsNotNull() {
            addCriterion("rencai_pingjia is not null");
            return (Criteria) this;
        }

        public Criteria andRencaiPingjiaEqualTo(String value) {
            addCriterion("rencai_pingjia =", value, "rencaiPingjia");
            return (Criteria) this;
        }

        public Criteria andRencaiPingjiaNotEqualTo(String value) {
            addCriterion("rencai_pingjia <>", value, "rencaiPingjia");
            return (Criteria) this;
        }

        public Criteria andRencaiPingjiaGreaterThan(String value) {
            addCriterion("rencai_pingjia >", value, "rencaiPingjia");
            return (Criteria) this;
        }

        public Criteria andRencaiPingjiaGreaterThanOrEqualTo(String value) {
            addCriterion("rencai_pingjia >=", value, "rencaiPingjia");
            return (Criteria) this;
        }

        public Criteria andRencaiPingjiaLessThan(String value) {
            addCriterion("rencai_pingjia <", value, "rencaiPingjia");
            return (Criteria) this;
        }

        public Criteria andRencaiPingjiaLessThanOrEqualTo(String value) {
            addCriterion("rencai_pingjia <=", value, "rencaiPingjia");
            return (Criteria) this;
        }

        public Criteria andRencaiPingjiaLike(String value) {
            addCriterion("rencai_pingjia like", value, "rencaiPingjia");
            return (Criteria) this;
        }

        public Criteria andRencaiPingjiaNotLike(String value) {
            addCriterion("rencai_pingjia not like", value, "rencaiPingjia");
            return (Criteria) this;
        }

        public Criteria andRencaiPingjiaIn(List<String> values) {
            addCriterion("rencai_pingjia in", values, "rencaiPingjia");
            return (Criteria) this;
        }

        public Criteria andRencaiPingjiaNotIn(List<String> values) {
            addCriterion("rencai_pingjia not in", values, "rencaiPingjia");
            return (Criteria) this;
        }

        public Criteria andRencaiPingjiaBetween(String value1, String value2) {
            addCriterion("rencai_pingjia between", value1, value2, "rencaiPingjia");
            return (Criteria) this;
        }

        public Criteria andRencaiPingjiaNotBetween(String value1, String value2) {
            addCriterion("rencai_pingjia not between", value1, value2, "rencaiPingjia");
            return (Criteria) this;
        }

        public Criteria andXingweiPingjiaIsNull() {
            addCriterion("xingwei_pingjia is null");
            return (Criteria) this;
        }

        public Criteria andXingweiPingjiaIsNotNull() {
            addCriterion("xingwei_pingjia is not null");
            return (Criteria) this;
        }

        public Criteria andXingweiPingjiaEqualTo(String value) {
            addCriterion("xingwei_pingjia =", value, "xingweiPingjia");
            return (Criteria) this;
        }

        public Criteria andXingweiPingjiaNotEqualTo(String value) {
            addCriterion("xingwei_pingjia <>", value, "xingweiPingjia");
            return (Criteria) this;
        }

        public Criteria andXingweiPingjiaGreaterThan(String value) {
            addCriterion("xingwei_pingjia >", value, "xingweiPingjia");
            return (Criteria) this;
        }

        public Criteria andXingweiPingjiaGreaterThanOrEqualTo(String value) {
            addCriterion("xingwei_pingjia >=", value, "xingweiPingjia");
            return (Criteria) this;
        }

        public Criteria andXingweiPingjiaLessThan(String value) {
            addCriterion("xingwei_pingjia <", value, "xingweiPingjia");
            return (Criteria) this;
        }

        public Criteria andXingweiPingjiaLessThanOrEqualTo(String value) {
            addCriterion("xingwei_pingjia <=", value, "xingweiPingjia");
            return (Criteria) this;
        }

        public Criteria andXingweiPingjiaLike(String value) {
            addCriterion("xingwei_pingjia like", value, "xingweiPingjia");
            return (Criteria) this;
        }

        public Criteria andXingweiPingjiaNotLike(String value) {
            addCriterion("xingwei_pingjia not like", value, "xingweiPingjia");
            return (Criteria) this;
        }

        public Criteria andXingweiPingjiaIn(List<String> values) {
            addCriterion("xingwei_pingjia in", values, "xingweiPingjia");
            return (Criteria) this;
        }

        public Criteria andXingweiPingjiaNotIn(List<String> values) {
            addCriterion("xingwei_pingjia not in", values, "xingweiPingjia");
            return (Criteria) this;
        }

        public Criteria andXingweiPingjiaBetween(String value1, String value2) {
            addCriterion("xingwei_pingjia between", value1, value2, "xingweiPingjia");
            return (Criteria) this;
        }

        public Criteria andXingweiPingjiaNotBetween(String value1, String value2) {
            addCriterion("xingwei_pingjia not between", value1, value2, "xingweiPingjia");
            return (Criteria) this;
        }

        public Criteria andGuanliPingjiaIsNull() {
            addCriterion("guanli_pingjia is null");
            return (Criteria) this;
        }

        public Criteria andGuanliPingjiaIsNotNull() {
            addCriterion("guanli_pingjia is not null");
            return (Criteria) this;
        }

        public Criteria andGuanliPingjiaEqualTo(String value) {
            addCriterion("guanli_pingjia =", value, "guanliPingjia");
            return (Criteria) this;
        }

        public Criteria andGuanliPingjiaNotEqualTo(String value) {
            addCriterion("guanli_pingjia <>", value, "guanliPingjia");
            return (Criteria) this;
        }

        public Criteria andGuanliPingjiaGreaterThan(String value) {
            addCriterion("guanli_pingjia >", value, "guanliPingjia");
            return (Criteria) this;
        }

        public Criteria andGuanliPingjiaGreaterThanOrEqualTo(String value) {
            addCriterion("guanli_pingjia >=", value, "guanliPingjia");
            return (Criteria) this;
        }

        public Criteria andGuanliPingjiaLessThan(String value) {
            addCriterion("guanli_pingjia <", value, "guanliPingjia");
            return (Criteria) this;
        }

        public Criteria andGuanliPingjiaLessThanOrEqualTo(String value) {
            addCriterion("guanli_pingjia <=", value, "guanliPingjia");
            return (Criteria) this;
        }

        public Criteria andGuanliPingjiaLike(String value) {
            addCriterion("guanli_pingjia like", value, "guanliPingjia");
            return (Criteria) this;
        }

        public Criteria andGuanliPingjiaNotLike(String value) {
            addCriterion("guanli_pingjia not like", value, "guanliPingjia");
            return (Criteria) this;
        }

        public Criteria andGuanliPingjiaIn(List<String> values) {
            addCriterion("guanli_pingjia in", values, "guanliPingjia");
            return (Criteria) this;
        }

        public Criteria andGuanliPingjiaNotIn(List<String> values) {
            addCriterion("guanli_pingjia not in", values, "guanliPingjia");
            return (Criteria) this;
        }

        public Criteria andGuanliPingjiaBetween(String value1, String value2) {
            addCriterion("guanli_pingjia between", value1, value2, "guanliPingjia");
            return (Criteria) this;
        }

        public Criteria andGuanliPingjiaNotBetween(String value1, String value2) {
            addCriterion("guanli_pingjia not between", value1, value2, "guanliPingjia");
            return (Criteria) this;
        }

        public Criteria andJishuPingjiaIsNull() {
            addCriterion("jishu_pingjia is null");
            return (Criteria) this;
        }

        public Criteria andJishuPingjiaIsNotNull() {
            addCriterion("jishu_pingjia is not null");
            return (Criteria) this;
        }

        public Criteria andJishuPingjiaEqualTo(String value) {
            addCriterion("jishu_pingjia =", value, "jishuPingjia");
            return (Criteria) this;
        }

        public Criteria andJishuPingjiaNotEqualTo(String value) {
            addCriterion("jishu_pingjia <>", value, "jishuPingjia");
            return (Criteria) this;
        }

        public Criteria andJishuPingjiaGreaterThan(String value) {
            addCriterion("jishu_pingjia >", value, "jishuPingjia");
            return (Criteria) this;
        }

        public Criteria andJishuPingjiaGreaterThanOrEqualTo(String value) {
            addCriterion("jishu_pingjia >=", value, "jishuPingjia");
            return (Criteria) this;
        }

        public Criteria andJishuPingjiaLessThan(String value) {
            addCriterion("jishu_pingjia <", value, "jishuPingjia");
            return (Criteria) this;
        }

        public Criteria andJishuPingjiaLessThanOrEqualTo(String value) {
            addCriterion("jishu_pingjia <=", value, "jishuPingjia");
            return (Criteria) this;
        }

        public Criteria andJishuPingjiaLike(String value) {
            addCriterion("jishu_pingjia like", value, "jishuPingjia");
            return (Criteria) this;
        }

        public Criteria andJishuPingjiaNotLike(String value) {
            addCriterion("jishu_pingjia not like", value, "jishuPingjia");
            return (Criteria) this;
        }

        public Criteria andJishuPingjiaIn(List<String> values) {
            addCriterion("jishu_pingjia in", values, "jishuPingjia");
            return (Criteria) this;
        }

        public Criteria andJishuPingjiaNotIn(List<String> values) {
            addCriterion("jishu_pingjia not in", values, "jishuPingjia");
            return (Criteria) this;
        }

        public Criteria andJishuPingjiaBetween(String value1, String value2) {
            addCriterion("jishu_pingjia between", value1, value2, "jishuPingjia");
            return (Criteria) this;
        }

        public Criteria andJishuPingjiaNotBetween(String value1, String value2) {
            addCriterion("jishu_pingjia not between", value1, value2, "jishuPingjia");
            return (Criteria) this;
        }

        public Criteria andJingjiPingjiaIsNull() {
            addCriterion("jingji_pingjia is null");
            return (Criteria) this;
        }

        public Criteria andJingjiPingjiaIsNotNull() {
            addCriterion("jingji_pingjia is not null");
            return (Criteria) this;
        }

        public Criteria andJingjiPingjiaEqualTo(String value) {
            addCriterion("jingji_pingjia =", value, "jingjiPingjia");
            return (Criteria) this;
        }

        public Criteria andJingjiPingjiaNotEqualTo(String value) {
            addCriterion("jingji_pingjia <>", value, "jingjiPingjia");
            return (Criteria) this;
        }

        public Criteria andJingjiPingjiaGreaterThan(String value) {
            addCriterion("jingji_pingjia >", value, "jingjiPingjia");
            return (Criteria) this;
        }

        public Criteria andJingjiPingjiaGreaterThanOrEqualTo(String value) {
            addCriterion("jingji_pingjia >=", value, "jingjiPingjia");
            return (Criteria) this;
        }

        public Criteria andJingjiPingjiaLessThan(String value) {
            addCriterion("jingji_pingjia <", value, "jingjiPingjia");
            return (Criteria) this;
        }

        public Criteria andJingjiPingjiaLessThanOrEqualTo(String value) {
            addCriterion("jingji_pingjia <=", value, "jingjiPingjia");
            return (Criteria) this;
        }

        public Criteria andJingjiPingjiaLike(String value) {
            addCriterion("jingji_pingjia like", value, "jingjiPingjia");
            return (Criteria) this;
        }

        public Criteria andJingjiPingjiaNotLike(String value) {
            addCriterion("jingji_pingjia not like", value, "jingjiPingjia");
            return (Criteria) this;
        }

        public Criteria andJingjiPingjiaIn(List<String> values) {
            addCriterion("jingji_pingjia in", values, "jingjiPingjia");
            return (Criteria) this;
        }

        public Criteria andJingjiPingjiaNotIn(List<String> values) {
            addCriterion("jingji_pingjia not in", values, "jingjiPingjia");
            return (Criteria) this;
        }

        public Criteria andJingjiPingjiaBetween(String value1, String value2) {
            addCriterion("jingji_pingjia between", value1, value2, "jingjiPingjia");
            return (Criteria) this;
        }

        public Criteria andJingjiPingjiaNotBetween(String value1, String value2) {
            addCriterion("jingji_pingjia not between", value1, value2, "jingjiPingjia");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(Long value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(Long value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(Long value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(Long value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(Long value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(Long value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<Long> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<Long> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(Long value1, Long value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(Long value1, Long value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andPingjiaRenIsNull() {
            addCriterion("pingjia_ren is null");
            return (Criteria) this;
        }

        public Criteria andPingjiaRenIsNotNull() {
            addCriterion("pingjia_ren is not null");
            return (Criteria) this;
        }

        public Criteria andPingjiaRenEqualTo(Long value) {
            addCriterion("pingjia_ren =", value, "pingjiaRen");
            return (Criteria) this;
        }

        public Criteria andPingjiaRenNotEqualTo(Long value) {
            addCriterion("pingjia_ren <>", value, "pingjiaRen");
            return (Criteria) this;
        }

        public Criteria andPingjiaRenGreaterThan(Long value) {
            addCriterion("pingjia_ren >", value, "pingjiaRen");
            return (Criteria) this;
        }

        public Criteria andPingjiaRenGreaterThanOrEqualTo(Long value) {
            addCriterion("pingjia_ren >=", value, "pingjiaRen");
            return (Criteria) this;
        }

        public Criteria andPingjiaRenLessThan(Long value) {
            addCriterion("pingjia_ren <", value, "pingjiaRen");
            return (Criteria) this;
        }

        public Criteria andPingjiaRenLessThanOrEqualTo(Long value) {
            addCriterion("pingjia_ren <=", value, "pingjiaRen");
            return (Criteria) this;
        }

        public Criteria andPingjiaRenIn(List<Long> values) {
            addCriterion("pingjia_ren in", values, "pingjiaRen");
            return (Criteria) this;
        }

        public Criteria andPingjiaRenNotIn(List<Long> values) {
            addCriterion("pingjia_ren not in", values, "pingjiaRen");
            return (Criteria) this;
        }

        public Criteria andPingjiaRenBetween(Long value1, Long value2) {
            addCriterion("pingjia_ren between", value1, value2, "pingjiaRen");
            return (Criteria) this;
        }

        public Criteria andPingjiaRenNotBetween(Long value1, Long value2) {
            addCriterion("pingjia_ren not between", value1, value2, "pingjiaRen");
            return (Criteria) this;
        }

        public Criteria andFengxianRenIsNull() {
            addCriterion("fengxian_ren is null");
            return (Criteria) this;
        }

        public Criteria andFengxianRenIsNotNull() {
            addCriterion("fengxian_ren is not null");
            return (Criteria) this;
        }

        public Criteria andFengxianRenEqualTo(Long value) {
            addCriterion("fengxian_ren =", value, "fengxianRen");
            return (Criteria) this;
        }

        public Criteria andFengxianRenNotEqualTo(Long value) {
            addCriterion("fengxian_ren <>", value, "fengxianRen");
            return (Criteria) this;
        }

        public Criteria andFengxianRenGreaterThan(Long value) {
            addCriterion("fengxian_ren >", value, "fengxianRen");
            return (Criteria) this;
        }

        public Criteria andFengxianRenGreaterThanOrEqualTo(Long value) {
            addCriterion("fengxian_ren >=", value, "fengxianRen");
            return (Criteria) this;
        }

        public Criteria andFengxianRenLessThan(Long value) {
            addCriterion("fengxian_ren <", value, "fengxianRen");
            return (Criteria) this;
        }

        public Criteria andFengxianRenLessThanOrEqualTo(Long value) {
            addCriterion("fengxian_ren <=", value, "fengxianRen");
            return (Criteria) this;
        }

        public Criteria andFengxianRenIn(List<Long> values) {
            addCriterion("fengxian_ren in", values, "fengxianRen");
            return (Criteria) this;
        }

        public Criteria andFengxianRenNotIn(List<Long> values) {
            addCriterion("fengxian_ren not in", values, "fengxianRen");
            return (Criteria) this;
        }

        public Criteria andFengxianRenBetween(Long value1, Long value2) {
            addCriterion("fengxian_ren between", value1, value2, "fengxianRen");
            return (Criteria) this;
        }

        public Criteria andFengxianRenNotBetween(Long value1, Long value2) {
            addCriterion("fengxian_ren not between", value1, value2, "fengxianRen");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}