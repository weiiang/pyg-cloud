package com.pyg.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created By WQ
 * Description:
 * 
 */
public class TbItemCat implements Serializable {
    /**
     *   类目ID
     *
     */
    private Long id;

    /**
     *   父类目ID=0时，代表的是一级的类目
     *
     */
    private Long parent_id;

    /**
     *   类目名称
     *
     */
    private String name;

    /**
     *   类型id
     *
     */
    private Long type_id;

    /**
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column tb_item_cat.id
     *
     * @return the value of tb_item_cat.id
     */
    public Long getId() {
        return id;
    }

    /**
     */
    public TbItemCat withId(Long id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_item_cat.id
     *
     * @param id the value for tb_item_cat.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column tb_item_cat.parent_id
     *
     * @return the value of tb_item_cat.parent_id
     */
    public Long getParent_id() {
        return parent_id;
    }

    /**
     */
    public TbItemCat withParent_id(Long parent_id) {
        this.setParent_id(parent_id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_item_cat.parent_id
     *
     * @param parent_id the value for tb_item_cat.parent_id
     */
    public void setParent_id(Long parent_id) {
        this.parent_id = parent_id;
    }

    /**
     * This method returns the value of the database column tb_item_cat.name
     *
     * @return the value of tb_item_cat.name
     */
    public String getName() {
        return name;
    }

    /**
     */
    public TbItemCat withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * This method sets the value of the database column tb_item_cat.name
     *
     * @param name the value for tb_item_cat.name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method returns the value of the database column tb_item_cat.type_id
     *
     * @return the value of tb_item_cat.type_id
     */
    public Long getType_id() {
        return type_id;
    }

    /**
     */
    public TbItemCat withType_id(Long type_id) {
        this.setType_id(type_id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_item_cat.type_id
     *
     * @param type_id the value for tb_item_cat.type_id
     */
    public void setType_id(Long type_id) {
        this.type_id = type_id;
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
        sb.append(", parent_id=").append(parent_id);
        sb.append(", name=").append(name);
        sb.append(", type_id=").append(type_id);
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
        TbItemCat other = (TbItemCat) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getParent_id() == null ? other.getParent_id() == null : this.getParent_id().equals(other.getParent_id()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getType_id() == null ? other.getType_id() == null : this.getType_id().equals(other.getType_id()));
    }

    /**
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getParent_id() == null) ? 0 : getParent_id().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getType_id() == null) ? 0 : getType_id().hashCode());
        return result;
    }

    /**
     */
    public enum Column {
        id("id", "id", "BIGINT", false),
        parent_id("parent_id", "parent_id", "BIGINT", false),
        name("name", "name", "VARCHAR", false),
        type_id("type_id", "type_id", "BIGINT", false);

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