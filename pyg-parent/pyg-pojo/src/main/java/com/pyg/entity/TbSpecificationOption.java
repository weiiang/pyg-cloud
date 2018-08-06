package com.pyg.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created By WQ
 * Description:
 * 
 */
public class TbSpecificationOption implements Serializable {
    /**
     *   规格项ID
     *
     */
    private Long id;

    /**
     *   规格项名称
     *
     */
    private String option_name;

    /**
     *   规格ID
     *
     */
    private Long spec_id;

    /**
     *   排序值
     *
     */
    private Integer orders;

    /**
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column tb_specification_option.id
     *
     * @return the value of tb_specification_option.id
     */
    public Long getId() {
        return id;
    }

    /**
     */
    public TbSpecificationOption withId(Long id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_specification_option.id
     *
     * @param id the value for tb_specification_option.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column tb_specification_option.option_name
     *
     * @return the value of tb_specification_option.option_name
     */
    public String getOption_name() {
        return option_name;
    }

    /**
     */
    public TbSpecificationOption withOption_name(String option_name) {
        this.setOption_name(option_name);
        return this;
    }

    /**
     * This method sets the value of the database column tb_specification_option.option_name
     *
     * @param option_name the value for tb_specification_option.option_name
     */
    public void setOption_name(String option_name) {
        this.option_name = option_name == null ? null : option_name.trim();
    }

    /**
     * This method returns the value of the database column tb_specification_option.spec_id
     *
     * @return the value of tb_specification_option.spec_id
     */
    public Long getSpec_id() {
        return spec_id;
    }

    /**
     */
    public TbSpecificationOption withSpec_id(Long spec_id) {
        this.setSpec_id(spec_id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_specification_option.spec_id
     *
     * @param spec_id the value for tb_specification_option.spec_id
     */
    public void setSpec_id(Long spec_id) {
        this.spec_id = spec_id;
    }

    /**
     * This method returns the value of the database column tb_specification_option.orders
     *
     * @return the value of tb_specification_option.orders
     */
    public Integer getOrders() {
        return orders;
    }

    /**
     */
    public TbSpecificationOption withOrders(Integer orders) {
        this.setOrders(orders);
        return this;
    }

    /**
     * This method sets the value of the database column tb_specification_option.orders
     *
     * @param orders the value for tb_specification_option.orders
     */
    public void setOrders(Integer orders) {
        this.orders = orders;
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
        sb.append(", option_name=").append(option_name);
        sb.append(", spec_id=").append(spec_id);
        sb.append(", orders=").append(orders);
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
        TbSpecificationOption other = (TbSpecificationOption) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOption_name() == null ? other.getOption_name() == null : this.getOption_name().equals(other.getOption_name()))
            && (this.getSpec_id() == null ? other.getSpec_id() == null : this.getSpec_id().equals(other.getSpec_id()))
            && (this.getOrders() == null ? other.getOrders() == null : this.getOrders().equals(other.getOrders()));
    }

    /**
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOption_name() == null) ? 0 : getOption_name().hashCode());
        result = prime * result + ((getSpec_id() == null) ? 0 : getSpec_id().hashCode());
        result = prime * result + ((getOrders() == null) ? 0 : getOrders().hashCode());
        return result;
    }

    /**
     */
    public enum Column {
        id("id", "id", "BIGINT", false),
        option_name("option_name", "option_name", "VARCHAR", false),
        spec_id("spec_id", "spec_id", "BIGINT", false),
        orders("orders", "orders", "INTEGER", false);

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