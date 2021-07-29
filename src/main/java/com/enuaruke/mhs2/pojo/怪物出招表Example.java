package com.enuaruke.mhs2.pojo;

import java.util.ArrayList;
import java.util.List;

public class 怪物出招表Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public 怪物出招表Example() {
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

        public Criteria and怪物名IsNull() {
            addCriterion("怪物名 is null");
            return (Criteria) this;
        }

        public Criteria and怪物名IsNotNull() {
            addCriterion("怪物名 is not null");
            return (Criteria) this;
        }

        public Criteria and怪物名EqualTo(String value) {
            addCriterion("怪物名 =", value, "怪物名");
            return (Criteria) this;
        }

        public Criteria and怪物名NotEqualTo(String value) {
            addCriterion("怪物名 <>", value, "怪物名");
            return (Criteria) this;
        }

        public Criteria and怪物名GreaterThan(String value) {
            addCriterion("怪物名 >", value, "怪物名");
            return (Criteria) this;
        }

        public Criteria and怪物名GreaterThanOrEqualTo(String value) {
            addCriterion("怪物名 >=", value, "怪物名");
            return (Criteria) this;
        }

        public Criteria and怪物名LessThan(String value) {
            addCriterion("怪物名 <", value, "怪物名");
            return (Criteria) this;
        }

        public Criteria and怪物名LessThanOrEqualTo(String value) {
            addCriterion("怪物名 <=", value, "怪物名");
            return (Criteria) this;
        }

        public Criteria and怪物名Like(String value) {
            addCriterion("怪物名 like", value, "怪物名");
            return (Criteria) this;
        }

        public Criteria and怪物名NotLike(String value) {
            addCriterion("怪物名 not like", value, "怪物名");
            return (Criteria) this;
        }

        public Criteria and怪物名In(List<String> values) {
            addCriterion("怪物名 in", values, "怪物名");
            return (Criteria) this;
        }

        public Criteria and怪物名NotIn(List<String> values) {
            addCriterion("怪物名 not in", values, "怪物名");
            return (Criteria) this;
        }

        public Criteria and怪物名Between(String value1, String value2) {
            addCriterion("怪物名 between", value1, value2, "怪物名");
            return (Criteria) this;
        }

        public Criteria and怪物名NotBetween(String value1, String value2) {
            addCriterion("怪物名 not between", value1, value2, "怪物名");
            return (Criteria) this;
        }

        public Criteria and普通状态IsNull() {
            addCriterion("普通状态 is null");
            return (Criteria) this;
        }

        public Criteria and普通状态IsNotNull() {
            addCriterion("普通状态 is not null");
            return (Criteria) this;
        }

        public Criteria and普通状态EqualTo(String value) {
            addCriterion("普通状态 =", value, "普通状态");
            return (Criteria) this;
        }

        public Criteria and普通状态NotEqualTo(String value) {
            addCriterion("普通状态 <>", value, "普通状态");
            return (Criteria) this;
        }

        public Criteria and普通状态GreaterThan(String value) {
            addCriterion("普通状态 >", value, "普通状态");
            return (Criteria) this;
        }

        public Criteria and普通状态GreaterThanOrEqualTo(String value) {
            addCriterion("普通状态 >=", value, "普通状态");
            return (Criteria) this;
        }

        public Criteria and普通状态LessThan(String value) {
            addCriterion("普通状态 <", value, "普通状态");
            return (Criteria) this;
        }

        public Criteria and普通状态LessThanOrEqualTo(String value) {
            addCriterion("普通状态 <=", value, "普通状态");
            return (Criteria) this;
        }

        public Criteria and普通状态Like(String value) {
            addCriterion("普通状态 like", value, "普通状态");
            return (Criteria) this;
        }

        public Criteria and普通状态NotLike(String value) {
            addCriterion("普通状态 not like", value, "普通状态");
            return (Criteria) this;
        }

        public Criteria and普通状态In(List<String> values) {
            addCriterion("普通状态 in", values, "普通状态");
            return (Criteria) this;
        }

        public Criteria and普通状态NotIn(List<String> values) {
            addCriterion("普通状态 not in", values, "普通状态");
            return (Criteria) this;
        }

        public Criteria and普通状态Between(String value1, String value2) {
            addCriterion("普通状态 between", value1, value2, "普通状态");
            return (Criteria) this;
        }

        public Criteria and普通状态NotBetween(String value1, String value2) {
            addCriterion("普通状态 not between", value1, value2, "普通状态");
            return (Criteria) this;
        }

        public Criteria and愤怒状态IsNull() {
            addCriterion("愤怒状态 is null");
            return (Criteria) this;
        }

        public Criteria and愤怒状态IsNotNull() {
            addCriterion("愤怒状态 is not null");
            return (Criteria) this;
        }

        public Criteria and愤怒状态EqualTo(String value) {
            addCriterion("愤怒状态 =", value, "愤怒状态");
            return (Criteria) this;
        }

        public Criteria and愤怒状态NotEqualTo(String value) {
            addCriterion("愤怒状态 <>", value, "愤怒状态");
            return (Criteria) this;
        }

        public Criteria and愤怒状态GreaterThan(String value) {
            addCriterion("愤怒状态 >", value, "愤怒状态");
            return (Criteria) this;
        }

        public Criteria and愤怒状态GreaterThanOrEqualTo(String value) {
            addCriterion("愤怒状态 >=", value, "愤怒状态");
            return (Criteria) this;
        }

        public Criteria and愤怒状态LessThan(String value) {
            addCriterion("愤怒状态 <", value, "愤怒状态");
            return (Criteria) this;
        }

        public Criteria and愤怒状态LessThanOrEqualTo(String value) {
            addCriterion("愤怒状态 <=", value, "愤怒状态");
            return (Criteria) this;
        }

        public Criteria and愤怒状态Like(String value) {
            addCriterion("愤怒状态 like", value, "愤怒状态");
            return (Criteria) this;
        }

        public Criteria and愤怒状态NotLike(String value) {
            addCriterion("愤怒状态 not like", value, "愤怒状态");
            return (Criteria) this;
        }

        public Criteria and愤怒状态In(List<String> values) {
            addCriterion("愤怒状态 in", values, "愤怒状态");
            return (Criteria) this;
        }

        public Criteria and愤怒状态NotIn(List<String> values) {
            addCriterion("愤怒状态 not in", values, "愤怒状态");
            return (Criteria) this;
        }

        public Criteria and愤怒状态Between(String value1, String value2) {
            addCriterion("愤怒状态 between", value1, value2, "愤怒状态");
            return (Criteria) this;
        }

        public Criteria and愤怒状态NotBetween(String value1, String value2) {
            addCriterion("愤怒状态 not between", value1, value2, "愤怒状态");
            return (Criteria) this;
        }

        public Criteria and特殊状态IsNull() {
            addCriterion("特殊状态 is null");
            return (Criteria) this;
        }

        public Criteria and特殊状态IsNotNull() {
            addCriterion("特殊状态 is not null");
            return (Criteria) this;
        }

        public Criteria and特殊状态EqualTo(String value) {
            addCriterion("特殊状态 =", value, "特殊状态");
            return (Criteria) this;
        }

        public Criteria and特殊状态NotEqualTo(String value) {
            addCriterion("特殊状态 <>", value, "特殊状态");
            return (Criteria) this;
        }

        public Criteria and特殊状态GreaterThan(String value) {
            addCriterion("特殊状态 >", value, "特殊状态");
            return (Criteria) this;
        }

        public Criteria and特殊状态GreaterThanOrEqualTo(String value) {
            addCriterion("特殊状态 >=", value, "特殊状态");
            return (Criteria) this;
        }

        public Criteria and特殊状态LessThan(String value) {
            addCriterion("特殊状态 <", value, "特殊状态");
            return (Criteria) this;
        }

        public Criteria and特殊状态LessThanOrEqualTo(String value) {
            addCriterion("特殊状态 <=", value, "特殊状态");
            return (Criteria) this;
        }

        public Criteria and特殊状态Like(String value) {
            addCriterion("特殊状态 like", value, "特殊状态");
            return (Criteria) this;
        }

        public Criteria and特殊状态NotLike(String value) {
            addCriterion("特殊状态 not like", value, "特殊状态");
            return (Criteria) this;
        }

        public Criteria and特殊状态In(List<String> values) {
            addCriterion("特殊状态 in", values, "特殊状态");
            return (Criteria) this;
        }

        public Criteria and特殊状态NotIn(List<String> values) {
            addCriterion("特殊状态 not in", values, "特殊状态");
            return (Criteria) this;
        }

        public Criteria and特殊状态Between(String value1, String value2) {
            addCriterion("特殊状态 between", value1, value2, "特殊状态");
            return (Criteria) this;
        }

        public Criteria and特殊状态NotBetween(String value1, String value2) {
            addCriterion("特殊状态 not between", value1, value2, "特殊状态");
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

        public Criteria andF6IsNull() {
            addCriterion("f6 is null");
            return (Criteria) this;
        }

        public Criteria andF6IsNotNull() {
            addCriterion("f6 is not null");
            return (Criteria) this;
        }

        public Criteria andF6EqualTo(String value) {
            addCriterion("f6 =", value, "f6");
            return (Criteria) this;
        }

        public Criteria andF6NotEqualTo(String value) {
            addCriterion("f6 <>", value, "f6");
            return (Criteria) this;
        }

        public Criteria andF6GreaterThan(String value) {
            addCriterion("f6 >", value, "f6");
            return (Criteria) this;
        }

        public Criteria andF6GreaterThanOrEqualTo(String value) {
            addCriterion("f6 >=", value, "f6");
            return (Criteria) this;
        }

        public Criteria andF6LessThan(String value) {
            addCriterion("f6 <", value, "f6");
            return (Criteria) this;
        }

        public Criteria andF6LessThanOrEqualTo(String value) {
            addCriterion("f6 <=", value, "f6");
            return (Criteria) this;
        }

        public Criteria andF6Like(String value) {
            addCriterion("f6 like", value, "f6");
            return (Criteria) this;
        }

        public Criteria andF6NotLike(String value) {
            addCriterion("f6 not like", value, "f6");
            return (Criteria) this;
        }

        public Criteria andF6In(List<String> values) {
            addCriterion("f6 in", values, "f6");
            return (Criteria) this;
        }

        public Criteria andF6NotIn(List<String> values) {
            addCriterion("f6 not in", values, "f6");
            return (Criteria) this;
        }

        public Criteria andF6Between(String value1, String value2) {
            addCriterion("f6 between", value1, value2, "f6");
            return (Criteria) this;
        }

        public Criteria andF6NotBetween(String value1, String value2) {
            addCriterion("f6 not between", value1, value2, "f6");
            return (Criteria) this;
        }

        public Criteria andF7IsNull() {
            addCriterion("f7 is null");
            return (Criteria) this;
        }

        public Criteria andF7IsNotNull() {
            addCriterion("f7 is not null");
            return (Criteria) this;
        }

        public Criteria andF7EqualTo(String value) {
            addCriterion("f7 =", value, "f7");
            return (Criteria) this;
        }

        public Criteria andF7NotEqualTo(String value) {
            addCriterion("f7 <>", value, "f7");
            return (Criteria) this;
        }

        public Criteria andF7GreaterThan(String value) {
            addCriterion("f7 >", value, "f7");
            return (Criteria) this;
        }

        public Criteria andF7GreaterThanOrEqualTo(String value) {
            addCriterion("f7 >=", value, "f7");
            return (Criteria) this;
        }

        public Criteria andF7LessThan(String value) {
            addCriterion("f7 <", value, "f7");
            return (Criteria) this;
        }

        public Criteria andF7LessThanOrEqualTo(String value) {
            addCriterion("f7 <=", value, "f7");
            return (Criteria) this;
        }

        public Criteria andF7Like(String value) {
            addCriterion("f7 like", value, "f7");
            return (Criteria) this;
        }

        public Criteria andF7NotLike(String value) {
            addCriterion("f7 not like", value, "f7");
            return (Criteria) this;
        }

        public Criteria andF7In(List<String> values) {
            addCriterion("f7 in", values, "f7");
            return (Criteria) this;
        }

        public Criteria andF7NotIn(List<String> values) {
            addCriterion("f7 not in", values, "f7");
            return (Criteria) this;
        }

        public Criteria andF7Between(String value1, String value2) {
            addCriterion("f7 between", value1, value2, "f7");
            return (Criteria) this;
        }

        public Criteria andF7NotBetween(String value1, String value2) {
            addCriterion("f7 not between", value1, value2, "f7");
            return (Criteria) this;
        }

        public Criteria andF8IsNull() {
            addCriterion("f8 is null");
            return (Criteria) this;
        }

        public Criteria andF8IsNotNull() {
            addCriterion("f8 is not null");
            return (Criteria) this;
        }

        public Criteria andF8EqualTo(String value) {
            addCriterion("f8 =", value, "f8");
            return (Criteria) this;
        }

        public Criteria andF8NotEqualTo(String value) {
            addCriterion("f8 <>", value, "f8");
            return (Criteria) this;
        }

        public Criteria andF8GreaterThan(String value) {
            addCriterion("f8 >", value, "f8");
            return (Criteria) this;
        }

        public Criteria andF8GreaterThanOrEqualTo(String value) {
            addCriterion("f8 >=", value, "f8");
            return (Criteria) this;
        }

        public Criteria andF8LessThan(String value) {
            addCriterion("f8 <", value, "f8");
            return (Criteria) this;
        }

        public Criteria andF8LessThanOrEqualTo(String value) {
            addCriterion("f8 <=", value, "f8");
            return (Criteria) this;
        }

        public Criteria andF8Like(String value) {
            addCriterion("f8 like", value, "f8");
            return (Criteria) this;
        }

        public Criteria andF8NotLike(String value) {
            addCriterion("f8 not like", value, "f8");
            return (Criteria) this;
        }

        public Criteria andF8In(List<String> values) {
            addCriterion("f8 in", values, "f8");
            return (Criteria) this;
        }

        public Criteria andF8NotIn(List<String> values) {
            addCriterion("f8 not in", values, "f8");
            return (Criteria) this;
        }

        public Criteria andF8Between(String value1, String value2) {
            addCriterion("f8 between", value1, value2, "f8");
            return (Criteria) this;
        }

        public Criteria andF8NotBetween(String value1, String value2) {
            addCriterion("f8 not between", value1, value2, "f8");
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