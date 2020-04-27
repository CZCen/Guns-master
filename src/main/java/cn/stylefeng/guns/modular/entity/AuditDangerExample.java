package cn.stylefeng.guns.modular.entity;

import java.util.ArrayList;
import java.util.List;

public class AuditDangerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuditDangerExample() {
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

        public Criteria andDangerPointIsNull() {
            addCriterion("danger_point is null");
            return (Criteria) this;
        }

        public Criteria andDangerPointIsNotNull() {
            addCriterion("danger_point is not null");
            return (Criteria) this;
        }

        public Criteria andDangerPointEqualTo(String value) {
            addCriterion("danger_point =", value, "dangerPoint");
            return (Criteria) this;
        }

        public Criteria andDangerPointNotEqualTo(String value) {
            addCriterion("danger_point <>", value, "dangerPoint");
            return (Criteria) this;
        }

        public Criteria andDangerPointGreaterThan(String value) {
            addCriterion("danger_point >", value, "dangerPoint");
            return (Criteria) this;
        }

        public Criteria andDangerPointGreaterThanOrEqualTo(String value) {
            addCriterion("danger_point >=", value, "dangerPoint");
            return (Criteria) this;
        }

        public Criteria andDangerPointLessThan(String value) {
            addCriterion("danger_point <", value, "dangerPoint");
            return (Criteria) this;
        }

        public Criteria andDangerPointLessThanOrEqualTo(String value) {
            addCriterion("danger_point <=", value, "dangerPoint");
            return (Criteria) this;
        }

        public Criteria andDangerPointLike(String value) {
            addCriterion("danger_point like", value, "dangerPoint");
            return (Criteria) this;
        }

        public Criteria andDangerPointNotLike(String value) {
            addCriterion("danger_point not like", value, "dangerPoint");
            return (Criteria) this;
        }

        public Criteria andDangerPointIn(List<String> values) {
            addCriterion("danger_point in", values, "dangerPoint");
            return (Criteria) this;
        }

        public Criteria andDangerPointNotIn(List<String> values) {
            addCriterion("danger_point not in", values, "dangerPoint");
            return (Criteria) this;
        }

        public Criteria andDangerPointBetween(String value1, String value2) {
            addCriterion("danger_point between", value1, value2, "dangerPoint");
            return (Criteria) this;
        }

        public Criteria andDangerPointNotBetween(String value1, String value2) {
            addCriterion("danger_point not between", value1, value2, "dangerPoint");
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

        public Criteria andAuditAddIsNull() {
            addCriterion("audit_add is null");
            return (Criteria) this;
        }

        public Criteria andAuditAddIsNotNull() {
            addCriterion("audit_add is not null");
            return (Criteria) this;
        }

        public Criteria andAuditAddEqualTo(String value) {
            addCriterion("audit_add =", value, "auditAdd");
            return (Criteria) this;
        }

        public Criteria andAuditAddNotEqualTo(String value) {
            addCriterion("audit_add <>", value, "auditAdd");
            return (Criteria) this;
        }

        public Criteria andAuditAddGreaterThan(String value) {
            addCriterion("audit_add >", value, "auditAdd");
            return (Criteria) this;
        }

        public Criteria andAuditAddGreaterThanOrEqualTo(String value) {
            addCriterion("audit_add >=", value, "auditAdd");
            return (Criteria) this;
        }

        public Criteria andAuditAddLessThan(String value) {
            addCriterion("audit_add <", value, "auditAdd");
            return (Criteria) this;
        }

        public Criteria andAuditAddLessThanOrEqualTo(String value) {
            addCriterion("audit_add <=", value, "auditAdd");
            return (Criteria) this;
        }

        public Criteria andAuditAddLike(String value) {
            addCriterion("audit_add like", value, "auditAdd");
            return (Criteria) this;
        }

        public Criteria andAuditAddNotLike(String value) {
            addCriterion("audit_add not like", value, "auditAdd");
            return (Criteria) this;
        }

        public Criteria andAuditAddIn(List<String> values) {
            addCriterion("audit_add in", values, "auditAdd");
            return (Criteria) this;
        }

        public Criteria andAuditAddNotIn(List<String> values) {
            addCriterion("audit_add not in", values, "auditAdd");
            return (Criteria) this;
        }

        public Criteria andAuditAddBetween(String value1, String value2) {
            addCriterion("audit_add between", value1, value2, "auditAdd");
            return (Criteria) this;
        }

        public Criteria andAuditAddNotBetween(String value1, String value2) {
            addCriterion("audit_add not between", value1, value2, "auditAdd");
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