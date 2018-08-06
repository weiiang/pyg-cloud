package com.pyg.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TbOrderItemExample {
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
    public TbOrderItemExample() {
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
    public TbOrderItemExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    /**
     */
    public TbOrderItemExample orderBy(String ... orderByClauses) {
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
        public Criteria andIdEqualToColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdNotEqualToColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdGreaterThanColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdGreaterThanOrEqualToColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdLessThanColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdLessThanOrEqualToColumn(TbOrderItem.Column column) {
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

        public Criteria andItem_idIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItem_idIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItem_idEqualTo(Long value) {
            addCriterion("item_id =", value, "item_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andItem_idEqualToColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("item_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andItem_idNotEqualTo(Long value) {
            addCriterion("item_id <>", value, "item_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andItem_idNotEqualToColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("item_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andItem_idGreaterThan(Long value) {
            addCriterion("item_id >", value, "item_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andItem_idGreaterThanColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("item_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andItem_idGreaterThanOrEqualTo(Long value) {
            addCriterion("item_id >=", value, "item_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andItem_idGreaterThanOrEqualToColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("item_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andItem_idLessThan(Long value) {
            addCriterion("item_id <", value, "item_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andItem_idLessThanColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("item_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andItem_idLessThanOrEqualTo(Long value) {
            addCriterion("item_id <=", value, "item_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andItem_idLessThanOrEqualToColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("item_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andItem_idIn(List<Long> values) {
            addCriterion("item_id in", values, "item_id");
            return (Criteria) this;
        }

        public Criteria andItem_idNotIn(List<Long> values) {
            addCriterion("item_id not in", values, "item_id");
            return (Criteria) this;
        }

        public Criteria andItem_idBetween(Long value1, Long value2) {
            addCriterion("item_id between", value1, value2, "item_id");
            return (Criteria) this;
        }

        public Criteria andItem_idNotBetween(Long value1, Long value2) {
            addCriterion("item_id not between", value1, value2, "item_id");
            return (Criteria) this;
        }

        public Criteria andGoods_idIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoods_idIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_idEqualTo(Long value) {
            addCriterion("goods_id =", value, "goods_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andGoods_idEqualToColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("goods_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoods_idNotEqualTo(Long value) {
            addCriterion("goods_id <>", value, "goods_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andGoods_idNotEqualToColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("goods_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoods_idGreaterThan(Long value) {
            addCriterion("goods_id >", value, "goods_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andGoods_idGreaterThanColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("goods_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoods_idGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_id >=", value, "goods_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andGoods_idGreaterThanOrEqualToColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("goods_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoods_idLessThan(Long value) {
            addCriterion("goods_id <", value, "goods_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andGoods_idLessThanColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("goods_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoods_idLessThanOrEqualTo(Long value) {
            addCriterion("goods_id <=", value, "goods_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andGoods_idLessThanOrEqualToColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("goods_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoods_idIn(List<Long> values) {
            addCriterion("goods_id in", values, "goods_id");
            return (Criteria) this;
        }

        public Criteria andGoods_idNotIn(List<Long> values) {
            addCriterion("goods_id not in", values, "goods_id");
            return (Criteria) this;
        }

        public Criteria andGoods_idBetween(Long value1, Long value2) {
            addCriterion("goods_id between", value1, value2, "goods_id");
            return (Criteria) this;
        }

        public Criteria andGoods_idNotBetween(Long value1, Long value2) {
            addCriterion("goods_id not between", value1, value2, "goods_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrder_idIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_idEqualTo(Long value) {
            addCriterion("order_id =", value, "order_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOrder_idEqualToColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("order_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrder_idNotEqualTo(Long value) {
            addCriterion("order_id <>", value, "order_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOrder_idNotEqualToColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("order_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrder_idGreaterThan(Long value) {
            addCriterion("order_id >", value, "order_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOrder_idGreaterThanColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("order_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrder_idGreaterThanOrEqualTo(Long value) {
            addCriterion("order_id >=", value, "order_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOrder_idGreaterThanOrEqualToColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("order_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrder_idLessThan(Long value) {
            addCriterion("order_id <", value, "order_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOrder_idLessThanColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("order_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrder_idLessThanOrEqualTo(Long value) {
            addCriterion("order_id <=", value, "order_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOrder_idLessThanOrEqualToColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("order_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrder_idIn(List<Long> values) {
            addCriterion("order_id in", values, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idNotIn(List<Long> values) {
            addCriterion("order_id not in", values, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idBetween(Long value1, Long value2) {
            addCriterion("order_id between", value1, value2, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idNotBetween(Long value1, Long value2) {
            addCriterion("order_id not between", value1, value2, "order_id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTitleEqualToColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("title = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTitleNotEqualToColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("title <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTitleGreaterThanColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("title > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTitleGreaterThanOrEqualToColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("title >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTitleLessThanColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("title < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTitleLessThanOrEqualToColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("title <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPriceEqualToColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("price = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPriceNotEqualToColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("price <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPriceGreaterThanColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("price > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPriceGreaterThanOrEqualToColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("price >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPriceLessThanColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("price < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPriceLessThanOrEqualToColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("price <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNumEqualToColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("num = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNumNotEqualToColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("num <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNumGreaterThanColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("num > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNumGreaterThanOrEqualToColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("num >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNumLessThanColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("num < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNumLessThanOrEqualToColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("num <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andTotal_feeIsNull() {
            addCriterion("total_fee is null");
            return (Criteria) this;
        }

        public Criteria andTotal_feeIsNotNull() {
            addCriterion("total_fee is not null");
            return (Criteria) this;
        }

        public Criteria andTotal_feeEqualTo(BigDecimal value) {
            addCriterion("total_fee =", value, "total_fee");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTotal_feeEqualToColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("total_fee = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotal_feeNotEqualTo(BigDecimal value) {
            addCriterion("total_fee <>", value, "total_fee");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTotal_feeNotEqualToColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("total_fee <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotal_feeGreaterThan(BigDecimal value) {
            addCriterion("total_fee >", value, "total_fee");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTotal_feeGreaterThanColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("total_fee > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotal_feeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_fee >=", value, "total_fee");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTotal_feeGreaterThanOrEqualToColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("total_fee >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotal_feeLessThan(BigDecimal value) {
            addCriterion("total_fee <", value, "total_fee");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTotal_feeLessThanColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("total_fee < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotal_feeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_fee <=", value, "total_fee");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTotal_feeLessThanOrEqualToColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("total_fee <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotal_feeIn(List<BigDecimal> values) {
            addCriterion("total_fee in", values, "total_fee");
            return (Criteria) this;
        }

        public Criteria andTotal_feeNotIn(List<BigDecimal> values) {
            addCriterion("total_fee not in", values, "total_fee");
            return (Criteria) this;
        }

        public Criteria andTotal_feeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_fee between", value1, value2, "total_fee");
            return (Criteria) this;
        }

        public Criteria andTotal_feeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_fee not between", value1, value2, "total_fee");
            return (Criteria) this;
        }

        public Criteria andPic_pathIsNull() {
            addCriterion("pic_path is null");
            return (Criteria) this;
        }

        public Criteria andPic_pathIsNotNull() {
            addCriterion("pic_path is not null");
            return (Criteria) this;
        }

        public Criteria andPic_pathEqualTo(String value) {
            addCriterion("pic_path =", value, "pic_path");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPic_pathEqualToColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("pic_path = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPic_pathNotEqualTo(String value) {
            addCriterion("pic_path <>", value, "pic_path");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPic_pathNotEqualToColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("pic_path <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPic_pathGreaterThan(String value) {
            addCriterion("pic_path >", value, "pic_path");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPic_pathGreaterThanColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("pic_path > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPic_pathGreaterThanOrEqualTo(String value) {
            addCriterion("pic_path >=", value, "pic_path");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPic_pathGreaterThanOrEqualToColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("pic_path >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPic_pathLessThan(String value) {
            addCriterion("pic_path <", value, "pic_path");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPic_pathLessThanColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("pic_path < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPic_pathLessThanOrEqualTo(String value) {
            addCriterion("pic_path <=", value, "pic_path");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPic_pathLessThanOrEqualToColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("pic_path <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPic_pathLike(String value) {
            addCriterion("pic_path like", value, "pic_path");
            return (Criteria) this;
        }

        public Criteria andPic_pathNotLike(String value) {
            addCriterion("pic_path not like", value, "pic_path");
            return (Criteria) this;
        }

        public Criteria andPic_pathIn(List<String> values) {
            addCriterion("pic_path in", values, "pic_path");
            return (Criteria) this;
        }

        public Criteria andPic_pathNotIn(List<String> values) {
            addCriterion("pic_path not in", values, "pic_path");
            return (Criteria) this;
        }

        public Criteria andPic_pathBetween(String value1, String value2) {
            addCriterion("pic_path between", value1, value2, "pic_path");
            return (Criteria) this;
        }

        public Criteria andPic_pathNotBetween(String value1, String value2) {
            addCriterion("pic_path not between", value1, value2, "pic_path");
            return (Criteria) this;
        }

        public Criteria andSeller_idIsNull() {
            addCriterion("seller_id is null");
            return (Criteria) this;
        }

        public Criteria andSeller_idIsNotNull() {
            addCriterion("seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeller_idEqualTo(String value) {
            addCriterion("seller_id =", value, "seller_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSeller_idEqualToColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("seller_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeller_idNotEqualTo(String value) {
            addCriterion("seller_id <>", value, "seller_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSeller_idNotEqualToColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("seller_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeller_idGreaterThan(String value) {
            addCriterion("seller_id >", value, "seller_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSeller_idGreaterThanColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("seller_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeller_idGreaterThanOrEqualTo(String value) {
            addCriterion("seller_id >=", value, "seller_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSeller_idGreaterThanOrEqualToColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("seller_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeller_idLessThan(String value) {
            addCriterion("seller_id <", value, "seller_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSeller_idLessThanColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("seller_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeller_idLessThanOrEqualTo(String value) {
            addCriterion("seller_id <=", value, "seller_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSeller_idLessThanOrEqualToColumn(TbOrderItem.Column column) {
            addCriterion(new StringBuilder("seller_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeller_idLike(String value) {
            addCriterion("seller_id like", value, "seller_id");
            return (Criteria) this;
        }

        public Criteria andSeller_idNotLike(String value) {
            addCriterion("seller_id not like", value, "seller_id");
            return (Criteria) this;
        }

        public Criteria andSeller_idIn(List<String> values) {
            addCriterion("seller_id in", values, "seller_id");
            return (Criteria) this;
        }

        public Criteria andSeller_idNotIn(List<String> values) {
            addCriterion("seller_id not in", values, "seller_id");
            return (Criteria) this;
        }

        public Criteria andSeller_idBetween(String value1, String value2) {
            addCriterion("seller_id between", value1, value2, "seller_id");
            return (Criteria) this;
        }

        public Criteria andSeller_idNotBetween(String value1, String value2) {
            addCriterion("seller_id not between", value1, value2, "seller_id");
            return (Criteria) this;
        }

        public Criteria andTitleLikeInsensitive(String value) {
            addCriterion("upper(title) like", value.toUpperCase(), "title");
            return (Criteria) this;
        }

        public Criteria andPic_pathLikeInsensitive(String value) {
            addCriterion("upper(pic_path) like", value.toUpperCase(), "pic_path");
            return (Criteria) this;
        }

        public Criteria andSeller_idLikeInsensitive(String value) {
            addCriterion("upper(seller_id) like", value.toUpperCase(), "seller_id");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {
        /**
         */
        private TbOrderItemExample example;

        /**
         */
        protected Criteria(TbOrderItemExample example) {
            super();
            this.example = example;
        }

        /**
         */
        public TbOrderItemExample example() {
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