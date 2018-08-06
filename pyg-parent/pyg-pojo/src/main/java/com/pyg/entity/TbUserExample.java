package com.pyg.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbUserExample {
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
    public TbUserExample() {
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
    public TbUserExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    /**
     */
    public TbUserExample orderBy(String ... orderByClauses) {
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
        public Criteria andIdEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdNotEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdGreaterThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdGreaterThanOrEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdLessThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdLessThanOrEqualToColumn(TbUser.Column column) {
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUsernameEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("username = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUsernameNotEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("username <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUsernameGreaterThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("username > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUsernameGreaterThanOrEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("username >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUsernameLessThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("username < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUsernameLessThanOrEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("username <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
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
        public Criteria andPasswordEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("password = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPasswordNotEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("password <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPasswordGreaterThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("password > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPasswordGreaterThanOrEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("password >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPasswordLessThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("password < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPasswordLessThanOrEqualToColumn(TbUser.Column column) {
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

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPhoneEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("phone = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPhoneNotEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("phone <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPhoneGreaterThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("phone > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPhoneGreaterThanOrEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("phone >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPhoneLessThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("phone < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPhoneLessThanOrEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("phone <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
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
        public Criteria andEmailEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("email = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andEmailNotEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("email <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andEmailGreaterThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("email > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andEmailGreaterThanOrEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("email >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andEmailLessThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("email < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andEmailLessThanOrEqualToColumn(TbUser.Column column) {
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

        public Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Date value) {
            addCriterion("created =", value, "created");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreatedEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("created = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Date value) {
            addCriterion("created <>", value, "created");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreatedNotEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("created <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Date value) {
            addCriterion("created >", value, "created");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreatedGreaterThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("created > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("created >=", value, "created");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreatedGreaterThanOrEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("created >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Date value) {
            addCriterion("created <", value, "created");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreatedLessThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("created < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Date value) {
            addCriterion("created <=", value, "created");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreatedLessThanOrEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("created <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Date> values) {
            addCriterion("created in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Date> values) {
            addCriterion("created not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Date value1, Date value2) {
            addCriterion("created between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Date value1, Date value2) {
            addCriterion("created not between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNull() {
            addCriterion("updated is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNotNull() {
            addCriterion("updated is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedEqualTo(Date value) {
            addCriterion("updated =", value, "updated");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUpdatedEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("updated = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedNotEqualTo(Date value) {
            addCriterion("updated <>", value, "updated");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUpdatedNotEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("updated <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThan(Date value) {
            addCriterion("updated >", value, "updated");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUpdatedGreaterThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("updated > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("updated >=", value, "updated");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUpdatedGreaterThanOrEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("updated >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThan(Date value) {
            addCriterion("updated <", value, "updated");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUpdatedLessThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("updated < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("updated <=", value, "updated");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUpdatedLessThanOrEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("updated <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedIn(List<Date> values) {
            addCriterion("updated in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotIn(List<Date> values) {
            addCriterion("updated not in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedBetween(Date value1, Date value2) {
            addCriterion("updated between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("updated not between", value1, value2, "updated");
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
        public Criteria andSource_typeEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("source_type = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSource_typeNotEqualTo(String value) {
            addCriterion("source_type <>", value, "source_type");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSource_typeNotEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("source_type <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSource_typeGreaterThan(String value) {
            addCriterion("source_type >", value, "source_type");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSource_typeGreaterThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("source_type > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSource_typeGreaterThanOrEqualTo(String value) {
            addCriterion("source_type >=", value, "source_type");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSource_typeGreaterThanOrEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("source_type >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSource_typeLessThan(String value) {
            addCriterion("source_type <", value, "source_type");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSource_typeLessThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("source_type < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSource_typeLessThanOrEqualTo(String value) {
            addCriterion("source_type <=", value, "source_type");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSource_typeLessThanOrEqualToColumn(TbUser.Column column) {
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
        public Criteria andNick_nameEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("nick_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNick_nameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nick_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNick_nameNotEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("nick_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNick_nameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nick_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNick_nameGreaterThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("nick_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNick_nameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nick_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNick_nameGreaterThanOrEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("nick_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNick_nameLessThan(String value) {
            addCriterion("nick_name <", value, "nick_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNick_nameLessThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("nick_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNick_nameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nick_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNick_nameLessThanOrEqualToColumn(TbUser.Column column) {
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
        public Criteria andNameEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNameNotEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNameGreaterThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNameGreaterThanOrEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNameLessThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNameLessThanOrEqualToColumn(TbUser.Column column) {
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
        public Criteria andStatusEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("status = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusNotEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("status <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusGreaterThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("status > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusGreaterThanOrEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("status >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusLessThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("status < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusLessThanOrEqualToColumn(TbUser.Column column) {
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

        public Criteria andHead_picIsNull() {
            addCriterion("head_pic is null");
            return (Criteria) this;
        }

        public Criteria andHead_picIsNotNull() {
            addCriterion("head_pic is not null");
            return (Criteria) this;
        }

        public Criteria andHead_picEqualTo(String value) {
            addCriterion("head_pic =", value, "head_pic");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andHead_picEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("head_pic = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHead_picNotEqualTo(String value) {
            addCriterion("head_pic <>", value, "head_pic");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andHead_picNotEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("head_pic <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHead_picGreaterThan(String value) {
            addCriterion("head_pic >", value, "head_pic");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andHead_picGreaterThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("head_pic > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHead_picGreaterThanOrEqualTo(String value) {
            addCriterion("head_pic >=", value, "head_pic");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andHead_picGreaterThanOrEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("head_pic >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHead_picLessThan(String value) {
            addCriterion("head_pic <", value, "head_pic");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andHead_picLessThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("head_pic < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHead_picLessThanOrEqualTo(String value) {
            addCriterion("head_pic <=", value, "head_pic");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andHead_picLessThanOrEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("head_pic <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHead_picLike(String value) {
            addCriterion("head_pic like", value, "head_pic");
            return (Criteria) this;
        }

        public Criteria andHead_picNotLike(String value) {
            addCriterion("head_pic not like", value, "head_pic");
            return (Criteria) this;
        }

        public Criteria andHead_picIn(List<String> values) {
            addCriterion("head_pic in", values, "head_pic");
            return (Criteria) this;
        }

        public Criteria andHead_picNotIn(List<String> values) {
            addCriterion("head_pic not in", values, "head_pic");
            return (Criteria) this;
        }

        public Criteria andHead_picBetween(String value1, String value2) {
            addCriterion("head_pic between", value1, value2, "head_pic");
            return (Criteria) this;
        }

        public Criteria andHead_picNotBetween(String value1, String value2) {
            addCriterion("head_pic not between", value1, value2, "head_pic");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andQqEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("qq = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andQqNotEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("qq <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andQqGreaterThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("qq > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andQqGreaterThanOrEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("qq >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andQqLessThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("qq < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andQqLessThanOrEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("qq <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andAccount_balanceIsNull() {
            addCriterion("account_balance is null");
            return (Criteria) this;
        }

        public Criteria andAccount_balanceIsNotNull() {
            addCriterion("account_balance is not null");
            return (Criteria) this;
        }

        public Criteria andAccount_balanceEqualTo(Long value) {
            addCriterion("account_balance =", value, "account_balance");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAccount_balanceEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("account_balance = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAccount_balanceNotEqualTo(Long value) {
            addCriterion("account_balance <>", value, "account_balance");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAccount_balanceNotEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("account_balance <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAccount_balanceGreaterThan(Long value) {
            addCriterion("account_balance >", value, "account_balance");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAccount_balanceGreaterThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("account_balance > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAccount_balanceGreaterThanOrEqualTo(Long value) {
            addCriterion("account_balance >=", value, "account_balance");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAccount_balanceGreaterThanOrEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("account_balance >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAccount_balanceLessThan(Long value) {
            addCriterion("account_balance <", value, "account_balance");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAccount_balanceLessThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("account_balance < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAccount_balanceLessThanOrEqualTo(Long value) {
            addCriterion("account_balance <=", value, "account_balance");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAccount_balanceLessThanOrEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("account_balance <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAccount_balanceIn(List<Long> values) {
            addCriterion("account_balance in", values, "account_balance");
            return (Criteria) this;
        }

        public Criteria andAccount_balanceNotIn(List<Long> values) {
            addCriterion("account_balance not in", values, "account_balance");
            return (Criteria) this;
        }

        public Criteria andAccount_balanceBetween(Long value1, Long value2) {
            addCriterion("account_balance between", value1, value2, "account_balance");
            return (Criteria) this;
        }

        public Criteria andAccount_balanceNotBetween(Long value1, Long value2) {
            addCriterion("account_balance not between", value1, value2, "account_balance");
            return (Criteria) this;
        }

        public Criteria andIs_mobile_checkIsNull() {
            addCriterion("is_mobile_check is null");
            return (Criteria) this;
        }

        public Criteria andIs_mobile_checkIsNotNull() {
            addCriterion("is_mobile_check is not null");
            return (Criteria) this;
        }

        public Criteria andIs_mobile_checkEqualTo(String value) {
            addCriterion("is_mobile_check =", value, "is_mobile_check");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIs_mobile_checkEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("is_mobile_check = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_mobile_checkNotEqualTo(String value) {
            addCriterion("is_mobile_check <>", value, "is_mobile_check");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIs_mobile_checkNotEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("is_mobile_check <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_mobile_checkGreaterThan(String value) {
            addCriterion("is_mobile_check >", value, "is_mobile_check");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIs_mobile_checkGreaterThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("is_mobile_check > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_mobile_checkGreaterThanOrEqualTo(String value) {
            addCriterion("is_mobile_check >=", value, "is_mobile_check");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIs_mobile_checkGreaterThanOrEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("is_mobile_check >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_mobile_checkLessThan(String value) {
            addCriterion("is_mobile_check <", value, "is_mobile_check");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIs_mobile_checkLessThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("is_mobile_check < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_mobile_checkLessThanOrEqualTo(String value) {
            addCriterion("is_mobile_check <=", value, "is_mobile_check");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIs_mobile_checkLessThanOrEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("is_mobile_check <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_mobile_checkLike(String value) {
            addCriterion("is_mobile_check like", value, "is_mobile_check");
            return (Criteria) this;
        }

        public Criteria andIs_mobile_checkNotLike(String value) {
            addCriterion("is_mobile_check not like", value, "is_mobile_check");
            return (Criteria) this;
        }

        public Criteria andIs_mobile_checkIn(List<String> values) {
            addCriterion("is_mobile_check in", values, "is_mobile_check");
            return (Criteria) this;
        }

        public Criteria andIs_mobile_checkNotIn(List<String> values) {
            addCriterion("is_mobile_check not in", values, "is_mobile_check");
            return (Criteria) this;
        }

        public Criteria andIs_mobile_checkBetween(String value1, String value2) {
            addCriterion("is_mobile_check between", value1, value2, "is_mobile_check");
            return (Criteria) this;
        }

        public Criteria andIs_mobile_checkNotBetween(String value1, String value2) {
            addCriterion("is_mobile_check not between", value1, value2, "is_mobile_check");
            return (Criteria) this;
        }

        public Criteria andIs_email_checkIsNull() {
            addCriterion("is_email_check is null");
            return (Criteria) this;
        }

        public Criteria andIs_email_checkIsNotNull() {
            addCriterion("is_email_check is not null");
            return (Criteria) this;
        }

        public Criteria andIs_email_checkEqualTo(String value) {
            addCriterion("is_email_check =", value, "is_email_check");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIs_email_checkEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("is_email_check = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_email_checkNotEqualTo(String value) {
            addCriterion("is_email_check <>", value, "is_email_check");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIs_email_checkNotEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("is_email_check <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_email_checkGreaterThan(String value) {
            addCriterion("is_email_check >", value, "is_email_check");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIs_email_checkGreaterThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("is_email_check > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_email_checkGreaterThanOrEqualTo(String value) {
            addCriterion("is_email_check >=", value, "is_email_check");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIs_email_checkGreaterThanOrEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("is_email_check >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_email_checkLessThan(String value) {
            addCriterion("is_email_check <", value, "is_email_check");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIs_email_checkLessThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("is_email_check < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_email_checkLessThanOrEqualTo(String value) {
            addCriterion("is_email_check <=", value, "is_email_check");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIs_email_checkLessThanOrEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("is_email_check <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_email_checkLike(String value) {
            addCriterion("is_email_check like", value, "is_email_check");
            return (Criteria) this;
        }

        public Criteria andIs_email_checkNotLike(String value) {
            addCriterion("is_email_check not like", value, "is_email_check");
            return (Criteria) this;
        }

        public Criteria andIs_email_checkIn(List<String> values) {
            addCriterion("is_email_check in", values, "is_email_check");
            return (Criteria) this;
        }

        public Criteria andIs_email_checkNotIn(List<String> values) {
            addCriterion("is_email_check not in", values, "is_email_check");
            return (Criteria) this;
        }

        public Criteria andIs_email_checkBetween(String value1, String value2) {
            addCriterion("is_email_check between", value1, value2, "is_email_check");
            return (Criteria) this;
        }

        public Criteria andIs_email_checkNotBetween(String value1, String value2) {
            addCriterion("is_email_check not between", value1, value2, "is_email_check");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSexEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("sex = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSexNotEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("sex <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSexGreaterThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("sex > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSexGreaterThanOrEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("sex >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSexLessThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("sex < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSexLessThanOrEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("sex <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andUser_levelIsNull() {
            addCriterion("user_level is null");
            return (Criteria) this;
        }

        public Criteria andUser_levelIsNotNull() {
            addCriterion("user_level is not null");
            return (Criteria) this;
        }

        public Criteria andUser_levelEqualTo(Integer value) {
            addCriterion("user_level =", value, "user_level");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUser_levelEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("user_level = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_levelNotEqualTo(Integer value) {
            addCriterion("user_level <>", value, "user_level");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUser_levelNotEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("user_level <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_levelGreaterThan(Integer value) {
            addCriterion("user_level >", value, "user_level");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUser_levelGreaterThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("user_level > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_levelGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_level >=", value, "user_level");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUser_levelGreaterThanOrEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("user_level >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_levelLessThan(Integer value) {
            addCriterion("user_level <", value, "user_level");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUser_levelLessThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("user_level < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_levelLessThanOrEqualTo(Integer value) {
            addCriterion("user_level <=", value, "user_level");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUser_levelLessThanOrEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("user_level <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_levelIn(List<Integer> values) {
            addCriterion("user_level in", values, "user_level");
            return (Criteria) this;
        }

        public Criteria andUser_levelNotIn(List<Integer> values) {
            addCriterion("user_level not in", values, "user_level");
            return (Criteria) this;
        }

        public Criteria andUser_levelBetween(Integer value1, Integer value2) {
            addCriterion("user_level between", value1, value2, "user_level");
            return (Criteria) this;
        }

        public Criteria andUser_levelNotBetween(Integer value1, Integer value2) {
            addCriterion("user_level not between", value1, value2, "user_level");
            return (Criteria) this;
        }

        public Criteria andPointsIsNull() {
            addCriterion("points is null");
            return (Criteria) this;
        }

        public Criteria andPointsIsNotNull() {
            addCriterion("points is not null");
            return (Criteria) this;
        }

        public Criteria andPointsEqualTo(Integer value) {
            addCriterion("points =", value, "points");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPointsEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("points = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPointsNotEqualTo(Integer value) {
            addCriterion("points <>", value, "points");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPointsNotEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("points <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThan(Integer value) {
            addCriterion("points >", value, "points");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPointsGreaterThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("points > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("points >=", value, "points");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPointsGreaterThanOrEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("points >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPointsLessThan(Integer value) {
            addCriterion("points <", value, "points");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPointsLessThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("points < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPointsLessThanOrEqualTo(Integer value) {
            addCriterion("points <=", value, "points");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPointsLessThanOrEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("points <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPointsIn(List<Integer> values) {
            addCriterion("points in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotIn(List<Integer> values) {
            addCriterion("points not in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsBetween(Integer value1, Integer value2) {
            addCriterion("points between", value1, value2, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("points not between", value1, value2, "points");
            return (Criteria) this;
        }

        public Criteria andExperience_valueIsNull() {
            addCriterion("experience_value is null");
            return (Criteria) this;
        }

        public Criteria andExperience_valueIsNotNull() {
            addCriterion("experience_value is not null");
            return (Criteria) this;
        }

        public Criteria andExperience_valueEqualTo(Integer value) {
            addCriterion("experience_value =", value, "experience_value");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andExperience_valueEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("experience_value = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExperience_valueNotEqualTo(Integer value) {
            addCriterion("experience_value <>", value, "experience_value");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andExperience_valueNotEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("experience_value <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExperience_valueGreaterThan(Integer value) {
            addCriterion("experience_value >", value, "experience_value");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andExperience_valueGreaterThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("experience_value > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExperience_valueGreaterThanOrEqualTo(Integer value) {
            addCriterion("experience_value >=", value, "experience_value");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andExperience_valueGreaterThanOrEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("experience_value >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExperience_valueLessThan(Integer value) {
            addCriterion("experience_value <", value, "experience_value");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andExperience_valueLessThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("experience_value < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExperience_valueLessThanOrEqualTo(Integer value) {
            addCriterion("experience_value <=", value, "experience_value");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andExperience_valueLessThanOrEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("experience_value <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExperience_valueIn(List<Integer> values) {
            addCriterion("experience_value in", values, "experience_value");
            return (Criteria) this;
        }

        public Criteria andExperience_valueNotIn(List<Integer> values) {
            addCriterion("experience_value not in", values, "experience_value");
            return (Criteria) this;
        }

        public Criteria andExperience_valueBetween(Integer value1, Integer value2) {
            addCriterion("experience_value between", value1, value2, "experience_value");
            return (Criteria) this;
        }

        public Criteria andExperience_valueNotBetween(Integer value1, Integer value2) {
            addCriterion("experience_value not between", value1, value2, "experience_value");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBirthdayEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("birthday = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBirthdayNotEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("birthday <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBirthdayGreaterThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("birthday > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBirthdayGreaterThanOrEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("birthday >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBirthdayLessThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("birthday < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBirthdayLessThanOrEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("birthday <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andLast_login_timeIsNull() {
            addCriterion("last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andLast_login_timeIsNotNull() {
            addCriterion("last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLast_login_timeEqualTo(Date value) {
            addCriterion("last_login_time =", value, "last_login_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLast_login_timeEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("last_login_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLast_login_timeNotEqualTo(Date value) {
            addCriterion("last_login_time <>", value, "last_login_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLast_login_timeNotEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("last_login_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLast_login_timeGreaterThan(Date value) {
            addCriterion("last_login_time >", value, "last_login_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLast_login_timeGreaterThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("last_login_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLast_login_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_login_time >=", value, "last_login_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLast_login_timeGreaterThanOrEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("last_login_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLast_login_timeLessThan(Date value) {
            addCriterion("last_login_time <", value, "last_login_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLast_login_timeLessThanColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("last_login_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLast_login_timeLessThanOrEqualTo(Date value) {
            addCriterion("last_login_time <=", value, "last_login_time");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLast_login_timeLessThanOrEqualToColumn(TbUser.Column column) {
            addCriterion(new StringBuilder("last_login_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLast_login_timeIn(List<Date> values) {
            addCriterion("last_login_time in", values, "last_login_time");
            return (Criteria) this;
        }

        public Criteria andLast_login_timeNotIn(List<Date> values) {
            addCriterion("last_login_time not in", values, "last_login_time");
            return (Criteria) this;
        }

        public Criteria andLast_login_timeBetween(Date value1, Date value2) {
            addCriterion("last_login_time between", value1, value2, "last_login_time");
            return (Criteria) this;
        }

        public Criteria andLast_login_timeNotBetween(Date value1, Date value2) {
            addCriterion("last_login_time not between", value1, value2, "last_login_time");
            return (Criteria) this;
        }

        public Criteria andUsernameLikeInsensitive(String value) {
            addCriterion("upper(username) like", value.toUpperCase(), "username");
            return (Criteria) this;
        }

        public Criteria andPasswordLikeInsensitive(String value) {
            addCriterion("upper(password) like", value.toUpperCase(), "password");
            return (Criteria) this;
        }

        public Criteria andPhoneLikeInsensitive(String value) {
            addCriterion("upper(phone) like", value.toUpperCase(), "phone");
            return (Criteria) this;
        }

        public Criteria andEmailLikeInsensitive(String value) {
            addCriterion("upper(email) like", value.toUpperCase(), "email");
            return (Criteria) this;
        }

        public Criteria andSource_typeLikeInsensitive(String value) {
            addCriterion("upper(source_type) like", value.toUpperCase(), "source_type");
            return (Criteria) this;
        }

        public Criteria andNick_nameLikeInsensitive(String value) {
            addCriterion("upper(nick_name) like", value.toUpperCase(), "nick_name");
            return (Criteria) this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(name) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andStatusLikeInsensitive(String value) {
            addCriterion("upper(status) like", value.toUpperCase(), "status");
            return (Criteria) this;
        }

        public Criteria andHead_picLikeInsensitive(String value) {
            addCriterion("upper(head_pic) like", value.toUpperCase(), "head_pic");
            return (Criteria) this;
        }

        public Criteria andQqLikeInsensitive(String value) {
            addCriterion("upper(qq) like", value.toUpperCase(), "qq");
            return (Criteria) this;
        }

        public Criteria andIs_mobile_checkLikeInsensitive(String value) {
            addCriterion("upper(is_mobile_check) like", value.toUpperCase(), "is_mobile_check");
            return (Criteria) this;
        }

        public Criteria andIs_email_checkLikeInsensitive(String value) {
            addCriterion("upper(is_email_check) like", value.toUpperCase(), "is_email_check");
            return (Criteria) this;
        }

        public Criteria andSexLikeInsensitive(String value) {
            addCriterion("upper(sex) like", value.toUpperCase(), "sex");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {
        /**
         */
        private TbUserExample example;

        /**
         */
        protected Criteria(TbUserExample example) {
            super();
            this.example = example;
        }

        /**
         */
        public TbUserExample example() {
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