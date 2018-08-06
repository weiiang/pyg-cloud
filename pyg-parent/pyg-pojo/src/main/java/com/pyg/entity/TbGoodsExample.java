package com.pyg.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TbGoodsExample {
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
    public TbGoodsExample() {
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
    public TbGoodsExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    /**
     */
    public TbGoodsExample orderBy(String ... orderByClauses) {
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
        public Criteria andIdEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdNotEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdGreaterThanColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdGreaterThanOrEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdLessThanColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdLessThanOrEqualToColumn(TbGoods.Column column) {
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
        public Criteria andSeller_idEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("seller_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeller_idNotEqualTo(String value) {
            addCriterion("seller_id <>", value, "seller_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSeller_idNotEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("seller_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeller_idGreaterThan(String value) {
            addCriterion("seller_id >", value, "seller_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSeller_idGreaterThanColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("seller_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeller_idGreaterThanOrEqualTo(String value) {
            addCriterion("seller_id >=", value, "seller_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSeller_idGreaterThanOrEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("seller_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeller_idLessThan(String value) {
            addCriterion("seller_id <", value, "seller_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSeller_idLessThanColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("seller_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeller_idLessThanOrEqualTo(String value) {
            addCriterion("seller_id <=", value, "seller_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSeller_idLessThanOrEqualToColumn(TbGoods.Column column) {
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

        public Criteria andGoods_nameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoods_nameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_nameEqualTo(String value) {
            addCriterion("goods_name =", value, "goods_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andGoods_nameEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("goods_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoods_nameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goods_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andGoods_nameNotEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("goods_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoods_nameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goods_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andGoods_nameGreaterThanColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("goods_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoods_nameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goods_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andGoods_nameGreaterThanOrEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("goods_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoods_nameLessThan(String value) {
            addCriterion("goods_name <", value, "goods_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andGoods_nameLessThanColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("goods_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoods_nameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goods_name");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andGoods_nameLessThanOrEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("goods_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoods_nameLike(String value) {
            addCriterion("goods_name like", value, "goods_name");
            return (Criteria) this;
        }

        public Criteria andGoods_nameNotLike(String value) {
            addCriterion("goods_name not like", value, "goods_name");
            return (Criteria) this;
        }

        public Criteria andGoods_nameIn(List<String> values) {
            addCriterion("goods_name in", values, "goods_name");
            return (Criteria) this;
        }

        public Criteria andGoods_nameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goods_name");
            return (Criteria) this;
        }

        public Criteria andGoods_nameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goods_name");
            return (Criteria) this;
        }

        public Criteria andGoods_nameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goods_name");
            return (Criteria) this;
        }

        public Criteria andDefault_item_idIsNull() {
            addCriterion("default_item_id is null");
            return (Criteria) this;
        }

        public Criteria andDefault_item_idIsNotNull() {
            addCriterion("default_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andDefault_item_idEqualTo(Long value) {
            addCriterion("default_item_id =", value, "default_item_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andDefault_item_idEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("default_item_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDefault_item_idNotEqualTo(Long value) {
            addCriterion("default_item_id <>", value, "default_item_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andDefault_item_idNotEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("default_item_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDefault_item_idGreaterThan(Long value) {
            addCriterion("default_item_id >", value, "default_item_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andDefault_item_idGreaterThanColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("default_item_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDefault_item_idGreaterThanOrEqualTo(Long value) {
            addCriterion("default_item_id >=", value, "default_item_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andDefault_item_idGreaterThanOrEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("default_item_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDefault_item_idLessThan(Long value) {
            addCriterion("default_item_id <", value, "default_item_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andDefault_item_idLessThanColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("default_item_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDefault_item_idLessThanOrEqualTo(Long value) {
            addCriterion("default_item_id <=", value, "default_item_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andDefault_item_idLessThanOrEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("default_item_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDefault_item_idIn(List<Long> values) {
            addCriterion("default_item_id in", values, "default_item_id");
            return (Criteria) this;
        }

        public Criteria andDefault_item_idNotIn(List<Long> values) {
            addCriterion("default_item_id not in", values, "default_item_id");
            return (Criteria) this;
        }

        public Criteria andDefault_item_idBetween(Long value1, Long value2) {
            addCriterion("default_item_id between", value1, value2, "default_item_id");
            return (Criteria) this;
        }

        public Criteria andDefault_item_idNotBetween(Long value1, Long value2) {
            addCriterion("default_item_id not between", value1, value2, "default_item_id");
            return (Criteria) this;
        }

        public Criteria andAudit_statusIsNull() {
            addCriterion("audit_status is null");
            return (Criteria) this;
        }

        public Criteria andAudit_statusIsNotNull() {
            addCriterion("audit_status is not null");
            return (Criteria) this;
        }

        public Criteria andAudit_statusEqualTo(String value) {
            addCriterion("audit_status =", value, "audit_status");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAudit_statusEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("audit_status = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAudit_statusNotEqualTo(String value) {
            addCriterion("audit_status <>", value, "audit_status");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAudit_statusNotEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("audit_status <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAudit_statusGreaterThan(String value) {
            addCriterion("audit_status >", value, "audit_status");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAudit_statusGreaterThanColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("audit_status > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAudit_statusGreaterThanOrEqualTo(String value) {
            addCriterion("audit_status >=", value, "audit_status");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAudit_statusGreaterThanOrEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("audit_status >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAudit_statusLessThan(String value) {
            addCriterion("audit_status <", value, "audit_status");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAudit_statusLessThanColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("audit_status < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAudit_statusLessThanOrEqualTo(String value) {
            addCriterion("audit_status <=", value, "audit_status");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAudit_statusLessThanOrEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("audit_status <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAudit_statusLike(String value) {
            addCriterion("audit_status like", value, "audit_status");
            return (Criteria) this;
        }

        public Criteria andAudit_statusNotLike(String value) {
            addCriterion("audit_status not like", value, "audit_status");
            return (Criteria) this;
        }

        public Criteria andAudit_statusIn(List<String> values) {
            addCriterion("audit_status in", values, "audit_status");
            return (Criteria) this;
        }

        public Criteria andAudit_statusNotIn(List<String> values) {
            addCriterion("audit_status not in", values, "audit_status");
            return (Criteria) this;
        }

        public Criteria andAudit_statusBetween(String value1, String value2) {
            addCriterion("audit_status between", value1, value2, "audit_status");
            return (Criteria) this;
        }

        public Criteria andAudit_statusNotBetween(String value1, String value2) {
            addCriterion("audit_status not between", value1, value2, "audit_status");
            return (Criteria) this;
        }

        public Criteria andIs_marketableIsNull() {
            addCriterion("is_marketable is null");
            return (Criteria) this;
        }

        public Criteria andIs_marketableIsNotNull() {
            addCriterion("is_marketable is not null");
            return (Criteria) this;
        }

        public Criteria andIs_marketableEqualTo(String value) {
            addCriterion("is_marketable =", value, "is_marketable");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIs_marketableEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("is_marketable = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_marketableNotEqualTo(String value) {
            addCriterion("is_marketable <>", value, "is_marketable");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIs_marketableNotEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("is_marketable <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_marketableGreaterThan(String value) {
            addCriterion("is_marketable >", value, "is_marketable");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIs_marketableGreaterThanColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("is_marketable > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_marketableGreaterThanOrEqualTo(String value) {
            addCriterion("is_marketable >=", value, "is_marketable");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIs_marketableGreaterThanOrEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("is_marketable >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_marketableLessThan(String value) {
            addCriterion("is_marketable <", value, "is_marketable");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIs_marketableLessThanColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("is_marketable < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_marketableLessThanOrEqualTo(String value) {
            addCriterion("is_marketable <=", value, "is_marketable");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIs_marketableLessThanOrEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("is_marketable <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_marketableLike(String value) {
            addCriterion("is_marketable like", value, "is_marketable");
            return (Criteria) this;
        }

        public Criteria andIs_marketableNotLike(String value) {
            addCriterion("is_marketable not like", value, "is_marketable");
            return (Criteria) this;
        }

        public Criteria andIs_marketableIn(List<String> values) {
            addCriterion("is_marketable in", values, "is_marketable");
            return (Criteria) this;
        }

        public Criteria andIs_marketableNotIn(List<String> values) {
            addCriterion("is_marketable not in", values, "is_marketable");
            return (Criteria) this;
        }

        public Criteria andIs_marketableBetween(String value1, String value2) {
            addCriterion("is_marketable between", value1, value2, "is_marketable");
            return (Criteria) this;
        }

        public Criteria andIs_marketableNotBetween(String value1, String value2) {
            addCriterion("is_marketable not between", value1, value2, "is_marketable");
            return (Criteria) this;
        }

        public Criteria andBrand_idIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrand_idIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrand_idEqualTo(Long value) {
            addCriterion("brand_id =", value, "brand_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBrand_idEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("brand_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrand_idNotEqualTo(Long value) {
            addCriterion("brand_id <>", value, "brand_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBrand_idNotEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("brand_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrand_idGreaterThan(Long value) {
            addCriterion("brand_id >", value, "brand_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBrand_idGreaterThanColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("brand_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrand_idGreaterThanOrEqualTo(Long value) {
            addCriterion("brand_id >=", value, "brand_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBrand_idGreaterThanOrEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("brand_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrand_idLessThan(Long value) {
            addCriterion("brand_id <", value, "brand_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBrand_idLessThanColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("brand_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrand_idLessThanOrEqualTo(Long value) {
            addCriterion("brand_id <=", value, "brand_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andBrand_idLessThanOrEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("brand_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrand_idIn(List<Long> values) {
            addCriterion("brand_id in", values, "brand_id");
            return (Criteria) this;
        }

        public Criteria andBrand_idNotIn(List<Long> values) {
            addCriterion("brand_id not in", values, "brand_id");
            return (Criteria) this;
        }

        public Criteria andBrand_idBetween(Long value1, Long value2) {
            addCriterion("brand_id between", value1, value2, "brand_id");
            return (Criteria) this;
        }

        public Criteria andBrand_idNotBetween(Long value1, Long value2) {
            addCriterion("brand_id not between", value1, value2, "brand_id");
            return (Criteria) this;
        }

        public Criteria andCaptionIsNull() {
            addCriterion("caption is null");
            return (Criteria) this;
        }

        public Criteria andCaptionIsNotNull() {
            addCriterion("caption is not null");
            return (Criteria) this;
        }

        public Criteria andCaptionEqualTo(String value) {
            addCriterion("caption =", value, "caption");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCaptionEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("caption = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCaptionNotEqualTo(String value) {
            addCriterion("caption <>", value, "caption");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCaptionNotEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("caption <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCaptionGreaterThan(String value) {
            addCriterion("caption >", value, "caption");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCaptionGreaterThanColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("caption > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCaptionGreaterThanOrEqualTo(String value) {
            addCriterion("caption >=", value, "caption");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCaptionGreaterThanOrEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("caption >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCaptionLessThan(String value) {
            addCriterion("caption <", value, "caption");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCaptionLessThanColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("caption < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCaptionLessThanOrEqualTo(String value) {
            addCriterion("caption <=", value, "caption");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCaptionLessThanOrEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("caption <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCaptionLike(String value) {
            addCriterion("caption like", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionNotLike(String value) {
            addCriterion("caption not like", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionIn(List<String> values) {
            addCriterion("caption in", values, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionNotIn(List<String> values) {
            addCriterion("caption not in", values, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionBetween(String value1, String value2) {
            addCriterion("caption between", value1, value2, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionNotBetween(String value1, String value2) {
            addCriterion("caption not between", value1, value2, "caption");
            return (Criteria) this;
        }

        public Criteria andCategory1_idIsNull() {
            addCriterion("category1_id is null");
            return (Criteria) this;
        }

        public Criteria andCategory1_idIsNotNull() {
            addCriterion("category1_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategory1_idEqualTo(Long value) {
            addCriterion("category1_id =", value, "category1_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCategory1_idEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("category1_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategory1_idNotEqualTo(Long value) {
            addCriterion("category1_id <>", value, "category1_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCategory1_idNotEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("category1_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategory1_idGreaterThan(Long value) {
            addCriterion("category1_id >", value, "category1_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCategory1_idGreaterThanColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("category1_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategory1_idGreaterThanOrEqualTo(Long value) {
            addCriterion("category1_id >=", value, "category1_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCategory1_idGreaterThanOrEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("category1_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategory1_idLessThan(Long value) {
            addCriterion("category1_id <", value, "category1_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCategory1_idLessThanColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("category1_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategory1_idLessThanOrEqualTo(Long value) {
            addCriterion("category1_id <=", value, "category1_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCategory1_idLessThanOrEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("category1_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategory1_idIn(List<Long> values) {
            addCriterion("category1_id in", values, "category1_id");
            return (Criteria) this;
        }

        public Criteria andCategory1_idNotIn(List<Long> values) {
            addCriterion("category1_id not in", values, "category1_id");
            return (Criteria) this;
        }

        public Criteria andCategory1_idBetween(Long value1, Long value2) {
            addCriterion("category1_id between", value1, value2, "category1_id");
            return (Criteria) this;
        }

        public Criteria andCategory1_idNotBetween(Long value1, Long value2) {
            addCriterion("category1_id not between", value1, value2, "category1_id");
            return (Criteria) this;
        }

        public Criteria andCategory2_idIsNull() {
            addCriterion("category2_id is null");
            return (Criteria) this;
        }

        public Criteria andCategory2_idIsNotNull() {
            addCriterion("category2_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategory2_idEqualTo(Long value) {
            addCriterion("category2_id =", value, "category2_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCategory2_idEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("category2_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategory2_idNotEqualTo(Long value) {
            addCriterion("category2_id <>", value, "category2_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCategory2_idNotEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("category2_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategory2_idGreaterThan(Long value) {
            addCriterion("category2_id >", value, "category2_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCategory2_idGreaterThanColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("category2_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategory2_idGreaterThanOrEqualTo(Long value) {
            addCriterion("category2_id >=", value, "category2_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCategory2_idGreaterThanOrEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("category2_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategory2_idLessThan(Long value) {
            addCriterion("category2_id <", value, "category2_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCategory2_idLessThanColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("category2_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategory2_idLessThanOrEqualTo(Long value) {
            addCriterion("category2_id <=", value, "category2_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCategory2_idLessThanOrEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("category2_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategory2_idIn(List<Long> values) {
            addCriterion("category2_id in", values, "category2_id");
            return (Criteria) this;
        }

        public Criteria andCategory2_idNotIn(List<Long> values) {
            addCriterion("category2_id not in", values, "category2_id");
            return (Criteria) this;
        }

        public Criteria andCategory2_idBetween(Long value1, Long value2) {
            addCriterion("category2_id between", value1, value2, "category2_id");
            return (Criteria) this;
        }

        public Criteria andCategory2_idNotBetween(Long value1, Long value2) {
            addCriterion("category2_id not between", value1, value2, "category2_id");
            return (Criteria) this;
        }

        public Criteria andCategory3_idIsNull() {
            addCriterion("category3_id is null");
            return (Criteria) this;
        }

        public Criteria andCategory3_idIsNotNull() {
            addCriterion("category3_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategory3_idEqualTo(Long value) {
            addCriterion("category3_id =", value, "category3_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCategory3_idEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("category3_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategory3_idNotEqualTo(Long value) {
            addCriterion("category3_id <>", value, "category3_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCategory3_idNotEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("category3_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategory3_idGreaterThan(Long value) {
            addCriterion("category3_id >", value, "category3_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCategory3_idGreaterThanColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("category3_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategory3_idGreaterThanOrEqualTo(Long value) {
            addCriterion("category3_id >=", value, "category3_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCategory3_idGreaterThanOrEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("category3_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategory3_idLessThan(Long value) {
            addCriterion("category3_id <", value, "category3_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCategory3_idLessThanColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("category3_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategory3_idLessThanOrEqualTo(Long value) {
            addCriterion("category3_id <=", value, "category3_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCategory3_idLessThanOrEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("category3_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategory3_idIn(List<Long> values) {
            addCriterion("category3_id in", values, "category3_id");
            return (Criteria) this;
        }

        public Criteria andCategory3_idNotIn(List<Long> values) {
            addCriterion("category3_id not in", values, "category3_id");
            return (Criteria) this;
        }

        public Criteria andCategory3_idBetween(Long value1, Long value2) {
            addCriterion("category3_id between", value1, value2, "category3_id");
            return (Criteria) this;
        }

        public Criteria andCategory3_idNotBetween(Long value1, Long value2) {
            addCriterion("category3_id not between", value1, value2, "category3_id");
            return (Criteria) this;
        }

        public Criteria andSmall_picIsNull() {
            addCriterion("small_pic is null");
            return (Criteria) this;
        }

        public Criteria andSmall_picIsNotNull() {
            addCriterion("small_pic is not null");
            return (Criteria) this;
        }

        public Criteria andSmall_picEqualTo(String value) {
            addCriterion("small_pic =", value, "small_pic");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSmall_picEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("small_pic = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSmall_picNotEqualTo(String value) {
            addCriterion("small_pic <>", value, "small_pic");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSmall_picNotEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("small_pic <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSmall_picGreaterThan(String value) {
            addCriterion("small_pic >", value, "small_pic");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSmall_picGreaterThanColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("small_pic > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSmall_picGreaterThanOrEqualTo(String value) {
            addCriterion("small_pic >=", value, "small_pic");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSmall_picGreaterThanOrEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("small_pic >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSmall_picLessThan(String value) {
            addCriterion("small_pic <", value, "small_pic");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSmall_picLessThanColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("small_pic < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSmall_picLessThanOrEqualTo(String value) {
            addCriterion("small_pic <=", value, "small_pic");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andSmall_picLessThanOrEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("small_pic <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSmall_picLike(String value) {
            addCriterion("small_pic like", value, "small_pic");
            return (Criteria) this;
        }

        public Criteria andSmall_picNotLike(String value) {
            addCriterion("small_pic not like", value, "small_pic");
            return (Criteria) this;
        }

        public Criteria andSmall_picIn(List<String> values) {
            addCriterion("small_pic in", values, "small_pic");
            return (Criteria) this;
        }

        public Criteria andSmall_picNotIn(List<String> values) {
            addCriterion("small_pic not in", values, "small_pic");
            return (Criteria) this;
        }

        public Criteria andSmall_picBetween(String value1, String value2) {
            addCriterion("small_pic between", value1, value2, "small_pic");
            return (Criteria) this;
        }

        public Criteria andSmall_picNotBetween(String value1, String value2) {
            addCriterion("small_pic not between", value1, value2, "small_pic");
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
        public Criteria andPriceEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("price = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPriceNotEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("price <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPriceGreaterThanColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("price > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPriceGreaterThanOrEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("price >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPriceLessThanColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("price < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPriceLessThanOrEqualToColumn(TbGoods.Column column) {
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

        public Criteria andType_template_idIsNull() {
            addCriterion("type_template_id is null");
            return (Criteria) this;
        }

        public Criteria andType_template_idIsNotNull() {
            addCriterion("type_template_id is not null");
            return (Criteria) this;
        }

        public Criteria andType_template_idEqualTo(Long value) {
            addCriterion("type_template_id =", value, "type_template_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andType_template_idEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("type_template_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andType_template_idNotEqualTo(Long value) {
            addCriterion("type_template_id <>", value, "type_template_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andType_template_idNotEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("type_template_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andType_template_idGreaterThan(Long value) {
            addCriterion("type_template_id >", value, "type_template_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andType_template_idGreaterThanColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("type_template_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andType_template_idGreaterThanOrEqualTo(Long value) {
            addCriterion("type_template_id >=", value, "type_template_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andType_template_idGreaterThanOrEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("type_template_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andType_template_idLessThan(Long value) {
            addCriterion("type_template_id <", value, "type_template_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andType_template_idLessThanColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("type_template_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andType_template_idLessThanOrEqualTo(Long value) {
            addCriterion("type_template_id <=", value, "type_template_id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andType_template_idLessThanOrEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("type_template_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andType_template_idIn(List<Long> values) {
            addCriterion("type_template_id in", values, "type_template_id");
            return (Criteria) this;
        }

        public Criteria andType_template_idNotIn(List<Long> values) {
            addCriterion("type_template_id not in", values, "type_template_id");
            return (Criteria) this;
        }

        public Criteria andType_template_idBetween(Long value1, Long value2) {
            addCriterion("type_template_id between", value1, value2, "type_template_id");
            return (Criteria) this;
        }

        public Criteria andType_template_idNotBetween(Long value1, Long value2) {
            addCriterion("type_template_id not between", value1, value2, "type_template_id");
            return (Criteria) this;
        }

        public Criteria andIs_enable_specIsNull() {
            addCriterion("is_enable_spec is null");
            return (Criteria) this;
        }

        public Criteria andIs_enable_specIsNotNull() {
            addCriterion("is_enable_spec is not null");
            return (Criteria) this;
        }

        public Criteria andIs_enable_specEqualTo(String value) {
            addCriterion("is_enable_spec =", value, "is_enable_spec");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIs_enable_specEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("is_enable_spec = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_enable_specNotEqualTo(String value) {
            addCriterion("is_enable_spec <>", value, "is_enable_spec");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIs_enable_specNotEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("is_enable_spec <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_enable_specGreaterThan(String value) {
            addCriterion("is_enable_spec >", value, "is_enable_spec");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIs_enable_specGreaterThanColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("is_enable_spec > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_enable_specGreaterThanOrEqualTo(String value) {
            addCriterion("is_enable_spec >=", value, "is_enable_spec");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIs_enable_specGreaterThanOrEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("is_enable_spec >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_enable_specLessThan(String value) {
            addCriterion("is_enable_spec <", value, "is_enable_spec");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIs_enable_specLessThanColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("is_enable_spec < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_enable_specLessThanOrEqualTo(String value) {
            addCriterion("is_enable_spec <=", value, "is_enable_spec");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIs_enable_specLessThanOrEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("is_enable_spec <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_enable_specLike(String value) {
            addCriterion("is_enable_spec like", value, "is_enable_spec");
            return (Criteria) this;
        }

        public Criteria andIs_enable_specNotLike(String value) {
            addCriterion("is_enable_spec not like", value, "is_enable_spec");
            return (Criteria) this;
        }

        public Criteria andIs_enable_specIn(List<String> values) {
            addCriterion("is_enable_spec in", values, "is_enable_spec");
            return (Criteria) this;
        }

        public Criteria andIs_enable_specNotIn(List<String> values) {
            addCriterion("is_enable_spec not in", values, "is_enable_spec");
            return (Criteria) this;
        }

        public Criteria andIs_enable_specBetween(String value1, String value2) {
            addCriterion("is_enable_spec between", value1, value2, "is_enable_spec");
            return (Criteria) this;
        }

        public Criteria andIs_enable_specNotBetween(String value1, String value2) {
            addCriterion("is_enable_spec not between", value1, value2, "is_enable_spec");
            return (Criteria) this;
        }

        public Criteria andIs_deleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIs_deleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIs_deleteEqualTo(String value) {
            addCriterion("is_delete =", value, "is_delete");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIs_deleteEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("is_delete = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_deleteNotEqualTo(String value) {
            addCriterion("is_delete <>", value, "is_delete");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIs_deleteNotEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("is_delete <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_deleteGreaterThan(String value) {
            addCriterion("is_delete >", value, "is_delete");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIs_deleteGreaterThanColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("is_delete > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_deleteGreaterThanOrEqualTo(String value) {
            addCriterion("is_delete >=", value, "is_delete");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIs_deleteGreaterThanOrEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("is_delete >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_deleteLessThan(String value) {
            addCriterion("is_delete <", value, "is_delete");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIs_deleteLessThanColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("is_delete < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_deleteLessThanOrEqualTo(String value) {
            addCriterion("is_delete <=", value, "is_delete");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIs_deleteLessThanOrEqualToColumn(TbGoods.Column column) {
            addCriterion(new StringBuilder("is_delete <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_deleteLike(String value) {
            addCriterion("is_delete like", value, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteNotLike(String value) {
            addCriterion("is_delete not like", value, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteIn(List<String> values) {
            addCriterion("is_delete in", values, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteNotIn(List<String> values) {
            addCriterion("is_delete not in", values, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteBetween(String value1, String value2) {
            addCriterion("is_delete between", value1, value2, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteNotBetween(String value1, String value2) {
            addCriterion("is_delete not between", value1, value2, "is_delete");
            return (Criteria) this;
        }

        public Criteria andSeller_idLikeInsensitive(String value) {
            addCriterion("upper(seller_id) like", value.toUpperCase(), "seller_id");
            return (Criteria) this;
        }

        public Criteria andGoods_nameLikeInsensitive(String value) {
            addCriterion("upper(goods_name) like", value.toUpperCase(), "goods_name");
            return (Criteria) this;
        }

        public Criteria andAudit_statusLikeInsensitive(String value) {
            addCriterion("upper(audit_status) like", value.toUpperCase(), "audit_status");
            return (Criteria) this;
        }

        public Criteria andIs_marketableLikeInsensitive(String value) {
            addCriterion("upper(is_marketable) like", value.toUpperCase(), "is_marketable");
            return (Criteria) this;
        }

        public Criteria andCaptionLikeInsensitive(String value) {
            addCriterion("upper(caption) like", value.toUpperCase(), "caption");
            return (Criteria) this;
        }

        public Criteria andSmall_picLikeInsensitive(String value) {
            addCriterion("upper(small_pic) like", value.toUpperCase(), "small_pic");
            return (Criteria) this;
        }

        public Criteria andIs_enable_specLikeInsensitive(String value) {
            addCriterion("upper(is_enable_spec) like", value.toUpperCase(), "is_enable_spec");
            return (Criteria) this;
        }

        public Criteria andIs_deleteLikeInsensitive(String value) {
            addCriterion("upper(is_delete) like", value.toUpperCase(), "is_delete");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {
        /**
         */
        private TbGoodsExample example;

        /**
         */
        protected Criteria(TbGoodsExample example) {
            super();
            this.example = example;
        }

        /**
         */
        public Criteria andLogicalDeleted(boolean deleted) {
            return deleted ? andIs_deleteEqualTo(TbGoods.DELETED) : andIs_deleteNotEqualTo(TbGoods.DELETED);
        }

        /**
         */
        public TbGoodsExample example() {
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