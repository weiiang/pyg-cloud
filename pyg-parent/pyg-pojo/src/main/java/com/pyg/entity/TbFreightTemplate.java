package com.pyg.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 * Created By WQ
 * Description:
 * 
 */
public class TbFreightTemplate implements Serializable {
    /**
     *
     */
    private Long id;

    /**
     *   商家ID
     *
     */
    private String seller_id;

    /**
     *   是否默认   （‘Y’是   'N'否）
     *
     */
    private String is_default;

    /**
     *   模版名称
     *
     */
    private String name;

    /**
     *   发货时间（1:12h  2:24h  3:48h  4:72h  5:7d 6:15d ）
     *
     */
    private String send_time_type;

    /**
     *   统一价格
     *
     */
    private Long price;

    /**
     *   创建时间
     *
     */
    private Date create_time;

    /**
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column tb_freight_template.id
     *
     * @return the value of tb_freight_template.id
     */
    public Long getId() {
        return id;
    }

    /**
     */
    public TbFreightTemplate withId(Long id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_freight_template.id
     *
     * @param id the value for tb_freight_template.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column tb_freight_template.seller_id
     *
     * @return the value of tb_freight_template.seller_id
     */
    public String getSeller_id() {
        return seller_id;
    }

    /**
     */
    public TbFreightTemplate withSeller_id(String seller_id) {
        this.setSeller_id(seller_id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_freight_template.seller_id
     *
     * @param seller_id the value for tb_freight_template.seller_id
     */
    public void setSeller_id(String seller_id) {
        this.seller_id = seller_id == null ? null : seller_id.trim();
    }

    /**
     * This method returns the value of the database column tb_freight_template.is_default
     *
     * @return the value of tb_freight_template.is_default
     */
    public String getIs_default() {
        return is_default;
    }

    /**
     */
    public TbFreightTemplate withIs_default(String is_default) {
        this.setIs_default(is_default);
        return this;
    }

    /**
     * This method sets the value of the database column tb_freight_template.is_default
     *
     * @param is_default the value for tb_freight_template.is_default
     */
    public void setIs_default(String is_default) {
        this.is_default = is_default == null ? null : is_default.trim();
    }

    /**
     * This method returns the value of the database column tb_freight_template.name
     *
     * @return the value of tb_freight_template.name
     */
    public String getName() {
        return name;
    }

    /**
     */
    public TbFreightTemplate withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * This method sets the value of the database column tb_freight_template.name
     *
     * @param name the value for tb_freight_template.name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method returns the value of the database column tb_freight_template.send_time_type
     *
     * @return the value of tb_freight_template.send_time_type
     */
    public String getSend_time_type() {
        return send_time_type;
    }

    /**
     */
    public TbFreightTemplate withSend_time_type(String send_time_type) {
        this.setSend_time_type(send_time_type);
        return this;
    }

    /**
     * This method sets the value of the database column tb_freight_template.send_time_type
     *
     * @param send_time_type the value for tb_freight_template.send_time_type
     */
    public void setSend_time_type(String send_time_type) {
        this.send_time_type = send_time_type == null ? null : send_time_type.trim();
    }

    /**
     * This method returns the value of the database column tb_freight_template.price
     *
     * @return the value of tb_freight_template.price
     */
    public Long getPrice() {
        return price;
    }

    /**
     */
    public TbFreightTemplate withPrice(Long price) {
        this.setPrice(price);
        return this;
    }

    /**
     * This method sets the value of the database column tb_freight_template.price
     *
     * @param price the value for tb_freight_template.price
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * This method returns the value of the database column tb_freight_template.create_time
     *
     * @return the value of tb_freight_template.create_time
     */
    public Date getCreate_time() {
        return create_time;
    }

    /**
     */
    public TbFreightTemplate withCreate_time(Date create_time) {
        this.setCreate_time(create_time);
        return this;
    }

    /**
     * This method sets the value of the database column tb_freight_template.create_time
     *
     * @param create_time the value for tb_freight_template.create_time
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
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
        sb.append(", is_default=").append(is_default);
        sb.append(", name=").append(name);
        sb.append(", send_time_type=").append(send_time_type);
        sb.append(", price=").append(price);
        sb.append(", create_time=").append(create_time);
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
        TbFreightTemplate other = (TbFreightTemplate) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSeller_id() == null ? other.getSeller_id() == null : this.getSeller_id().equals(other.getSeller_id()))
            && (this.getIs_default() == null ? other.getIs_default() == null : this.getIs_default().equals(other.getIs_default()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSend_time_type() == null ? other.getSend_time_type() == null : this.getSend_time_type().equals(other.getSend_time_type()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()));
    }

    /**
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSeller_id() == null) ? 0 : getSeller_id().hashCode());
        result = prime * result + ((getIs_default() == null) ? 0 : getIs_default().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSend_time_type() == null) ? 0 : getSend_time_type().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        return result;
    }

    /**
     */
    public enum Column {
        id("id", "id", "BIGINT", false),
        seller_id("seller_id", "seller_id", "VARCHAR", false),
        is_default("is_default", "is_default", "VARCHAR", false),
        name("name", "name", "VARCHAR", false),
        send_time_type("send_time_type", "send_time_type", "VARCHAR", false),
        price("price", "price", "DECIMAL", false),
        create_time("create_time", "create_time", "TIMESTAMP", false);

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