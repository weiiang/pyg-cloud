package com.pyg.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbSellerExample {
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
    public TbSellerExample() {
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
    public TbSellerExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    /**
     */
    public TbSellerExample orderBy(String ... orderByClauses) {
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
        public Criteria andSeller_idEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("seller_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeller_idNotEqualTo(String value) {
            addCriterion("seller_id <>", value, "seller_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSeller_idNotEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("seller_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeller_idGreaterThan(String value) {
            addCriterion("seller_id >", value, "seller_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSeller_idGreaterThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("seller_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeller_idGreaterThanOrEqualTo(String value) {
            addCriterion("seller_id >=", value, "seller_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSeller_idGreaterThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("seller_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeller_idLessThan(String value) {
            addCriterion("seller_id <", value, "seller_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSeller_idLessThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("seller_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeller_idLessThanOrEqualTo(String value) {
            addCriterion("seller_id <=", value, "seller_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSeller_idLessThanOrEqualToColumn(TbSeller.Column column) {
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
        public Criteria andNameEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNameNotEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNameGreaterThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNameGreaterThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNameLessThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNameLessThanOrEqualToColumn(TbSeller.Column column) {
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

        public Criteria andNick_nameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria andNick_nameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNick_nameEqualTo(String value) {
            addCriterion("nick_name =", value, "nick_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNick_nameEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("nick_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNick_nameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nick_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNick_nameNotEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("nick_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNick_nameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nick_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNick_nameGreaterThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("nick_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNick_nameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nick_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNick_nameGreaterThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("nick_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNick_nameLessThan(String value) {
            addCriterion("nick_name <", value, "nick_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNick_nameLessThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("nick_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNick_nameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nick_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNick_nameLessThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("nick_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNick_nameLike(String value) {
            addCriterion("nick_name like", value, "nick_name");
            return (Criteria) this;
        }

        public Criteria andNick_nameNotLike(String value) {
            addCriterion("nick_name not like", value, "nick_name");
            return (Criteria) this;
        }

        public Criteria andNick_nameIn(List<String> values) {
            addCriterion("nick_name in", values, "nick_name");
            return (Criteria) this;
        }

        public Criteria andNick_nameNotIn(List<String> values) {
            addCriterion("nick_name not in", values, "nick_name");
            return (Criteria) this;
        }

        public Criteria andNick_nameBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nick_name");
            return (Criteria) this;
        }

        public Criteria andNick_nameNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nick_name");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPasswordEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("password = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPasswordNotEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("password <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPasswordGreaterThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("password > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPasswordGreaterThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("password >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPasswordLessThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("password < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPasswordLessThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("password <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andEmailEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("email = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andEmailNotEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("email <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andEmailGreaterThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("email > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andEmailGreaterThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("email >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andEmailLessThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("email < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andEmailLessThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("email <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andMobileEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("mobile = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andMobileNotEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("mobile <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andMobileGreaterThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("mobile > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andMobileGreaterThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("mobile >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andMobileLessThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("mobile < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andMobileLessThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("mobile <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTelephoneEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("telephone = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTelephoneNotEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("telephone <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTelephoneGreaterThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("telephone > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTelephoneGreaterThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("telephone >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTelephoneLessThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("telephone < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTelephoneLessThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("telephone <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
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
        public Criteria andStatusEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("status = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusNotEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("status <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusGreaterThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("status > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusGreaterThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("status >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusLessThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("status < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusLessThanOrEqualToColumn(TbSeller.Column column) {
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

        public Criteria andAddress_detailIsNull() {
            addCriterion("address_detail is null");
            return (Criteria) this;
        }

        public Criteria andAddress_detailIsNotNull() {
            addCriterion("address_detail is not null");
            return (Criteria) this;
        }

        public Criteria andAddress_detailEqualTo(String value) {
            addCriterion("address_detail =", value, "address_detail");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAddress_detailEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("address_detail = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddress_detailNotEqualTo(String value) {
            addCriterion("address_detail <>", value, "address_detail");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAddress_detailNotEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("address_detail <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddress_detailGreaterThan(String value) {
            addCriterion("address_detail >", value, "address_detail");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAddress_detailGreaterThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("address_detail > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddress_detailGreaterThanOrEqualTo(String value) {
            addCriterion("address_detail >=", value, "address_detail");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAddress_detailGreaterThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("address_detail >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddress_detailLessThan(String value) {
            addCriterion("address_detail <", value, "address_detail");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAddress_detailLessThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("address_detail < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddress_detailLessThanOrEqualTo(String value) {
            addCriterion("address_detail <=", value, "address_detail");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAddress_detailLessThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("address_detail <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddress_detailLike(String value) {
            addCriterion("address_detail like", value, "address_detail");
            return (Criteria) this;
        }

        public Criteria andAddress_detailNotLike(String value) {
            addCriterion("address_detail not like", value, "address_detail");
            return (Criteria) this;
        }

        public Criteria andAddress_detailIn(List<String> values) {
            addCriterion("address_detail in", values, "address_detail");
            return (Criteria) this;
        }

        public Criteria andAddress_detailNotIn(List<String> values) {
            addCriterion("address_detail not in", values, "address_detail");
            return (Criteria) this;
        }

        public Criteria andAddress_detailBetween(String value1, String value2) {
            addCriterion("address_detail between", value1, value2, "address_detail");
            return (Criteria) this;
        }

        public Criteria andAddress_detailNotBetween(String value1, String value2) {
            addCriterion("address_detail not between", value1, value2, "address_detail");
            return (Criteria) this;
        }

        public Criteria andLinkman_nameIsNull() {
            addCriterion("linkman_name is null");
            return (Criteria) this;
        }

        public Criteria andLinkman_nameIsNotNull() {
            addCriterion("linkman_name is not null");
            return (Criteria) this;
        }

        public Criteria andLinkman_nameEqualTo(String value) {
            addCriterion("linkman_name =", value, "linkman_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLinkman_nameEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("linkman_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLinkman_nameNotEqualTo(String value) {
            addCriterion("linkman_name <>", value, "linkman_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLinkman_nameNotEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("linkman_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLinkman_nameGreaterThan(String value) {
            addCriterion("linkman_name >", value, "linkman_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLinkman_nameGreaterThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("linkman_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLinkman_nameGreaterThanOrEqualTo(String value) {
            addCriterion("linkman_name >=", value, "linkman_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLinkman_nameGreaterThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("linkman_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLinkman_nameLessThan(String value) {
            addCriterion("linkman_name <", value, "linkman_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLinkman_nameLessThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("linkman_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLinkman_nameLessThanOrEqualTo(String value) {
            addCriterion("linkman_name <=", value, "linkman_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLinkman_nameLessThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("linkman_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLinkman_nameLike(String value) {
            addCriterion("linkman_name like", value, "linkman_name");
            return (Criteria) this;
        }

        public Criteria andLinkman_nameNotLike(String value) {
            addCriterion("linkman_name not like", value, "linkman_name");
            return (Criteria) this;
        }

        public Criteria andLinkman_nameIn(List<String> values) {
            addCriterion("linkman_name in", values, "linkman_name");
            return (Criteria) this;
        }

        public Criteria andLinkman_nameNotIn(List<String> values) {
            addCriterion("linkman_name not in", values, "linkman_name");
            return (Criteria) this;
        }

        public Criteria andLinkman_nameBetween(String value1, String value2) {
            addCriterion("linkman_name between", value1, value2, "linkman_name");
            return (Criteria) this;
        }

        public Criteria andLinkman_nameNotBetween(String value1, String value2) {
            addCriterion("linkman_name not between", value1, value2, "linkman_name");
            return (Criteria) this;
        }

        public Criteria andLinkman_qqIsNull() {
            addCriterion("linkman_qq is null");
            return (Criteria) this;
        }

        public Criteria andLinkman_qqIsNotNull() {
            addCriterion("linkman_qq is not null");
            return (Criteria) this;
        }

        public Criteria andLinkman_qqEqualTo(String value) {
            addCriterion("linkman_qq =", value, "linkman_qq");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLinkman_qqEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("linkman_qq = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLinkman_qqNotEqualTo(String value) {
            addCriterion("linkman_qq <>", value, "linkman_qq");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLinkman_qqNotEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("linkman_qq <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLinkman_qqGreaterThan(String value) {
            addCriterion("linkman_qq >", value, "linkman_qq");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLinkman_qqGreaterThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("linkman_qq > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLinkman_qqGreaterThanOrEqualTo(String value) {
            addCriterion("linkman_qq >=", value, "linkman_qq");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLinkman_qqGreaterThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("linkman_qq >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLinkman_qqLessThan(String value) {
            addCriterion("linkman_qq <", value, "linkman_qq");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLinkman_qqLessThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("linkman_qq < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLinkman_qqLessThanOrEqualTo(String value) {
            addCriterion("linkman_qq <=", value, "linkman_qq");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLinkman_qqLessThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("linkman_qq <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLinkman_qqLike(String value) {
            addCriterion("linkman_qq like", value, "linkman_qq");
            return (Criteria) this;
        }

        public Criteria andLinkman_qqNotLike(String value) {
            addCriterion("linkman_qq not like", value, "linkman_qq");
            return (Criteria) this;
        }

        public Criteria andLinkman_qqIn(List<String> values) {
            addCriterion("linkman_qq in", values, "linkman_qq");
            return (Criteria) this;
        }

        public Criteria andLinkman_qqNotIn(List<String> values) {
            addCriterion("linkman_qq not in", values, "linkman_qq");
            return (Criteria) this;
        }

        public Criteria andLinkman_qqBetween(String value1, String value2) {
            addCriterion("linkman_qq between", value1, value2, "linkman_qq");
            return (Criteria) this;
        }

        public Criteria andLinkman_qqNotBetween(String value1, String value2) {
            addCriterion("linkman_qq not between", value1, value2, "linkman_qq");
            return (Criteria) this;
        }

        public Criteria andLinkman_mobileIsNull() {
            addCriterion("linkman_mobile is null");
            return (Criteria) this;
        }

        public Criteria andLinkman_mobileIsNotNull() {
            addCriterion("linkman_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andLinkman_mobileEqualTo(String value) {
            addCriterion("linkman_mobile =", value, "linkman_mobile");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLinkman_mobileEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("linkman_mobile = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLinkman_mobileNotEqualTo(String value) {
            addCriterion("linkman_mobile <>", value, "linkman_mobile");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLinkman_mobileNotEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("linkman_mobile <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLinkman_mobileGreaterThan(String value) {
            addCriterion("linkman_mobile >", value, "linkman_mobile");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLinkman_mobileGreaterThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("linkman_mobile > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLinkman_mobileGreaterThanOrEqualTo(String value) {
            addCriterion("linkman_mobile >=", value, "linkman_mobile");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLinkman_mobileGreaterThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("linkman_mobile >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLinkman_mobileLessThan(String value) {
            addCriterion("linkman_mobile <", value, "linkman_mobile");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLinkman_mobileLessThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("linkman_mobile < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLinkman_mobileLessThanOrEqualTo(String value) {
            addCriterion("linkman_mobile <=", value, "linkman_mobile");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLinkman_mobileLessThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("linkman_mobile <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLinkman_mobileLike(String value) {
            addCriterion("linkman_mobile like", value, "linkman_mobile");
            return (Criteria) this;
        }

        public Criteria andLinkman_mobileNotLike(String value) {
            addCriterion("linkman_mobile not like", value, "linkman_mobile");
            return (Criteria) this;
        }

        public Criteria andLinkman_mobileIn(List<String> values) {
            addCriterion("linkman_mobile in", values, "linkman_mobile");
            return (Criteria) this;
        }

        public Criteria andLinkman_mobileNotIn(List<String> values) {
            addCriterion("linkman_mobile not in", values, "linkman_mobile");
            return (Criteria) this;
        }

        public Criteria andLinkman_mobileBetween(String value1, String value2) {
            addCriterion("linkman_mobile between", value1, value2, "linkman_mobile");
            return (Criteria) this;
        }

        public Criteria andLinkman_mobileNotBetween(String value1, String value2) {
            addCriterion("linkman_mobile not between", value1, value2, "linkman_mobile");
            return (Criteria) this;
        }

        public Criteria andLinkman_emailIsNull() {
            addCriterion("linkman_email is null");
            return (Criteria) this;
        }

        public Criteria andLinkman_emailIsNotNull() {
            addCriterion("linkman_email is not null");
            return (Criteria) this;
        }

        public Criteria andLinkman_emailEqualTo(String value) {
            addCriterion("linkman_email =", value, "linkman_email");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLinkman_emailEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("linkman_email = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLinkman_emailNotEqualTo(String value) {
            addCriterion("linkman_email <>", value, "linkman_email");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLinkman_emailNotEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("linkman_email <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLinkman_emailGreaterThan(String value) {
            addCriterion("linkman_email >", value, "linkman_email");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLinkman_emailGreaterThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("linkman_email > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLinkman_emailGreaterThanOrEqualTo(String value) {
            addCriterion("linkman_email >=", value, "linkman_email");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLinkman_emailGreaterThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("linkman_email >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLinkman_emailLessThan(String value) {
            addCriterion("linkman_email <", value, "linkman_email");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLinkman_emailLessThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("linkman_email < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLinkman_emailLessThanOrEqualTo(String value) {
            addCriterion("linkman_email <=", value, "linkman_email");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLinkman_emailLessThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("linkman_email <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLinkman_emailLike(String value) {
            addCriterion("linkman_email like", value, "linkman_email");
            return (Criteria) this;
        }

        public Criteria andLinkman_emailNotLike(String value) {
            addCriterion("linkman_email not like", value, "linkman_email");
            return (Criteria) this;
        }

        public Criteria andLinkman_emailIn(List<String> values) {
            addCriterion("linkman_email in", values, "linkman_email");
            return (Criteria) this;
        }

        public Criteria andLinkman_emailNotIn(List<String> values) {
            addCriterion("linkman_email not in", values, "linkman_email");
            return (Criteria) this;
        }

        public Criteria andLinkman_emailBetween(String value1, String value2) {
            addCriterion("linkman_email between", value1, value2, "linkman_email");
            return (Criteria) this;
        }

        public Criteria andLinkman_emailNotBetween(String value1, String value2) {
            addCriterion("linkman_email not between", value1, value2, "linkman_email");
            return (Criteria) this;
        }

        public Criteria andLicense_numberIsNull() {
            addCriterion("license_number is null");
            return (Criteria) this;
        }

        public Criteria andLicense_numberIsNotNull() {
            addCriterion("license_number is not null");
            return (Criteria) this;
        }

        public Criteria andLicense_numberEqualTo(String value) {
            addCriterion("license_number =", value, "license_number");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLicense_numberEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("license_number = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLicense_numberNotEqualTo(String value) {
            addCriterion("license_number <>", value, "license_number");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLicense_numberNotEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("license_number <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLicense_numberGreaterThan(String value) {
            addCriterion("license_number >", value, "license_number");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLicense_numberGreaterThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("license_number > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLicense_numberGreaterThanOrEqualTo(String value) {
            addCriterion("license_number >=", value, "license_number");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLicense_numberGreaterThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("license_number >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLicense_numberLessThan(String value) {
            addCriterion("license_number <", value, "license_number");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLicense_numberLessThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("license_number < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLicense_numberLessThanOrEqualTo(String value) {
            addCriterion("license_number <=", value, "license_number");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLicense_numberLessThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("license_number <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLicense_numberLike(String value) {
            addCriterion("license_number like", value, "license_number");
            return (Criteria) this;
        }

        public Criteria andLicense_numberNotLike(String value) {
            addCriterion("license_number not like", value, "license_number");
            return (Criteria) this;
        }

        public Criteria andLicense_numberIn(List<String> values) {
            addCriterion("license_number in", values, "license_number");
            return (Criteria) this;
        }

        public Criteria andLicense_numberNotIn(List<String> values) {
            addCriterion("license_number not in", values, "license_number");
            return (Criteria) this;
        }

        public Criteria andLicense_numberBetween(String value1, String value2) {
            addCriterion("license_number between", value1, value2, "license_number");
            return (Criteria) this;
        }

        public Criteria andLicense_numberNotBetween(String value1, String value2) {
            addCriterion("license_number not between", value1, value2, "license_number");
            return (Criteria) this;
        }

        public Criteria andTax_numberIsNull() {
            addCriterion("tax_number is null");
            return (Criteria) this;
        }

        public Criteria andTax_numberIsNotNull() {
            addCriterion("tax_number is not null");
            return (Criteria) this;
        }

        public Criteria andTax_numberEqualTo(String value) {
            addCriterion("tax_number =", value, "tax_number");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTax_numberEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("tax_number = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTax_numberNotEqualTo(String value) {
            addCriterion("tax_number <>", value, "tax_number");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTax_numberNotEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("tax_number <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTax_numberGreaterThan(String value) {
            addCriterion("tax_number >", value, "tax_number");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTax_numberGreaterThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("tax_number > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTax_numberGreaterThanOrEqualTo(String value) {
            addCriterion("tax_number >=", value, "tax_number");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTax_numberGreaterThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("tax_number >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTax_numberLessThan(String value) {
            addCriterion("tax_number <", value, "tax_number");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTax_numberLessThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("tax_number < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTax_numberLessThanOrEqualTo(String value) {
            addCriterion("tax_number <=", value, "tax_number");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTax_numberLessThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("tax_number <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTax_numberLike(String value) {
            addCriterion("tax_number like", value, "tax_number");
            return (Criteria) this;
        }

        public Criteria andTax_numberNotLike(String value) {
            addCriterion("tax_number not like", value, "tax_number");
            return (Criteria) this;
        }

        public Criteria andTax_numberIn(List<String> values) {
            addCriterion("tax_number in", values, "tax_number");
            return (Criteria) this;
        }

        public Criteria andTax_numberNotIn(List<String> values) {
            addCriterion("tax_number not in", values, "tax_number");
            return (Criteria) this;
        }

        public Criteria andTax_numberBetween(String value1, String value2) {
            addCriterion("tax_number between", value1, value2, "tax_number");
            return (Criteria) this;
        }

        public Criteria andTax_numberNotBetween(String value1, String value2) {
            addCriterion("tax_number not between", value1, value2, "tax_number");
            return (Criteria) this;
        }

        public Criteria andOrg_numberIsNull() {
            addCriterion("org_number is null");
            return (Criteria) this;
        }

        public Criteria andOrg_numberIsNotNull() {
            addCriterion("org_number is not null");
            return (Criteria) this;
        }

        public Criteria andOrg_numberEqualTo(String value) {
            addCriterion("org_number =", value, "org_number");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOrg_numberEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("org_number = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrg_numberNotEqualTo(String value) {
            addCriterion("org_number <>", value, "org_number");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOrg_numberNotEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("org_number <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrg_numberGreaterThan(String value) {
            addCriterion("org_number >", value, "org_number");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOrg_numberGreaterThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("org_number > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrg_numberGreaterThanOrEqualTo(String value) {
            addCriterion("org_number >=", value, "org_number");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOrg_numberGreaterThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("org_number >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrg_numberLessThan(String value) {
            addCriterion("org_number <", value, "org_number");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOrg_numberLessThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("org_number < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrg_numberLessThanOrEqualTo(String value) {
            addCriterion("org_number <=", value, "org_number");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOrg_numberLessThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("org_number <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrg_numberLike(String value) {
            addCriterion("org_number like", value, "org_number");
            return (Criteria) this;
        }

        public Criteria andOrg_numberNotLike(String value) {
            addCriterion("org_number not like", value, "org_number");
            return (Criteria) this;
        }

        public Criteria andOrg_numberIn(List<String> values) {
            addCriterion("org_number in", values, "org_number");
            return (Criteria) this;
        }

        public Criteria andOrg_numberNotIn(List<String> values) {
            addCriterion("org_number not in", values, "org_number");
            return (Criteria) this;
        }

        public Criteria andOrg_numberBetween(String value1, String value2) {
            addCriterion("org_number between", value1, value2, "org_number");
            return (Criteria) this;
        }

        public Criteria andOrg_numberNotBetween(String value1, String value2) {
            addCriterion("org_number not between", value1, value2, "org_number");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(Long value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAddressEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("address = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(Long value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAddressNotEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("address <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(Long value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAddressGreaterThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("address > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(Long value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAddressGreaterThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("address >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(Long value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAddressLessThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("address < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(Long value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAddressLessThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("address <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<Long> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<Long> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(Long value1, Long value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(Long value1, Long value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andLogo_picIsNull() {
            addCriterion("logo_pic is null");
            return (Criteria) this;
        }

        public Criteria andLogo_picIsNotNull() {
            addCriterion("logo_pic is not null");
            return (Criteria) this;
        }

        public Criteria andLogo_picEqualTo(String value) {
            addCriterion("logo_pic =", value, "logo_pic");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLogo_picEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("logo_pic = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLogo_picNotEqualTo(String value) {
            addCriterion("logo_pic <>", value, "logo_pic");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLogo_picNotEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("logo_pic <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLogo_picGreaterThan(String value) {
            addCriterion("logo_pic >", value, "logo_pic");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLogo_picGreaterThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("logo_pic > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLogo_picGreaterThanOrEqualTo(String value) {
            addCriterion("logo_pic >=", value, "logo_pic");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLogo_picGreaterThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("logo_pic >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLogo_picLessThan(String value) {
            addCriterion("logo_pic <", value, "logo_pic");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLogo_picLessThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("logo_pic < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLogo_picLessThanOrEqualTo(String value) {
            addCriterion("logo_pic <=", value, "logo_pic");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLogo_picLessThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("logo_pic <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLogo_picLike(String value) {
            addCriterion("logo_pic like", value, "logo_pic");
            return (Criteria) this;
        }

        public Criteria andLogo_picNotLike(String value) {
            addCriterion("logo_pic not like", value, "logo_pic");
            return (Criteria) this;
        }

        public Criteria andLogo_picIn(List<String> values) {
            addCriterion("logo_pic in", values, "logo_pic");
            return (Criteria) this;
        }

        public Criteria andLogo_picNotIn(List<String> values) {
            addCriterion("logo_pic not in", values, "logo_pic");
            return (Criteria) this;
        }

        public Criteria andLogo_picBetween(String value1, String value2) {
            addCriterion("logo_pic between", value1, value2, "logo_pic");
            return (Criteria) this;
        }

        public Criteria andLogo_picNotBetween(String value1, String value2) {
            addCriterion("logo_pic not between", value1, value2, "logo_pic");
            return (Criteria) this;
        }

        public Criteria andBriefIsNull() {
            addCriterion("brief is null");
            return (Criteria) this;
        }

        public Criteria andBriefIsNotNull() {
            addCriterion("brief is not null");
            return (Criteria) this;
        }

        public Criteria andBriefEqualTo(String value) {
            addCriterion("brief =", value, "brief");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBriefEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("brief = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBriefNotEqualTo(String value) {
            addCriterion("brief <>", value, "brief");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBriefNotEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("brief <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBriefGreaterThan(String value) {
            addCriterion("brief >", value, "brief");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBriefGreaterThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("brief > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBriefGreaterThanOrEqualTo(String value) {
            addCriterion("brief >=", value, "brief");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBriefGreaterThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("brief >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBriefLessThan(String value) {
            addCriterion("brief <", value, "brief");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBriefLessThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("brief < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBriefLessThanOrEqualTo(String value) {
            addCriterion("brief <=", value, "brief");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBriefLessThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("brief <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBriefLike(String value) {
            addCriterion("brief like", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotLike(String value) {
            addCriterion("brief not like", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefIn(List<String> values) {
            addCriterion("brief in", values, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotIn(List<String> values) {
            addCriterion("brief not in", values, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefBetween(String value1, String value2) {
            addCriterion("brief between", value1, value2, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotBetween(String value1, String value2) {
            addCriterion("brief not between", value1, value2, "brief");
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
        public Criteria andCreate_timeEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("create_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreate_timeNotEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("create_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterion("create_time >", value, "create_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreate_timeGreaterThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("create_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreate_timeGreaterThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("create_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterion("create_time <", value, "create_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreate_timeLessThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("create_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreate_timeLessThanOrEqualToColumn(TbSeller.Column column) {
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

        public Criteria andLegal_personIsNull() {
            addCriterion("legal_person is null");
            return (Criteria) this;
        }

        public Criteria andLegal_personIsNotNull() {
            addCriterion("legal_person is not null");
            return (Criteria) this;
        }

        public Criteria andLegal_personEqualTo(String value) {
            addCriterion("legal_person =", value, "legal_person");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLegal_personEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("legal_person = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLegal_personNotEqualTo(String value) {
            addCriterion("legal_person <>", value, "legal_person");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLegal_personNotEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("legal_person <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLegal_personGreaterThan(String value) {
            addCriterion("legal_person >", value, "legal_person");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLegal_personGreaterThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("legal_person > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLegal_personGreaterThanOrEqualTo(String value) {
            addCriterion("legal_person >=", value, "legal_person");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLegal_personGreaterThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("legal_person >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLegal_personLessThan(String value) {
            addCriterion("legal_person <", value, "legal_person");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLegal_personLessThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("legal_person < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLegal_personLessThanOrEqualTo(String value) {
            addCriterion("legal_person <=", value, "legal_person");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLegal_personLessThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("legal_person <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLegal_personLike(String value) {
            addCriterion("legal_person like", value, "legal_person");
            return (Criteria) this;
        }

        public Criteria andLegal_personNotLike(String value) {
            addCriterion("legal_person not like", value, "legal_person");
            return (Criteria) this;
        }

        public Criteria andLegal_personIn(List<String> values) {
            addCriterion("legal_person in", values, "legal_person");
            return (Criteria) this;
        }

        public Criteria andLegal_personNotIn(List<String> values) {
            addCriterion("legal_person not in", values, "legal_person");
            return (Criteria) this;
        }

        public Criteria andLegal_personBetween(String value1, String value2) {
            addCriterion("legal_person between", value1, value2, "legal_person");
            return (Criteria) this;
        }

        public Criteria andLegal_personNotBetween(String value1, String value2) {
            addCriterion("legal_person not between", value1, value2, "legal_person");
            return (Criteria) this;
        }

        public Criteria andLegal_person_card_idIsNull() {
            addCriterion("legal_person_card_id is null");
            return (Criteria) this;
        }

        public Criteria andLegal_person_card_idIsNotNull() {
            addCriterion("legal_person_card_id is not null");
            return (Criteria) this;
        }

        public Criteria andLegal_person_card_idEqualTo(String value) {
            addCriterion("legal_person_card_id =", value, "legal_person_card_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLegal_person_card_idEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("legal_person_card_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLegal_person_card_idNotEqualTo(String value) {
            addCriterion("legal_person_card_id <>", value, "legal_person_card_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLegal_person_card_idNotEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("legal_person_card_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLegal_person_card_idGreaterThan(String value) {
            addCriterion("legal_person_card_id >", value, "legal_person_card_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLegal_person_card_idGreaterThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("legal_person_card_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLegal_person_card_idGreaterThanOrEqualTo(String value) {
            addCriterion("legal_person_card_id >=", value, "legal_person_card_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLegal_person_card_idGreaterThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("legal_person_card_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLegal_person_card_idLessThan(String value) {
            addCriterion("legal_person_card_id <", value, "legal_person_card_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLegal_person_card_idLessThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("legal_person_card_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLegal_person_card_idLessThanOrEqualTo(String value) {
            addCriterion("legal_person_card_id <=", value, "legal_person_card_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLegal_person_card_idLessThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("legal_person_card_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLegal_person_card_idLike(String value) {
            addCriterion("legal_person_card_id like", value, "legal_person_card_id");
            return (Criteria) this;
        }

        public Criteria andLegal_person_card_idNotLike(String value) {
            addCriterion("legal_person_card_id not like", value, "legal_person_card_id");
            return (Criteria) this;
        }

        public Criteria andLegal_person_card_idIn(List<String> values) {
            addCriterion("legal_person_card_id in", values, "legal_person_card_id");
            return (Criteria) this;
        }

        public Criteria andLegal_person_card_idNotIn(List<String> values) {
            addCriterion("legal_person_card_id not in", values, "legal_person_card_id");
            return (Criteria) this;
        }

        public Criteria andLegal_person_card_idBetween(String value1, String value2) {
            addCriterion("legal_person_card_id between", value1, value2, "legal_person_card_id");
            return (Criteria) this;
        }

        public Criteria andLegal_person_card_idNotBetween(String value1, String value2) {
            addCriterion("legal_person_card_id not between", value1, value2, "legal_person_card_id");
            return (Criteria) this;
        }

        public Criteria andBank_userIsNull() {
            addCriterion("bank_user is null");
            return (Criteria) this;
        }

        public Criteria andBank_userIsNotNull() {
            addCriterion("bank_user is not null");
            return (Criteria) this;
        }

        public Criteria andBank_userEqualTo(String value) {
            addCriterion("bank_user =", value, "bank_user");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBank_userEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("bank_user = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBank_userNotEqualTo(String value) {
            addCriterion("bank_user <>", value, "bank_user");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBank_userNotEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("bank_user <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBank_userGreaterThan(String value) {
            addCriterion("bank_user >", value, "bank_user");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBank_userGreaterThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("bank_user > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBank_userGreaterThanOrEqualTo(String value) {
            addCriterion("bank_user >=", value, "bank_user");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBank_userGreaterThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("bank_user >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBank_userLessThan(String value) {
            addCriterion("bank_user <", value, "bank_user");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBank_userLessThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("bank_user < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBank_userLessThanOrEqualTo(String value) {
            addCriterion("bank_user <=", value, "bank_user");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBank_userLessThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("bank_user <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBank_userLike(String value) {
            addCriterion("bank_user like", value, "bank_user");
            return (Criteria) this;
        }

        public Criteria andBank_userNotLike(String value) {
            addCriterion("bank_user not like", value, "bank_user");
            return (Criteria) this;
        }

        public Criteria andBank_userIn(List<String> values) {
            addCriterion("bank_user in", values, "bank_user");
            return (Criteria) this;
        }

        public Criteria andBank_userNotIn(List<String> values) {
            addCriterion("bank_user not in", values, "bank_user");
            return (Criteria) this;
        }

        public Criteria andBank_userBetween(String value1, String value2) {
            addCriterion("bank_user between", value1, value2, "bank_user");
            return (Criteria) this;
        }

        public Criteria andBank_userNotBetween(String value1, String value2) {
            addCriterion("bank_user not between", value1, value2, "bank_user");
            return (Criteria) this;
        }

        public Criteria andBank_nameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBank_nameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBank_nameEqualTo(String value) {
            addCriterion("bank_name =", value, "bank_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBank_nameEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("bank_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBank_nameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bank_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBank_nameNotEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("bank_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBank_nameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bank_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBank_nameGreaterThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("bank_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBank_nameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bank_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBank_nameGreaterThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("bank_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBank_nameLessThan(String value) {
            addCriterion("bank_name <", value, "bank_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBank_nameLessThanColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("bank_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBank_nameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bank_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBank_nameLessThanOrEqualToColumn(TbSeller.Column column) {
            addCriterion(new StringBuilder("bank_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBank_nameLike(String value) {
            addCriterion("bank_name like", value, "bank_name");
            return (Criteria) this;
        }

        public Criteria andBank_nameNotLike(String value) {
            addCriterion("bank_name not like", value, "bank_name");
            return (Criteria) this;
        }

        public Criteria andBank_nameIn(List<String> values) {
            addCriterion("bank_name in", values, "bank_name");
            return (Criteria) this;
        }

        public Criteria andBank_nameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bank_name");
            return (Criteria) this;
        }

        public Criteria andBank_nameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bank_name");
            return (Criteria) this;
        }

        public Criteria andBank_nameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bank_name");
            return (Criteria) this;
        }

        public Criteria andSeller_idLikeInsensitive(String value) {
            addCriterion("upper(seller_id) like", value.toUpperCase(), "seller_id");
            return (Criteria) this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(name) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andNick_nameLikeInsensitive(String value) {
            addCriterion("upper(nick_name) like", value.toUpperCase(), "nick_name");
            return (Criteria) this;
        }

        public Criteria andPasswordLikeInsensitive(String value) {
            addCriterion("upper(password) like", value.toUpperCase(), "password");
            return (Criteria) this;
        }

        public Criteria andEmailLikeInsensitive(String value) {
            addCriterion("upper(email) like", value.toUpperCase(), "email");
            return (Criteria) this;
        }

        public Criteria andMobileLikeInsensitive(String value) {
            addCriterion("upper(mobile) like", value.toUpperCase(), "mobile");
            return (Criteria) this;
        }

        public Criteria andTelephoneLikeInsensitive(String value) {
            addCriterion("upper(telephone) like", value.toUpperCase(), "telephone");
            return (Criteria) this;
        }

        public Criteria andStatusLikeInsensitive(String value) {
            addCriterion("upper(status) like", value.toUpperCase(), "status");
            return (Criteria) this;
        }

        public Criteria andAddress_detailLikeInsensitive(String value) {
            addCriterion("upper(address_detail) like", value.toUpperCase(), "address_detail");
            return (Criteria) this;
        }

        public Criteria andLinkman_nameLikeInsensitive(String value) {
            addCriterion("upper(linkman_name) like", value.toUpperCase(), "linkman_name");
            return (Criteria) this;
        }

        public Criteria andLinkman_qqLikeInsensitive(String value) {
            addCriterion("upper(linkman_qq) like", value.toUpperCase(), "linkman_qq");
            return (Criteria) this;
        }

        public Criteria andLinkman_mobileLikeInsensitive(String value) {
            addCriterion("upper(linkman_mobile) like", value.toUpperCase(), "linkman_mobile");
            return (Criteria) this;
        }

        public Criteria andLinkman_emailLikeInsensitive(String value) {
            addCriterion("upper(linkman_email) like", value.toUpperCase(), "linkman_email");
            return (Criteria) this;
        }

        public Criteria andLicense_numberLikeInsensitive(String value) {
            addCriterion("upper(license_number) like", value.toUpperCase(), "license_number");
            return (Criteria) this;
        }

        public Criteria andTax_numberLikeInsensitive(String value) {
            addCriterion("upper(tax_number) like", value.toUpperCase(), "tax_number");
            return (Criteria) this;
        }

        public Criteria andOrg_numberLikeInsensitive(String value) {
            addCriterion("upper(org_number) like", value.toUpperCase(), "org_number");
            return (Criteria) this;
        }

        public Criteria andLogo_picLikeInsensitive(String value) {
            addCriterion("upper(logo_pic) like", value.toUpperCase(), "logo_pic");
            return (Criteria) this;
        }

        public Criteria andBriefLikeInsensitive(String value) {
            addCriterion("upper(brief) like", value.toUpperCase(), "brief");
            return (Criteria) this;
        }

        public Criteria andLegal_personLikeInsensitive(String value) {
            addCriterion("upper(legal_person) like", value.toUpperCase(), "legal_person");
            return (Criteria) this;
        }

        public Criteria andLegal_person_card_idLikeInsensitive(String value) {
            addCriterion("upper(legal_person_card_id) like", value.toUpperCase(), "legal_person_card_id");
            return (Criteria) this;
        }

        public Criteria andBank_userLikeInsensitive(String value) {
            addCriterion("upper(bank_user) like", value.toUpperCase(), "bank_user");
            return (Criteria) this;
        }

        public Criteria andBank_nameLikeInsensitive(String value) {
            addCriterion("upper(bank_name) like", value.toUpperCase(), "bank_name");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {
        /**
         */
        private TbSellerExample example;

        /**
         */
        protected Criteria(TbSellerExample example) {
            super();
            this.example = example;
        }

        /**
         */
        public TbSellerExample example() {
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