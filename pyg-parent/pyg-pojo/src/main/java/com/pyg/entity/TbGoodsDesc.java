package com.pyg.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created By WQ
 * Description:
 * 
 */
public class TbGoodsDesc implements Serializable {
    /**
     *   SPU_ID
     *
     */
    private Long goods_id;

    /**
     *   描述
     *
     */
    private String introduction;

    /**
     *   规格结果集，所有规格，包含isSelected
     *
     */
    private String specification_items;

    /**
     *   自定义属性（参数结果）
     *
     */
    private String custom_attribute_items;

    /**
     *
     */
    private String item_images;

    /**
     *   包装列表
     *
     */
    private String package_list;

    /**
     *   售后服务
     *
     */
    private String sale_service;

    /**
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column tb_goods_desc.goods_id
     *
     * @return the value of tb_goods_desc.goods_id
     */
    public Long getGoods_id() {
        return goods_id;
    }

    /**
     */
    public TbGoodsDesc withGoods_id(Long goods_id) {
        this.setGoods_id(goods_id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_goods_desc.goods_id
     *
     * @param goods_id the value for tb_goods_desc.goods_id
     */
    public void setGoods_id(Long goods_id) {
        this.goods_id = goods_id;
    }

    /**
     * This method returns the value of the database column tb_goods_desc.introduction
     *
     * @return the value of tb_goods_desc.introduction
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     */
    public TbGoodsDesc withIntroduction(String introduction) {
        this.setIntroduction(introduction);
        return this;
    }

    /**
     * This method sets the value of the database column tb_goods_desc.introduction
     *
     * @param introduction the value for tb_goods_desc.introduction
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    /**
     * This method returns the value of the database column tb_goods_desc.specification_items
     *
     * @return the value of tb_goods_desc.specification_items
     */
    public String getSpecification_items() {
        return specification_items;
    }

    /**
     */
    public TbGoodsDesc withSpecification_items(String specification_items) {
        this.setSpecification_items(specification_items);
        return this;
    }

    /**
     * This method sets the value of the database column tb_goods_desc.specification_items
     *
     * @param specification_items the value for tb_goods_desc.specification_items
     */
    public void setSpecification_items(String specification_items) {
        this.specification_items = specification_items == null ? null : specification_items.trim();
    }

    /**
     * This method returns the value of the database column tb_goods_desc.custom_attribute_items
     *
     * @return the value of tb_goods_desc.custom_attribute_items
     */
    public String getCustom_attribute_items() {
        return custom_attribute_items;
    }

    /**
     */
    public TbGoodsDesc withCustom_attribute_items(String custom_attribute_items) {
        this.setCustom_attribute_items(custom_attribute_items);
        return this;
    }

    /**
     * This method sets the value of the database column tb_goods_desc.custom_attribute_items
     *
     * @param custom_attribute_items the value for tb_goods_desc.custom_attribute_items
     */
    public void setCustom_attribute_items(String custom_attribute_items) {
        this.custom_attribute_items = custom_attribute_items == null ? null : custom_attribute_items.trim();
    }

    /**
     * This method returns the value of the database column tb_goods_desc.item_images
     *
     * @return the value of tb_goods_desc.item_images
     */
    public String getItem_images() {
        return item_images;
    }

    /**
     */
    public TbGoodsDesc withItem_images(String item_images) {
        this.setItem_images(item_images);
        return this;
    }

    /**
     * This method sets the value of the database column tb_goods_desc.item_images
     *
     * @param item_images the value for tb_goods_desc.item_images
     */
    public void setItem_images(String item_images) {
        this.item_images = item_images == null ? null : item_images.trim();
    }

    /**
     * This method returns the value of the database column tb_goods_desc.package_list
     *
     * @return the value of tb_goods_desc.package_list
     */
    public String getPackage_list() {
        return package_list;
    }

    /**
     */
    public TbGoodsDesc withPackage_list(String package_list) {
        this.setPackage_list(package_list);
        return this;
    }

    /**
     * This method sets the value of the database column tb_goods_desc.package_list
     *
     * @param package_list the value for tb_goods_desc.package_list
     */
    public void setPackage_list(String package_list) {
        this.package_list = package_list == null ? null : package_list.trim();
    }

    /**
     * This method returns the value of the database column tb_goods_desc.sale_service
     *
     * @return the value of tb_goods_desc.sale_service
     */
    public String getSale_service() {
        return sale_service;
    }

    /**
     */
    public TbGoodsDesc withSale_service(String sale_service) {
        this.setSale_service(sale_service);
        return this;
    }

    /**
     * This method sets the value of the database column tb_goods_desc.sale_service
     *
     * @param sale_service the value for tb_goods_desc.sale_service
     */
    public void setSale_service(String sale_service) {
        this.sale_service = sale_service == null ? null : sale_service.trim();
    }

    /**
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", goods_id=").append(goods_id);
        sb.append(", introduction=").append(introduction);
        sb.append(", specification_items=").append(specification_items);
        sb.append(", custom_attribute_items=").append(custom_attribute_items);
        sb.append(", item_images=").append(item_images);
        sb.append(", package_list=").append(package_list);
        sb.append(", sale_service=").append(sale_service);
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
        TbGoodsDesc other = (TbGoodsDesc) that;
        return (this.getGoods_id() == null ? other.getGoods_id() == null : this.getGoods_id().equals(other.getGoods_id()))
            && (this.getIntroduction() == null ? other.getIntroduction() == null : this.getIntroduction().equals(other.getIntroduction()))
            && (this.getSpecification_items() == null ? other.getSpecification_items() == null : this.getSpecification_items().equals(other.getSpecification_items()))
            && (this.getCustom_attribute_items() == null ? other.getCustom_attribute_items() == null : this.getCustom_attribute_items().equals(other.getCustom_attribute_items()))
            && (this.getItem_images() == null ? other.getItem_images() == null : this.getItem_images().equals(other.getItem_images()))
            && (this.getPackage_list() == null ? other.getPackage_list() == null : this.getPackage_list().equals(other.getPackage_list()))
            && (this.getSale_service() == null ? other.getSale_service() == null : this.getSale_service().equals(other.getSale_service()));
    }

    /**
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGoods_id() == null) ? 0 : getGoods_id().hashCode());
        result = prime * result + ((getIntroduction() == null) ? 0 : getIntroduction().hashCode());
        result = prime * result + ((getSpecification_items() == null) ? 0 : getSpecification_items().hashCode());
        result = prime * result + ((getCustom_attribute_items() == null) ? 0 : getCustom_attribute_items().hashCode());
        result = prime * result + ((getItem_images() == null) ? 0 : getItem_images().hashCode());
        result = prime * result + ((getPackage_list() == null) ? 0 : getPackage_list().hashCode());
        result = prime * result + ((getSale_service() == null) ? 0 : getSale_service().hashCode());
        return result;
    }

    /**
     */
    public enum Column {
        goods_id("goods_id", "goods_id", "BIGINT", false),
        introduction("introduction", "introduction", "VARCHAR", false),
        specification_items("specification_items", "specification_items", "VARCHAR", false),
        custom_attribute_items("custom_attribute_items", "custom_attribute_items", "VARCHAR", false),
        item_images("item_images", "item_images", "VARCHAR", false),
        package_list("package_list", "package_list", "VARCHAR", false),
        sale_service("sale_service", "sale_service", "VARCHAR", false);

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