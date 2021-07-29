package com.enuaruke.mhs2.pojo;

import java.util.ArrayList;
import java.util.List;

public class WeaknessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public WeaknessExample() {
        oredCriteria = new ArrayList<>();
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria and编号IsNull() {
            addCriterion("编号 is null");
            return (Criteria) this;
        }

        public Criteria and编号IsNotNull() {
            addCriterion("编号 is not null");
            return (Criteria) this;
        }

        public Criteria and编号EqualTo(Integer value) {
            addCriterion("编号 =", value, "编号");
            return (Criteria) this;
        }

        public Criteria and编号NotEqualTo(Integer value) {
            addCriterion("编号 <>", value, "编号");
            return (Criteria) this;
        }

        public Criteria and编号GreaterThan(Integer value) {
            addCriterion("编号 >", value, "编号");
            return (Criteria) this;
        }

        public Criteria and编号GreaterThanOrEqualTo(Integer value) {
            addCriterion("编号 >=", value, "编号");
            return (Criteria) this;
        }

        public Criteria and编号LessThan(Integer value) {
            addCriterion("编号 <", value, "编号");
            return (Criteria) this;
        }

        public Criteria and编号LessThanOrEqualTo(Integer value) {
            addCriterion("编号 <=", value, "编号");
            return (Criteria) this;
        }

        public Criteria and编号In(List<Integer> values) {
            addCriterion("编号 in", values, "编号");
            return (Criteria) this;
        }

        public Criteria and编号NotIn(List<Integer> values) {
            addCriterion("编号 not in", values, "编号");
            return (Criteria) this;
        }

        public Criteria and编号Between(Integer value1, Integer value2) {
            addCriterion("编号 between", value1, value2, "编号");
            return (Criteria) this;
        }

        public Criteria and编号NotBetween(Integer value1, Integer value2) {
            addCriterion("编号 not between", value1, value2, "编号");
            return (Criteria) this;
        }

        public Criteria and名称IsNull() {
            addCriterion("名称 is null");
            return (Criteria) this;
        }

        public Criteria and名称IsNotNull() {
            addCriterion("名称 is not null");
            return (Criteria) this;
        }

        public Criteria and名称EqualTo(String value) {
            addCriterion("名称 =", value, "名称");
            return (Criteria) this;
        }

        public Criteria and名称NotEqualTo(String value) {
            addCriterion("名称 <>", value, "名称");
            return (Criteria) this;
        }

        public Criteria and名称GreaterThan(String value) {
            addCriterion("名称 >", value, "名称");
            return (Criteria) this;
        }

        public Criteria and名称GreaterThanOrEqualTo(String value) {
            addCriterion("名称 >=", value, "名称");
            return (Criteria) this;
        }

        public Criteria and名称LessThan(String value) {
            addCriterion("名称 <", value, "名称");
            return (Criteria) this;
        }

        public Criteria and名称LessThanOrEqualTo(String value) {
            addCriterion("名称 <=", value, "名称");
            return (Criteria) this;
        }

        public Criteria and名称Like(String value) {
            addCriterion("名称 like", value, "名称");
            return (Criteria) this;
        }

        public Criteria and名称NotLike(String value) {
            addCriterion("名称 not like", value, "名称");
            return (Criteria) this;
        }

        public Criteria and名称In(List<String> values) {
            addCriterion("名称 in", values, "名称");
            return (Criteria) this;
        }

        public Criteria and名称NotIn(List<String> values) {
            addCriterion("名称 not in", values, "名称");
            return (Criteria) this;
        }

        public Criteria and名称Between(String value1, String value2) {
            addCriterion("名称 between", value1, value2, "名称");
            return (Criteria) this;
        }

        public Criteria and名称NotBetween(String value1, String value2) {
            addCriterion("名称 not between", value1, value2, "名称");
            return (Criteria) this;
        }

        public Criteria and攻击属性IsNull() {
            addCriterion("攻击属性 is null");
            return (Criteria) this;
        }

        public Criteria and攻击属性IsNotNull() {
            addCriterion("攻击属性 is not null");
            return (Criteria) this;
        }

        public Criteria and攻击属性EqualTo(String value) {
            addCriterion("攻击属性 =", value, "攻击属性");
            return (Criteria) this;
        }

        public Criteria and攻击属性NotEqualTo(String value) {
            addCriterion("攻击属性 <>", value, "攻击属性");
            return (Criteria) this;
        }

        public Criteria and攻击属性GreaterThan(String value) {
            addCriterion("攻击属性 >", value, "攻击属性");
            return (Criteria) this;
        }

        public Criteria and攻击属性GreaterThanOrEqualTo(String value) {
            addCriterion("攻击属性 >=", value, "攻击属性");
            return (Criteria) this;
        }

        public Criteria and攻击属性LessThan(String value) {
            addCriterion("攻击属性 <", value, "攻击属性");
            return (Criteria) this;
        }

        public Criteria and攻击属性LessThanOrEqualTo(String value) {
            addCriterion("攻击属性 <=", value, "攻击属性");
            return (Criteria) this;
        }

        public Criteria and攻击属性Like(String value) {
            addCriterion("攻击属性 like", value, "攻击属性");
            return (Criteria) this;
        }

        public Criteria and攻击属性NotLike(String value) {
            addCriterion("攻击属性 not like", value, "攻击属性");
            return (Criteria) this;
        }

        public Criteria and攻击属性In(List<String> values) {
            addCriterion("攻击属性 in", values, "攻击属性");
            return (Criteria) this;
        }

        public Criteria and攻击属性NotIn(List<String> values) {
            addCriterion("攻击属性 not in", values, "攻击属性");
            return (Criteria) this;
        }

        public Criteria and攻击属性Between(String value1, String value2) {
            addCriterion("攻击属性 between", value1, value2, "攻击属性");
            return (Criteria) this;
        }

        public Criteria and攻击属性NotBetween(String value1, String value2) {
            addCriterion("攻击属性 not between", value1, value2, "攻击属性");
            return (Criteria) this;
        }

        public Criteria and属性弱点IsNull() {
            addCriterion("属性弱点 is null");
            return (Criteria) this;
        }

        public Criteria and属性弱点IsNotNull() {
            addCriterion("属性弱点 is not null");
            return (Criteria) this;
        }

        public Criteria and属性弱点EqualTo(String value) {
            addCriterion("属性弱点 =", value, "属性弱点");
            return (Criteria) this;
        }

        public Criteria and属性弱点NotEqualTo(String value) {
            addCriterion("属性弱点 <>", value, "属性弱点");
            return (Criteria) this;
        }

        public Criteria and属性弱点GreaterThan(String value) {
            addCriterion("属性弱点 >", value, "属性弱点");
            return (Criteria) this;
        }

        public Criteria and属性弱点GreaterThanOrEqualTo(String value) {
            addCriterion("属性弱点 >=", value, "属性弱点");
            return (Criteria) this;
        }

        public Criteria and属性弱点LessThan(String value) {
            addCriterion("属性弱点 <", value, "属性弱点");
            return (Criteria) this;
        }

        public Criteria and属性弱点LessThanOrEqualTo(String value) {
            addCriterion("属性弱点 <=", value, "属性弱点");
            return (Criteria) this;
        }

        public Criteria and属性弱点Like(String value) {
            addCriterion("属性弱点 like", value, "属性弱点");
            return (Criteria) this;
        }

        public Criteria and属性弱点NotLike(String value) {
            addCriterion("属性弱点 not like", value, "属性弱点");
            return (Criteria) this;
        }

        public Criteria and属性弱点In(List<String> values) {
            addCriterion("属性弱点 in", values, "属性弱点");
            return (Criteria) this;
        }

        public Criteria and属性弱点NotIn(List<String> values) {
            addCriterion("属性弱点 not in", values, "属性弱点");
            return (Criteria) this;
        }

        public Criteria and属性弱点Between(String value1, String value2) {
            addCriterion("属性弱点 between", value1, value2, "属性弱点");
            return (Criteria) this;
        }

        public Criteria and属性弱点NotBetween(String value1, String value2) {
            addCriterion("属性弱点 not between", value1, value2, "属性弱点");
            return (Criteria) this;
        }

        public Criteria and部位弱点IsNull() {
            addCriterion("部位弱点 is null");
            return (Criteria) this;
        }

        public Criteria and部位弱点IsNotNull() {
            addCriterion("部位弱点 is not null");
            return (Criteria) this;
        }

        public Criteria and部位弱点EqualTo(String value) {
            addCriterion("部位弱点 =", value, "部位弱点");
            return (Criteria) this;
        }

        public Criteria and部位弱点NotEqualTo(String value) {
            addCriterion("部位弱点 <>", value, "部位弱点");
            return (Criteria) this;
        }

        public Criteria and部位弱点GreaterThan(String value) {
            addCriterion("部位弱点 >", value, "部位弱点");
            return (Criteria) this;
        }

        public Criteria and部位弱点GreaterThanOrEqualTo(String value) {
            addCriterion("部位弱点 >=", value, "部位弱点");
            return (Criteria) this;
        }

        public Criteria and部位弱点LessThan(String value) {
            addCriterion("部位弱点 <", value, "部位弱点");
            return (Criteria) this;
        }

        public Criteria and部位弱点LessThanOrEqualTo(String value) {
            addCriterion("部位弱点 <=", value, "部位弱点");
            return (Criteria) this;
        }

        public Criteria and部位弱点Like(String value) {
            addCriterion("部位弱点 like", value, "部位弱点");
            return (Criteria) this;
        }

        public Criteria and部位弱点NotLike(String value) {
            addCriterion("部位弱点 not like", value, "部位弱点");
            return (Criteria) this;
        }

        public Criteria and部位弱点In(List<String> values) {
            addCriterion("部位弱点 in", values, "部位弱点");
            return (Criteria) this;
        }

        public Criteria and部位弱点NotIn(List<String> values) {
            addCriterion("部位弱点 not in", values, "部位弱点");
            return (Criteria) this;
        }

        public Criteria and部位弱点Between(String value1, String value2) {
            addCriterion("部位弱点 between", value1, value2, "部位弱点");
            return (Criteria) this;
        }

        public Criteria and部位弱点NotBetween(String value1, String value2) {
            addCriterion("部位弱点 not between", value1, value2, "部位弱点");
            return (Criteria) this;
        }

        public Criteria and招式弱点IsNull() {
            addCriterion("招式弱点 is null");
            return (Criteria) this;
        }

        public Criteria and招式弱点IsNotNull() {
            addCriterion("招式弱点 is not null");
            return (Criteria) this;
        }

        public Criteria and招式弱点EqualTo(String value) {
            addCriterion("招式弱点 =", value, "招式弱点");
            return (Criteria) this;
        }

        public Criteria and招式弱点NotEqualTo(String value) {
            addCriterion("招式弱点 <>", value, "招式弱点");
            return (Criteria) this;
        }

        public Criteria and招式弱点GreaterThan(String value) {
            addCriterion("招式弱点 >", value, "招式弱点");
            return (Criteria) this;
        }

        public Criteria and招式弱点GreaterThanOrEqualTo(String value) {
            addCriterion("招式弱点 >=", value, "招式弱点");
            return (Criteria) this;
        }

        public Criteria and招式弱点LessThan(String value) {
            addCriterion("招式弱点 <", value, "招式弱点");
            return (Criteria) this;
        }

        public Criteria and招式弱点LessThanOrEqualTo(String value) {
            addCriterion("招式弱点 <=", value, "招式弱点");
            return (Criteria) this;
        }

        public Criteria and招式弱点Like(String value) {
            addCriterion("招式弱点 like", value, "招式弱点");
            return (Criteria) this;
        }

        public Criteria and招式弱点NotLike(String value) {
            addCriterion("招式弱点 not like", value, "招式弱点");
            return (Criteria) this;
        }

        public Criteria and招式弱点In(List<String> values) {
            addCriterion("招式弱点 in", values, "招式弱点");
            return (Criteria) this;
        }

        public Criteria and招式弱点NotIn(List<String> values) {
            addCriterion("招式弱点 not in", values, "招式弱点");
            return (Criteria) this;
        }

        public Criteria and招式弱点Between(String value1, String value2) {
            addCriterion("招式弱点 between", value1, value2, "招式弱点");
            return (Criteria) this;
        }

        public Criteria and招式弱点NotBetween(String value1, String value2) {
            addCriterion("招式弱点 not between", value1, value2, "招式弱点");
            return (Criteria) this;
        }

        public Criteria and备注IsNull() {
            addCriterion("备注 is null");
            return (Criteria) this;
        }

        public Criteria and备注IsNotNull() {
            addCriterion("备注 is not null");
            return (Criteria) this;
        }

        public Criteria and备注EqualTo(String value) {
            addCriterion("备注 =", value, "备注");
            return (Criteria) this;
        }

        public Criteria and备注NotEqualTo(String value) {
            addCriterion("备注 <>", value, "备注");
            return (Criteria) this;
        }

        public Criteria and备注GreaterThan(String value) {
            addCriterion("备注 >", value, "备注");
            return (Criteria) this;
        }

        public Criteria and备注GreaterThanOrEqualTo(String value) {
            addCriterion("备注 >=", value, "备注");
            return (Criteria) this;
        }

        public Criteria and备注LessThan(String value) {
            addCriterion("备注 <", value, "备注");
            return (Criteria) this;
        }

        public Criteria and备注LessThanOrEqualTo(String value) {
            addCriterion("备注 <=", value, "备注");
            return (Criteria) this;
        }

        public Criteria and备注Like(String value) {
            addCriterion("备注 like", value, "备注");
            return (Criteria) this;
        }

        public Criteria and备注NotLike(String value) {
            addCriterion("备注 not like", value, "备注");
            return (Criteria) this;
        }

        public Criteria and备注In(List<String> values) {
            addCriterion("备注 in", values, "备注");
            return (Criteria) this;
        }

        public Criteria and备注NotIn(List<String> values) {
            addCriterion("备注 not in", values, "备注");
            return (Criteria) this;
        }

        public Criteria and备注Between(String value1, String value2) {
            addCriterion("备注 between", value1, value2, "备注");
            return (Criteria) this;
        }

        public Criteria and备注NotBetween(String value1, String value2) {
            addCriterion("备注 not between", value1, value2, "备注");
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