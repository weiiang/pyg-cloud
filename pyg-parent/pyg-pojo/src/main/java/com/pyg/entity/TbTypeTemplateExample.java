package com.pyg.entity;

import java.util.ArrayList;
import java.util.List;

public class TbTypeTemplateExample {
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
    public TbTypeTemplateExample() {
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
    public TbTypeTemplateExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    /**
     */
    public TbTypeTemplateExample orderBy(String ... orderByClauses) {
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
        public Criteria andIdEqualToColumn(TbTypeTemplate.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdNotEqualToColumn(TbTypeTemplate.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdGreaterThanColumn(TbTypeTemplate.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdGreaterThanOrEqualToColumn(TbTypeTemplate.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdLessThanColumn(TbTypeTemplate.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdLessThanOrEqualToColumn(TbTypeTemplate.Column column) {
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

        /**
         */
        public Criteria andNameEqualToColumn(TbTypeTemplate.Column column) {
            addCriterion(new StringBuilder("name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNameNotEqualToColumn(TbTypeTemplate.Column column) {
            addCriterion(new StringBuilder("name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNameGreaterThanColumn(TbTypeTemplate.Column column) {
            addCriterion(new StringBuilder("name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNameGreaterThanOrEqualToColumn(TbTypeTemplate.Column column) {
            addCriterion(new StringBuilder("name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNameLessThanColumn(TbTypeTemplate.Column column) {
            addCriterion(new StringBuilder("name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNameLessThanOrEqualToColumn(TbTypeTemplate.Column column) {
            addCriterion(new StringBuilder("name <= ").append(column.getEscapedColumnName()).toString());
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

        public Criteria andSpec_idsIsNull() {
            addCriterion("spec_ids is null");
            return (Criteria) this;
        }

        public Criteria andSpec_idsIsNotNull() {
            addCriterion("spec_ids is not null");
            return (Criteria) this;
        }

        public Criteria andSpec_idsEqualTo(String value) {
            addCriterion("spec_ids =", value, "spec_ids");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSpec_idsEqualToColumn(TbTypeTemplate.Column column) {
            addCriterion(new StringBuilder("spec_ids = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpec_idsNotEqualTo(String value) {
            addCriterion("spec_ids <>", value, "spec_ids");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSpec_idsNotEqualToColumn(TbTypeTemplate.Column column) {
            addCriterion(new StringBuilder("spec_ids <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpec_idsGreaterThan(String value) {
            addCriterion("spec_ids >", value, "spec_ids");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSpec_idsGreaterThanColumn(TbTypeTemplate.Column column) {
            addCriterion(new StringBuilder("spec_ids > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpec_idsGreaterThanOrEqualTo(String value) {
            addCriterion("spec_ids >=", value, "spec_ids");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSpec_idsGreaterThanOrEqualToColumn(TbTypeTemplate.Column column) {
            addCriterion(new StringBuilder("spec_ids >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpec_idsLessThan(String value) {
            addCriterion("spec_ids <", value, "spec_ids");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSpec_idsLessThanColumn(TbTypeTemplate.Column column) {
            addCriterion(new StringBuilder("spec_ids < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpec_idsLessThanOrEqualTo(String value) {
            addCriterion("spec_ids <=", value, "spec_ids");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSpec_idsLessThanOrEqualToColumn(TbTypeTemplate.Column column) {
            addCriterion(new StringBuilder("spec_ids <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpec_idsLike(String value) {
            addCriterion("spec_ids like", value, "spec_ids");
            return (Criteria) this;
        }

        public Criteria andSpec_idsNotLike(String value) {
            addCriterion("spec_ids not like", value, "spec_ids");
            return (Criteria) this;
        }

        public Criteria andSpec_idsIn(List<String> values) {
            addCriterion("spec_ids in", values, "spec_ids");
            return (Criteria) this;
        }

        public Criteria andSpec_idsNotIn(List<String> values) {
            addCriterion("spec_ids not in", values, "spec_ids");
            return (Criteria) this;
        }

        public Criteria andSpec_idsBetween(String value1, String value2) {
            addCriterion("spec_ids between", value1, value2, "spec_ids");
            return (Criteria) this;
        }

        public Criteria andSpec_idsNotBetween(String value1, String value2) {
            addCriterion("spec_ids not between", value1, value2, "spec_ids");
            return (Criteria) this;
        }

        public Criteria andBrand_idsIsNull() {
            addCriterion("brand_ids is null");
            return (Criteria) this;
        }

        public Criteria andBrand_idsIsNotNull() {
            addCriterion("brand_ids is not null");
            return (Criteria) this;
        }

        public Criteria andBrand_idsEqualTo(String value) {
            addCriterion("brand_ids =", value, "brand_ids");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBrand_idsEqualToColumn(TbTypeTemplate.Column column) {
            addCriterion(new StringBuilder("brand_ids = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrand_idsNotEqualTo(String value) {
            addCriterion("brand_ids <>", value, "brand_ids");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBrand_idsNotEqualToColumn(TbTypeTemplate.Column column) {
            addCriterion(new StringBuilder("brand_ids <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrand_idsGreaterThan(String value) {
            addCriterion("brand_ids >", value, "brand_ids");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBrand_idsGreaterThanColumn(TbTypeTemplate.Column column) {
            addCriterion(new StringBuilder("brand_ids > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrand_idsGreaterThanOrEqualTo(String value) {
            addCriterion("brand_ids >=", value, "brand_ids");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBrand_idsGreaterThanOrEqualToColumn(TbTypeTemplate.Column column) {
            addCriterion(new StringBuilder("brand_ids >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrand_idsLessThan(String value) {
            addCriterion("brand_ids <", value, "brand_ids");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBrand_idsLessThanColumn(TbTypeTemplate.Column column) {
            addCriterion(new StringBuilder("brand_ids < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrand_idsLessThanOrEqualTo(String value) {
            addCriterion("brand_ids <=", value, "brand_ids");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBrand_idsLessThanOrEqualToColumn(TbTypeTemplate.Column column) {
            addCriterion(new StringBuilder("brand_ids <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrand_idsLike(String value) {
            addCriterion("brand_ids like", value, "brand_ids");
            return (Criteria) this;
        }

        public Criteria andBrand_idsNotLike(String value) {
            addCriterion("brand_ids not like", value, "brand_ids");
            return (Criteria) this;
        }

        public Criteria andBrand_idsIn(List<String> values) {
            addCriterion("brand_ids in", values, "brand_ids");
            return (Criteria) this;
        }

        public Criteria andBrand_idsNotIn(List<String> values) {
            addCriterion("brand_ids not in", values, "brand_ids");
            return (Criteria) this;
        }

        public Criteria andBrand_idsBetween(String value1, String value2) {
            addCriterion("brand_ids between", value1, value2, "brand_ids");
            return (Criteria) this;
        }

        public Criteria andBrand_idsNotBetween(String value1, String value2) {
            addCriterion("brand_ids not between", value1, value2, "brand_ids");
            return (Criteria) this;
        }

        public Criteria andCustom_attribute_itemsIsNull() {
            addCriterion("custom_attribute_items is null");
            return (Criteria) this;
        }

        public Criteria andCustom_attribute_itemsIsNotNull() {
            addCriterion("custom_attribute_items is not null");
            return (Criteria) this;
        }

        public Criteria andCustom_attribute_itemsEqualTo(String value) {
            addCriterion("custom_attribute_items =", value, "custom_attribute_items");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCustom_attribute_itemsEqualToColumn(TbTypeTemplate.Column column) {
            addCriterion(new StringBuilder("custom_attribute_items = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCustom_attribute_itemsNotEqualTo(String value) {
            addCriterion("custom_attribute_items <>", value, "custom_attribute_items");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCustom_attribute_itemsNotEqualToColumn(TbTypeTemplate.Column column) {
            addCriterion(new StringBuilder("custom_attribute_items <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCustom_attribute_itemsGreaterThan(String value) {
            addCriterion("custom_attribute_items >", value, "custom_attribute_items");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCustom_attribute_itemsGreaterThanColumn(TbTypeTemplate.Column column) {
            addCriterion(new StringBuilder("custom_attribute_items > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCustom_attribute_itemsGreaterThanOrEqualTo(String value) {
            addCriterion("custom_attribute_items >=", value, "custom_attribute_items");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCustom_attribute_itemsGreaterThanOrEqualToColumn(TbTypeTemplate.Column column) {
            addCriterion(new StringBuilder("custom_attribute_items >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCustom_attribute_itemsLessThan(String value) {
            addCriterion("custom_attribute_items <", value, "custom_attribute_items");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCustom_attribute_itemsLessThanColumn(TbTypeTemplate.Column column) {
            addCriterion(new StringBuilder("custom_attribute_items < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCustom_attribute_itemsLessThanOrEqualTo(String value) {
            addCriterion("custom_attribute_items <=", value, "custom_attribute_items");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCustom_attribute_itemsLessThanOrEqualToColumn(TbTypeTemplate.Column column) {
            addCriterion(new StringBuilder("custom_attribute_items <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCustom_attribute_itemsLike(String value) {
            addCriterion("custom_attribute_items like", value, "custom_attribute_items");
            return (Criteria) this;
        }

        public Criteria andCustom_attribute_itemsNotLike(String value) {
            addCriterion("custom_attribute_items not like", value, "custom_attribute_items");
            return (Criteria) this;
        }

        public Criteria andCustom_attribute_itemsIn(List<String> values) {
            addCriterion("custom_attribute_items in", values, "custom_attribute_items");
            return (Criteria) this;
        }

        public Criteria andCustom_attribute_itemsNotIn(List<String> values) {
            addCriterion("custom_attribute_items not in", values, "custom_attribute_items");
            return (Criteria) this;
        }

        public Criteria andCustom_attribute_itemsBetween(String value1, String value2) {
            addCriterion("custom_attribute_items between", value1, value2, "custom_attribute_items");
            return (Criteria) this;
        }

        public Criteria andCustom_attribute_itemsNotBetween(String value1, String value2) {
            addCriterion("custom_attribute_items not between", value1, value2, "custom_attribute_items");
            return (Criteria) this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(name) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andSpec_idsLikeInsensitive(String value) {
            addCriterion("upper(spec_ids) like", value.toUpperCase(), "spec_ids");
            return (Criteria) this;
        }

        public Criteria andBrand_idsLikeInsensitive(String value) {
            addCriterion("upper(brand_ids) like", value.toUpperCase(), "brand_ids");
            return (Criteria) this;
        }

        public Criteria andCustom_attribute_itemsLikeInsensitive(String value) {
            addCriterion("upper(custom_attribute_items) like", value.toUpperCase(), "custom_attribute_items");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {
        /**
         */
        private TbTypeTemplateExample example;

        /**
         */
        protected Criteria(TbTypeTemplateExample example) {
            super();
            this.example = example;
        }

        /**
         */
        public TbTypeTemplateExample example() {
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