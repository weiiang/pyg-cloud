package com.pyg.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbItemExample {
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
    public TbItemExample() {
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
    public TbItemExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    /**
     */
    public TbItemExample orderBy(String ... orderByClauses) {
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
        public Criteria andIdEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdNotEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdGreaterThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdGreaterThanOrEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdLessThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdLessThanOrEqualToColumn(TbItem.Column column) {
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
        public Criteria andTitleEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("title = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTitleNotEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("title <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTitleGreaterThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("title > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTitleGreaterThanOrEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("title >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTitleLessThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("title < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTitleLessThanOrEqualToColumn(TbItem.Column column) {
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

        public Criteria andSell_pointIsNull() {
            addCriterion("sell_point is null");
            return (Criteria) this;
        }

        public Criteria andSell_pointIsNotNull() {
            addCriterion("sell_point is not null");
            return (Criteria) this;
        }

        public Criteria andSell_pointEqualTo(String value) {
            addCriterion("sell_point =", value, "sell_point");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSell_pointEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("sell_point = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSell_pointNotEqualTo(String value) {
            addCriterion("sell_point <>", value, "sell_point");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSell_pointNotEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("sell_point <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSell_pointGreaterThan(String value) {
            addCriterion("sell_point >", value, "sell_point");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSell_pointGreaterThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("sell_point > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSell_pointGreaterThanOrEqualTo(String value) {
            addCriterion("sell_point >=", value, "sell_point");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSell_pointGreaterThanOrEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("sell_point >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSell_pointLessThan(String value) {
            addCriterion("sell_point <", value, "sell_point");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSell_pointLessThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("sell_point < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSell_pointLessThanOrEqualTo(String value) {
            addCriterion("sell_point <=", value, "sell_point");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSell_pointLessThanOrEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("sell_point <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSell_pointLike(String value) {
            addCriterion("sell_point like", value, "sell_point");
            return (Criteria) this;
        }

        public Criteria andSell_pointNotLike(String value) {
            addCriterion("sell_point not like", value, "sell_point");
            return (Criteria) this;
        }

        public Criteria andSell_pointIn(List<String> values) {
            addCriterion("sell_point in", values, "sell_point");
            return (Criteria) this;
        }

        public Criteria andSell_pointNotIn(List<String> values) {
            addCriterion("sell_point not in", values, "sell_point");
            return (Criteria) this;
        }

        public Criteria andSell_pointBetween(String value1, String value2) {
            addCriterion("sell_point between", value1, value2, "sell_point");
            return (Criteria) this;
        }

        public Criteria andSell_pointNotBetween(String value1, String value2) {
            addCriterion("sell_point not between", value1, value2, "sell_point");
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
        public Criteria andPriceEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("price = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPriceNotEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("price <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPriceGreaterThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("price > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPriceGreaterThanOrEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("price >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPriceLessThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("price < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPriceLessThanOrEqualToColumn(TbItem.Column column) {
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

        public Criteria andStock_countIsNull() {
            addCriterion("stock_count is null");
            return (Criteria) this;
        }

        public Criteria andStock_countIsNotNull() {
            addCriterion("stock_count is not null");
            return (Criteria) this;
        }

        public Criteria andStock_countEqualTo(Integer value) {
            addCriterion("stock_count =", value, "stock_count");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStock_countEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("stock_count = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStock_countNotEqualTo(Integer value) {
            addCriterion("stock_count <>", value, "stock_count");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStock_countNotEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("stock_count <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStock_countGreaterThan(Integer value) {
            addCriterion("stock_count >", value, "stock_count");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStock_countGreaterThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("stock_count > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStock_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock_count >=", value, "stock_count");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStock_countGreaterThanOrEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("stock_count >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStock_countLessThan(Integer value) {
            addCriterion("stock_count <", value, "stock_count");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStock_countLessThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("stock_count < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStock_countLessThanOrEqualTo(Integer value) {
            addCriterion("stock_count <=", value, "stock_count");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStock_countLessThanOrEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("stock_count <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStock_countIn(List<Integer> values) {
            addCriterion("stock_count in", values, "stock_count");
            return (Criteria) this;
        }

        public Criteria andStock_countNotIn(List<Integer> values) {
            addCriterion("stock_count not in", values, "stock_count");
            return (Criteria) this;
        }

        public Criteria andStock_countBetween(Integer value1, Integer value2) {
            addCriterion("stock_count between", value1, value2, "stock_count");
            return (Criteria) this;
        }

        public Criteria andStock_countNotBetween(Integer value1, Integer value2) {
            addCriterion("stock_count not between", value1, value2, "stock_count");
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
        public Criteria andNumEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("num = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNumNotEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("num <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNumGreaterThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("num > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNumGreaterThanOrEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("num >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNumLessThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("num < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNumLessThanOrEqualToColumn(TbItem.Column column) {
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

        public Criteria andBarcodeIsNull() {
            addCriterion("barcode is null");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNotNull() {
            addCriterion("barcode is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodeEqualTo(String value) {
            addCriterion("barcode =", value, "barcode");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBarcodeEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("barcode = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBarcodeNotEqualTo(String value) {
            addCriterion("barcode <>", value, "barcode");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBarcodeNotEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("barcode <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThan(String value) {
            addCriterion("barcode >", value, "barcode");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBarcodeGreaterThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("barcode > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("barcode >=", value, "barcode");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBarcodeGreaterThanOrEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("barcode >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThan(String value) {
            addCriterion("barcode <", value, "barcode");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBarcodeLessThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("barcode < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThanOrEqualTo(String value) {
            addCriterion("barcode <=", value, "barcode");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBarcodeLessThanOrEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("barcode <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBarcodeLike(String value) {
            addCriterion("barcode like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotLike(String value) {
            addCriterion("barcode not like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeIn(List<String> values) {
            addCriterion("barcode in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotIn(List<String> values) {
            addCriterion("barcode not in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeBetween(String value1, String value2) {
            addCriterion("barcode between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotBetween(String value1, String value2) {
            addCriterion("barcode not between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andImageEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("image = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andImageNotEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("image <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andImageGreaterThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("image > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andImageGreaterThanOrEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("image >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andImageLessThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("image < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andImageLessThanOrEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("image <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("categoryId is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("categoryId is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Long value) {
            addCriterion("categoryId =", value, "categoryId");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCategoryIdEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("categoryId = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Long value) {
            addCriterion("categoryId <>", value, "categoryId");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCategoryIdNotEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("categoryId <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Long value) {
            addCriterion("categoryId >", value, "categoryId");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCategoryIdGreaterThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("categoryId > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("categoryId >=", value, "categoryId");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCategoryIdGreaterThanOrEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("categoryId >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Long value) {
            addCriterion("categoryId <", value, "categoryId");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCategoryIdLessThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("categoryId < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("categoryId <=", value, "categoryId");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCategoryIdLessThanOrEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("categoryId <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Long> values) {
            addCriterion("categoryId in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Long> values) {
            addCriterion("categoryId not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Long value1, Long value2) {
            addCriterion("categoryId between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("categoryId not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("status = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusNotEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("status <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusGreaterThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("status > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusGreaterThanOrEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("status >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusLessThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("status < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusLessThanOrEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("status <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeEqualTo(Date value) {
            addCriterion("create_time =", value, "create_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreate_timeEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("create_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreate_timeNotEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("create_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterion("create_time >", value, "create_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreate_timeGreaterThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("create_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreate_timeGreaterThanOrEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("create_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterion("create_time <", value, "create_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreate_timeLessThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("create_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreate_timeLessThanOrEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("create_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeIn(List<Date> values) {
            addCriterion("create_time in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeEqualTo(Date value) {
            addCriterion("update_time =", value, "update_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUpdate_timeEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("update_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "update_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUpdate_timeNotEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("update_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdate_timeGreaterThan(Date value) {
            addCriterion("update_time >", value, "update_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUpdate_timeGreaterThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("update_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "update_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUpdate_timeGreaterThanOrEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("update_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdate_timeLessThan(Date value) {
            addCriterion("update_time <", value, "update_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUpdate_timeLessThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("update_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdate_timeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "update_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUpdate_timeLessThanOrEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("update_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIn(List<Date> values) {
            addCriterion("update_time in", values, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "update_time");
            return (Criteria) this;
        }

        public Criteria andItem_snIsNull() {
            addCriterion("item_sn is null");
            return (Criteria) this;
        }

        public Criteria andItem_snIsNotNull() {
            addCriterion("item_sn is not null");
            return (Criteria) this;
        }

        public Criteria andItem_snEqualTo(String value) {
            addCriterion("item_sn =", value, "item_sn");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andItem_snEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("item_sn = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andItem_snNotEqualTo(String value) {
            addCriterion("item_sn <>", value, "item_sn");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andItem_snNotEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("item_sn <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andItem_snGreaterThan(String value) {
            addCriterion("item_sn >", value, "item_sn");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andItem_snGreaterThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("item_sn > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andItem_snGreaterThanOrEqualTo(String value) {
            addCriterion("item_sn >=", value, "item_sn");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andItem_snGreaterThanOrEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("item_sn >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andItem_snLessThan(String value) {
            addCriterion("item_sn <", value, "item_sn");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andItem_snLessThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("item_sn < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andItem_snLessThanOrEqualTo(String value) {
            addCriterion("item_sn <=", value, "item_sn");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andItem_snLessThanOrEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("item_sn <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andItem_snLike(String value) {
            addCriterion("item_sn like", value, "item_sn");
            return (Criteria) this;
        }

        public Criteria andItem_snNotLike(String value) {
            addCriterion("item_sn not like", value, "item_sn");
            return (Criteria) this;
        }

        public Criteria andItem_snIn(List<String> values) {
            addCriterion("item_sn in", values, "item_sn");
            return (Criteria) this;
        }

        public Criteria andItem_snNotIn(List<String> values) {
            addCriterion("item_sn not in", values, "item_sn");
            return (Criteria) this;
        }

        public Criteria andItem_snBetween(String value1, String value2) {
            addCriterion("item_sn between", value1, value2, "item_sn");
            return (Criteria) this;
        }

        public Criteria andItem_snNotBetween(String value1, String value2) {
            addCriterion("item_sn not between", value1, value2, "item_sn");
            return (Criteria) this;
        }

        public Criteria andCost_pirceIsNull() {
            addCriterion("cost_pirce is null");
            return (Criteria) this;
        }

        public Criteria andCost_pirceIsNotNull() {
            addCriterion("cost_pirce is not null");
            return (Criteria) this;
        }

        public Criteria andCost_pirceEqualTo(BigDecimal value) {
            addCriterion("cost_pirce =", value, "cost_pirce");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCost_pirceEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("cost_pirce = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCost_pirceNotEqualTo(BigDecimal value) {
            addCriterion("cost_pirce <>", value, "cost_pirce");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCost_pirceNotEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("cost_pirce <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCost_pirceGreaterThan(BigDecimal value) {
            addCriterion("cost_pirce >", value, "cost_pirce");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCost_pirceGreaterThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("cost_pirce > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCost_pirceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_pirce >=", value, "cost_pirce");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCost_pirceGreaterThanOrEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("cost_pirce >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCost_pirceLessThan(BigDecimal value) {
            addCriterion("cost_pirce <", value, "cost_pirce");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCost_pirceLessThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("cost_pirce < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCost_pirceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_pirce <=", value, "cost_pirce");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCost_pirceLessThanOrEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("cost_pirce <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCost_pirceIn(List<BigDecimal> values) {
            addCriterion("cost_pirce in", values, "cost_pirce");
            return (Criteria) this;
        }

        public Criteria andCost_pirceNotIn(List<BigDecimal> values) {
            addCriterion("cost_pirce not in", values, "cost_pirce");
            return (Criteria) this;
        }

        public Criteria andCost_pirceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_pirce between", value1, value2, "cost_pirce");
            return (Criteria) this;
        }

        public Criteria andCost_pirceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_pirce not between", value1, value2, "cost_pirce");
            return (Criteria) this;
        }

        public Criteria andMarket_priceIsNull() {
            addCriterion("market_price is null");
            return (Criteria) this;
        }

        public Criteria andMarket_priceIsNotNull() {
            addCriterion("market_price is not null");
            return (Criteria) this;
        }

        public Criteria andMarket_priceEqualTo(BigDecimal value) {
            addCriterion("market_price =", value, "market_price");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andMarket_priceEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("market_price = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMarket_priceNotEqualTo(BigDecimal value) {
            addCriterion("market_price <>", value, "market_price");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andMarket_priceNotEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("market_price <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMarket_priceGreaterThan(BigDecimal value) {
            addCriterion("market_price >", value, "market_price");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andMarket_priceGreaterThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("market_price > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMarket_priceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("market_price >=", value, "market_price");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andMarket_priceGreaterThanOrEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("market_price >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMarket_priceLessThan(BigDecimal value) {
            addCriterion("market_price <", value, "market_price");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andMarket_priceLessThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("market_price < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMarket_priceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("market_price <=", value, "market_price");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andMarket_priceLessThanOrEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("market_price <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMarket_priceIn(List<BigDecimal> values) {
            addCriterion("market_price in", values, "market_price");
            return (Criteria) this;
        }

        public Criteria andMarket_priceNotIn(List<BigDecimal> values) {
            addCriterion("market_price not in", values, "market_price");
            return (Criteria) this;
        }

        public Criteria andMarket_priceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_price between", value1, value2, "market_price");
            return (Criteria) this;
        }

        public Criteria andMarket_priceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_price not between", value1, value2, "market_price");
            return (Criteria) this;
        }

        public Criteria andIs_defaultIsNull() {
            addCriterion("is_default is null");
            return (Criteria) this;
        }

        public Criteria andIs_defaultIsNotNull() {
            addCriterion("is_default is not null");
            return (Criteria) this;
        }

        public Criteria andIs_defaultEqualTo(String value) {
            addCriterion("is_default =", value, "is_default");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIs_defaultEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("is_default = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_defaultNotEqualTo(String value) {
            addCriterion("is_default <>", value, "is_default");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIs_defaultNotEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("is_default <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_defaultGreaterThan(String value) {
            addCriterion("is_default >", value, "is_default");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIs_defaultGreaterThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("is_default > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_defaultGreaterThanOrEqualTo(String value) {
            addCriterion("is_default >=", value, "is_default");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIs_defaultGreaterThanOrEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("is_default >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_defaultLessThan(String value) {
            addCriterion("is_default <", value, "is_default");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIs_defaultLessThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("is_default < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_defaultLessThanOrEqualTo(String value) {
            addCriterion("is_default <=", value, "is_default");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIs_defaultLessThanOrEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("is_default <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_defaultLike(String value) {
            addCriterion("is_default like", value, "is_default");
            return (Criteria) this;
        }

        public Criteria andIs_defaultNotLike(String value) {
            addCriterion("is_default not like", value, "is_default");
            return (Criteria) this;
        }

        public Criteria andIs_defaultIn(List<String> values) {
            addCriterion("is_default in", values, "is_default");
            return (Criteria) this;
        }

        public Criteria andIs_defaultNotIn(List<String> values) {
            addCriterion("is_default not in", values, "is_default");
            return (Criteria) this;
        }

        public Criteria andIs_defaultBetween(String value1, String value2) {
            addCriterion("is_default between", value1, value2, "is_default");
            return (Criteria) this;
        }

        public Criteria andIs_defaultNotBetween(String value1, String value2) {
            addCriterion("is_default not between", value1, value2, "is_default");
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
        public Criteria andGoods_idEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("goods_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoods_idNotEqualTo(Long value) {
            addCriterion("goods_id <>", value, "goods_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andGoods_idNotEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("goods_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoods_idGreaterThan(Long value) {
            addCriterion("goods_id >", value, "goods_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andGoods_idGreaterThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("goods_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoods_idGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_id >=", value, "goods_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andGoods_idGreaterThanOrEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("goods_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoods_idLessThan(Long value) {
            addCriterion("goods_id <", value, "goods_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andGoods_idLessThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("goods_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoods_idLessThanOrEqualTo(Long value) {
            addCriterion("goods_id <=", value, "goods_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andGoods_idLessThanOrEqualToColumn(TbItem.Column column) {
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
        public Criteria andSeller_idEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("seller_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeller_idNotEqualTo(String value) {
            addCriterion("seller_id <>", value, "seller_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSeller_idNotEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("seller_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeller_idGreaterThan(String value) {
            addCriterion("seller_id >", value, "seller_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSeller_idGreaterThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("seller_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeller_idGreaterThanOrEqualTo(String value) {
            addCriterion("seller_id >=", value, "seller_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSeller_idGreaterThanOrEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("seller_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeller_idLessThan(String value) {
            addCriterion("seller_id <", value, "seller_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSeller_idLessThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("seller_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeller_idLessThanOrEqualTo(String value) {
            addCriterion("seller_id <=", value, "seller_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSeller_idLessThanOrEqualToColumn(TbItem.Column column) {
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

        public Criteria andCart_thumbnailIsNull() {
            addCriterion("cart_thumbnail is null");
            return (Criteria) this;
        }

        public Criteria andCart_thumbnailIsNotNull() {
            addCriterion("cart_thumbnail is not null");
            return (Criteria) this;
        }

        public Criteria andCart_thumbnailEqualTo(String value) {
            addCriterion("cart_thumbnail =", value, "cart_thumbnail");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCart_thumbnailEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("cart_thumbnail = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCart_thumbnailNotEqualTo(String value) {
            addCriterion("cart_thumbnail <>", value, "cart_thumbnail");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCart_thumbnailNotEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("cart_thumbnail <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCart_thumbnailGreaterThan(String value) {
            addCriterion("cart_thumbnail >", value, "cart_thumbnail");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCart_thumbnailGreaterThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("cart_thumbnail > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCart_thumbnailGreaterThanOrEqualTo(String value) {
            addCriterion("cart_thumbnail >=", value, "cart_thumbnail");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCart_thumbnailGreaterThanOrEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("cart_thumbnail >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCart_thumbnailLessThan(String value) {
            addCriterion("cart_thumbnail <", value, "cart_thumbnail");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCart_thumbnailLessThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("cart_thumbnail < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCart_thumbnailLessThanOrEqualTo(String value) {
            addCriterion("cart_thumbnail <=", value, "cart_thumbnail");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCart_thumbnailLessThanOrEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("cart_thumbnail <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCart_thumbnailLike(String value) {
            addCriterion("cart_thumbnail like", value, "cart_thumbnail");
            return (Criteria) this;
        }

        public Criteria andCart_thumbnailNotLike(String value) {
            addCriterion("cart_thumbnail not like", value, "cart_thumbnail");
            return (Criteria) this;
        }

        public Criteria andCart_thumbnailIn(List<String> values) {
            addCriterion("cart_thumbnail in", values, "cart_thumbnail");
            return (Criteria) this;
        }

        public Criteria andCart_thumbnailNotIn(List<String> values) {
            addCriterion("cart_thumbnail not in", values, "cart_thumbnail");
            return (Criteria) this;
        }

        public Criteria andCart_thumbnailBetween(String value1, String value2) {
            addCriterion("cart_thumbnail between", value1, value2, "cart_thumbnail");
            return (Criteria) this;
        }

        public Criteria andCart_thumbnailNotBetween(String value1, String value2) {
            addCriterion("cart_thumbnail not between", value1, value2, "cart_thumbnail");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCategoryEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("category = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCategoryNotEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("category <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCategoryGreaterThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("category > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCategoryGreaterThanOrEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("category >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCategoryLessThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("category < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCategoryLessThanOrEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("category <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBrandEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("brand = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBrandNotEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("brand <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBrandGreaterThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("brand > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBrandGreaterThanOrEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("brand >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBrandLessThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("brand < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBrandLessThanOrEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("brand <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andSpecIsNull() {
            addCriterion("spec is null");
            return (Criteria) this;
        }

        public Criteria andSpecIsNotNull() {
            addCriterion("spec is not null");
            return (Criteria) this;
        }

        public Criteria andSpecEqualTo(String value) {
            addCriterion("spec =", value, "spec");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSpecEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("spec = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpecNotEqualTo(String value) {
            addCriterion("spec <>", value, "spec");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSpecNotEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("spec <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpecGreaterThan(String value) {
            addCriterion("spec >", value, "spec");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSpecGreaterThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("spec > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpecGreaterThanOrEqualTo(String value) {
            addCriterion("spec >=", value, "spec");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSpecGreaterThanOrEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("spec >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpecLessThan(String value) {
            addCriterion("spec <", value, "spec");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSpecLessThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("spec < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpecLessThanOrEqualTo(String value) {
            addCriterion("spec <=", value, "spec");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSpecLessThanOrEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("spec <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSpecLike(String value) {
            addCriterion("spec like", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecNotLike(String value) {
            addCriterion("spec not like", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecIn(List<String> values) {
            addCriterion("spec in", values, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecNotIn(List<String> values) {
            addCriterion("spec not in", values, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecBetween(String value1, String value2) {
            addCriterion("spec between", value1, value2, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecNotBetween(String value1, String value2) {
            addCriterion("spec not between", value1, value2, "spec");
            return (Criteria) this;
        }

        public Criteria andSellerIsNull() {
            addCriterion("seller is null");
            return (Criteria) this;
        }

        public Criteria andSellerIsNotNull() {
            addCriterion("seller is not null");
            return (Criteria) this;
        }

        public Criteria andSellerEqualTo(String value) {
            addCriterion("seller =", value, "seller");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSellerEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("seller = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSellerNotEqualTo(String value) {
            addCriterion("seller <>", value, "seller");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSellerNotEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("seller <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSellerGreaterThan(String value) {
            addCriterion("seller >", value, "seller");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSellerGreaterThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("seller > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSellerGreaterThanOrEqualTo(String value) {
            addCriterion("seller >=", value, "seller");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSellerGreaterThanOrEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("seller >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSellerLessThan(String value) {
            addCriterion("seller <", value, "seller");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSellerLessThanColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("seller < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSellerLessThanOrEqualTo(String value) {
            addCriterion("seller <=", value, "seller");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSellerLessThanOrEqualToColumn(TbItem.Column column) {
            addCriterion(new StringBuilder("seller <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSellerLike(String value) {
            addCriterion("seller like", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerNotLike(String value) {
            addCriterion("seller not like", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerIn(List<String> values) {
            addCriterion("seller in", values, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerNotIn(List<String> values) {
            addCriterion("seller not in", values, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerBetween(String value1, String value2) {
            addCriterion("seller between", value1, value2, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerNotBetween(String value1, String value2) {
            addCriterion("seller not between", value1, value2, "seller");
            return (Criteria) this;
        }

        public Criteria andTitleLikeInsensitive(String value) {
            addCriterion("upper(title) like", value.toUpperCase(), "title");
            return (Criteria) this;
        }

        public Criteria andSell_pointLikeInsensitive(String value) {
            addCriterion("upper(sell_point) like", value.toUpperCase(), "sell_point");
            return (Criteria) this;
        }

        public Criteria andBarcodeLikeInsensitive(String value) {
            addCriterion("upper(barcode) like", value.toUpperCase(), "barcode");
            return (Criteria) this;
        }

        public Criteria andImageLikeInsensitive(String value) {
            addCriterion("upper(image) like", value.toUpperCase(), "image");
            return (Criteria) this;
        }

        public Criteria andStatusLikeInsensitive(String value) {
            addCriterion("upper(status) like", value.toUpperCase(), "status");
            return (Criteria) this;
        }

        public Criteria andItem_snLikeInsensitive(String value) {
            addCriterion("upper(item_sn) like", value.toUpperCase(), "item_sn");
            return (Criteria) this;
        }

        public Criteria andIs_defaultLikeInsensitive(String value) {
            addCriterion("upper(is_default) like", value.toUpperCase(), "is_default");
            return (Criteria) this;
        }

        public Criteria andSeller_idLikeInsensitive(String value) {
            addCriterion("upper(seller_id) like", value.toUpperCase(), "seller_id");
            return (Criteria) this;
        }

        public Criteria andCart_thumbnailLikeInsensitive(String value) {
            addCriterion("upper(cart_thumbnail) like", value.toUpperCase(), "cart_thumbnail");
            return (Criteria) this;
        }

        public Criteria andCategoryLikeInsensitive(String value) {
            addCriterion("upper(category) like", value.toUpperCase(), "category");
            return (Criteria) this;
        }

        public Criteria andBrandLikeInsensitive(String value) {
            addCriterion("upper(brand) like", value.toUpperCase(), "brand");
            return (Criteria) this;
        }

        public Criteria andSpecLikeInsensitive(String value) {
            addCriterion("upper(spec) like", value.toUpperCase(), "spec");
            return (Criteria) this;
        }

        public Criteria andSellerLikeInsensitive(String value) {
            addCriterion("upper(seller) like", value.toUpperCase(), "seller");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {
        /**
         */
        private TbItemExample example;

        /**
         */
        protected Criteria(TbItemExample example) {
            super();
            this.example = example;
        }

        /**
         */
        public TbItemExample example() {
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