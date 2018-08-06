package com.pyg.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbSeckillOrderExample {
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
    public TbSeckillOrderExample() {
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
    public TbSeckillOrderExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    /**
     */
    public TbSeckillOrderExample orderBy(String ... orderByClauses) {
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
        public Criteria andIdEqualToColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdNotEqualToColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdGreaterThanColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdGreaterThanOrEqualToColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdLessThanColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdLessThanOrEqualToColumn(TbSeckillOrder.Column column) {
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

        public Criteria andSeckill_idIsNull() {
            addCriterion("seckill_id is null");
            return (Criteria) this;
        }

        public Criteria andSeckill_idIsNotNull() {
            addCriterion("seckill_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeckill_idEqualTo(Long value) {
            addCriterion("seckill_id =", value, "seckill_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSeckill_idEqualToColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("seckill_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeckill_idNotEqualTo(Long value) {
            addCriterion("seckill_id <>", value, "seckill_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSeckill_idNotEqualToColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("seckill_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeckill_idGreaterThan(Long value) {
            addCriterion("seckill_id >", value, "seckill_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSeckill_idGreaterThanColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("seckill_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeckill_idGreaterThanOrEqualTo(Long value) {
            addCriterion("seckill_id >=", value, "seckill_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSeckill_idGreaterThanOrEqualToColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("seckill_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeckill_idLessThan(Long value) {
            addCriterion("seckill_id <", value, "seckill_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSeckill_idLessThanColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("seckill_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeckill_idLessThanOrEqualTo(Long value) {
            addCriterion("seckill_id <=", value, "seckill_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSeckill_idLessThanOrEqualToColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("seckill_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeckill_idIn(List<Long> values) {
            addCriterion("seckill_id in", values, "seckill_id");
            return (Criteria) this;
        }

        public Criteria andSeckill_idNotIn(List<Long> values) {
            addCriterion("seckill_id not in", values, "seckill_id");
            return (Criteria) this;
        }

        public Criteria andSeckill_idBetween(Long value1, Long value2) {
            addCriterion("seckill_id between", value1, value2, "seckill_id");
            return (Criteria) this;
        }

        public Criteria andSeckill_idNotBetween(Long value1, Long value2) {
            addCriterion("seckill_id not between", value1, value2, "seckill_id");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(BigDecimal value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andMoneyEqualToColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("money = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(BigDecimal value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andMoneyNotEqualToColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("money <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(BigDecimal value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andMoneyGreaterThanColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("money > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andMoneyGreaterThanOrEqualToColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("money >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(BigDecimal value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andMoneyLessThanColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("money < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andMoneyLessThanOrEqualToColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("money <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<BigDecimal> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<BigDecimal> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money not between", value1, value2, "money");
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
        public Criteria andUser_idEqualToColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("user_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idNotEqualTo(String value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUser_idNotEqualToColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("user_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThan(String value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUser_idGreaterThanColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("user_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUser_idGreaterThanOrEqualToColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("user_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idLessThan(String value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUser_idLessThanColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("user_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUser_idLessThanOrEqualToColumn(TbSeckillOrder.Column column) {
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
        public Criteria andSeller_idEqualToColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("seller_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeller_idNotEqualTo(String value) {
            addCriterion("seller_id <>", value, "seller_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSeller_idNotEqualToColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("seller_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeller_idGreaterThan(String value) {
            addCriterion("seller_id >", value, "seller_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSeller_idGreaterThanColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("seller_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeller_idGreaterThanOrEqualTo(String value) {
            addCriterion("seller_id >=", value, "seller_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSeller_idGreaterThanOrEqualToColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("seller_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeller_idLessThan(String value) {
            addCriterion("seller_id <", value, "seller_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSeller_idLessThanColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("seller_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeller_idLessThanOrEqualTo(String value) {
            addCriterion("seller_id <=", value, "seller_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSeller_idLessThanOrEqualToColumn(TbSeckillOrder.Column column) {
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
        public Criteria andCreate_timeEqualToColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("create_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreate_timeNotEqualToColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("create_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterion("create_time >", value, "create_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreate_timeGreaterThanColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("create_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreate_timeGreaterThanOrEqualToColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("create_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterion("create_time <", value, "create_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreate_timeLessThanColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("create_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreate_timeLessThanOrEqualToColumn(TbSeckillOrder.Column column) {
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
        public Criteria andPay_timeEqualToColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("pay_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPay_timeNotEqualTo(Date value) {
            addCriterion("pay_time <>", value, "pay_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPay_timeNotEqualToColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("pay_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPay_timeGreaterThan(Date value) {
            addCriterion("pay_time >", value, "pay_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPay_timeGreaterThanColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("pay_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPay_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_time >=", value, "pay_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPay_timeGreaterThanOrEqualToColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("pay_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPay_timeLessThan(Date value) {
            addCriterion("pay_time <", value, "pay_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPay_timeLessThanColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("pay_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPay_timeLessThanOrEqualTo(Date value) {
            addCriterion("pay_time <=", value, "pay_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPay_timeLessThanOrEqualToColumn(TbSeckillOrder.Column column) {
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
        public Criteria andStatusEqualToColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("status = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusNotEqualToColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("status <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusGreaterThanColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("status > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusGreaterThanOrEqualToColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("status >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusLessThanColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("status < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusLessThanOrEqualToColumn(TbSeckillOrder.Column column) {
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

        public Criteria andReceiver_addressIsNull() {
            addCriterion("receiver_address is null");
            return (Criteria) this;
        }

        public Criteria andReceiver_addressIsNotNull() {
            addCriterion("receiver_address is not null");
            return (Criteria) this;
        }

        public Criteria andReceiver_addressEqualTo(String value) {
            addCriterion("receiver_address =", value, "receiver_address");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andReceiver_addressEqualToColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("receiver_address = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiver_addressNotEqualTo(String value) {
            addCriterion("receiver_address <>", value, "receiver_address");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andReceiver_addressNotEqualToColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("receiver_address <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiver_addressGreaterThan(String value) {
            addCriterion("receiver_address >", value, "receiver_address");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andReceiver_addressGreaterThanColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("receiver_address > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiver_addressGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_address >=", value, "receiver_address");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andReceiver_addressGreaterThanOrEqualToColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("receiver_address >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiver_addressLessThan(String value) {
            addCriterion("receiver_address <", value, "receiver_address");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andReceiver_addressLessThanColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("receiver_address < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiver_addressLessThanOrEqualTo(String value) {
            addCriterion("receiver_address <=", value, "receiver_address");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andReceiver_addressLessThanOrEqualToColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("receiver_address <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiver_addressLike(String value) {
            addCriterion("receiver_address like", value, "receiver_address");
            return (Criteria) this;
        }

        public Criteria andReceiver_addressNotLike(String value) {
            addCriterion("receiver_address not like", value, "receiver_address");
            return (Criteria) this;
        }

        public Criteria andReceiver_addressIn(List<String> values) {
            addCriterion("receiver_address in", values, "receiver_address");
            return (Criteria) this;
        }

        public Criteria andReceiver_addressNotIn(List<String> values) {
            addCriterion("receiver_address not in", values, "receiver_address");
            return (Criteria) this;
        }

        public Criteria andReceiver_addressBetween(String value1, String value2) {
            addCriterion("receiver_address between", value1, value2, "receiver_address");
            return (Criteria) this;
        }

        public Criteria andReceiver_addressNotBetween(String value1, String value2) {
            addCriterion("receiver_address not between", value1, value2, "receiver_address");
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
        public Criteria andReceiver_mobileEqualToColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("receiver_mobile = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiver_mobileNotEqualTo(String value) {
            addCriterion("receiver_mobile <>", value, "receiver_mobile");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andReceiver_mobileNotEqualToColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("receiver_mobile <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiver_mobileGreaterThan(String value) {
            addCriterion("receiver_mobile >", value, "receiver_mobile");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andReceiver_mobileGreaterThanColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("receiver_mobile > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiver_mobileGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_mobile >=", value, "receiver_mobile");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andReceiver_mobileGreaterThanOrEqualToColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("receiver_mobile >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiver_mobileLessThan(String value) {
            addCriterion("receiver_mobile <", value, "receiver_mobile");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andReceiver_mobileLessThanColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("receiver_mobile < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiver_mobileLessThanOrEqualTo(String value) {
            addCriterion("receiver_mobile <=", value, "receiver_mobile");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andReceiver_mobileLessThanOrEqualToColumn(TbSeckillOrder.Column column) {
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
        public Criteria andReceiverEqualToColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("receiver = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiverNotEqualTo(String value) {
            addCriterion("receiver <>", value, "receiver");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andReceiverNotEqualToColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("receiver <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThan(String value) {
            addCriterion("receiver >", value, "receiver");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andReceiverGreaterThanColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("receiver > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThanOrEqualTo(String value) {
            addCriterion("receiver >=", value, "receiver");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andReceiverGreaterThanOrEqualToColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("receiver >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiverLessThan(String value) {
            addCriterion("receiver <", value, "receiver");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andReceiverLessThanColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("receiver < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiverLessThanOrEqualTo(String value) {
            addCriterion("receiver <=", value, "receiver");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andReceiverLessThanOrEqualToColumn(TbSeckillOrder.Column column) {
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
        public Criteria andTransaction_idEqualToColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("transaction_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransaction_idNotEqualTo(String value) {
            addCriterion("transaction_id <>", value, "transaction_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTransaction_idNotEqualToColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("transaction_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransaction_idGreaterThan(String value) {
            addCriterion("transaction_id >", value, "transaction_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTransaction_idGreaterThanColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("transaction_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransaction_idGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_id >=", value, "transaction_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTransaction_idGreaterThanOrEqualToColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("transaction_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransaction_idLessThan(String value) {
            addCriterion("transaction_id <", value, "transaction_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTransaction_idLessThanColumn(TbSeckillOrder.Column column) {
            addCriterion(new StringBuilder("transaction_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransaction_idLessThanOrEqualTo(String value) {
            addCriterion("transaction_id <=", value, "transaction_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTransaction_idLessThanOrEqualToColumn(TbSeckillOrder.Column column) {
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

        public Criteria andUser_idLikeInsensitive(String value) {
            addCriterion("upper(user_id) like", value.toUpperCase(), "user_id");
            return (Criteria) this;
        }

        public Criteria andSeller_idLikeInsensitive(String value) {
            addCriterion("upper(seller_id) like", value.toUpperCase(), "seller_id");
            return (Criteria) this;
        }

        public Criteria andStatusLikeInsensitive(String value) {
            addCriterion("upper(status) like", value.toUpperCase(), "status");
            return (Criteria) this;
        }

        public Criteria andReceiver_addressLikeInsensitive(String value) {
            addCriterion("upper(receiver_address) like", value.toUpperCase(), "receiver_address");
            return (Criteria) this;
        }

        public Criteria andReceiver_mobileLikeInsensitive(String value) {
            addCriterion("upper(receiver_mobile) like", value.toUpperCase(), "receiver_mobile");
            return (Criteria) this;
        }

        public Criteria andReceiverLikeInsensitive(String value) {
            addCriterion("upper(receiver) like", value.toUpperCase(), "receiver");
            return (Criteria) this;
        }

        public Criteria andTransaction_idLikeInsensitive(String value) {
            addCriterion("upper(transaction_id) like", value.toUpperCase(), "transaction_id");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {
        /**
         */
        private TbSeckillOrderExample example;

        /**
         */
        protected Criteria(TbSeckillOrderExample example) {
            super();
            this.example = example;
        }

        /**
         */
        public TbSeckillOrderExample example() {
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