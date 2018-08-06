package com.pyg.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbOrderExample {
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
    public TbOrderExample() {
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
    public TbOrderExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    /**
     */
    public TbOrderExample orderBy(String ... orderByClauses) {
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
        public Criteria andOrder_idEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("order_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrder_idNotEqualTo(Long value) {
            addCriterion("order_id <>", value, "order_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOrder_idNotEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("order_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrder_idGreaterThan(Long value) {
            addCriterion("order_id >", value, "order_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOrder_idGreaterThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("order_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrder_idGreaterThanOrEqualTo(Long value) {
            addCriterion("order_id >=", value, "order_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOrder_idGreaterThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("order_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrder_idLessThan(Long value) {
            addCriterion("order_id <", value, "order_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOrder_idLessThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("order_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrder_idLessThanOrEqualTo(Long value) {
            addCriterion("order_id <=", value, "order_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOrder_idLessThanOrEqualToColumn(TbOrder.Column column) {
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

        public Criteria andPaymentIsNull() {
            addCriterion("payment is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNotNull() {
            addCriterion("payment is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentEqualTo(BigDecimal value) {
            addCriterion("payment =", value, "payment");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPaymentEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("payment = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPaymentNotEqualTo(BigDecimal value) {
            addCriterion("payment <>", value, "payment");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPaymentNotEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("payment <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThan(BigDecimal value) {
            addCriterion("payment >", value, "payment");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPaymentGreaterThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("payment > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("payment >=", value, "payment");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPaymentGreaterThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("payment >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPaymentLessThan(BigDecimal value) {
            addCriterion("payment <", value, "payment");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPaymentLessThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("payment < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPaymentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("payment <=", value, "payment");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPaymentLessThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("payment <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPaymentIn(List<BigDecimal> values) {
            addCriterion("payment in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotIn(List<BigDecimal> values) {
            addCriterion("payment not in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payment between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payment not between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPayment_typeIsNull() {
            addCriterion("payment_type is null");
            return (Criteria) this;
        }

        public Criteria andPayment_typeIsNotNull() {
            addCriterion("payment_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayment_typeEqualTo(String value) {
            addCriterion("payment_type =", value, "payment_type");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPayment_typeEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("payment_type = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPayment_typeNotEqualTo(String value) {
            addCriterion("payment_type <>", value, "payment_type");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPayment_typeNotEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("payment_type <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPayment_typeGreaterThan(String value) {
            addCriterion("payment_type >", value, "payment_type");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPayment_typeGreaterThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("payment_type > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPayment_typeGreaterThanOrEqualTo(String value) {
            addCriterion("payment_type >=", value, "payment_type");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPayment_typeGreaterThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("payment_type >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPayment_typeLessThan(String value) {
            addCriterion("payment_type <", value, "payment_type");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPayment_typeLessThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("payment_type < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPayment_typeLessThanOrEqualTo(String value) {
            addCriterion("payment_type <=", value, "payment_type");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPayment_typeLessThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("payment_type <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPayment_typeLike(String value) {
            addCriterion("payment_type like", value, "payment_type");
            return (Criteria) this;
        }

        public Criteria andPayment_typeNotLike(String value) {
            addCriterion("payment_type not like", value, "payment_type");
            return (Criteria) this;
        }

        public Criteria andPayment_typeIn(List<String> values) {
            addCriterion("payment_type in", values, "payment_type");
            return (Criteria) this;
        }

        public Criteria andPayment_typeNotIn(List<String> values) {
            addCriterion("payment_type not in", values, "payment_type");
            return (Criteria) this;
        }

        public Criteria andPayment_typeBetween(String value1, String value2) {
            addCriterion("payment_type between", value1, value2, "payment_type");
            return (Criteria) this;
        }

        public Criteria andPayment_typeNotBetween(String value1, String value2) {
            addCriterion("payment_type not between", value1, value2, "payment_type");
            return (Criteria) this;
        }

        public Criteria andPost_feeIsNull() {
            addCriterion("post_fee is null");
            return (Criteria) this;
        }

        public Criteria andPost_feeIsNotNull() {
            addCriterion("post_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPost_feeEqualTo(String value) {
            addCriterion("post_fee =", value, "post_fee");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPost_feeEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("post_fee = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPost_feeNotEqualTo(String value) {
            addCriterion("post_fee <>", value, "post_fee");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPost_feeNotEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("post_fee <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPost_feeGreaterThan(String value) {
            addCriterion("post_fee >", value, "post_fee");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPost_feeGreaterThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("post_fee > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPost_feeGreaterThanOrEqualTo(String value) {
            addCriterion("post_fee >=", value, "post_fee");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPost_feeGreaterThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("post_fee >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPost_feeLessThan(String value) {
            addCriterion("post_fee <", value, "post_fee");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPost_feeLessThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("post_fee < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPost_feeLessThanOrEqualTo(String value) {
            addCriterion("post_fee <=", value, "post_fee");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPost_feeLessThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("post_fee <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPost_feeLike(String value) {
            addCriterion("post_fee like", value, "post_fee");
            return (Criteria) this;
        }

        public Criteria andPost_feeNotLike(String value) {
            addCriterion("post_fee not like", value, "post_fee");
            return (Criteria) this;
        }

        public Criteria andPost_feeIn(List<String> values) {
            addCriterion("post_fee in", values, "post_fee");
            return (Criteria) this;
        }

        public Criteria andPost_feeNotIn(List<String> values) {
            addCriterion("post_fee not in", values, "post_fee");
            return (Criteria) this;
        }

        public Criteria andPost_feeBetween(String value1, String value2) {
            addCriterion("post_fee between", value1, value2, "post_fee");
            return (Criteria) this;
        }

        public Criteria andPost_feeNotBetween(String value1, String value2) {
            addCriterion("post_fee not between", value1, value2, "post_fee");
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
        public Criteria andStatusEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("status = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusNotEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("status <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusGreaterThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("status > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusGreaterThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("status >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusLessThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("status < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusLessThanOrEqualToColumn(TbOrder.Column column) {
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
        public Criteria andCreate_timeEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("create_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreate_timeNotEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("create_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterion("create_time >", value, "create_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreate_timeGreaterThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("create_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreate_timeGreaterThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("create_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterion("create_time <", value, "create_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreate_timeLessThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("create_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreate_timeLessThanOrEqualToColumn(TbOrder.Column column) {
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
        public Criteria andUpdate_timeEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("update_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "update_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUpdate_timeNotEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("update_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdate_timeGreaterThan(Date value) {
            addCriterion("update_time >", value, "update_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUpdate_timeGreaterThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("update_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "update_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUpdate_timeGreaterThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("update_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdate_timeLessThan(Date value) {
            addCriterion("update_time <", value, "update_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUpdate_timeLessThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("update_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdate_timeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "update_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUpdate_timeLessThanOrEqualToColumn(TbOrder.Column column) {
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

        public Criteria andPayment_timeIsNull() {
            addCriterion("payment_time is null");
            return (Criteria) this;
        }

        public Criteria andPayment_timeIsNotNull() {
            addCriterion("payment_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayment_timeEqualTo(Date value) {
            addCriterion("payment_time =", value, "payment_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPayment_timeEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("payment_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPayment_timeNotEqualTo(Date value) {
            addCriterion("payment_time <>", value, "payment_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPayment_timeNotEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("payment_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPayment_timeGreaterThan(Date value) {
            addCriterion("payment_time >", value, "payment_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPayment_timeGreaterThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("payment_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPayment_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("payment_time >=", value, "payment_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPayment_timeGreaterThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("payment_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPayment_timeLessThan(Date value) {
            addCriterion("payment_time <", value, "payment_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPayment_timeLessThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("payment_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPayment_timeLessThanOrEqualTo(Date value) {
            addCriterion("payment_time <=", value, "payment_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPayment_timeLessThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("payment_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPayment_timeIn(List<Date> values) {
            addCriterion("payment_time in", values, "payment_time");
            return (Criteria) this;
        }

        public Criteria andPayment_timeNotIn(List<Date> values) {
            addCriterion("payment_time not in", values, "payment_time");
            return (Criteria) this;
        }

        public Criteria andPayment_timeBetween(Date value1, Date value2) {
            addCriterion("payment_time between", value1, value2, "payment_time");
            return (Criteria) this;
        }

        public Criteria andPayment_timeNotBetween(Date value1, Date value2) {
            addCriterion("payment_time not between", value1, value2, "payment_time");
            return (Criteria) this;
        }

        public Criteria andConsign_timeIsNull() {
            addCriterion("consign_time is null");
            return (Criteria) this;
        }

        public Criteria andConsign_timeIsNotNull() {
            addCriterion("consign_time is not null");
            return (Criteria) this;
        }

        public Criteria andConsign_timeEqualTo(Date value) {
            addCriterion("consign_time =", value, "consign_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andConsign_timeEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("consign_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andConsign_timeNotEqualTo(Date value) {
            addCriterion("consign_time <>", value, "consign_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andConsign_timeNotEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("consign_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andConsign_timeGreaterThan(Date value) {
            addCriterion("consign_time >", value, "consign_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andConsign_timeGreaterThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("consign_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andConsign_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("consign_time >=", value, "consign_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andConsign_timeGreaterThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("consign_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andConsign_timeLessThan(Date value) {
            addCriterion("consign_time <", value, "consign_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andConsign_timeLessThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("consign_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andConsign_timeLessThanOrEqualTo(Date value) {
            addCriterion("consign_time <=", value, "consign_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andConsign_timeLessThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("consign_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andConsign_timeIn(List<Date> values) {
            addCriterion("consign_time in", values, "consign_time");
            return (Criteria) this;
        }

        public Criteria andConsign_timeNotIn(List<Date> values) {
            addCriterion("consign_time not in", values, "consign_time");
            return (Criteria) this;
        }

        public Criteria andConsign_timeBetween(Date value1, Date value2) {
            addCriterion("consign_time between", value1, value2, "consign_time");
            return (Criteria) this;
        }

        public Criteria andConsign_timeNotBetween(Date value1, Date value2) {
            addCriterion("consign_time not between", value1, value2, "consign_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEnd_timeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnd_timeEqualTo(Date value) {
            addCriterion("end_time =", value, "end_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andEnd_timeEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("end_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnd_timeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "end_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andEnd_timeNotEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("end_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnd_timeGreaterThan(Date value) {
            addCriterion("end_time >", value, "end_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andEnd_timeGreaterThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("end_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnd_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "end_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andEnd_timeGreaterThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("end_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnd_timeLessThan(Date value) {
            addCriterion("end_time <", value, "end_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andEnd_timeLessThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("end_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnd_timeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "end_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andEnd_timeLessThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("end_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnd_timeIn(List<Date> values) {
            addCriterion("end_time in", values, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "end_time");
            return (Criteria) this;
        }

        public Criteria andClose_timeIsNull() {
            addCriterion("close_time is null");
            return (Criteria) this;
        }

        public Criteria andClose_timeIsNotNull() {
            addCriterion("close_time is not null");
            return (Criteria) this;
        }

        public Criteria andClose_timeEqualTo(Date value) {
            addCriterion("close_time =", value, "close_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andClose_timeEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("close_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andClose_timeNotEqualTo(Date value) {
            addCriterion("close_time <>", value, "close_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andClose_timeNotEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("close_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andClose_timeGreaterThan(Date value) {
            addCriterion("close_time >", value, "close_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andClose_timeGreaterThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("close_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andClose_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("close_time >=", value, "close_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andClose_timeGreaterThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("close_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andClose_timeLessThan(Date value) {
            addCriterion("close_time <", value, "close_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andClose_timeLessThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("close_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andClose_timeLessThanOrEqualTo(Date value) {
            addCriterion("close_time <=", value, "close_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andClose_timeLessThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("close_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andClose_timeIn(List<Date> values) {
            addCriterion("close_time in", values, "close_time");
            return (Criteria) this;
        }

        public Criteria andClose_timeNotIn(List<Date> values) {
            addCriterion("close_time not in", values, "close_time");
            return (Criteria) this;
        }

        public Criteria andClose_timeBetween(Date value1, Date value2) {
            addCriterion("close_time between", value1, value2, "close_time");
            return (Criteria) this;
        }

        public Criteria andClose_timeNotBetween(Date value1, Date value2) {
            addCriterion("close_time not between", value1, value2, "close_time");
            return (Criteria) this;
        }

        public Criteria andShipping_nameIsNull() {
            addCriterion("shipping_name is null");
            return (Criteria) this;
        }

        public Criteria andShipping_nameIsNotNull() {
            addCriterion("shipping_name is not null");
            return (Criteria) this;
        }

        public Criteria andShipping_nameEqualTo(String value) {
            addCriterion("shipping_name =", value, "shipping_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andShipping_nameEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("shipping_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShipping_nameNotEqualTo(String value) {
            addCriterion("shipping_name <>", value, "shipping_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andShipping_nameNotEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("shipping_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShipping_nameGreaterThan(String value) {
            addCriterion("shipping_name >", value, "shipping_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andShipping_nameGreaterThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("shipping_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShipping_nameGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_name >=", value, "shipping_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andShipping_nameGreaterThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("shipping_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShipping_nameLessThan(String value) {
            addCriterion("shipping_name <", value, "shipping_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andShipping_nameLessThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("shipping_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShipping_nameLessThanOrEqualTo(String value) {
            addCriterion("shipping_name <=", value, "shipping_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andShipping_nameLessThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("shipping_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShipping_nameLike(String value) {
            addCriterion("shipping_name like", value, "shipping_name");
            return (Criteria) this;
        }

        public Criteria andShipping_nameNotLike(String value) {
            addCriterion("shipping_name not like", value, "shipping_name");
            return (Criteria) this;
        }

        public Criteria andShipping_nameIn(List<String> values) {
            addCriterion("shipping_name in", values, "shipping_name");
            return (Criteria) this;
        }

        public Criteria andShipping_nameNotIn(List<String> values) {
            addCriterion("shipping_name not in", values, "shipping_name");
            return (Criteria) this;
        }

        public Criteria andShipping_nameBetween(String value1, String value2) {
            addCriterion("shipping_name between", value1, value2, "shipping_name");
            return (Criteria) this;
        }

        public Criteria andShipping_nameNotBetween(String value1, String value2) {
            addCriterion("shipping_name not between", value1, value2, "shipping_name");
            return (Criteria) this;
        }

        public Criteria andShipping_codeIsNull() {
            addCriterion("shipping_code is null");
            return (Criteria) this;
        }

        public Criteria andShipping_codeIsNotNull() {
            addCriterion("shipping_code is not null");
            return (Criteria) this;
        }

        public Criteria andShipping_codeEqualTo(String value) {
            addCriterion("shipping_code =", value, "shipping_code");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andShipping_codeEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("shipping_code = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShipping_codeNotEqualTo(String value) {
            addCriterion("shipping_code <>", value, "shipping_code");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andShipping_codeNotEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("shipping_code <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShipping_codeGreaterThan(String value) {
            addCriterion("shipping_code >", value, "shipping_code");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andShipping_codeGreaterThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("shipping_code > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShipping_codeGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_code >=", value, "shipping_code");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andShipping_codeGreaterThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("shipping_code >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShipping_codeLessThan(String value) {
            addCriterion("shipping_code <", value, "shipping_code");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andShipping_codeLessThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("shipping_code < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShipping_codeLessThanOrEqualTo(String value) {
            addCriterion("shipping_code <=", value, "shipping_code");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andShipping_codeLessThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("shipping_code <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShipping_codeLike(String value) {
            addCriterion("shipping_code like", value, "shipping_code");
            return (Criteria) this;
        }

        public Criteria andShipping_codeNotLike(String value) {
            addCriterion("shipping_code not like", value, "shipping_code");
            return (Criteria) this;
        }

        public Criteria andShipping_codeIn(List<String> values) {
            addCriterion("shipping_code in", values, "shipping_code");
            return (Criteria) this;
        }

        public Criteria andShipping_codeNotIn(List<String> values) {
            addCriterion("shipping_code not in", values, "shipping_code");
            return (Criteria) this;
        }

        public Criteria andShipping_codeBetween(String value1, String value2) {
            addCriterion("shipping_code between", value1, value2, "shipping_code");
            return (Criteria) this;
        }

        public Criteria andShipping_codeNotBetween(String value1, String value2) {
            addCriterion("shipping_code not between", value1, value2, "shipping_code");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_idEqualTo(String value) {
            addCriterion("user_id =", value, "user_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUser_idEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("user_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idNotEqualTo(String value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUser_idNotEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("user_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThan(String value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUser_idGreaterThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("user_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUser_idGreaterThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("user_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idLessThan(String value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUser_idLessThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("user_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUser_idLessThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("user_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idLike(String value) {
            addCriterion("user_id like", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotLike(String value) {
            addCriterion("user_id not like", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idIn(List<String> values) {
            addCriterion("user_id in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotIn(List<String> values) {
            addCriterion("user_id not in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andBuyer_messageIsNull() {
            addCriterion("buyer_message is null");
            return (Criteria) this;
        }

        public Criteria andBuyer_messageIsNotNull() {
            addCriterion("buyer_message is not null");
            return (Criteria) this;
        }

        public Criteria andBuyer_messageEqualTo(String value) {
            addCriterion("buyer_message =", value, "buyer_message");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBuyer_messageEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("buyer_message = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBuyer_messageNotEqualTo(String value) {
            addCriterion("buyer_message <>", value, "buyer_message");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBuyer_messageNotEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("buyer_message <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBuyer_messageGreaterThan(String value) {
            addCriterion("buyer_message >", value, "buyer_message");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBuyer_messageGreaterThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("buyer_message > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBuyer_messageGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_message >=", value, "buyer_message");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBuyer_messageGreaterThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("buyer_message >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBuyer_messageLessThan(String value) {
            addCriterion("buyer_message <", value, "buyer_message");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBuyer_messageLessThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("buyer_message < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBuyer_messageLessThanOrEqualTo(String value) {
            addCriterion("buyer_message <=", value, "buyer_message");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBuyer_messageLessThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("buyer_message <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBuyer_messageLike(String value) {
            addCriterion("buyer_message like", value, "buyer_message");
            return (Criteria) this;
        }

        public Criteria andBuyer_messageNotLike(String value) {
            addCriterion("buyer_message not like", value, "buyer_message");
            return (Criteria) this;
        }

        public Criteria andBuyer_messageIn(List<String> values) {
            addCriterion("buyer_message in", values, "buyer_message");
            return (Criteria) this;
        }

        public Criteria andBuyer_messageNotIn(List<String> values) {
            addCriterion("buyer_message not in", values, "buyer_message");
            return (Criteria) this;
        }

        public Criteria andBuyer_messageBetween(String value1, String value2) {
            addCriterion("buyer_message between", value1, value2, "buyer_message");
            return (Criteria) this;
        }

        public Criteria andBuyer_messageNotBetween(String value1, String value2) {
            addCriterion("buyer_message not between", value1, value2, "buyer_message");
            return (Criteria) this;
        }

        public Criteria andBuyer_nickIsNull() {
            addCriterion("buyer_nick is null");
            return (Criteria) this;
        }

        public Criteria andBuyer_nickIsNotNull() {
            addCriterion("buyer_nick is not null");
            return (Criteria) this;
        }

        public Criteria andBuyer_nickEqualTo(String value) {
            addCriterion("buyer_nick =", value, "buyer_nick");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBuyer_nickEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("buyer_nick = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBuyer_nickNotEqualTo(String value) {
            addCriterion("buyer_nick <>", value, "buyer_nick");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBuyer_nickNotEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("buyer_nick <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBuyer_nickGreaterThan(String value) {
            addCriterion("buyer_nick >", value, "buyer_nick");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBuyer_nickGreaterThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("buyer_nick > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBuyer_nickGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_nick >=", value, "buyer_nick");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBuyer_nickGreaterThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("buyer_nick >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBuyer_nickLessThan(String value) {
            addCriterion("buyer_nick <", value, "buyer_nick");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBuyer_nickLessThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("buyer_nick < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBuyer_nickLessThanOrEqualTo(String value) {
            addCriterion("buyer_nick <=", value, "buyer_nick");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBuyer_nickLessThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("buyer_nick <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBuyer_nickLike(String value) {
            addCriterion("buyer_nick like", value, "buyer_nick");
            return (Criteria) this;
        }

        public Criteria andBuyer_nickNotLike(String value) {
            addCriterion("buyer_nick not like", value, "buyer_nick");
            return (Criteria) this;
        }

        public Criteria andBuyer_nickIn(List<String> values) {
            addCriterion("buyer_nick in", values, "buyer_nick");
            return (Criteria) this;
        }

        public Criteria andBuyer_nickNotIn(List<String> values) {
            addCriterion("buyer_nick not in", values, "buyer_nick");
            return (Criteria) this;
        }

        public Criteria andBuyer_nickBetween(String value1, String value2) {
            addCriterion("buyer_nick between", value1, value2, "buyer_nick");
            return (Criteria) this;
        }

        public Criteria andBuyer_nickNotBetween(String value1, String value2) {
            addCriterion("buyer_nick not between", value1, value2, "buyer_nick");
            return (Criteria) this;
        }

        public Criteria andBuyer_rateIsNull() {
            addCriterion("buyer_rate is null");
            return (Criteria) this;
        }

        public Criteria andBuyer_rateIsNotNull() {
            addCriterion("buyer_rate is not null");
            return (Criteria) this;
        }

        public Criteria andBuyer_rateEqualTo(String value) {
            addCriterion("buyer_rate =", value, "buyer_rate");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBuyer_rateEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("buyer_rate = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBuyer_rateNotEqualTo(String value) {
            addCriterion("buyer_rate <>", value, "buyer_rate");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBuyer_rateNotEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("buyer_rate <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBuyer_rateGreaterThan(String value) {
            addCriterion("buyer_rate >", value, "buyer_rate");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBuyer_rateGreaterThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("buyer_rate > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBuyer_rateGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_rate >=", value, "buyer_rate");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBuyer_rateGreaterThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("buyer_rate >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBuyer_rateLessThan(String value) {
            addCriterion("buyer_rate <", value, "buyer_rate");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBuyer_rateLessThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("buyer_rate < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBuyer_rateLessThanOrEqualTo(String value) {
            addCriterion("buyer_rate <=", value, "buyer_rate");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBuyer_rateLessThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("buyer_rate <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBuyer_rateLike(String value) {
            addCriterion("buyer_rate like", value, "buyer_rate");
            return (Criteria) this;
        }

        public Criteria andBuyer_rateNotLike(String value) {
            addCriterion("buyer_rate not like", value, "buyer_rate");
            return (Criteria) this;
        }

        public Criteria andBuyer_rateIn(List<String> values) {
            addCriterion("buyer_rate in", values, "buyer_rate");
            return (Criteria) this;
        }

        public Criteria andBuyer_rateNotIn(List<String> values) {
            addCriterion("buyer_rate not in", values, "buyer_rate");
            return (Criteria) this;
        }

        public Criteria andBuyer_rateBetween(String value1, String value2) {
            addCriterion("buyer_rate between", value1, value2, "buyer_rate");
            return (Criteria) this;
        }

        public Criteria andBuyer_rateNotBetween(String value1, String value2) {
            addCriterion("buyer_rate not between", value1, value2, "buyer_rate");
            return (Criteria) this;
        }

        public Criteria andReceiver_area_nameIsNull() {
            addCriterion("receiver_area_name is null");
            return (Criteria) this;
        }

        public Criteria andReceiver_area_nameIsNotNull() {
            addCriterion("receiver_area_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceiver_area_nameEqualTo(String value) {
            addCriterion("receiver_area_name =", value, "receiver_area_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andReceiver_area_nameEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("receiver_area_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiver_area_nameNotEqualTo(String value) {
            addCriterion("receiver_area_name <>", value, "receiver_area_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andReceiver_area_nameNotEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("receiver_area_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiver_area_nameGreaterThan(String value) {
            addCriterion("receiver_area_name >", value, "receiver_area_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andReceiver_area_nameGreaterThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("receiver_area_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiver_area_nameGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_area_name >=", value, "receiver_area_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andReceiver_area_nameGreaterThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("receiver_area_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiver_area_nameLessThan(String value) {
            addCriterion("receiver_area_name <", value, "receiver_area_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andReceiver_area_nameLessThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("receiver_area_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiver_area_nameLessThanOrEqualTo(String value) {
            addCriterion("receiver_area_name <=", value, "receiver_area_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andReceiver_area_nameLessThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("receiver_area_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiver_area_nameLike(String value) {
            addCriterion("receiver_area_name like", value, "receiver_area_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_area_nameNotLike(String value) {
            addCriterion("receiver_area_name not like", value, "receiver_area_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_area_nameIn(List<String> values) {
            addCriterion("receiver_area_name in", values, "receiver_area_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_area_nameNotIn(List<String> values) {
            addCriterion("receiver_area_name not in", values, "receiver_area_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_area_nameBetween(String value1, String value2) {
            addCriterion("receiver_area_name between", value1, value2, "receiver_area_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_area_nameNotBetween(String value1, String value2) {
            addCriterion("receiver_area_name not between", value1, value2, "receiver_area_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_mobileIsNull() {
            addCriterion("receiver_mobile is null");
            return (Criteria) this;
        }

        public Criteria andReceiver_mobileIsNotNull() {
            addCriterion("receiver_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andReceiver_mobileEqualTo(String value) {
            addCriterion("receiver_mobile =", value, "receiver_mobile");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andReceiver_mobileEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("receiver_mobile = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiver_mobileNotEqualTo(String value) {
            addCriterion("receiver_mobile <>", value, "receiver_mobile");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andReceiver_mobileNotEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("receiver_mobile <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiver_mobileGreaterThan(String value) {
            addCriterion("receiver_mobile >", value, "receiver_mobile");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andReceiver_mobileGreaterThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("receiver_mobile > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiver_mobileGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_mobile >=", value, "receiver_mobile");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andReceiver_mobileGreaterThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("receiver_mobile >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiver_mobileLessThan(String value) {
            addCriterion("receiver_mobile <", value, "receiver_mobile");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andReceiver_mobileLessThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("receiver_mobile < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiver_mobileLessThanOrEqualTo(String value) {
            addCriterion("receiver_mobile <=", value, "receiver_mobile");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andReceiver_mobileLessThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("receiver_mobile <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiver_mobileLike(String value) {
            addCriterion("receiver_mobile like", value, "receiver_mobile");
            return (Criteria) this;
        }

        public Criteria andReceiver_mobileNotLike(String value) {
            addCriterion("receiver_mobile not like", value, "receiver_mobile");
            return (Criteria) this;
        }

        public Criteria andReceiver_mobileIn(List<String> values) {
            addCriterion("receiver_mobile in", values, "receiver_mobile");
            return (Criteria) this;
        }

        public Criteria andReceiver_mobileNotIn(List<String> values) {
            addCriterion("receiver_mobile not in", values, "receiver_mobile");
            return (Criteria) this;
        }

        public Criteria andReceiver_mobileBetween(String value1, String value2) {
            addCriterion("receiver_mobile between", value1, value2, "receiver_mobile");
            return (Criteria) this;
        }

        public Criteria andReceiver_mobileNotBetween(String value1, String value2) {
            addCriterion("receiver_mobile not between", value1, value2, "receiver_mobile");
            return (Criteria) this;
        }

        public Criteria andReceiver_zip_codeIsNull() {
            addCriterion("receiver_zip_code is null");
            return (Criteria) this;
        }

        public Criteria andReceiver_zip_codeIsNotNull() {
            addCriterion("receiver_zip_code is not null");
            return (Criteria) this;
        }

        public Criteria andReceiver_zip_codeEqualTo(String value) {
            addCriterion("receiver_zip_code =", value, "receiver_zip_code");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andReceiver_zip_codeEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("receiver_zip_code = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiver_zip_codeNotEqualTo(String value) {
            addCriterion("receiver_zip_code <>", value, "receiver_zip_code");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andReceiver_zip_codeNotEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("receiver_zip_code <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiver_zip_codeGreaterThan(String value) {
            addCriterion("receiver_zip_code >", value, "receiver_zip_code");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andReceiver_zip_codeGreaterThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("receiver_zip_code > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiver_zip_codeGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_zip_code >=", value, "receiver_zip_code");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andReceiver_zip_codeGreaterThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("receiver_zip_code >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiver_zip_codeLessThan(String value) {
            addCriterion("receiver_zip_code <", value, "receiver_zip_code");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andReceiver_zip_codeLessThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("receiver_zip_code < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiver_zip_codeLessThanOrEqualTo(String value) {
            addCriterion("receiver_zip_code <=", value, "receiver_zip_code");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andReceiver_zip_codeLessThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("receiver_zip_code <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiver_zip_codeLike(String value) {
            addCriterion("receiver_zip_code like", value, "receiver_zip_code");
            return (Criteria) this;
        }

        public Criteria andReceiver_zip_codeNotLike(String value) {
            addCriterion("receiver_zip_code not like", value, "receiver_zip_code");
            return (Criteria) this;
        }

        public Criteria andReceiver_zip_codeIn(List<String> values) {
            addCriterion("receiver_zip_code in", values, "receiver_zip_code");
            return (Criteria) this;
        }

        public Criteria andReceiver_zip_codeNotIn(List<String> values) {
            addCriterion("receiver_zip_code not in", values, "receiver_zip_code");
            return (Criteria) this;
        }

        public Criteria andReceiver_zip_codeBetween(String value1, String value2) {
            addCriterion("receiver_zip_code between", value1, value2, "receiver_zip_code");
            return (Criteria) this;
        }

        public Criteria andReceiver_zip_codeNotBetween(String value1, String value2) {
            addCriterion("receiver_zip_code not between", value1, value2, "receiver_zip_code");
            return (Criteria) this;
        }

        public Criteria andReceiverIsNull() {
            addCriterion("receiver is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIsNotNull() {
            addCriterion("receiver is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverEqualTo(String value) {
            addCriterion("receiver =", value, "receiver");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andReceiverEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("receiver = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiverNotEqualTo(String value) {
            addCriterion("receiver <>", value, "receiver");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andReceiverNotEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("receiver <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThan(String value) {
            addCriterion("receiver >", value, "receiver");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andReceiverGreaterThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("receiver > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThanOrEqualTo(String value) {
            addCriterion("receiver >=", value, "receiver");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andReceiverGreaterThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("receiver >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiverLessThan(String value) {
            addCriterion("receiver <", value, "receiver");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andReceiverLessThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("receiver < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiverLessThanOrEqualTo(String value) {
            addCriterion("receiver <=", value, "receiver");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andReceiverLessThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("receiver <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiverLike(String value) {
            addCriterion("receiver like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotLike(String value) {
            addCriterion("receiver not like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverIn(List<String> values) {
            addCriterion("receiver in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotIn(List<String> values) {
            addCriterion("receiver not in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverBetween(String value1, String value2) {
            addCriterion("receiver between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotBetween(String value1, String value2) {
            addCriterion("receiver not between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria andExpireIsNull() {
            addCriterion("expire is null");
            return (Criteria) this;
        }

        public Criteria andExpireIsNotNull() {
            addCriterion("expire is not null");
            return (Criteria) this;
        }

        public Criteria andExpireEqualTo(Date value) {
            addCriterion("expire =", value, "expire");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andExpireEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("expire = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExpireNotEqualTo(Date value) {
            addCriterion("expire <>", value, "expire");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andExpireNotEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("expire <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExpireGreaterThan(Date value) {
            addCriterion("expire >", value, "expire");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andExpireGreaterThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("expire > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExpireGreaterThanOrEqualTo(Date value) {
            addCriterion("expire >=", value, "expire");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andExpireGreaterThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("expire >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExpireLessThan(Date value) {
            addCriterion("expire <", value, "expire");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andExpireLessThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("expire < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExpireLessThanOrEqualTo(Date value) {
            addCriterion("expire <=", value, "expire");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andExpireLessThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("expire <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExpireIn(List<Date> values) {
            addCriterion("expire in", values, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireNotIn(List<Date> values) {
            addCriterion("expire not in", values, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireBetween(Date value1, Date value2) {
            addCriterion("expire between", value1, value2, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireNotBetween(Date value1, Date value2) {
            addCriterion("expire not between", value1, value2, "expire");
            return (Criteria) this;
        }

        public Criteria andInvoice_typeIsNull() {
            addCriterion("invoice_type is null");
            return (Criteria) this;
        }

        public Criteria andInvoice_typeIsNotNull() {
            addCriterion("invoice_type is not null");
            return (Criteria) this;
        }

        public Criteria andInvoice_typeEqualTo(String value) {
            addCriterion("invoice_type =", value, "invoice_type");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andInvoice_typeEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("invoice_type = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInvoice_typeNotEqualTo(String value) {
            addCriterion("invoice_type <>", value, "invoice_type");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andInvoice_typeNotEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("invoice_type <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInvoice_typeGreaterThan(String value) {
            addCriterion("invoice_type >", value, "invoice_type");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andInvoice_typeGreaterThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("invoice_type > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInvoice_typeGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_type >=", value, "invoice_type");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andInvoice_typeGreaterThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("invoice_type >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInvoice_typeLessThan(String value) {
            addCriterion("invoice_type <", value, "invoice_type");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andInvoice_typeLessThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("invoice_type < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInvoice_typeLessThanOrEqualTo(String value) {
            addCriterion("invoice_type <=", value, "invoice_type");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andInvoice_typeLessThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("invoice_type <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInvoice_typeLike(String value) {
            addCriterion("invoice_type like", value, "invoice_type");
            return (Criteria) this;
        }

        public Criteria andInvoice_typeNotLike(String value) {
            addCriterion("invoice_type not like", value, "invoice_type");
            return (Criteria) this;
        }

        public Criteria andInvoice_typeIn(List<String> values) {
            addCriterion("invoice_type in", values, "invoice_type");
            return (Criteria) this;
        }

        public Criteria andInvoice_typeNotIn(List<String> values) {
            addCriterion("invoice_type not in", values, "invoice_type");
            return (Criteria) this;
        }

        public Criteria andInvoice_typeBetween(String value1, String value2) {
            addCriterion("invoice_type between", value1, value2, "invoice_type");
            return (Criteria) this;
        }

        public Criteria andInvoice_typeNotBetween(String value1, String value2) {
            addCriterion("invoice_type not between", value1, value2, "invoice_type");
            return (Criteria) this;
        }

        public Criteria andSource_typeIsNull() {
            addCriterion("source_type is null");
            return (Criteria) this;
        }

        public Criteria andSource_typeIsNotNull() {
            addCriterion("source_type is not null");
            return (Criteria) this;
        }

        public Criteria andSource_typeEqualTo(String value) {
            addCriterion("source_type =", value, "source_type");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSource_typeEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("source_type = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSource_typeNotEqualTo(String value) {
            addCriterion("source_type <>", value, "source_type");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSource_typeNotEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("source_type <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSource_typeGreaterThan(String value) {
            addCriterion("source_type >", value, "source_type");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSource_typeGreaterThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("source_type > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSource_typeGreaterThanOrEqualTo(String value) {
            addCriterion("source_type >=", value, "source_type");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSource_typeGreaterThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("source_type >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSource_typeLessThan(String value) {
            addCriterion("source_type <", value, "source_type");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSource_typeLessThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("source_type < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSource_typeLessThanOrEqualTo(String value) {
            addCriterion("source_type <=", value, "source_type");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSource_typeLessThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("source_type <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSource_typeLike(String value) {
            addCriterion("source_type like", value, "source_type");
            return (Criteria) this;
        }

        public Criteria andSource_typeNotLike(String value) {
            addCriterion("source_type not like", value, "source_type");
            return (Criteria) this;
        }

        public Criteria andSource_typeIn(List<String> values) {
            addCriterion("source_type in", values, "source_type");
            return (Criteria) this;
        }

        public Criteria andSource_typeNotIn(List<String> values) {
            addCriterion("source_type not in", values, "source_type");
            return (Criteria) this;
        }

        public Criteria andSource_typeBetween(String value1, String value2) {
            addCriterion("source_type between", value1, value2, "source_type");
            return (Criteria) this;
        }

        public Criteria andSource_typeNotBetween(String value1, String value2) {
            addCriterion("source_type not between", value1, value2, "source_type");
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
        public Criteria andSeller_idEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("seller_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeller_idNotEqualTo(String value) {
            addCriterion("seller_id <>", value, "seller_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSeller_idNotEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("seller_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeller_idGreaterThan(String value) {
            addCriterion("seller_id >", value, "seller_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSeller_idGreaterThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("seller_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeller_idGreaterThanOrEqualTo(String value) {
            addCriterion("seller_id >=", value, "seller_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSeller_idGreaterThanOrEqualToColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("seller_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeller_idLessThan(String value) {
            addCriterion("seller_id <", value, "seller_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSeller_idLessThanColumn(TbOrder.Column column) {
            addCriterion(new StringBuilder("seller_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeller_idLessThanOrEqualTo(String value) {
            addCriterion("seller_id <=", value, "seller_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSeller_idLessThanOrEqualToColumn(TbOrder.Column column) {
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

        public Criteria andPayment_typeLikeInsensitive(String value) {
            addCriterion("upper(payment_type) like", value.toUpperCase(), "payment_type");
            return (Criteria) this;
        }

        public Criteria andPost_feeLikeInsensitive(String value) {
            addCriterion("upper(post_fee) like", value.toUpperCase(), "post_fee");
            return (Criteria) this;
        }

        public Criteria andStatusLikeInsensitive(String value) {
            addCriterion("upper(status) like", value.toUpperCase(), "status");
            return (Criteria) this;
        }

        public Criteria andShipping_nameLikeInsensitive(String value) {
            addCriterion("upper(shipping_name) like", value.toUpperCase(), "shipping_name");
            return (Criteria) this;
        }

        public Criteria andShipping_codeLikeInsensitive(String value) {
            addCriterion("upper(shipping_code) like", value.toUpperCase(), "shipping_code");
            return (Criteria) this;
        }

        public Criteria andUser_idLikeInsensitive(String value) {
            addCriterion("upper(user_id) like", value.toUpperCase(), "user_id");
            return (Criteria) this;
        }

        public Criteria andBuyer_messageLikeInsensitive(String value) {
            addCriterion("upper(buyer_message) like", value.toUpperCase(), "buyer_message");
            return (Criteria) this;
        }

        public Criteria andBuyer_nickLikeInsensitive(String value) {
            addCriterion("upper(buyer_nick) like", value.toUpperCase(), "buyer_nick");
            return (Criteria) this;
        }

        public Criteria andBuyer_rateLikeInsensitive(String value) {
            addCriterion("upper(buyer_rate) like", value.toUpperCase(), "buyer_rate");
            return (Criteria) this;
        }

        public Criteria andReceiver_area_nameLikeInsensitive(String value) {
            addCriterion("upper(receiver_area_name) like", value.toUpperCase(), "receiver_area_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_mobileLikeInsensitive(String value) {
            addCriterion("upper(receiver_mobile) like", value.toUpperCase(), "receiver_mobile");
            return (Criteria) this;
        }

        public Criteria andReceiver_zip_codeLikeInsensitive(String value) {
            addCriterion("upper(receiver_zip_code) like", value.toUpperCase(), "receiver_zip_code");
            return (Criteria) this;
        }

        public Criteria andReceiverLikeInsensitive(String value) {
            addCriterion("upper(receiver) like", value.toUpperCase(), "receiver");
            return (Criteria) this;
        }

        public Criteria andInvoice_typeLikeInsensitive(String value) {
            addCriterion("upper(invoice_type) like", value.toUpperCase(), "invoice_type");
            return (Criteria) this;
        }

        public Criteria andSource_typeLikeInsensitive(String value) {
            addCriterion("upper(source_type) like", value.toUpperCase(), "source_type");
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
        private TbOrderExample example;

        /**
         */
        protected Criteria(TbOrderExample example) {
            super();
            this.example = example;
        }

        /**
         */
        public TbOrderExample example() {
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