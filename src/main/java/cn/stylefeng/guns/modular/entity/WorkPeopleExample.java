package cn.stylefeng.guns.modular.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class WorkPeopleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkPeopleExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andEgeIsNull() {
            addCriterion("ege is null");
            return (Criteria) this;
        }

        public Criteria andEgeIsNotNull() {
            addCriterion("ege is not null");
            return (Criteria) this;
        }

        public Criteria andEgeEqualTo(String value) {
            addCriterion("ege =", value, "ege");
            return (Criteria) this;
        }

        public Criteria andEgeNotEqualTo(String value) {
            addCriterion("ege <>", value, "ege");
            return (Criteria) this;
        }

        public Criteria andEgeGreaterThan(String value) {
            addCriterion("ege >", value, "ege");
            return (Criteria) this;
        }

        public Criteria andEgeGreaterThanOrEqualTo(String value) {
            addCriterion("ege >=", value, "ege");
            return (Criteria) this;
        }

        public Criteria andEgeLessThan(String value) {
            addCriterion("ege <", value, "ege");
            return (Criteria) this;
        }

        public Criteria andEgeLessThanOrEqualTo(String value) {
            addCriterion("ege <=", value, "ege");
            return (Criteria) this;
        }

        public Criteria andEgeLike(String value) {
            addCriterion("ege like", value, "ege");
            return (Criteria) this;
        }

        public Criteria andEgeNotLike(String value) {
            addCriterion("ege not like", value, "ege");
            return (Criteria) this;
        }

        public Criteria andEgeIn(List<String> values) {
            addCriterion("ege in", values, "ege");
            return (Criteria) this;
        }

        public Criteria andEgeNotIn(List<String> values) {
            addCriterion("ege not in", values, "ege");
            return (Criteria) this;
        }

        public Criteria andEgeBetween(String value1, String value2) {
            addCriterion("ege between", value1, value2, "ege");
            return (Criteria) this;
        }

        public Criteria andEgeNotBetween(String value1, String value2) {
            addCriterion("ege not between", value1, value2, "ege");
            return (Criteria) this;
        }

        public Criteria andZiZhiIsNull() {
            addCriterion("zi_zhi is null");
            return (Criteria) this;
        }

        public Criteria andZiZhiIsNotNull() {
            addCriterion("zi_zhi is not null");
            return (Criteria) this;
        }

        public Criteria andZiZhiEqualTo(String value) {
            addCriterion("zi_zhi =", value, "ziZhi");
            return (Criteria) this;
        }

        public Criteria andZiZhiNotEqualTo(String value) {
            addCriterion("zi_zhi <>", value, "ziZhi");
            return (Criteria) this;
        }

        public Criteria andZiZhiGreaterThan(String value) {
            addCriterion("zi_zhi >", value, "ziZhi");
            return (Criteria) this;
        }

        public Criteria andZiZhiGreaterThanOrEqualTo(String value) {
            addCriterion("zi_zhi >=", value, "ziZhi");
            return (Criteria) this;
        }

        public Criteria andZiZhiLessThan(String value) {
            addCriterion("zi_zhi <", value, "ziZhi");
            return (Criteria) this;
        }

        public Criteria andZiZhiLessThanOrEqualTo(String value) {
            addCriterion("zi_zhi <=", value, "ziZhi");
            return (Criteria) this;
        }

        public Criteria andZiZhiLike(String value) {
            addCriterion("zi_zhi like", value, "ziZhi");
            return (Criteria) this;
        }

        public Criteria andZiZhiNotLike(String value) {
            addCriterion("zi_zhi not like", value, "ziZhi");
            return (Criteria) this;
        }

        public Criteria andZiZhiIn(List<String> values) {
            addCriterion("zi_zhi in", values, "ziZhi");
            return (Criteria) this;
        }

        public Criteria andZiZhiNotIn(List<String> values) {
            addCriterion("zi_zhi not in", values, "ziZhi");
            return (Criteria) this;
        }

        public Criteria andZiZhiBetween(String value1, String value2) {
            addCriterion("zi_zhi between", value1, value2, "ziZhi");
            return (Criteria) this;
        }

        public Criteria andZiZhiNotBetween(String value1, String value2) {
            addCriterion("zi_zhi not between", value1, value2, "ziZhi");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNull() {
            addCriterion("audit_status is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNotNull() {
            addCriterion("audit_status is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusEqualTo(Long value) {
            addCriterion("audit_status =", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotEqualTo(Long value) {
            addCriterion("audit_status <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThan(Long value) {
            addCriterion("audit_status >", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanOrEqualTo(Long value) {
            addCriterion("audit_status >=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThan(Long value) {
            addCriterion("audit_status <", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThanOrEqualTo(Long value) {
            addCriterion("audit_status <=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIn(List<Long> values) {
            addCriterion("audit_status in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotIn(List<Long> values) {
            addCriterion("audit_status not in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBetween(Long value1, Long value2) {
            addCriterion("audit_status between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotBetween(Long value1, Long value2) {
            addCriterion("audit_status not between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditPeopleIsNull() {
            addCriterion("audit_people is null");
            return (Criteria) this;
        }

        public Criteria andAuditPeopleIsNotNull() {
            addCriterion("audit_people is not null");
            return (Criteria) this;
        }

        public Criteria andAuditPeopleEqualTo(Long value) {
            addCriterion("audit_people =", value, "auditPeople");
            return (Criteria) this;
        }

        public Criteria andAuditPeopleNotEqualTo(Long value) {
            addCriterion("audit_people <>", value, "auditPeople");
            return (Criteria) this;
        }

        public Criteria andAuditPeopleGreaterThan(Long value) {
            addCriterion("audit_people >", value, "auditPeople");
            return (Criteria) this;
        }

        public Criteria andAuditPeopleGreaterThanOrEqualTo(Long value) {
            addCriterion("audit_people >=", value, "auditPeople");
            return (Criteria) this;
        }

        public Criteria andAuditPeopleLessThan(Long value) {
            addCriterion("audit_people <", value, "auditPeople");
            return (Criteria) this;
        }

        public Criteria andAuditPeopleLessThanOrEqualTo(Long value) {
            addCriterion("audit_people <=", value, "auditPeople");
            return (Criteria) this;
        }

        public Criteria andAuditPeopleIn(List<Long> values) {
            addCriterion("audit_people in", values, "auditPeople");
            return (Criteria) this;
        }

        public Criteria andAuditPeopleNotIn(List<Long> values) {
            addCriterion("audit_people not in", values, "auditPeople");
            return (Criteria) this;
        }

        public Criteria andAuditPeopleBetween(Long value1, Long value2) {
            addCriterion("audit_people between", value1, value2, "auditPeople");
            return (Criteria) this;
        }

        public Criteria andAuditPeopleNotBetween(Long value1, Long value2) {
            addCriterion("audit_people not between", value1, value2, "auditPeople");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("audit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterionForJDBCDate("audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterionForJDBCDate("audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterionForJDBCDate("audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("audit_time not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNull() {
            addCriterion("type_name is null");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNotNull() {
            addCriterion("type_name is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNameEqualTo(String value) {
            addCriterion("type_name =", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotEqualTo(String value) {
            addCriterion("type_name <>", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThan(String value) {
            addCriterion("type_name >", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("type_name >=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThan(String value) {
            addCriterion("type_name <", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThanOrEqualTo(String value) {
            addCriterion("type_name <=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLike(String value) {
            addCriterion("type_name like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotLike(String value) {
            addCriterion("type_name not like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameIn(List<String> values) {
            addCriterion("type_name in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotIn(List<String> values) {
            addCriterion("type_name not in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameBetween(String value1, String value2) {
            addCriterion("type_name between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotBetween(String value1, String value2) {
            addCriterion("type_name not between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andMgrIdIsNull() {
            addCriterion("mgr_id is null");
            return (Criteria) this;
        }

        public Criteria andMgrIdIsNotNull() {
            addCriterion("mgr_id is not null");
            return (Criteria) this;
        }

        public Criteria andMgrIdEqualTo(Long value) {
            addCriterion("mgr_id =", value, "mgrId");
            return (Criteria) this;
        }

        public Criteria andMgrIdNotEqualTo(Long value) {
            addCriterion("mgr_id <>", value, "mgrId");
            return (Criteria) this;
        }

        public Criteria andMgrIdGreaterThan(Long value) {
            addCriterion("mgr_id >", value, "mgrId");
            return (Criteria) this;
        }

        public Criteria andMgrIdGreaterThanOrEqualTo(Long value) {
            addCriterion("mgr_id >=", value, "mgrId");
            return (Criteria) this;
        }

        public Criteria andMgrIdLessThan(Long value) {
            addCriterion("mgr_id <", value, "mgrId");
            return (Criteria) this;
        }

        public Criteria andMgrIdLessThanOrEqualTo(Long value) {
            addCriterion("mgr_id <=", value, "mgrId");
            return (Criteria) this;
        }

        public Criteria andMgrIdIn(List<Long> values) {
            addCriterion("mgr_id in", values, "mgrId");
            return (Criteria) this;
        }

        public Criteria andMgrIdNotIn(List<Long> values) {
            addCriterion("mgr_id not in", values, "mgrId");
            return (Criteria) this;
        }

        public Criteria andMgrIdBetween(Long value1, Long value2) {
            addCriterion("mgr_id between", value1, value2, "mgrId");
            return (Criteria) this;
        }

        public Criteria andMgrIdNotBetween(Long value1, Long value2) {
            addCriterion("mgr_id not between", value1, value2, "mgrId");
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