package com.enuaruke.mhs2.pojo;

import java.util.ArrayList;
import java.util.List;

public class GeneExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GeneExample() {
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

        public Criteria and基因编号IsNull() {
            addCriterion("基因编号 is null");
            return (Criteria) this;
        }

        public Criteria and基因编号IsNotNull() {
            addCriterion("基因编号 is not null");
            return (Criteria) this;
        }

        public Criteria and基因编号EqualTo(Integer value) {
            addCriterion("基因编号 =", value, "基因编号");
            return (Criteria) this;
        }

        public Criteria and基因编号NotEqualTo(Integer value) {
            addCriterion("基因编号 <>", value, "基因编号");
            return (Criteria) this;
        }

        public Criteria and基因编号GreaterThan(Integer value) {
            addCriterion("基因编号 >", value, "基因编号");
            return (Criteria) this;
        }

        public Criteria and基因编号GreaterThanOrEqualTo(Integer value) {
            addCriterion("基因编号 >=", value, "基因编号");
            return (Criteria) this;
        }

        public Criteria and基因编号LessThan(Integer value) {
            addCriterion("基因编号 <", value, "基因编号");
            return (Criteria) this;
        }

        public Criteria and基因编号LessThanOrEqualTo(Integer value) {
            addCriterion("基因编号 <=", value, "基因编号");
            return (Criteria) this;
        }

        public Criteria and基因编号In(List<Integer> values) {
            addCriterion("基因编号 in", values, "基因编号");
            return (Criteria) this;
        }

        public Criteria and基因编号NotIn(List<Integer> values) {
            addCriterion("基因编号 not in", values, "基因编号");
            return (Criteria) this;
        }

        public Criteria and基因编号Between(Integer value1, Integer value2) {
            addCriterion("基因编号 between", value1, value2, "基因编号");
            return (Criteria) this;
        }

        public Criteria and基因编号NotBetween(Integer value1, Integer value2) {
            addCriterion("基因编号 not between", value1, value2, "基因编号");
            return (Criteria) this;
        }

        public Criteria and基因名称IsNull() {
            addCriterion("基因名称 is null");
            return (Criteria) this;
        }

        public Criteria and基因名称IsNotNull() {
            addCriterion("基因名称 is not null");
            return (Criteria) this;
        }

        public Criteria and基因名称EqualTo(String value) {
            addCriterion("基因名称 =", value, "基因名称");
            return (Criteria) this;
        }

        public Criteria and基因名称NotEqualTo(String value) {
            addCriterion("基因名称 <>", value, "基因名称");
            return (Criteria) this;
        }

        public Criteria and基因名称GreaterThan(String value) {
            addCriterion("基因名称 >", value, "基因名称");
            return (Criteria) this;
        }

        public Criteria and基因名称GreaterThanOrEqualTo(String value) {
            addCriterion("基因名称 >=", value, "基因名称");
            return (Criteria) this;
        }

        public Criteria and基因名称LessThan(String value) {
            addCriterion("基因名称 <", value, "基因名称");
            return (Criteria) this;
        }

        public Criteria and基因名称LessThanOrEqualTo(String value) {
            addCriterion("基因名称 <=", value, "基因名称");
            return (Criteria) this;
        }

        public Criteria and基因名称Like(String value) {
            addCriterion("基因名称 like", value, "基因名称");
            return (Criteria) this;
        }

        public Criteria and基因名称NotLike(String value) {
            addCriterion("基因名称 not like", value, "基因名称");
            return (Criteria) this;
        }

        public Criteria and基因名称In(List<String> values) {
            addCriterion("基因名称 in", values, "基因名称");
            return (Criteria) this;
        }

        public Criteria and基因名称NotIn(List<String> values) {
            addCriterion("基因名称 not in", values, "基因名称");
            return (Criteria) this;
        }

        public Criteria and基因名称Between(String value1, String value2) {
            addCriterion("基因名称 between", value1, value2, "基因名称");
            return (Criteria) this;
        }

        public Criteria and基因名称NotBetween(String value1, String value2) {
            addCriterion("基因名称 not between", value1, value2, "基因名称");
            return (Criteria) this;
        }

        public Criteria and技能类型IsNull() {
            addCriterion("技能类型 is null");
            return (Criteria) this;
        }

        public Criteria and技能类型IsNotNull() {
            addCriterion("技能类型 is not null");
            return (Criteria) this;
        }

        public Criteria and技能类型EqualTo(String value) {
            addCriterion("技能类型 =", value, "技能类型");
            return (Criteria) this;
        }

        public Criteria and技能类型NotEqualTo(String value) {
            addCriterion("技能类型 <>", value, "技能类型");
            return (Criteria) this;
        }

        public Criteria and技能类型GreaterThan(String value) {
            addCriterion("技能类型 >", value, "技能类型");
            return (Criteria) this;
        }

        public Criteria and技能类型GreaterThanOrEqualTo(String value) {
            addCriterion("技能类型 >=", value, "技能类型");
            return (Criteria) this;
        }

        public Criteria and技能类型LessThan(String value) {
            addCriterion("技能类型 <", value, "技能类型");
            return (Criteria) this;
        }

        public Criteria and技能类型LessThanOrEqualTo(String value) {
            addCriterion("技能类型 <=", value, "技能类型");
            return (Criteria) this;
        }

        public Criteria and技能类型Like(String value) {
            addCriterion("技能类型 like", value, "技能类型");
            return (Criteria) this;
        }

        public Criteria and技能类型NotLike(String value) {
            addCriterion("技能类型 not like", value, "技能类型");
            return (Criteria) this;
        }

        public Criteria and技能类型In(List<String> values) {
            addCriterion("技能类型 in", values, "技能类型");
            return (Criteria) this;
        }

        public Criteria and技能类型NotIn(List<String> values) {
            addCriterion("技能类型 not in", values, "技能类型");
            return (Criteria) this;
        }

        public Criteria and技能类型Between(String value1, String value2) {
            addCriterion("技能类型 between", value1, value2, "技能类型");
            return (Criteria) this;
        }

        public Criteria and技能类型NotBetween(String value1, String value2) {
            addCriterion("技能类型 not between", value1, value2, "技能类型");
            return (Criteria) this;
        }

        public Criteria and技能属性IsNull() {
            addCriterion("技能属性 is null");
            return (Criteria) this;
        }

        public Criteria and技能属性IsNotNull() {
            addCriterion("技能属性 is not null");
            return (Criteria) this;
        }

        public Criteria and技能属性EqualTo(String value) {
            addCriterion("技能属性 =", value, "技能属性");
            return (Criteria) this;
        }

        public Criteria and技能属性NotEqualTo(String value) {
            addCriterion("技能属性 <>", value, "技能属性");
            return (Criteria) this;
        }

        public Criteria and技能属性GreaterThan(String value) {
            addCriterion("技能属性 >", value, "技能属性");
            return (Criteria) this;
        }

        public Criteria and技能属性GreaterThanOrEqualTo(String value) {
            addCriterion("技能属性 >=", value, "技能属性");
            return (Criteria) this;
        }

        public Criteria and技能属性LessThan(String value) {
            addCriterion("技能属性 <", value, "技能属性");
            return (Criteria) this;
        }

        public Criteria and技能属性LessThanOrEqualTo(String value) {
            addCriterion("技能属性 <=", value, "技能属性");
            return (Criteria) this;
        }

        public Criteria and技能属性Like(String value) {
            addCriterion("技能属性 like", value, "技能属性");
            return (Criteria) this;
        }

        public Criteria and技能属性NotLike(String value) {
            addCriterion("技能属性 not like", value, "技能属性");
            return (Criteria) this;
        }

        public Criteria and技能属性In(List<String> values) {
            addCriterion("技能属性 in", values, "技能属性");
            return (Criteria) this;
        }

        public Criteria and技能属性NotIn(List<String> values) {
            addCriterion("技能属性 not in", values, "技能属性");
            return (Criteria) this;
        }

        public Criteria and技能属性Between(String value1, String value2) {
            addCriterion("技能属性 between", value1, value2, "技能属性");
            return (Criteria) this;
        }

        public Criteria and技能属性NotBetween(String value1, String value2) {
            addCriterion("技能属性 not between", value1, value2, "技能属性");
            return (Criteria) this;
        }

        public Criteria and必要等级IsNull() {
            addCriterion("必要等级 is null");
            return (Criteria) this;
        }

        public Criteria and必要等级IsNotNull() {
            addCriterion("必要等级 is not null");
            return (Criteria) this;
        }

        public Criteria and必要等级EqualTo(String value) {
            addCriterion("必要等级 =", value, "必要等级");
            return (Criteria) this;
        }

        public Criteria and必要等级NotEqualTo(String value) {
            addCriterion("必要等级 <>", value, "必要等级");
            return (Criteria) this;
        }

        public Criteria and必要等级GreaterThan(String value) {
            addCriterion("必要等级 >", value, "必要等级");
            return (Criteria) this;
        }

        public Criteria and必要等级GreaterThanOrEqualTo(String value) {
            addCriterion("必要等级 >=", value, "必要等级");
            return (Criteria) this;
        }

        public Criteria and必要等级LessThan(String value) {
            addCriterion("必要等级 <", value, "必要等级");
            return (Criteria) this;
        }

        public Criteria and必要等级LessThanOrEqualTo(String value) {
            addCriterion("必要等级 <=", value, "必要等级");
            return (Criteria) this;
        }

        public Criteria and必要等级Like(String value) {
            addCriterion("必要等级 like", value, "必要等级");
            return (Criteria) this;
        }

        public Criteria and必要等级NotLike(String value) {
            addCriterion("必要等级 not like", value, "必要等级");
            return (Criteria) this;
        }

        public Criteria and必要等级In(List<String> values) {
            addCriterion("必要等级 in", values, "必要等级");
            return (Criteria) this;
        }

        public Criteria and必要等级NotIn(List<String> values) {
            addCriterion("必要等级 not in", values, "必要等级");
            return (Criteria) this;
        }

        public Criteria and必要等级Between(String value1, String value2) {
            addCriterion("必要等级 between", value1, value2, "必要等级");
            return (Criteria) this;
        }

        public Criteria and必要等级NotBetween(String value1, String value2) {
            addCriterion("必要等级 not between", value1, value2, "必要等级");
            return (Criteria) this;
        }

        public Criteria and基因出处IsNull() {
            addCriterion("基因出处 is null");
            return (Criteria) this;
        }

        public Criteria and基因出处IsNotNull() {
            addCriterion("基因出处 is not null");
            return (Criteria) this;
        }

        public Criteria and基因出处EqualTo(String value) {
            addCriterion("基因出处 =", value, "基因出处");
            return (Criteria) this;
        }

        public Criteria and基因出处NotEqualTo(String value) {
            addCriterion("基因出处 <>", value, "基因出处");
            return (Criteria) this;
        }

        public Criteria and基因出处GreaterThan(String value) {
            addCriterion("基因出处 >", value, "基因出处");
            return (Criteria) this;
        }

        public Criteria and基因出处GreaterThanOrEqualTo(String value) {
            addCriterion("基因出处 >=", value, "基因出处");
            return (Criteria) this;
        }

        public Criteria and基因出处LessThan(String value) {
            addCriterion("基因出处 <", value, "基因出处");
            return (Criteria) this;
        }

        public Criteria and基因出处LessThanOrEqualTo(String value) {
            addCriterion("基因出处 <=", value, "基因出处");
            return (Criteria) this;
        }

        public Criteria and基因出处Like(String value) {
            addCriterion("基因出处 like", value, "基因出处");
            return (Criteria) this;
        }

        public Criteria and基因出处NotLike(String value) {
            addCriterion("基因出处 not like", value, "基因出处");
            return (Criteria) this;
        }

        public Criteria and基因出处In(List<String> values) {
            addCriterion("基因出处 in", values, "基因出处");
            return (Criteria) this;
        }

        public Criteria and基因出处NotIn(List<String> values) {
            addCriterion("基因出处 not in", values, "基因出处");
            return (Criteria) this;
        }

        public Criteria and基因出处Between(String value1, String value2) {
            addCriterion("基因出处 between", value1, value2, "基因出处");
            return (Criteria) this;
        }

        public Criteria and基因出处NotBetween(String value1, String value2) {
            addCriterion("基因出处 not between", value1, value2, "基因出处");
            return (Criteria) this;
        }

        public Criteria and技能名称IsNull() {
            addCriterion("技能名称 is null");
            return (Criteria) this;
        }

        public Criteria and技能名称IsNotNull() {
            addCriterion("技能名称 is not null");
            return (Criteria) this;
        }

        public Criteria and技能名称EqualTo(String value) {
            addCriterion("技能名称 =", value, "技能名称");
            return (Criteria) this;
        }

        public Criteria and技能名称NotEqualTo(String value) {
            addCriterion("技能名称 <>", value, "技能名称");
            return (Criteria) this;
        }

        public Criteria and技能名称GreaterThan(String value) {
            addCriterion("技能名称 >", value, "技能名称");
            return (Criteria) this;
        }

        public Criteria and技能名称GreaterThanOrEqualTo(String value) {
            addCriterion("技能名称 >=", value, "技能名称");
            return (Criteria) this;
        }

        public Criteria and技能名称LessThan(String value) {
            addCriterion("技能名称 <", value, "技能名称");
            return (Criteria) this;
        }

        public Criteria and技能名称LessThanOrEqualTo(String value) {
            addCriterion("技能名称 <=", value, "技能名称");
            return (Criteria) this;
        }

        public Criteria and技能名称Like(String value) {
            addCriterion("技能名称 like", value, "技能名称");
            return (Criteria) this;
        }

        public Criteria and技能名称NotLike(String value) {
            addCriterion("技能名称 not like", value, "技能名称");
            return (Criteria) this;
        }

        public Criteria and技能名称In(List<String> values) {
            addCriterion("技能名称 in", values, "技能名称");
            return (Criteria) this;
        }

        public Criteria and技能名称NotIn(List<String> values) {
            addCriterion("技能名称 not in", values, "技能名称");
            return (Criteria) this;
        }

        public Criteria and技能名称Between(String value1, String value2) {
            addCriterion("技能名称 between", value1, value2, "技能名称");
            return (Criteria) this;
        }

        public Criteria and技能名称NotBetween(String value1, String value2) {
            addCriterion("技能名称 not between", value1, value2, "技能名称");
            return (Criteria) this;
        }

        public Criteria and技能描述IsNull() {
            addCriterion("技能描述 is null");
            return (Criteria) this;
        }

        public Criteria and技能描述IsNotNull() {
            addCriterion("技能描述 is not null");
            return (Criteria) this;
        }

        public Criteria and技能描述EqualTo(String value) {
            addCriterion("技能描述 =", value, "技能描述");
            return (Criteria) this;
        }

        public Criteria and技能描述NotEqualTo(String value) {
            addCriterion("技能描述 <>", value, "技能描述");
            return (Criteria) this;
        }

        public Criteria and技能描述GreaterThan(String value) {
            addCriterion("技能描述 >", value, "技能描述");
            return (Criteria) this;
        }

        public Criteria and技能描述GreaterThanOrEqualTo(String value) {
            addCriterion("技能描述 >=", value, "技能描述");
            return (Criteria) this;
        }

        public Criteria and技能描述LessThan(String value) {
            addCriterion("技能描述 <", value, "技能描述");
            return (Criteria) this;
        }

        public Criteria and技能描述LessThanOrEqualTo(String value) {
            addCriterion("技能描述 <=", value, "技能描述");
            return (Criteria) this;
        }

        public Criteria and技能描述Like(String value) {
            addCriterion("技能描述 like", value, "技能描述");
            return (Criteria) this;
        }

        public Criteria and技能描述NotLike(String value) {
            addCriterion("技能描述 not like", value, "技能描述");
            return (Criteria) this;
        }

        public Criteria and技能描述In(List<String> values) {
            addCriterion("技能描述 in", values, "技能描述");
            return (Criteria) this;
        }

        public Criteria and技能描述NotIn(List<String> values) {
            addCriterion("技能描述 not in", values, "技能描述");
            return (Criteria) this;
        }

        public Criteria and技能描述Between(String value1, String value2) {
            addCriterion("技能描述 between", value1, value2, "技能描述");
            return (Criteria) this;
        }

        public Criteria and技能描述NotBetween(String value1, String value2) {
            addCriterion("技能描述 not between", value1, value2, "技能描述");
            return (Criteria) this;
        }

        public Criteria and羁绊消耗IsNull() {
            addCriterion("羁绊消耗 is null");
            return (Criteria) this;
        }

        public Criteria and羁绊消耗IsNotNull() {
            addCriterion("羁绊消耗 is not null");
            return (Criteria) this;
        }

        public Criteria and羁绊消耗EqualTo(String value) {
            addCriterion("羁绊消耗 =", value, "羁绊消耗");
            return (Criteria) this;
        }

        public Criteria and羁绊消耗NotEqualTo(String value) {
            addCriterion("羁绊消耗 <>", value, "羁绊消耗");
            return (Criteria) this;
        }

        public Criteria and羁绊消耗GreaterThan(String value) {
            addCriterion("羁绊消耗 >", value, "羁绊消耗");
            return (Criteria) this;
        }

        public Criteria and羁绊消耗GreaterThanOrEqualTo(String value) {
            addCriterion("羁绊消耗 >=", value, "羁绊消耗");
            return (Criteria) this;
        }

        public Criteria and羁绊消耗LessThan(String value) {
            addCriterion("羁绊消耗 <", value, "羁绊消耗");
            return (Criteria) this;
        }

        public Criteria and羁绊消耗LessThanOrEqualTo(String value) {
            addCriterion("羁绊消耗 <=", value, "羁绊消耗");
            return (Criteria) this;
        }

        public Criteria and羁绊消耗Like(String value) {
            addCriterion("羁绊消耗 like", value, "羁绊消耗");
            return (Criteria) this;
        }

        public Criteria and羁绊消耗NotLike(String value) {
            addCriterion("羁绊消耗 not like", value, "羁绊消耗");
            return (Criteria) this;
        }

        public Criteria and羁绊消耗In(List<String> values) {
            addCriterion("羁绊消耗 in", values, "羁绊消耗");
            return (Criteria) this;
        }

        public Criteria and羁绊消耗NotIn(List<String> values) {
            addCriterion("羁绊消耗 not in", values, "羁绊消耗");
            return (Criteria) this;
        }

        public Criteria and羁绊消耗Between(String value1, String value2) {
            addCriterion("羁绊消耗 between", value1, value2, "羁绊消耗");
            return (Criteria) this;
        }

        public Criteria and羁绊消耗NotBetween(String value1, String value2) {
            addCriterion("羁绊消耗 not between", value1, value2, "羁绊消耗");
            return (Criteria) this;
        }

        public Criteria andF9IsNull() {
            addCriterion("f9 is null");
            return (Criteria) this;
        }

        public Criteria andF9IsNotNull() {
            addCriterion("f9 is not null");
            return (Criteria) this;
        }

        public Criteria andF9EqualTo(String value) {
            addCriterion("f9 =", value, "f9");
            return (Criteria) this;
        }

        public Criteria andF9NotEqualTo(String value) {
            addCriterion("f9 <>", value, "f9");
            return (Criteria) this;
        }

        public Criteria andF9GreaterThan(String value) {
            addCriterion("f9 >", value, "f9");
            return (Criteria) this;
        }

        public Criteria andF9GreaterThanOrEqualTo(String value) {
            addCriterion("f9 >=", value, "f9");
            return (Criteria) this;
        }

        public Criteria andF9LessThan(String value) {
            addCriterion("f9 <", value, "f9");
            return (Criteria) this;
        }

        public Criteria andF9LessThanOrEqualTo(String value) {
            addCriterion("f9 <=", value, "f9");
            return (Criteria) this;
        }

        public Criteria andF9Like(String value) {
            addCriterion("f9 like", value, "f9");
            return (Criteria) this;
        }

        public Criteria andF9NotLike(String value) {
            addCriterion("f9 not like", value, "f9");
            return (Criteria) this;
        }

        public Criteria andF9In(List<String> values) {
            addCriterion("f9 in", values, "f9");
            return (Criteria) this;
        }

        public Criteria andF9NotIn(List<String> values) {
            addCriterion("f9 not in", values, "f9");
            return (Criteria) this;
        }

        public Criteria andF9Between(String value1, String value2) {
            addCriterion("f9 between", value1, value2, "f9");
            return (Criteria) this;
        }

        public Criteria andF9NotBetween(String value1, String value2) {
            addCriterion("f9 not between", value1, value2, "f9");
            return (Criteria) this;
        }

        public Criteria andF10IsNull() {
            addCriterion("f10 is null");
            return (Criteria) this;
        }

        public Criteria andF10IsNotNull() {
            addCriterion("f10 is not null");
            return (Criteria) this;
        }

        public Criteria andF10EqualTo(String value) {
            addCriterion("f10 =", value, "f10");
            return (Criteria) this;
        }

        public Criteria andF10NotEqualTo(String value) {
            addCriterion("f10 <>", value, "f10");
            return (Criteria) this;
        }

        public Criteria andF10GreaterThan(String value) {
            addCriterion("f10 >", value, "f10");
            return (Criteria) this;
        }

        public Criteria andF10GreaterThanOrEqualTo(String value) {
            addCriterion("f10 >=", value, "f10");
            return (Criteria) this;
        }

        public Criteria andF10LessThan(String value) {
            addCriterion("f10 <", value, "f10");
            return (Criteria) this;
        }

        public Criteria andF10LessThanOrEqualTo(String value) {
            addCriterion("f10 <=", value, "f10");
            return (Criteria) this;
        }

        public Criteria andF10Like(String value) {
            addCriterion("f10 like", value, "f10");
            return (Criteria) this;
        }

        public Criteria andF10NotLike(String value) {
            addCriterion("f10 not like", value, "f10");
            return (Criteria) this;
        }

        public Criteria andF10In(List<String> values) {
            addCriterion("f10 in", values, "f10");
            return (Criteria) this;
        }

        public Criteria andF10NotIn(List<String> values) {
            addCriterion("f10 not in", values, "f10");
            return (Criteria) this;
        }

        public Criteria andF10Between(String value1, String value2) {
            addCriterion("f10 between", value1, value2, "f10");
            return (Criteria) this;
        }

        public Criteria andF10NotBetween(String value1, String value2) {
            addCriterion("f10 not between", value1, value2, "f10");
            return (Criteria) this;
        }

        public Criteria andF11IsNull() {
            addCriterion("f11 is null");
            return (Criteria) this;
        }

        public Criteria andF11IsNotNull() {
            addCriterion("f11 is not null");
            return (Criteria) this;
        }

        public Criteria andF11EqualTo(String value) {
            addCriterion("f11 =", value, "f11");
            return (Criteria) this;
        }

        public Criteria andF11NotEqualTo(String value) {
            addCriterion("f11 <>", value, "f11");
            return (Criteria) this;
        }

        public Criteria andF11GreaterThan(String value) {
            addCriterion("f11 >", value, "f11");
            return (Criteria) this;
        }

        public Criteria andF11GreaterThanOrEqualTo(String value) {
            addCriterion("f11 >=", value, "f11");
            return (Criteria) this;
        }

        public Criteria andF11LessThan(String value) {
            addCriterion("f11 <", value, "f11");
            return (Criteria) this;
        }

        public Criteria andF11LessThanOrEqualTo(String value) {
            addCriterion("f11 <=", value, "f11");
            return (Criteria) this;
        }

        public Criteria andF11Like(String value) {
            addCriterion("f11 like", value, "f11");
            return (Criteria) this;
        }

        public Criteria andF11NotLike(String value) {
            addCriterion("f11 not like", value, "f11");
            return (Criteria) this;
        }

        public Criteria andF11In(List<String> values) {
            addCriterion("f11 in", values, "f11");
            return (Criteria) this;
        }

        public Criteria andF11NotIn(List<String> values) {
            addCriterion("f11 not in", values, "f11");
            return (Criteria) this;
        }

        public Criteria andF11Between(String value1, String value2) {
            addCriterion("f11 between", value1, value2, "f11");
            return (Criteria) this;
        }

        public Criteria andF11NotBetween(String value1, String value2) {
            addCriterion("f11 not between", value1, value2, "f11");
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