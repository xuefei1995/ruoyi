package com.xuefei.pojo.manager;

import java.util.ArrayList;
import java.util.List;

public class PermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PermissionExample() {
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

        public Criteria andPermissionIdIsNull() {
            addCriterion("permission_id is null");
            return (Criteria) this;
        }

        public Criteria andPermissionIdIsNotNull() {
            addCriterion("permission_id is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionIdEqualTo(Long value) {
            addCriterion("permission_id =", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotEqualTo(Long value) {
            addCriterion("permission_id <>", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdGreaterThan(Long value) {
            addCriterion("permission_id >", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("permission_id >=", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdLessThan(Long value) {
            addCriterion("permission_id <", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdLessThanOrEqualTo(Long value) {
            addCriterion("permission_id <=", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdIn(List<Long> values) {
            addCriterion("permission_id in", values, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotIn(List<Long> values) {
            addCriterion("permission_id not in", values, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdBetween(Long value1, Long value2) {
            addCriterion("permission_id between", value1, value2, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotBetween(Long value1, Long value2) {
            addCriterion("permission_id not between", value1, value2, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionNameIsNull() {
            addCriterion("permission_name is null");
            return (Criteria) this;
        }

        public Criteria andPermissionNameIsNotNull() {
            addCriterion("permission_name is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionNameEqualTo(String value) {
            addCriterion("permission_name =", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameNotEqualTo(String value) {
            addCriterion("permission_name <>", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameGreaterThan(String value) {
            addCriterion("permission_name >", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameGreaterThanOrEqualTo(String value) {
            addCriterion("permission_name >=", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameLessThan(String value) {
            addCriterion("permission_name <", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameLessThanOrEqualTo(String value) {
            addCriterion("permission_name <=", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameLike(String value) {
            addCriterion("permission_name like", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameNotLike(String value) {
            addCriterion("permission_name not like", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameIn(List<String> values) {
            addCriterion("permission_name in", values, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameNotIn(List<String> values) {
            addCriterion("permission_name not in", values, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameBetween(String value1, String value2) {
            addCriterion("permission_name between", value1, value2, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameNotBetween(String value1, String value2) {
            addCriterion("permission_name not between", value1, value2, "permissionName");
            return (Criteria) this;
        }

        public Criteria andUriIsNull() {
            addCriterion("uri is null");
            return (Criteria) this;
        }

        public Criteria andUriIsNotNull() {
            addCriterion("uri is not null");
            return (Criteria) this;
        }

        public Criteria andUriEqualTo(String value) {
            addCriterion("uri =", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotEqualTo(String value) {
            addCriterion("uri <>", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriGreaterThan(String value) {
            addCriterion("uri >", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriGreaterThanOrEqualTo(String value) {
            addCriterion("uri >=", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriLessThan(String value) {
            addCriterion("uri <", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriLessThanOrEqualTo(String value) {
            addCriterion("uri <=", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriLike(String value) {
            addCriterion("uri like", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotLike(String value) {
            addCriterion("uri not like", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriIn(List<String> values) {
            addCriterion("uri in", values, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotIn(List<String> values) {
            addCriterion("uri not in", values, "uri");
            return (Criteria) this;
        }

        public Criteria andUriBetween(String value1, String value2) {
            addCriterion("uri between", value1, value2, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotBetween(String value1, String value2) {
            addCriterion("uri not between", value1, value2, "uri");
            return (Criteria) this;
        }

        public Criteria andCIsNull() {
            addCriterion("`c` is null");
            return (Criteria) this;
        }

        public Criteria andCIsNotNull() {
            addCriterion("`c` is not null");
            return (Criteria) this;
        }

        public Criteria andCEqualTo(Boolean value) {
            addCriterion("`c` =", value, "c");
            return (Criteria) this;
        }

        public Criteria andCNotEqualTo(Boolean value) {
            addCriterion("`c` <>", value, "c");
            return (Criteria) this;
        }

        public Criteria andCGreaterThan(Boolean value) {
            addCriterion("`c` >", value, "c");
            return (Criteria) this;
        }

        public Criteria andCGreaterThanOrEqualTo(Boolean value) {
            addCriterion("`c` >=", value, "c");
            return (Criteria) this;
        }

        public Criteria andCLessThan(Boolean value) {
            addCriterion("`c` <", value, "c");
            return (Criteria) this;
        }

        public Criteria andCLessThanOrEqualTo(Boolean value) {
            addCriterion("`c` <=", value, "c");
            return (Criteria) this;
        }

        public Criteria andCIn(List<Boolean> values) {
            addCriterion("`c` in", values, "c");
            return (Criteria) this;
        }

        public Criteria andCNotIn(List<Boolean> values) {
            addCriterion("`c` not in", values, "c");
            return (Criteria) this;
        }

        public Criteria andCBetween(Boolean value1, Boolean value2) {
            addCriterion("`c` between", value1, value2, "c");
            return (Criteria) this;
        }

        public Criteria andCNotBetween(Boolean value1, Boolean value2) {
            addCriterion("`c` not between", value1, value2, "c");
            return (Criteria) this;
        }

        public Criteria andRIsNull() {
            addCriterion("r is null");
            return (Criteria) this;
        }

        public Criteria andRIsNotNull() {
            addCriterion("r is not null");
            return (Criteria) this;
        }

        public Criteria andREqualTo(Boolean value) {
            addCriterion("r =", value, "r");
            return (Criteria) this;
        }

        public Criteria andRNotEqualTo(Boolean value) {
            addCriterion("r <>", value, "r");
            return (Criteria) this;
        }

        public Criteria andRGreaterThan(Boolean value) {
            addCriterion("r >", value, "r");
            return (Criteria) this;
        }

        public Criteria andRGreaterThanOrEqualTo(Boolean value) {
            addCriterion("r >=", value, "r");
            return (Criteria) this;
        }

        public Criteria andRLessThan(Boolean value) {
            addCriterion("r <", value, "r");
            return (Criteria) this;
        }

        public Criteria andRLessThanOrEqualTo(Boolean value) {
            addCriterion("r <=", value, "r");
            return (Criteria) this;
        }

        public Criteria andRIn(List<Boolean> values) {
            addCriterion("r in", values, "r");
            return (Criteria) this;
        }

        public Criteria andRNotIn(List<Boolean> values) {
            addCriterion("r not in", values, "r");
            return (Criteria) this;
        }

        public Criteria andRBetween(Boolean value1, Boolean value2) {
            addCriterion("r between", value1, value2, "r");
            return (Criteria) this;
        }

        public Criteria andRNotBetween(Boolean value1, Boolean value2) {
            addCriterion("r not between", value1, value2, "r");
            return (Criteria) this;
        }

        public Criteria andUIsNull() {
            addCriterion("u is null");
            return (Criteria) this;
        }

        public Criteria andUIsNotNull() {
            addCriterion("u is not null");
            return (Criteria) this;
        }

        public Criteria andUEqualTo(Boolean value) {
            addCriterion("u =", value, "u");
            return (Criteria) this;
        }

        public Criteria andUNotEqualTo(Boolean value) {
            addCriterion("u <>", value, "u");
            return (Criteria) this;
        }

        public Criteria andUGreaterThan(Boolean value) {
            addCriterion("u >", value, "u");
            return (Criteria) this;
        }

        public Criteria andUGreaterThanOrEqualTo(Boolean value) {
            addCriterion("u >=", value, "u");
            return (Criteria) this;
        }

        public Criteria andULessThan(Boolean value) {
            addCriterion("u <", value, "u");
            return (Criteria) this;
        }

        public Criteria andULessThanOrEqualTo(Boolean value) {
            addCriterion("u <=", value, "u");
            return (Criteria) this;
        }

        public Criteria andUIn(List<Boolean> values) {
            addCriterion("u in", values, "u");
            return (Criteria) this;
        }

        public Criteria andUNotIn(List<Boolean> values) {
            addCriterion("u not in", values, "u");
            return (Criteria) this;
        }

        public Criteria andUBetween(Boolean value1, Boolean value2) {
            addCriterion("u between", value1, value2, "u");
            return (Criteria) this;
        }

        public Criteria andUNotBetween(Boolean value1, Boolean value2) {
            addCriterion("u not between", value1, value2, "u");
            return (Criteria) this;
        }

        public Criteria andDIsNull() {
            addCriterion("d is null");
            return (Criteria) this;
        }

        public Criteria andDIsNotNull() {
            addCriterion("d is not null");
            return (Criteria) this;
        }

        public Criteria andDEqualTo(Boolean value) {
            addCriterion("d =", value, "d");
            return (Criteria) this;
        }

        public Criteria andDNotEqualTo(Boolean value) {
            addCriterion("d <>", value, "d");
            return (Criteria) this;
        }

        public Criteria andDGreaterThan(Boolean value) {
            addCriterion("d >", value, "d");
            return (Criteria) this;
        }

        public Criteria andDGreaterThanOrEqualTo(Boolean value) {
            addCriterion("d >=", value, "d");
            return (Criteria) this;
        }

        public Criteria andDLessThan(Boolean value) {
            addCriterion("d <", value, "d");
            return (Criteria) this;
        }

        public Criteria andDLessThanOrEqualTo(Boolean value) {
            addCriterion("d <=", value, "d");
            return (Criteria) this;
        }

        public Criteria andDIn(List<Boolean> values) {
            addCriterion("d in", values, "d");
            return (Criteria) this;
        }

        public Criteria andDNotIn(List<Boolean> values) {
            addCriterion("d not in", values, "d");
            return (Criteria) this;
        }

        public Criteria andDBetween(Boolean value1, Boolean value2) {
            addCriterion("d between", value1, value2, "d");
            return (Criteria) this;
        }

        public Criteria andDNotBetween(Boolean value1, Boolean value2) {
            addCriterion("d not between", value1, value2, "d");
            return (Criteria) this;
        }
    }

    /**
     */
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
