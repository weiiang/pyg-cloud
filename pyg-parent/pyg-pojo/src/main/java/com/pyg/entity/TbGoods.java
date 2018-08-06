package com.pyg.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created By WQ
 * Description:
 * 
 */
public class TbGoods implements Serializable {
    /**
     */
    public static final String NOT_DELETED = "0";

    /**
     */
    public static final String DELETED = "1";

    /**
     *   主键
     *
     */
    private Long id;

    /**
     *   商家ID
     *
     */
    private String seller_id;

    /**
     *   SPU名
     *
     */
    private String goods_name;

    /**
     *   默认SKU
     *
     */
    private Long default_item_id;

    /**
     *   状态
     *
     */
    private String audit_status;

    /**
     *   是否上架
     *
     */
    private String is_marketable;

    /**
     *   品牌
     *
     */
    private Long brand_id;

    /**
     *   副标题
     *
     */
    private String caption;

    /**
     *   一级类目
     *
     */
    private Long category1_id;

    /**
     *   二级类目
     *
     */
    private Long category2_id;

    /**
     *   三级类目
     *
     */
    private Long category3_id;

    /**
     *   小图
     *
     */
    private String small_pic;

    /**
     *   商城价
     *
     */
    private BigDecimal price;

    /**
     *   分类模板ID
     *
     */
    private Long type_template_id;

    /**
     *   是否启用规格
     *
     */
    private String is_enable_spec;

    /**
     *   是否删除
     *
     */
    private String is_delete;

    /**
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column tb_goods.id
     *
     * @return the value of tb_goods.id
     */
    public Long getId() {
        return id;
    }

    /**
     */
    public TbGoods withId(Long id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_goods.id
     *
     * @param id the value for tb_goods.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column tb_goods.seller_id
     *
     * @return the value of tb_goods.seller_id
     */
    public String getSeller_id() {
        return seller_id;
    }

    /**
     */
    public TbGoods withSeller_id(String seller_id) {
        this.setSeller_id(seller_id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_goods.seller_id
     *
     * @param seller_id the value for tb_goods.seller_id
     */
    public void setSeller_id(String seller_id) {
        this.seller_id = seller_id == null ? null : seller_id.trim();
    }

    /**
     * This method returns the value of the database column tb_goods.goods_name
     *
     * @return the value of tb_goods.goods_name
     */
    public String getGoods_name() {
        return goods_name;
    }

    /**
     */
    public TbGoods withGoods_name(String goods_name) {
        this.setGoods_name(goods_name);
        return this;
    }

    /**
     * This method sets the value of the database column tb_goods.goods_name
     *
     * @param goods_name the value for tb_goods.goods_name
     */
    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name == null ? null : goods_name.trim();
    }

    /**
     * This method returns the value of the database column tb_goods.default_item_id
     *
     * @return the value of tb_goods.default_item_id
     */
    public Long getDefault_item_id() {
        return default_item_id;
    }

    /**
     */
    public TbGoods withDefault_item_id(Long default_item_id) {
        this.setDefault_item_id(default_item_id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_goods.default_item_id
     *
     * @param default_item_id the value for tb_goods.default_item_id
     */
    public void setDefault_item_id(Long default_item_id) {
        this.default_item_id = default_item_id;
    }

    /**
     * This method returns the value of the database column tb_goods.audit_status
     *
     * @return the value of tb_goods.audit_status
     */
    public String getAudit_status() {
        return audit_status;
    }

    /**
     */
    public TbGoods withAudit_status(String audit_status) {
        this.setAudit_status(audit_status);
        return this;
    }

    /**
     * This method sets the value of the database column tb_goods.audit_status
     *
     * @param audit_status the value for tb_goods.audit_status
     */
    public void setAudit_status(String audit_status) {
        this.audit_status = audit_status == null ? null : audit_status.trim();
    }

    /**
     * This method returns the value of the database column tb_goods.is_marketable
     *
     * @return the value of tb_goods.is_marketable
     */
    public String getIs_marketable() {
        return is_marketable;
    }

    /**
     */
    public TbGoods withIs_marketable(String is_marketable) {
        this.setIs_marketable(is_marketable);
        return this;
    }

    /**
     * This method sets the value of the database column tb_goods.is_marketable
     *
     * @param is_marketable the value for tb_goods.is_marketable
     */
    public void setIs_marketable(String is_marketable) {
        this.is_marketable = is_marketable == null ? null : is_marketable.trim();
    }

    /**
     * This method returns the value of the database column tb_goods.brand_id
     *
     * @return the value of tb_goods.brand_id
     */
    public Long getBrand_id() {
        return brand_id;
    }

    /**
     */
    public TbGoods withBrand_id(Long brand_id) {
        this.setBrand_id(brand_id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_goods.brand_id
     *
     * @param brand_id the value for tb_goods.brand_id
     */
    public void setBrand_id(Long brand_id) {
        this.brand_id = brand_id;
    }

    /**
     * This method returns the value of the database column tb_goods.caption
     *
     * @return the value of tb_goods.caption
     */
    public String getCaption() {
        return caption;
    }

    /**
     */
    public TbGoods withCaption(String caption) {
        this.setCaption(caption);
        return this;
    }

    /**
     * This method sets the value of the database column tb_goods.caption
     *
     * @param caption the value for tb_goods.caption
     */
    public void setCaption(String caption) {
        this.caption = caption == null ? null : caption.trim();
    }

    /**
     * This method returns the value of the database column tb_goods.category1_id
     *
     * @return the value of tb_goods.category1_id
     */
    public Long getCategory1_id() {
        return category1_id;
    }

    /**
     */
    public TbGoods withCategory1_id(Long category1_id) {
        this.setCategory1_id(category1_id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_goods.category1_id
     *
     * @param category1_id the value for tb_goods.category1_id
     */
    public void setCategory1_id(Long category1_id) {
        this.category1_id = category1_id;
    }

    /**
     * This method returns the value of the database column tb_goods.category2_id
     *
     * @return the value of tb_goods.category2_id
     */
    public Long getCategory2_id() {
        return category2_id;
    }

    /**
     */
    public TbGoods withCategory2_id(Long category2_id) {
        this.setCategory2_id(category2_id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_goods.category2_id
     *
     * @param category2_id the value for tb_goods.category2_id
     */
    public void setCategory2_id(Long category2_id) {
        this.category2_id = category2_id;
    }

    /**
     * This method returns the value of the database column tb_goods.category3_id
     *
     * @return the value of tb_goods.category3_id
     */
    public Long getCategory3_id() {
        return category3_id;
    }

    /**
     */
    public TbGoods withCategory3_id(Long category3_id) {
        this.setCategory3_id(category3_id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_goods.category3_id
     *
     * @param category3_id the value for tb_goods.category3_id
     */
    public void setCategory3_id(Long category3_id) {
        this.category3_id = category3_id;
    }

    /**
     * This method returns the value of the database column tb_goods.small_pic
     *
     * @return the value of tb_goods.small_pic
     */
    public String getSmall_pic() {
        return small_pic;
    }

    /**
     */
    public TbGoods withSmall_pic(String small_pic) {
        this.setSmall_pic(small_pic);
        return this;
    }

    /**
     * This method sets the value of the database column tb_goods.small_pic
     *
     * @param small_pic the value for tb_goods.small_pic
     */
    public void setSmall_pic(String small_pic) {
        this.small_pic = small_pic == null ? null : small_pic.trim();
    }

    /**
     * This method returns the value of the database column tb_goods.price
     *
     * @return the value of tb_goods.price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     */
    public TbGoods withPrice(BigDecimal price) {
        this.setPrice(price);
        return this;
    }

    /**
     * This method sets the value of the database column tb_goods.price
     *
     * @param price the value for tb_goods.price
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method returns the value of the database column tb_goods.type_template_id
     *
     * @return the value of tb_goods.type_template_id
     */
    public Long getType_template_id() {
        return type_template_id;
    }

    /**
     */
    public TbGoods withType_template_id(Long type_template_id) {
        this.setType_template_id(type_template_id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_goods.type_template_id
     *
     * @param type_template_id the value for tb_goods.type_template_id
     */
    public void setType_template_id(Long type_template_id) {
        this.type_template_id = type_template_id;
    }

    /**
     * This method returns the value of the database column tb_goods.is_enable_spec
     *
     * @return the value of tb_goods.is_enable_spec
     */
    public String getIs_enable_spec() {
        return is_enable_spec;
    }

    /**
     */
    public TbGoods withIs_enable_spec(String is_enable_spec) {
        this.setIs_enable_spec(is_enable_spec);
        return this;
    }

    /**
     * This method sets the value of the database column tb_goods.is_enable_spec
     *
     * @param is_enable_spec the value for tb_goods.is_enable_spec
     */
    public void setIs_enable_spec(String is_enable_spec) {
        this.is_enable_spec = is_enable_spec == null ? null : is_enable_spec.trim();
    }

    /**
     * This method returns the value of the database column tb_goods.is_delete
     *
     * @return the value of tb_goods.is_delete
     */
    public String getIs_delete() {
        return is_delete;
    }

    /**
     */
    public TbGoods withIs_delete(String is_delete) {
        this.setIs_delete(is_delete);
        return this;
    }

    /**
     * This method sets the value of the database column tb_goods.is_delete
     *
     * @param is_delete the value for tb_goods.is_delete
     */
    public void setIs_delete(String is_delete) {
        this.is_delete = is_delete == null ? null : is_delete.trim();
    }

    /**
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", seller_id=").append(seller_id);
        sb.append(", goods_name=").append(goods_name);
        sb.append(", default_item_id=").append(default_item_id);
        sb.append(", audit_status=").append(audit_status);
        sb.append(", is_marketable=").append(is_marketable);
        sb.append(", brand_id=").append(brand_id);
        sb.append(", caption=").append(caption);
        sb.append(", category1_id=").append(category1_id);
        sb.append(", category2_id=").append(category2_id);
        sb.append(", category3_id=").append(category3_id);
        sb.append(", small_pic=").append(small_pic);
        sb.append(", price=").append(price);
        sb.append(", type_template_id=").append(type_template_id);
        sb.append(", is_enable_spec=").append(is_enable_spec);
        sb.append(", is_delete=").append(is_delete);
        sb.append("]");
        return sb.toString();
    }

    /**
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TbGoods other = (TbGoods) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSeller_id() == null ? other.getSeller_id() == null : this.getSeller_id().equals(other.getSeller_id()))
            && (this.getGoods_name() == null ? other.getGoods_name() == null : this.getGoods_name().equals(other.getGoods_name()))
            && (this.getDefault_item_id() == null ? other.getDefault_item_id() == null : this.getDefault_item_id().equals(other.getDefault_item_id()))
            && (this.getAudit_status() == null ? other.getAudit_status() == null : this.getAudit_status().equals(other.getAudit_status()))
            && (this.getIs_marketable() == null ? other.getIs_marketable() == null : this.getIs_marketable().equals(other.getIs_marketable()))
            && (this.getBrand_id() == null ? other.getBrand_id() == null : this.getBrand_id().equals(other.getBrand_id()))
            && (this.getCaption() == null ? other.getCaption() == null : this.getCaption().equals(other.getCaption()))
            && (this.getCategory1_id() == null ? other.getCategory1_id() == null : this.getCategory1_id().equals(other.getCategory1_id()))
            && (this.getCategory2_id() == null ? other.getCategory2_id() == null : this.getCategory2_id().equals(other.getCategory2_id()))
            && (this.getCategory3_id() == null ? other.getCategory3_id() == null : this.getCategory3_id().equals(other.getCategory3_id()))
            && (this.getSmall_pic() == null ? other.getSmall_pic() == null : this.getSmall_pic().equals(other.getSmall_pic()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getType_template_id() == null ? other.getType_template_id() == null : this.getType_template_id().equals(other.getType_template_id()))
            && (this.getIs_enable_spec() == null ? other.getIs_enable_spec() == null : this.getIs_enable_spec().equals(other.getIs_enable_spec()))
            && (this.getIs_delete() == null ? other.getIs_delete() == null : this.getIs_delete().equals(other.getIs_delete()));
    }

    /**
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSeller_id() == null) ? 0 : getSeller_id().hashCode());
        result = prime * result + ((getGoods_name() == null) ? 0 : getGoods_name().hashCode());
        result = prime * result + ((getDefault_item_id() == null) ? 0 : getDefault_item_id().hashCode());
        result = prime * result + ((getAudit_status() == null) ? 0 : getAudit_status().hashCode());
        result = prime * result + ((getIs_marketable() == null) ? 0 : getIs_marketable().hashCode());
        result = prime * result + ((getBrand_id() == null) ? 0 : getBrand_id().hashCode());
        result = prime * result + ((getCaption() == null) ? 0 : getCaption().hashCode());
        result = prime * result + ((getCategory1_id() == null) ? 0 : getCategory1_id().hashCode());
        result = prime * result + ((getCategory2_id() == null) ? 0 : getCategory2_id().hashCode());
        result = prime * result + ((getCategory3_id() == null) ? 0 : getCategory3_id().hashCode());
        result = prime * result + ((getSmall_pic() == null) ? 0 : getSmall_pic().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getType_template_id() == null) ? 0 : getType_template_id().hashCode());
        result = prime * result + ((getIs_enable_spec() == null) ? 0 : getIs_enable_spec().hashCode());
        result = prime * result + ((getIs_delete() == null) ? 0 : getIs_delete().hashCode());
        return result;
    }

    /**
     */
    public void andLogicalDeleted(boolean deleted) {
        setIs_delete(deleted ? DELETED : NOT_DELETED);
    }

    /**
     */
    public enum Column {
        id("id", "id", "BIGINT", false),
        seller_id("seller_id", "seller_id", "VARCHAR", false),
        goods_name("goods_name", "goods_name", "VARCHAR", false),
        default_item_id("default_item_id", "default_item_id", "BIGINT", false),
        audit_status("audit_status", "audit_status", "VARCHAR", false),
        is_marketable("is_marketable", "is_marketable", "VARCHAR", false),
        brand_id("brand_id", "brand_id", "BIGINT", false),
        caption("caption", "caption", "VARCHAR", false),
        category1_id("category1_id", "category1_id", "BIGINT", false),
        category2_id("category2_id", "category2_id", "BIGINT", false),
        category3_id("category3_id", "category3_id", "BIGINT", false),
        small_pic("small_pic", "small_pic", "VARCHAR", false),
        price("price", "price", "DECIMAL", false),
        type_template_id("type_template_id", "type_template_id", "BIGINT", false),
        is_enable_spec("is_enable_spec", "is_enable_spec", "VARCHAR", false),
        is_delete("is_delete", "is_delete", "VARCHAR", false);

        /**
         */
        private static final String BEGINNING_DELIMITER = "\"";

        /**
         */
        private static final String ENDING_DELIMITER = "\"";

        /**
         */
        private final String column;

        /**
         */
        private final boolean isColumnNameDelimited;

        /**
         */
        private final String javaProperty;

        /**
         */
        private final String jdbcType;

        /**
         */
        public String value() {
            return this.column;
        }

        /**
         */
        public String getValue() {
            return this.column;
        }

        /**
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }
    }
}