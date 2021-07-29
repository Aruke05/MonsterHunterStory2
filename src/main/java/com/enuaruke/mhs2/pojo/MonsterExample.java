package com.enuaruke.mhs2.pojo;

import java.util.ArrayList;
import java.util.List;

public class MonsterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MonsterExample() {
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

        public Criteria and编号EqualTo(String value) {
            addCriterion("编号 =", value, "编号");
            return (Criteria) this;
        }

        public Criteria and编号NotEqualTo(String value) {
            addCriterion("编号 <>", value, "编号");
            return (Criteria) this;
        }

        public Criteria and编号GreaterThan(String value) {
            addCriterion("编号 >", value, "编号");
            return (Criteria) this;
        }

        public Criteria and编号GreaterThanOrEqualTo(String value) {
            addCriterion("编号 >=", value, "编号");
            return (Criteria) this;
        }

        public Criteria and编号LessThan(String value) {
            addCriterion("编号 <", value, "编号");
            return (Criteria) this;
        }

        public Criteria and编号LessThanOrEqualTo(String value) {
            addCriterion("编号 <=", value, "编号");
            return (Criteria) this;
        }

        public Criteria and编号Like(String value) {
            addCriterion("编号 like", value, "编号");
            return (Criteria) this;
        }

        public Criteria and编号NotLike(String value) {
            addCriterion("编号 not like", value, "编号");
            return (Criteria) this;
        }

        public Criteria and编号In(List<String> values) {
            addCriterion("编号 in", values, "编号");
            return (Criteria) this;
        }

        public Criteria and编号NotIn(List<String> values) {
            addCriterion("编号 not in", values, "编号");
            return (Criteria) this;
        }

        public Criteria and编号Between(String value1, String value2) {
            addCriterion("编号 between", value1, value2, "编号");
            return (Criteria) this;
        }

        public Criteria and编号NotBetween(String value1, String value2) {
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

        public Criteria and稀有度IsNull() {
            addCriterion("稀有度 is null");
            return (Criteria) this;
        }

        public Criteria and稀有度IsNotNull() {
            addCriterion("稀有度 is not null");
            return (Criteria) this;
        }

        public Criteria and稀有度EqualTo(String value) {
            addCriterion("稀有度 =", value, "稀有度");
            return (Criteria) this;
        }

        public Criteria and稀有度NotEqualTo(String value) {
            addCriterion("稀有度 <>", value, "稀有度");
            return (Criteria) this;
        }

        public Criteria and稀有度GreaterThan(String value) {
            addCriterion("稀有度 >", value, "稀有度");
            return (Criteria) this;
        }

        public Criteria and稀有度GreaterThanOrEqualTo(String value) {
            addCriterion("稀有度 >=", value, "稀有度");
            return (Criteria) this;
        }

        public Criteria and稀有度LessThan(String value) {
            addCriterion("稀有度 <", value, "稀有度");
            return (Criteria) this;
        }

        public Criteria and稀有度LessThanOrEqualTo(String value) {
            addCriterion("稀有度 <=", value, "稀有度");
            return (Criteria) this;
        }

        public Criteria and稀有度Like(String value) {
            addCriterion("稀有度 like", value, "稀有度");
            return (Criteria) this;
        }

        public Criteria and稀有度NotLike(String value) {
            addCriterion("稀有度 not like", value, "稀有度");
            return (Criteria) this;
        }

        public Criteria and稀有度In(List<String> values) {
            addCriterion("稀有度 in", values, "稀有度");
            return (Criteria) this;
        }

        public Criteria and稀有度NotIn(List<String> values) {
            addCriterion("稀有度 not in", values, "稀有度");
            return (Criteria) this;
        }

        public Criteria and稀有度Between(String value1, String value2) {
            addCriterion("稀有度 between", value1, value2, "稀有度");
            return (Criteria) this;
        }

        public Criteria and稀有度NotBetween(String value1, String value2) {
            addCriterion("稀有度 not between", value1, value2, "稀有度");
            return (Criteria) this;
        }

        public Criteria and栖息地IsNull() {
            addCriterion("栖息地 is null");
            return (Criteria) this;
        }

        public Criteria and栖息地IsNotNull() {
            addCriterion("栖息地 is not null");
            return (Criteria) this;
        }

        public Criteria and栖息地EqualTo(String value) {
            addCriterion("栖息地 =", value, "栖息地");
            return (Criteria) this;
        }

        public Criteria and栖息地NotEqualTo(String value) {
            addCriterion("栖息地 <>", value, "栖息地");
            return (Criteria) this;
        }

        public Criteria and栖息地GreaterThan(String value) {
            addCriterion("栖息地 >", value, "栖息地");
            return (Criteria) this;
        }

        public Criteria and栖息地GreaterThanOrEqualTo(String value) {
            addCriterion("栖息地 >=", value, "栖息地");
            return (Criteria) this;
        }

        public Criteria and栖息地LessThan(String value) {
            addCriterion("栖息地 <", value, "栖息地");
            return (Criteria) this;
        }

        public Criteria and栖息地LessThanOrEqualTo(String value) {
            addCriterion("栖息地 <=", value, "栖息地");
            return (Criteria) this;
        }

        public Criteria and栖息地Like(String value) {
            addCriterion("栖息地 like", value, "栖息地");
            return (Criteria) this;
        }

        public Criteria and栖息地NotLike(String value) {
            addCriterion("栖息地 not like", value, "栖息地");
            return (Criteria) this;
        }

        public Criteria and栖息地In(List<String> values) {
            addCriterion("栖息地 in", values, "栖息地");
            return (Criteria) this;
        }

        public Criteria and栖息地NotIn(List<String> values) {
            addCriterion("栖息地 not in", values, "栖息地");
            return (Criteria) this;
        }

        public Criteria and栖息地Between(String value1, String value2) {
            addCriterion("栖息地 between", value1, value2, "栖息地");
            return (Criteria) this;
        }

        public Criteria and栖息地NotBetween(String value1, String value2) {
            addCriterion("栖息地 not between", value1, value2, "栖息地");
            return (Criteria) this;
        }

        public Criteria and归巢条件IsNull() {
            addCriterion("归巢条件 is null");
            return (Criteria) this;
        }

        public Criteria and归巢条件IsNotNull() {
            addCriterion("归巢条件 is not null");
            return (Criteria) this;
        }

        public Criteria and归巢条件EqualTo(String value) {
            addCriterion("归巢条件 =", value, "归巢条件");
            return (Criteria) this;
        }

        public Criteria and归巢条件NotEqualTo(String value) {
            addCriterion("归巢条件 <>", value, "归巢条件");
            return (Criteria) this;
        }

        public Criteria and归巢条件GreaterThan(String value) {
            addCriterion("归巢条件 >", value, "归巢条件");
            return (Criteria) this;
        }

        public Criteria and归巢条件GreaterThanOrEqualTo(String value) {
            addCriterion("归巢条件 >=", value, "归巢条件");
            return (Criteria) this;
        }

        public Criteria and归巢条件LessThan(String value) {
            addCriterion("归巢条件 <", value, "归巢条件");
            return (Criteria) this;
        }

        public Criteria and归巢条件LessThanOrEqualTo(String value) {
            addCriterion("归巢条件 <=", value, "归巢条件");
            return (Criteria) this;
        }

        public Criteria and归巢条件Like(String value) {
            addCriterion("归巢条件 like", value, "归巢条件");
            return (Criteria) this;
        }

        public Criteria and归巢条件NotLike(String value) {
            addCriterion("归巢条件 not like", value, "归巢条件");
            return (Criteria) this;
        }

        public Criteria and归巢条件In(List<String> values) {
            addCriterion("归巢条件 in", values, "归巢条件");
            return (Criteria) this;
        }

        public Criteria and归巢条件NotIn(List<String> values) {
            addCriterion("归巢条件 not in", values, "归巢条件");
            return (Criteria) this;
        }

        public Criteria and归巢条件Between(String value1, String value2) {
            addCriterion("归巢条件 between", value1, value2, "归巢条件");
            return (Criteria) this;
        }

        public Criteria and归巢条件NotBetween(String value1, String value2) {
            addCriterion("归巢条件 not between", value1, value2, "归巢条件");
            return (Criteria) this;
        }

        public Criteria and下位获取素材IsNull() {
            addCriterion("下位_获取素材 is null");
            return (Criteria) this;
        }

        public Criteria and下位获取素材IsNotNull() {
            addCriterion("下位_获取素材 is not null");
            return (Criteria) this;
        }

        public Criteria and下位获取素材EqualTo(String value) {
            addCriterion("下位_获取素材 =", value, "下位获取素材");
            return (Criteria) this;
        }

        public Criteria and下位获取素材NotEqualTo(String value) {
            addCriterion("下位_获取素材 <>", value, "下位获取素材");
            return (Criteria) this;
        }

        public Criteria and下位获取素材GreaterThan(String value) {
            addCriterion("下位_获取素材 >", value, "下位获取素材");
            return (Criteria) this;
        }

        public Criteria and下位获取素材GreaterThanOrEqualTo(String value) {
            addCriterion("下位_获取素材 >=", value, "下位获取素材");
            return (Criteria) this;
        }

        public Criteria and下位获取素材LessThan(String value) {
            addCriterion("下位_获取素材 <", value, "下位获取素材");
            return (Criteria) this;
        }

        public Criteria and下位获取素材LessThanOrEqualTo(String value) {
            addCriterion("下位_获取素材 <=", value, "下位获取素材");
            return (Criteria) this;
        }

        public Criteria and下位获取素材Like(String value) {
            addCriterion("下位_获取素材 like", value, "下位获取素材");
            return (Criteria) this;
        }

        public Criteria and下位获取素材NotLike(String value) {
            addCriterion("下位_获取素材 not like", value, "下位获取素材");
            return (Criteria) this;
        }

        public Criteria and下位获取素材In(List<String> values) {
            addCriterion("下位_获取素材 in", values, "下位获取素材");
            return (Criteria) this;
        }

        public Criteria and下位获取素材NotIn(List<String> values) {
            addCriterion("下位_获取素材 not in", values, "下位获取素材");
            return (Criteria) this;
        }

        public Criteria and下位获取素材Between(String value1, String value2) {
            addCriterion("下位_获取素材 between", value1, value2, "下位获取素材");
            return (Criteria) this;
        }

        public Criteria and下位获取素材NotBetween(String value1, String value2) {
            addCriterion("下位_获取素材 not between", value1, value2, "下位获取素材");
            return (Criteria) this;
        }

        public Criteria and下位部位信息IsNull() {
            addCriterion("下位_部位信息 is null");
            return (Criteria) this;
        }

        public Criteria and下位部位信息IsNotNull() {
            addCriterion("下位_部位信息 is not null");
            return (Criteria) this;
        }

        public Criteria and下位部位信息EqualTo(String value) {
            addCriterion("下位_部位信息 =", value, "下位部位信息");
            return (Criteria) this;
        }

        public Criteria and下位部位信息NotEqualTo(String value) {
            addCriterion("下位_部位信息 <>", value, "下位部位信息");
            return (Criteria) this;
        }

        public Criteria and下位部位信息GreaterThan(String value) {
            addCriterion("下位_部位信息 >", value, "下位部位信息");
            return (Criteria) this;
        }

        public Criteria and下位部位信息GreaterThanOrEqualTo(String value) {
            addCriterion("下位_部位信息 >=", value, "下位部位信息");
            return (Criteria) this;
        }

        public Criteria and下位部位信息LessThan(String value) {
            addCriterion("下位_部位信息 <", value, "下位部位信息");
            return (Criteria) this;
        }

        public Criteria and下位部位信息LessThanOrEqualTo(String value) {
            addCriterion("下位_部位信息 <=", value, "下位部位信息");
            return (Criteria) this;
        }

        public Criteria and下位部位信息Like(String value) {
            addCriterion("下位_部位信息 like", value, "下位部位信息");
            return (Criteria) this;
        }

        public Criteria and下位部位信息NotLike(String value) {
            addCriterion("下位_部位信息 not like", value, "下位部位信息");
            return (Criteria) this;
        }

        public Criteria and下位部位信息In(List<String> values) {
            addCriterion("下位_部位信息 in", values, "下位部位信息");
            return (Criteria) this;
        }

        public Criteria and下位部位信息NotIn(List<String> values) {
            addCriterion("下位_部位信息 not in", values, "下位部位信息");
            return (Criteria) this;
        }

        public Criteria and下位部位信息Between(String value1, String value2) {
            addCriterion("下位_部位信息 between", value1, value2, "下位部位信息");
            return (Criteria) this;
        }

        public Criteria and下位部位信息NotBetween(String value1, String value2) {
            addCriterion("下位_部位信息 not between", value1, value2, "下位部位信息");
            return (Criteria) this;
        }

        public Criteria and上位获取素材IsNull() {
            addCriterion("上位_获取素材 is null");
            return (Criteria) this;
        }

        public Criteria and上位获取素材IsNotNull() {
            addCriterion("上位_获取素材 is not null");
            return (Criteria) this;
        }

        public Criteria and上位获取素材EqualTo(String value) {
            addCriterion("上位_获取素材 =", value, "上位获取素材");
            return (Criteria) this;
        }

        public Criteria and上位获取素材NotEqualTo(String value) {
            addCriterion("上位_获取素材 <>", value, "上位获取素材");
            return (Criteria) this;
        }

        public Criteria and上位获取素材GreaterThan(String value) {
            addCriterion("上位_获取素材 >", value, "上位获取素材");
            return (Criteria) this;
        }

        public Criteria and上位获取素材GreaterThanOrEqualTo(String value) {
            addCriterion("上位_获取素材 >=", value, "上位获取素材");
            return (Criteria) this;
        }

        public Criteria and上位获取素材LessThan(String value) {
            addCriterion("上位_获取素材 <", value, "上位获取素材");
            return (Criteria) this;
        }

        public Criteria and上位获取素材LessThanOrEqualTo(String value) {
            addCriterion("上位_获取素材 <=", value, "上位获取素材");
            return (Criteria) this;
        }

        public Criteria and上位获取素材Like(String value) {
            addCriterion("上位_获取素材 like", value, "上位获取素材");
            return (Criteria) this;
        }

        public Criteria and上位获取素材NotLike(String value) {
            addCriterion("上位_获取素材 not like", value, "上位获取素材");
            return (Criteria) this;
        }

        public Criteria and上位获取素材In(List<String> values) {
            addCriterion("上位_获取素材 in", values, "上位获取素材");
            return (Criteria) this;
        }

        public Criteria and上位获取素材NotIn(List<String> values) {
            addCriterion("上位_获取素材 not in", values, "上位获取素材");
            return (Criteria) this;
        }

        public Criteria and上位获取素材Between(String value1, String value2) {
            addCriterion("上位_获取素材 between", value1, value2, "上位获取素材");
            return (Criteria) this;
        }

        public Criteria and上位获取素材NotBetween(String value1, String value2) {
            addCriterion("上位_获取素材 not between", value1, value2, "上位获取素材");
            return (Criteria) this;
        }

        public Criteria and上位部位信息IsNull() {
            addCriterion("上位_部位信息 is null");
            return (Criteria) this;
        }

        public Criteria and上位部位信息IsNotNull() {
            addCriterion("上位_部位信息 is not null");
            return (Criteria) this;
        }

        public Criteria and上位部位信息EqualTo(String value) {
            addCriterion("上位_部位信息 =", value, "上位部位信息");
            return (Criteria) this;
        }

        public Criteria and上位部位信息NotEqualTo(String value) {
            addCriterion("上位_部位信息 <>", value, "上位部位信息");
            return (Criteria) this;
        }

        public Criteria and上位部位信息GreaterThan(String value) {
            addCriterion("上位_部位信息 >", value, "上位部位信息");
            return (Criteria) this;
        }

        public Criteria and上位部位信息GreaterThanOrEqualTo(String value) {
            addCriterion("上位_部位信息 >=", value, "上位部位信息");
            return (Criteria) this;
        }

        public Criteria and上位部位信息LessThan(String value) {
            addCriterion("上位_部位信息 <", value, "上位部位信息");
            return (Criteria) this;
        }

        public Criteria and上位部位信息LessThanOrEqualTo(String value) {
            addCriterion("上位_部位信息 <=", value, "上位部位信息");
            return (Criteria) this;
        }

        public Criteria and上位部位信息Like(String value) {
            addCriterion("上位_部位信息 like", value, "上位部位信息");
            return (Criteria) this;
        }

        public Criteria and上位部位信息NotLike(String value) {
            addCriterion("上位_部位信息 not like", value, "上位部位信息");
            return (Criteria) this;
        }

        public Criteria and上位部位信息In(List<String> values) {
            addCriterion("上位_部位信息 in", values, "上位部位信息");
            return (Criteria) this;
        }

        public Criteria and上位部位信息NotIn(List<String> values) {
            addCriterion("上位_部位信息 not in", values, "上位部位信息");
            return (Criteria) this;
        }

        public Criteria and上位部位信息Between(String value1, String value2) {
            addCriterion("上位_部位信息 between", value1, value2, "上位部位信息");
            return (Criteria) this;
        }

        public Criteria and上位部位信息NotBetween(String value1, String value2) {
            addCriterion("上位_部位信息 not between", value1, value2, "上位部位信息");
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