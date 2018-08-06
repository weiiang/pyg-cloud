package com.pyg.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbAddressExample {
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
    public TbAddressExample() {
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
    public TbAddressExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    /**
     */
    public TbAddressExample orderBy(String ... orderByClauses) {
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
        public Criteria andIdEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdNotEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdGreaterThanColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdGreaterThanOrEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdLessThanColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdLessThanOrEqualToColumn(TbAddress.Column column) {
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
        public Criteria andUser_idEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("user_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idNotEqualTo(String value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUser_idNotEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("user_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThan(String value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUser_idGreaterThanColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("user_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUser_idGreaterThanOrEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("user_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idLessThan(String value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUser_idLessThanColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("user_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUser_idLessThanOrEqualToColumn(TbAddress.Column column) {
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

        public Criteria andProvince_idIsNull() {
            addCriterion("province_id is null");
            return (Criteria) this;
        }

        public Criteria andProvince_idIsNotNull() {
            addCriterion("province_id is not null");
            return (Criteria) this;
        }

        public Criteria andProvince_idEqualTo(String value) {
            addCriterion("province_id =", value, "province_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andProvince_idEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("province_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProvince_idNotEqualTo(String value) {
            addCriterion("province_id <>", value, "province_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andProvince_idNotEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("province_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProvince_idGreaterThan(String value) {
            addCriterion("province_id >", value, "province_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andProvince_idGreaterThanColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("province_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProvince_idGreaterThanOrEqualTo(String value) {
            addCriterion("province_id >=", value, "province_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andProvince_idGreaterThanOrEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("province_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProvince_idLessThan(String value) {
            addCriterion("province_id <", value, "province_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andProvince_idLessThanColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("province_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProvince_idLessThanOrEqualTo(String value) {
            addCriterion("province_id <=", value, "province_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andProvince_idLessThanOrEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("province_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProvince_idLike(String value) {
            addCriterion("province_id like", value, "province_id");
            return (Criteria) this;
        }

        public Criteria andProvince_idNotLike(String value) {
            addCriterion("province_id not like", value, "province_id");
            return (Criteria) this;
        }

        public Criteria andProvince_idIn(List<String> values) {
            addCriterion("province_id in", values, "province_id");
            return (Criteria) this;
        }

        public Criteria andProvince_idNotIn(List<String> values) {
            addCriterion("province_id not in", values, "province_id");
            return (Criteria) this;
        }

        public Criteria andProvince_idBetween(String value1, String value2) {
            addCriterion("province_id between", value1, value2, "province_id");
            return (Criteria) this;
        }

        public Criteria andProvince_idNotBetween(String value1, String value2) {
            addCriterion("province_id not between", value1, value2, "province_id");
            return (Criteria) this;
        }

        public Criteria andCity_idIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCity_idIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCity_idEqualTo(String value) {
            addCriterion("city_id =", value, "city_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCity_idEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("city_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCity_idNotEqualTo(String value) {
            addCriterion("city_id <>", value, "city_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCity_idNotEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("city_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCity_idGreaterThan(String value) {
            addCriterion("city_id >", value, "city_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCity_idGreaterThanColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("city_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCity_idGreaterThanOrEqualTo(String value) {
            addCriterion("city_id >=", value, "city_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCity_idGreaterThanOrEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("city_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCity_idLessThan(String value) {
            addCriterion("city_id <", value, "city_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCity_idLessThanColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("city_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCity_idLessThanOrEqualTo(String value) {
            addCriterion("city_id <=", value, "city_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCity_idLessThanOrEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("city_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCity_idLike(String value) {
            addCriterion("city_id like", value, "city_id");
            return (Criteria) this;
        }

        public Criteria andCity_idNotLike(String value) {
            addCriterion("city_id not like", value, "city_id");
            return (Criteria) this;
        }

        public Criteria andCity_idIn(List<String> values) {
            addCriterion("city_id in", values, "city_id");
            return (Criteria) this;
        }

        public Criteria andCity_idNotIn(List<String> values) {
            addCriterion("city_id not in", values, "city_id");
            return (Criteria) this;
        }

        public Criteria andCity_idBetween(String value1, String value2) {
            addCriterion("city_id between", value1, value2, "city_id");
            return (Criteria) this;
        }

        public Criteria andCity_idNotBetween(String value1, String value2) {
            addCriterion("city_id not between", value1, value2, "city_id");
            return (Criteria) this;
        }

        public Criteria andTown_idIsNull() {
            addCriterion("town_id is null");
            return (Criteria) this;
        }

        public Criteria andTown_idIsNotNull() {
            addCriterion("town_id is not null");
            return (Criteria) this;
        }

        public Criteria andTown_idEqualTo(String value) {
            addCriterion("town_id =", value, "town_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTown_idEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("town_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTown_idNotEqualTo(String value) {
            addCriterion("town_id <>", value, "town_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTown_idNotEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("town_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTown_idGreaterThan(String value) {
            addCriterion("town_id >", value, "town_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTown_idGreaterThanColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("town_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTown_idGreaterThanOrEqualTo(String value) {
            addCriterion("town_id >=", value, "town_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTown_idGreaterThanOrEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("town_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTown_idLessThan(String value) {
            addCriterion("town_id <", value, "town_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTown_idLessThanColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("town_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTown_idLessThanOrEqualTo(String value) {
            addCriterion("town_id <=", value, "town_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTown_idLessThanOrEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("town_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTown_idLike(String value) {
            addCriterion("town_id like", value, "town_id");
            return (Criteria) this;
        }

        public Criteria andTown_idNotLike(String value) {
            addCriterion("town_id not like", value, "town_id");
            return (Criteria) this;
        }

        public Criteria andTown_idIn(List<String> values) {
            addCriterion("town_id in", values, "town_id");
            return (Criteria) this;
        }

        public Criteria andTown_idNotIn(List<String> values) {
            addCriterion("town_id not in", values, "town_id");
            return (Criteria) this;
        }

        public Criteria andTown_idBetween(String value1, String value2) {
            addCriterion("town_id between", value1, value2, "town_id");
            return (Criteria) this;
        }

        public Criteria andTown_idNotBetween(String value1, String value2) {
            addCriterion("town_id not between", value1, value2, "town_id");
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
        public Criteria andMobileEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("mobile = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andMobileNotEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("mobile <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andMobileGreaterThanColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("mobile > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andMobileGreaterThanOrEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("mobile >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andMobileLessThanColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("mobile < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andMobileLessThanOrEqualToColumn(TbAddress.Column column) {
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

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAddressEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("address = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAddressNotEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("address <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAddressGreaterThanColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("address > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAddressGreaterThanOrEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("address >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAddressLessThanColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("address < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAddressLessThanOrEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("address <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("contact is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("contact is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("contact =", value, "contact");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andContactEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("contact = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("contact <>", value, "contact");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andContactNotEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("contact <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("contact >", value, "contact");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andContactGreaterThanColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("contact > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("contact >=", value, "contact");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andContactGreaterThanOrEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("contact >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("contact <", value, "contact");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andContactLessThanColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("contact < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("contact <=", value, "contact");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andContactLessThanOrEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("contact <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("contact like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("contact not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("contact in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("contact not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("contact between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("contact not between", value1, value2, "contact");
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
        public Criteria andIs_defaultEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("is_default = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_defaultNotEqualTo(String value) {
            addCriterion("is_default <>", value, "is_default");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIs_defaultNotEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("is_default <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_defaultGreaterThan(String value) {
            addCriterion("is_default >", value, "is_default");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIs_defaultGreaterThanColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("is_default > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_defaultGreaterThanOrEqualTo(String value) {
            addCriterion("is_default >=", value, "is_default");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIs_defaultGreaterThanOrEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("is_default >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_defaultLessThan(String value) {
            addCriterion("is_default <", value, "is_default");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIs_defaultLessThanColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("is_default < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_defaultLessThanOrEqualTo(String value) {
            addCriterion("is_default <=", value, "is_default");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIs_defaultLessThanOrEqualToColumn(TbAddress.Column column) {
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

        public Criteria andNotesIsNull() {
            addCriterion("notes is null");
            return (Criteria) this;
        }

        public Criteria andNotesIsNotNull() {
            addCriterion("notes is not null");
            return (Criteria) this;
        }

        public Criteria andNotesEqualTo(String value) {
            addCriterion("notes =", value, "notes");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNotesEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("notes = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNotesNotEqualTo(String value) {
            addCriterion("notes <>", value, "notes");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNotesNotEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("notes <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThan(String value) {
            addCriterion("notes >", value, "notes");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNotesGreaterThanColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("notes > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThanOrEqualTo(String value) {
            addCriterion("notes >=", value, "notes");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNotesGreaterThanOrEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("notes >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNotesLessThan(String value) {
            addCriterion("notes <", value, "notes");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNotesLessThanColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("notes < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNotesLessThanOrEqualTo(String value) {
            addCriterion("notes <=", value, "notes");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andNotesLessThanOrEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("notes <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNotesLike(String value) {
            addCriterion("notes like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotLike(String value) {
            addCriterion("notes not like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesIn(List<String> values) {
            addCriterion("notes in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotIn(List<String> values) {
            addCriterion("notes not in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesBetween(String value1, String value2) {
            addCriterion("notes between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotBetween(String value1, String value2) {
            addCriterion("notes not between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andCreate_dateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreate_dateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_dateEqualTo(Date value) {
            addCriterion("create_date =", value, "create_date");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreate_dateEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("create_date = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_dateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "create_date");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreate_dateNotEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("create_date <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_dateGreaterThan(Date value) {
            addCriterion("create_date >", value, "create_date");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreate_dateGreaterThanColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("create_date > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "create_date");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreate_dateGreaterThanOrEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("create_date >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_dateLessThan(Date value) {
            addCriterion("create_date <", value, "create_date");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreate_dateLessThanColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("create_date < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_dateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "create_date");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreate_dateLessThanOrEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("create_date <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_dateIn(List<Date> values) {
            addCriterion("create_date in", values, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "create_date");
            return (Criteria) this;
        }

        public Criteria andAliasIsNull() {
            addCriterion("alias is null");
            return (Criteria) this;
        }

        public Criteria andAliasIsNotNull() {
            addCriterion("alias is not null");
            return (Criteria) this;
        }

        public Criteria andAliasEqualTo(String value) {
            addCriterion("alias =", value, "alias");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAliasEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("alias = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAliasNotEqualTo(String value) {
            addCriterion("alias <>", value, "alias");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAliasNotEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("alias <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAliasGreaterThan(String value) {
            addCriterion("alias >", value, "alias");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAliasGreaterThanColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("alias > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAliasGreaterThanOrEqualTo(String value) {
            addCriterion("alias >=", value, "alias");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAliasGreaterThanOrEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("alias >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAliasLessThan(String value) {
            addCriterion("alias <", value, "alias");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAliasLessThanColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("alias < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAliasLessThanOrEqualTo(String value) {
            addCriterion("alias <=", value, "alias");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAliasLessThanOrEqualToColumn(TbAddress.Column column) {
            addCriterion(new StringBuilder("alias <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAliasLike(String value) {
            addCriterion("alias like", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotLike(String value) {
            addCriterion("alias not like", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasIn(List<String> values) {
            addCriterion("alias in", values, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotIn(List<String> values) {
            addCriterion("alias not in", values, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasBetween(String value1, String value2) {
            addCriterion("alias between", value1, value2, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotBetween(String value1, String value2) {
            addCriterion("alias not between", value1, value2, "alias");
            return (Criteria) this;
        }

        public Criteria andUser_idLikeInsensitive(String value) {
            addCriterion("upper(user_id) like", value.toUpperCase(), "user_id");
            return (Criteria) this;
        }

        public Criteria andProvince_idLikeInsensitive(String value) {
            addCriterion("upper(province_id) like", value.toUpperCase(), "province_id");
            return (Criteria) this;
        }

        public Criteria andCity_idLikeInsensitive(String value) {
            addCriterion("upper(city_id) like", value.toUpperCase(), "city_id");
            return (Criteria) this;
        }

        public Criteria andTown_idLikeInsensitive(String value) {
            addCriterion("upper(town_id) like", value.toUpperCase(), "town_id");
            return (Criteria) this;
        }

        public Criteria andMobileLikeInsensitive(String value) {
            addCriterion("upper(mobile) like", value.toUpperCase(), "mobile");
            return (Criteria) this;
        }

        public Criteria andAddressLikeInsensitive(String value) {
            addCriterion("upper(address) like", value.toUpperCase(), "address");
            return (Criteria) this;
        }

        public Criteria andContactLikeInsensitive(String value) {
            addCriterion("upper(contact) like", value.toUpperCase(), "contact");
            return (Criteria) this;
        }

        public Criteria andIs_defaultLikeInsensitive(String value) {
            addCriterion("upper(is_default) like", value.toUpperCase(), "is_default");
            return (Criteria) this;
        }

        public Criteria andNotesLikeInsensitive(String value) {
            addCriterion("upper(notes) like", value.toUpperCase(), "notes");
            return (Criteria) this;
        }

        public Criteria andAliasLikeInsensitive(String value) {
            addCriterion("upper(alias) like", value.toUpperCase(), "alias");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {
        /**
         */
        private TbAddressExample example;

        /**
         */
        protected Criteria(TbAddressExample example) {
            super();
            this.example = example;
        }

        /**
         */
        public TbAddressExample example() {
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