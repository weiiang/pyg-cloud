package com.pyg.entity;

import java.util.ArrayList;
import java.util.List;

public class TbSpecificationOptionExample {
    /**
     */
    protected String orderByClause;

    /**
     */
    protected boolean distinct;

    /**
     */
    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    /**
     */
    public TbSpecificationOptionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     */
    public TbSpecificationOptionExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    /**
     */
    public TbSpecificationOptionExample orderBy(String ... orderByClauses) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < orderByClauses.length; i++) {
            sb.append(orderByClauses[i]);
            if (i < orderByClauses.length - 1) {
                sb.append(" , ");
            }
        }
        this.setOrderByClause(sb.toString());
        return this;
    }

    /**
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    /**
     */
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

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setPageInfo(Integer currentPage, Integer pageSize) {
        if(pageSize<1) throw new IllegalArgumentException("页大小不能小于1！");
        this.limit=pageSize;
        if(currentPage<1) throw new IllegalArgumentException("页数不能小于1！");
        this.offset=(currentPage-1)*pageSize;
    }

    /**
     */
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

        /**
         */
        public Criteria andIdEqualToColumn(TbSpecificationOption.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdNotEqualToColumn(TbSpecificationOption.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdGreaterThanColumn(TbSpecificationOption.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdGreaterThanOrEqualToColumn(TbSpecificationOption.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdLessThanColumn(TbSpecificationOption.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdLessThanOrEqualToColumn(TbSpecificationOption.Column column) {
            addCriterion(new StringBuilder("id <= ").append(column.getEscapedColumnName()).toString());
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

        public Criteria andOption_nameIsNull() {
            addCriterion("option_name is null");
            return (Criteria) this;
        }

        public Criteria andOption_nameIsNotNull() {
            addCriterion("option_name is not null");
            return (Criteria) this;
        }

        public Criteria andOption_nameEqualTo(String value) {
            addCriterion("option_name =", value, "option_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOption_nameEqualToColumn(TbSpecificationOption.Column column) {
            addCriterion(new StringBuilder("option_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOption_nameNotEqualTo(String value) {
            addCriterion("option_name <>", value, "option_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOption_nameNotEqualToColumn(TbSpecificationOption.Column column) {
            addCriterion(new StringBuilder("option_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOption_nameGreaterThan(String value) {
            addCriterion("option_name >", value, "option_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOption_nameGreaterThanColumn(TbSpecificationOption.Column column) {
            addCriterion(new StringBuilder("option_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOption_nameGreaterThanOrEqualTo(String value) {
            addCriterion("option_name >=", value, "option_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOption_nameGreaterThanOrEqualToColumn(TbSpecificationOption.Column column) {
            addCriterion(new StringBuilder("option_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOption_nameLessThan(String value) {
            addCriterion("option_name <", value, "option_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOption_nameLessThanColumn(TbSpecificationOption.Column column) {
            addCriterion(new StringBuilder("option_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOption_nameLessThanOrEqualTo(String value) {
            addCriterion("option_name <=", value, "option_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOption_nameLessThanOrEqualToColumn(TbSpecificationOption.Column column) {
            addCriterion(new StringBuilder("option_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOption_nameLike(String value) {
            addCriterion("option_name like", value, "option_name");
            return (Criteria) this;
        }

        public Criteria andOption_nameNotLike(String value) {
            addCriterion("option_name not like", value, "option_name");
            return (Criteria) this;
        }

        public Criteria andOption_nameIn(List<String> values) {
            addCriterion("option_name in", values, "option_name");
            return (Criteria) this;
        }

        public Criteria andOption_nameNotIn(List<String> values) {
            addCriterion("option_name not in", values, "option_name");
            return (Criteria) this;
        }

        public Criteria andOption_nameBetween(String value1, String value2) {
            addCriterion("option_name between", value1, value2, "option_name");
            return (Criteria) this;
        }

        public Criteria andOption_nameNotBetween(String value1, String value2) {
            addCriterion("option_name not between", value1, value2, "option_name");
            return (Criteria) this;
        }

        public Criteria andSpec_idIsNull() {
            addCriterion("spec_id is null");
            return (Criteria) this;
        }

        public Criteria andSpec_idIsNotNull() {
            addCriterion("spec_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpec_idEqualTo(Long value) {
            addCriterion("spec_id =", value, "spec_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSpec_idEqualToColumn(TbSpecificationOption.Column column) {
            addCriterion(new StringBuilder("spec_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpec_idNotEqualTo(Long value) {
            addCriterion("spec_id <>", value, "spec_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSpec_idNotEqualToColumn(TbSpecificationOption.Column column) {
            addCriterion(new StringBuilder("spec_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpec_idGreaterThan(Long value) {
            addCriterion("spec_id >", value, "spec_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSpec_idGreaterThanColumn(TbSpecificationOption.Column column) {
            addCriterion(new StringBuilder("spec_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpec_idGreaterThanOrEqualTo(Long value) {
            addCriterion("spec_id >=", value, "spec_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSpec_idGreaterThanOrEqualToColumn(TbSpecificationOption.Column column) {
            addCriterion(new StringBuilder("spec_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpec_idLessThan(Long value) {
            addCriterion("spec_id <", value, "spec_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSpec_idLessThanColumn(TbSpecificationOption.Column column) {
            addCriterion(new StringBuilder("spec_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpec_idLessThanOrEqualTo(Long value) {
            addCriterion("spec_id <=", value, "spec_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSpec_idLessThanOrEqualToColumn(TbSpecificationOption.Column column) {
            addCriterion(new StringBuilder("spec_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpec_idIn(List<Long> values) {
            addCriterion("spec_id in", values, "spec_id");
            return (Criteria) this;
        }

        public Criteria andSpec_idNotIn(List<Long> values) {
            addCriterion("spec_id not in", values, "spec_id");
            return (Criteria) this;
        }

        public Criteria andSpec_idBetween(Long value1, Long value2) {
            addCriterion("spec_id between", value1, value2, "spec_id");
            return (Criteria) this;
        }

        public Criteria andSpec_idNotBetween(Long value1, Long value2) {
            addCriterion("spec_id not between", value1, value2, "spec_id");
            return (Criteria) this;
        }

        public Criteria andOrdersIsNull() {
            addCriterion("orders is null");
            return (Criteria) this;
        }

        public Criteria andOrdersIsNotNull() {
            addCriterion("orders is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersEqualTo(Integer value) {
            addCriterion("orders =", value, "orders");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOrdersEqualToColumn(TbSpecificationOption.Column column) {
            addCriterion(new StringBuilder("orders = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrdersNotEqualTo(Integer value) {
            addCriterion("orders <>", value, "orders");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOrdersNotEqualToColumn(TbSpecificationOption.Column column) {
            addCriterion(new StringBuilder("orders <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrdersGreaterThan(Integer value) {
            addCriterion("orders >", value, "orders");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOrdersGreaterThanColumn(TbSpecificationOption.Column column) {
            addCriterion(new StringBuilder("orders > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrdersGreaterThanOrEqualTo(Integer value) {
            addCriterion("orders >=", value, "orders");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOrdersGreaterThanOrEqualToColumn(TbSpecificationOption.Column column) {
            addCriterion(new StringBuilder("orders >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrdersLessThan(Integer value) {
            addCriterion("orders <", value, "orders");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOrdersLessThanColumn(TbSpecificationOption.Column column) {
            addCriterion(new StringBuilder("orders < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrdersLessThanOrEqualTo(Integer value) {
            addCriterion("orders <=", value, "orders");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOrdersLessThanOrEqualToColumn(TbSpecificationOption.Column column) {
            addCriterion(new StringBuilder("orders <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrdersIn(List<Integer> values) {
            addCriterion("orders in", values, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotIn(List<Integer> values) {
            addCriterion("orders not in", values, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersBetween(Integer value1, Integer value2) {
            addCriterion("orders between", value1, value2, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotBetween(Integer value1, Integer value2) {
            addCriterion("orders not between", value1, value2, "orders");
            return (Criteria) this;
        }

        public Criteria andOption_nameLikeInsensitive(String value) {
            addCriterion("upper(option_name) like", value.toUpperCase(), "option_name");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {
        /**
         */
        private TbSpecificationOptionExample example;

        /**
         */
        protected Criteria(TbSpecificationOptionExample example) {
            super();
            this.example = example;
        }

        /**
         */
        public TbSpecificationOptionExample example() {
            return this.example;
        }

        /**
         */
        public Criteria andIf(boolean ifAdd, ICriteriaAdd add) {
            if (ifAdd) {
                add.add(this);
            }
            return this;
        }

        public interface ICriteriaAdd {
            /**
             */
            Criteria add(Criteria add);
        }
    }

    /**
     */
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