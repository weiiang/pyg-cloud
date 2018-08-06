package com.pyg.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created By WQ
 * Description:
 * 
 */
public class TbTypeTemplate implements Serializable {
    /**
     *
     */
    private Long id;

    /**
     *   模板名称
     *
     */
    private String name;

    /**
     *   关联规格
     *
     */
    private String spec_ids;

    /**
     *   关联品牌
     *
     */
    private String brand_ids;

    /**
     *   自定义属性
     *
     */
    private String custom_attribute_items;

    /**
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column tb_type_template.id
     *
     * @return the value of tb_type_template.id
     */
    public Long getId() {
        return id;
    }

    /**
     */
    public TbTypeTemplate withId(Long id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_type_template.id
     *
     * @param id the value for tb_type_template.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column tb_type_template.name
     *
     * @return the value of tb_type_template.name
     */
    public String getName() {
        return name;
    }

    /**
     */
    public TbTypeTemplate withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * This method sets the value of the database column tb_type_template.name
     *
     * @param name the value for tb_type_template.name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method returns the value of the database column tb_type_template.spec_ids
     *
     * @return the value of tb_type_template.spec_ids
     */
    public String getSpec_ids() {
        return spec_ids;
    }

    /**
     */
    public TbTypeTemplate withSpec_ids(String spec_ids) {
        this.setSpec_ids(spec_ids);
        return this;
    }

    /**
     * This method sets the value of the database column tb_type_template.spec_ids
     *
     * @param spec_ids the value for tb_type_template.spec_ids
     */
    public void setSpec_ids(String spec_ids) {
        this.spec_ids = spec_ids == null ? null : spec_ids.trim();
    }

    /**
     * This method returns the value of the database column tb_type_template.brand_ids
     *
     * @return the value of tb_type_template.brand_ids
     */
    public String getBrand_ids() {
        return brand_ids;
    }

    /**
     */
    public TbTypeTemplate withBrand_ids(String brand_ids) {
        this.setBrand_ids(brand_ids);
        return this;
    }

    /**
     * This method sets the value of the database column tb_type_template.brand_ids
     *
     * @param brand_ids the value for tb_type_template.brand_ids
     */
    public void setBrand_ids(String brand_ids) {
        this.brand_ids = brand_ids == null ? null : brand_ids.trim();
    }

    /**
     * This method returns the value of the database column tb_type_template.custom_attribute_items
     *
     * @return the value of tb_type_template.custom_attribute_items
     */
    public String getCustom_attribute_items() {
        return custom_attribute_items;
    }

    /**
     */
    public TbTypeTemplate withCustom_attribute_items(String custom_attribute_items) {
        this.setCustom_attribute_items(custom_attribute_items);
        return this;
    }

    /**
     * This method sets the value of the database column tb_type_template.custom_attribute_items
     *
     * @param custom_attribute_items the value for tb_type_template.custom_attribute_items
     */
    public void setCustom_attribute_items(String custom_attribute_items) {
        this.custom_attribute_items = custom_attribute_items == null ? null : custom_attribute_items.trim();
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
        sb.append(", name=").append(name);
        sb.append(", spec_ids=").append(spec_ids);
        sb.append(", brand_ids=").append(brand_ids);
        sb.append(", custom_attribute_items=").append(custom_attribute_items);
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
        TbTypeTemplate other = (TbTypeTemplate) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSpec_ids() == null ? other.getSpec_ids() == null : this.getSpec_ids().equals(other.getSpec_ids()))
            && (this.getBrand_ids() == null ? other.getBrand_ids() == null : this.getBrand_ids().equals(other.getBrand_ids()))
            && (this.getCustom_attribute_items() == null ? other.getCustom_attribute_items() == null : this.getCustom_attribute_items().equals(other.getCustom_attribute_items()));
    }

    /**
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSpec_ids() == null) ? 0 : getSpec_ids().hashCode());
        result = prime * result + ((getBrand_ids() == null) ? 0 : getBrand_ids().hashCode());
        result = prime * result + ((getCustom_attribute_items() == null) ? 0 : getCustom_attribute_items().hashCode());
        return result;
    }

    /**
     */
    public enum Column {
        id("id", "id", "BIGINT", false),
        name("name", "name", "VARCHAR", false),
        spec_ids("spec_ids", "spec_ids", "VARCHAR", false),
        brand_ids("brand_ids", "brand_ids", "VARCHAR", false),
        custom_attribute_items("custom_attribute_items", "custom_attribute_items", "VARCHAR", false);

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