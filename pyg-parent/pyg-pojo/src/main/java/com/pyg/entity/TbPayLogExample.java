package com.pyg.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbPayLogExample {
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
    public TbPayLogExample() {
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
    public TbPayLogExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    /**
     */
    public TbPayLogExample orderBy(String ... orderByClauses) {
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

        public Criteria andOut_trade_noIsNull() {
            addCriterion("out_trade_no is null");
            return (Criteria) this;
        }

        public Criteria andOut_trade_noIsNotNull() {
            addCriterion("out_trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andOut_trade_noEqualTo(String value) {
            addCriterion("out_trade_no =", value, "out_trade_no");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOut_trade_noEqualToColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("out_trade_no = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOut_trade_noNotEqualTo(String value) {
            addCriterion("out_trade_no <>", value, "out_trade_no");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOut_trade_noNotEqualToColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("out_trade_no <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOut_trade_noGreaterThan(String value) {
            addCriterion("out_trade_no >", value, "out_trade_no");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOut_trade_noGreaterThanColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("out_trade_no > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOut_trade_noGreaterThanOrEqualTo(String value) {
            addCriterion("out_trade_no >=", value, "out_trade_no");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOut_trade_noGreaterThanOrEqualToColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("out_trade_no >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOut_trade_noLessThan(String value) {
            addCriterion("out_trade_no <", value, "out_trade_no");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOut_trade_noLessThanColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("out_trade_no < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOut_trade_noLessThanOrEqualTo(String value) {
            addCriterion("out_trade_no <=", value, "out_trade_no");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOut_trade_noLessThanOrEqualToColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("out_trade_no <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOut_trade_noLike(String value) {
            addCriterion("out_trade_no like", value, "out_trade_no");
            return (Criteria) this;
        }

        public Criteria andOut_trade_noNotLike(String value) {
            addCriterion("out_trade_no not like", value, "out_trade_no");
            return (Criteria) this;
        }

        public Criteria andOut_trade_noIn(List<String> values) {
            addCriterion("out_trade_no in", values, "out_trade_no");
            return (Criteria) this;
        }

        public Criteria andOut_trade_noNotIn(List<String> values) {
            addCriterion("out_trade_no not in", values, "out_trade_no");
            return (Criteria) this;
        }

        public Criteria andOut_trade_noBetween(String value1, String value2) {
            addCriterion("out_trade_no between", value1, value2, "out_trade_no");
            return (Criteria) this;
        }

        public Criteria andOut_trade_noNotBetween(String value1, String value2) {
            addCriterion("out_trade_no not between", value1, value2, "out_trade_no");
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
        public Criteria andCreate_timeEqualToColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("create_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreate_timeNotEqualToColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("create_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterion("create_time >", value, "create_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreate_timeGreaterThanColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("create_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreate_timeGreaterThanOrEqualToColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("create_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterion("create_time <", value, "create_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreate_timeLessThanColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("create_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreate_timeLessThanOrEqualToColumn(TbPayLog.Column column) {
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

        public Criteria andPay_timeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPay_timeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPay_timeEqualTo(Date value) {
            addCriterion("pay_time =", value, "pay_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPay_timeEqualToColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("pay_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPay_timeNotEqualTo(Date value) {
            addCriterion("pay_time <>", value, "pay_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPay_timeNotEqualToColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("pay_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPay_timeGreaterThan(Date value) {
            addCriterion("pay_time >", value, "pay_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPay_timeGreaterThanColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("pay_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPay_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_time >=", value, "pay_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPay_timeGreaterThanOrEqualToColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("pay_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPay_timeLessThan(Date value) {
            addCriterion("pay_time <", value, "pay_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPay_timeLessThanColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("pay_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPay_timeLessThanOrEqualTo(Date value) {
            addCriterion("pay_time <=", value, "pay_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPay_timeLessThanOrEqualToColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("pay_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPay_timeIn(List<Date> values) {
            addCriterion("pay_time in", values, "pay_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeNotIn(List<Date> values) {
            addCriterion("pay_time not in", values, "pay_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeBetween(Date value1, Date value2) {
            addCriterion("pay_time between", value1, value2, "pay_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeNotBetween(Date value1, Date value2) {
            addCriterion("pay_time not between", value1, value2, "pay_time");
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

        public Criteria andTotal_feeEqualTo(Long value) {
            addCriterion("total_fee =", value, "total_fee");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTotal_feeEqualToColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("total_fee = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotal_feeNotEqualTo(Long value) {
            addCriterion("total_fee <>", value, "total_fee");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTotal_feeNotEqualToColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("total_fee <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotal_feeGreaterThan(Long value) {
            addCriterion("total_fee >", value, "total_fee");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTotal_feeGreaterThanColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("total_fee > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotal_feeGreaterThanOrEqualTo(Long value) {
            addCriterion("total_fee >=", value, "total_fee");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTotal_feeGreaterThanOrEqualToColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("total_fee >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotal_feeLessThan(Long value) {
            addCriterion("total_fee <", value, "total_fee");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTotal_feeLessThanColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("total_fee < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotal_feeLessThanOrEqualTo(Long value) {
            addCriterion("total_fee <=", value, "total_fee");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTotal_feeLessThanOrEqualToColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("total_fee <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotal_feeIn(List<Long> values) {
            addCriterion("total_fee in", values, "total_fee");
            return (Criteria) this;
        }

        public Criteria andTotal_feeNotIn(List<Long> values) {
            addCriterion("total_fee not in", values, "total_fee");
            return (Criteria) this;
        }

        public Criteria andTotal_feeBetween(Long value1, Long value2) {
            addCriterion("total_fee between", value1, value2, "total_fee");
            return (Criteria) this;
        }

        public Criteria andTotal_feeNotBetween(Long value1, Long value2) {
            addCriterion("total_fee not between", value1, value2, "total_fee");
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
        public Criteria andUser_idEqualToColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("user_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idNotEqualTo(String value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUser_idNotEqualToColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("user_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThan(String value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUser_idGreaterThanColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("user_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUser_idGreaterThanOrEqualToColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("user_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idLessThan(String value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUser_idLessThanColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("user_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUser_idLessThanOrEqualToColumn(TbPayLog.Column column) {
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

        public Criteria andTransaction_idIsNull() {
            addCriterion("transaction_id is null");
            return (Criteria) this;
        }

        public Criteria andTransaction_idIsNotNull() {
            addCriterion("transaction_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransaction_idEqualTo(String value) {
            addCriterion("transaction_id =", value, "transaction_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTransaction_idEqualToColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("transaction_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransaction_idNotEqualTo(String value) {
            addCriterion("transaction_id <>", value, "transaction_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTransaction_idNotEqualToColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("transaction_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransaction_idGreaterThan(String value) {
            addCriterion("transaction_id >", value, "transaction_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTransaction_idGreaterThanColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("transaction_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransaction_idGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_id >=", value, "transaction_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTransaction_idGreaterThanOrEqualToColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("transaction_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransaction_idLessThan(String value) {
            addCriterion("transaction_id <", value, "transaction_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTransaction_idLessThanColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("transaction_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransaction_idLessThanOrEqualTo(String value) {
            addCriterion("transaction_id <=", value, "transaction_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTransaction_idLessThanOrEqualToColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("transaction_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransaction_idLike(String value) {
            addCriterion("transaction_id like", value, "transaction_id");
            return (Criteria) this;
        }

        public Criteria andTransaction_idNotLike(String value) {
            addCriterion("transaction_id not like", value, "transaction_id");
            return (Criteria) this;
        }

        public Criteria andTransaction_idIn(List<String> values) {
            addCriterion("transaction_id in", values, "transaction_id");
            return (Criteria) this;
        }

        public Criteria andTransaction_idNotIn(List<String> values) {
            addCriterion("transaction_id not in", values, "transaction_id");
            return (Criteria) this;
        }

        public Criteria andTransaction_idBetween(String value1, String value2) {
            addCriterion("transaction_id between", value1, value2, "transaction_id");
            return (Criteria) this;
        }

        public Criteria andTransaction_idNotBetween(String value1, String value2) {
            addCriterion("transaction_id not between", value1, value2, "transaction_id");
            return (Criteria) this;
        }

        public Criteria andTrade_stateIsNull() {
            addCriterion("trade_state is null");
            return (Criteria) this;
        }

        public Criteria andTrade_stateIsNotNull() {
            addCriterion("trade_state is not null");
            return (Criteria) this;
        }

        public Criteria andTrade_stateEqualTo(String value) {
            addCriterion("trade_state =", value, "trade_state");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTrade_stateEqualToColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("trade_state = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTrade_stateNotEqualTo(String value) {
            addCriterion("trade_state <>", value, "trade_state");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTrade_stateNotEqualToColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("trade_state <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTrade_stateGreaterThan(String value) {
            addCriterion("trade_state >", value, "trade_state");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTrade_stateGreaterThanColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("trade_state > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTrade_stateGreaterThanOrEqualTo(String value) {
            addCriterion("trade_state >=", value, "trade_state");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTrade_stateGreaterThanOrEqualToColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("trade_state >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTrade_stateLessThan(String value) {
            addCriterion("trade_state <", value, "trade_state");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTrade_stateLessThanColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("trade_state < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTrade_stateLessThanOrEqualTo(String value) {
            addCriterion("trade_state <=", value, "trade_state");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTrade_stateLessThanOrEqualToColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("trade_state <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTrade_stateLike(String value) {
            addCriterion("trade_state like", value, "trade_state");
            return (Criteria) this;
        }

        public Criteria andTrade_stateNotLike(String value) {
            addCriterion("trade_state not like", value, "trade_state");
            return (Criteria) this;
        }

        public Criteria andTrade_stateIn(List<String> values) {
            addCriterion("trade_state in", values, "trade_state");
            return (Criteria) this;
        }

        public Criteria andTrade_stateNotIn(List<String> values) {
            addCriterion("trade_state not in", values, "trade_state");
            return (Criteria) this;
        }

        public Criteria andTrade_stateBetween(String value1, String value2) {
            addCriterion("trade_state between", value1, value2, "trade_state");
            return (Criteria) this;
        }

        public Criteria andTrade_stateNotBetween(String value1, String value2) {
            addCriterion("trade_state not between", value1, value2, "trade_state");
            return (Criteria) this;
        }

        public Criteria andOrder_listIsNull() {
            addCriterion("order_list is null");
            return (Criteria) this;
        }

        public Criteria andOrder_listIsNotNull() {
            addCriterion("order_list is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_listEqualTo(String value) {
            addCriterion("order_list =", value, "order_list");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOrder_listEqualToColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("order_list = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrder_listNotEqualTo(String value) {
            addCriterion("order_list <>", value, "order_list");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOrder_listNotEqualToColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("order_list <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrder_listGreaterThan(String value) {
            addCriterion("order_list >", value, "order_list");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOrder_listGreaterThanColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("order_list > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrder_listGreaterThanOrEqualTo(String value) {
            addCriterion("order_list >=", value, "order_list");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOrder_listGreaterThanOrEqualToColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("order_list >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrder_listLessThan(String value) {
            addCriterion("order_list <", value, "order_list");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOrder_listLessThanColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("order_list < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrder_listLessThanOrEqualTo(String value) {
            addCriterion("order_list <=", value, "order_list");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOrder_listLessThanOrEqualToColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("order_list <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrder_listLike(String value) {
            addCriterion("order_list like", value, "order_list");
            return (Criteria) this;
        }

        public Criteria andOrder_listNotLike(String value) {
            addCriterion("order_list not like", value, "order_list");
            return (Criteria) this;
        }

        public Criteria andOrder_listIn(List<String> values) {
            addCriterion("order_list in", values, "order_list");
            return (Criteria) this;
        }

        public Criteria andOrder_listNotIn(List<String> values) {
            addCriterion("order_list not in", values, "order_list");
            return (Criteria) this;
        }

        public Criteria andOrder_listBetween(String value1, String value2) {
            addCriterion("order_list between", value1, value2, "order_list");
            return (Criteria) this;
        }

        public Criteria andOrder_listNotBetween(String value1, String value2) {
            addCriterion("order_list not between", value1, value2, "order_list");
            return (Criteria) this;
        }

        public Criteria andPay_typeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPay_typeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPay_typeEqualTo(String value) {
            addCriterion("pay_type =", value, "pay_type");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPay_typeEqualToColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("pay_type = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPay_typeNotEqualTo(String value) {
            addCriterion("pay_type <>", value, "pay_type");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPay_typeNotEqualToColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("pay_type <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPay_typeGreaterThan(String value) {
            addCriterion("pay_type >", value, "pay_type");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPay_typeGreaterThanColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("pay_type > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPay_typeGreaterThanOrEqualTo(String value) {
            addCriterion("pay_type >=", value, "pay_type");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPay_typeGreaterThanOrEqualToColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("pay_type >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPay_typeLessThan(String value) {
            addCriterion("pay_type <", value, "pay_type");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPay_typeLessThanColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("pay_type < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPay_typeLessThanOrEqualTo(String value) {
            addCriterion("pay_type <=", value, "pay_type");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPay_typeLessThanOrEqualToColumn(TbPayLog.Column column) {
            addCriterion(new StringBuilder("pay_type <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPay_typeLike(String value) {
            addCriterion("pay_type like", value, "pay_type");
            return (Criteria) this;
        }

        public Criteria andPay_typeNotLike(String value) {
            addCriterion("pay_type not like", value, "pay_type");
            return (Criteria) this;
        }

        public Criteria andPay_typeIn(List<String> values) {
            addCriterion("pay_type in", values, "pay_type");
            return (Criteria) this;
        }

        public Criteria andPay_typeNotIn(List<String> values) {
            addCriterion("pay_type not in", values, "pay_type");
            return (Criteria) this;
        }

        public Criteria andPay_typeBetween(String value1, String value2) {
            addCriterion("pay_type between", value1, value2, "pay_type");
            return (Criteria) this;
        }

        public Criteria andPay_typeNotBetween(String value1, String value2) {
            addCriterion("pay_type not between", value1, value2, "pay_type");
            return (Criteria) this;
        }

        public Criteria andOut_trade_noLikeInsensitive(String value) {
            addCriterion("upper(out_trade_no) like", value.toUpperCase(), "out_trade_no");
            return (Criteria) this;
        }

        public Criteria andUser_idLikeInsensitive(String value) {
            addCriterion("upper(user_id) like", value.toUpperCase(), "user_id");
            return (Criteria) this;
        }

        public Criteria andTransaction_idLikeInsensitive(String value) {
            addCriterion("upper(transaction_id) like", value.toUpperCase(), "transaction_id");
            return (Criteria) this;
        }

        public Criteria andTrade_stateLikeInsensitive(String value) {
            addCriterion("upper(trade_state) like", value.toUpperCase(), "trade_state");
            return (Criteria) this;
        }

        public Criteria andOrder_listLikeInsensitive(String value) {
            addCriterion("upper(order_list) like", value.toUpperCase(), "order_list");
            return (Criteria) this;
        }

        public Criteria andPay_typeLikeInsensitive(String value) {
            addCriterion("upper(pay_type) like", value.toUpperCase(), "pay_type");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {
        /**
         */
        private TbPayLogExample example;

        /**
         */
        protected Criteria(TbPayLogExample example) {
            super();
            this.example = example;
        }

        /**
         */
        public TbPayLogExample example() {
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