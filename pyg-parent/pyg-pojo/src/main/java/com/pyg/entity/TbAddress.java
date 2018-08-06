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
public class TbAddress implements Serializable {
    /**
     *
     */
    private Long id;

    /**
     *   用户ID
     *
     */
    private String user_id;

    /**
     *   省
     *
     */
    private String province_id;

    /**
     *   市
     *
     */
    private String city_id;

    /**
     *   县/区
     *
     */
    private String town_id;

    /**
     *   手机
     *
     */
    private String mobile;

    /**
     *   详细地址
     *
     */
    private String address;

    /**
     *   联系人
     *
     */
    private String contact;

    /**
     *   是否是默认 1默认 0否
     *
     */
    private String is_default;

    /**
     *   备注
     *
     */
    private String notes;

    /**
     *   创建日期
     *
     */
    private Date create_date;

    /**
     *   别名
     *
     */
    private String alias;

    /**
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column tb_address.id
     *
     * @return the value of tb_address.id
     */
    public Long getId() {
        return id;
    }

    /**
     */
    public TbAddress withId(Long id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_address.id
     *
     * @param id the value for tb_address.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column tb_address.user_id
     *
     * @return the value of tb_address.user_id
     */
    public String getUser_id() {
        return user_id;
    }

    /**
     */
    public TbAddress withUser_id(String user_id) {
        this.setUser_id(user_id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_address.user_id
     *
     * @param user_id the value for tb_address.user_id
     */
    public void setUser_id(String user_id) {
        this.user_id = user_id == null ? null : user_id.trim();
    }

    /**
     * This method returns the value of the database column tb_address.province_id
     *
     * @return the value of tb_address.province_id
     */
    public String getProvince_id() {
        return province_id;
    }

    /**
     */
    public TbAddress withProvince_id(String province_id) {
        this.setProvince_id(province_id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_address.province_id
     *
     * @param province_id the value for tb_address.province_id
     */
    public void setProvince_id(String province_id) {
        this.province_id = province_id == null ? null : province_id.trim();
    }

    /**
     * This method returns the value of the database column tb_address.city_id
     *
     * @return the value of tb_address.city_id
     */
    public String getCity_id() {
        return city_id;
    }

    /**
     */
    public TbAddress withCity_id(String city_id) {
        this.setCity_id(city_id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_address.city_id
     *
     * @param city_id the value for tb_address.city_id
     */
    public void setCity_id(String city_id) {
        this.city_id = city_id == null ? null : city_id.trim();
    }

    /**
     * This method returns the value of the database column tb_address.town_id
     *
     * @return the value of tb_address.town_id
     */
    public String getTown_id() {
        return town_id;
    }

    /**
     */
    public TbAddress withTown_id(String town_id) {
        this.setTown_id(town_id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_address.town_id
     *
     * @param town_id the value for tb_address.town_id
     */
    public void setTown_id(String town_id) {
        this.town_id = town_id == null ? null : town_id.trim();
    }

    /**
     * This method returns the value of the database column tb_address.mobile
     *
     * @return the value of tb_address.mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     */
    public TbAddress withMobile(String mobile) {
        this.setMobile(mobile);
        return this;
    }

    /**
     * This method sets the value of the database column tb_address.mobile
     *
     * @param mobile the value for tb_address.mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method returns the value of the database column tb_address.address
     *
     * @return the value of tb_address.address
     */
    public String getAddress() {
        return address;
    }

    /**
     */
    public TbAddress withAddress(String address) {
        this.setAddress(address);
        return this;
    }

    /**
     * This method sets the value of the database column tb_address.address
     *
     * @param address the value for tb_address.address
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method returns the value of the database column tb_address.contact
     *
     * @return the value of tb_address.contact
     */
    public String getContact() {
        return contact;
    }

    /**
     */
    public TbAddress withContact(String contact) {
        this.setContact(contact);
        return this;
    }

    /**
     * This method sets the value of the database column tb_address.contact
     *
     * @param contact the value for tb_address.contact
     */
    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    /**
     * This method returns the value of the database column tb_address.is_default
     *
     * @return the value of tb_address.is_default
     */
    public String getIs_default() {
        return is_default;
    }

    /**
     */
    public TbAddress withIs_default(String is_default) {
        this.setIs_default(is_default);
        return this;
    }

    /**
     * This method sets the value of the database column tb_address.is_default
     *
     * @param is_default the value for tb_address.is_default
     */
    public void setIs_default(String is_default) {
        this.is_default = is_default == null ? null : is_default.trim();
    }

    /**
     * This method returns the value of the database column tb_address.notes
     *
     * @return the value of tb_address.notes
     */
    public String getNotes() {
        return notes;
    }

    /**
     */
    public TbAddress withNotes(String notes) {
        this.setNotes(notes);
        return this;
    }

    /**
     * This method sets the value of the database column tb_address.notes
     *
     * @param notes the value for tb_address.notes
     */
    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    /**
     * This method returns the value of the database column tb_address.create_date
     *
     * @return the value of tb_address.create_date
     */
    public Date getCreate_date() {
        return create_date;
    }

    /**
     */
    public TbAddress withCreate_date(Date create_date) {
        this.setCreate_date(create_date);
        return this;
    }

    /**
     * This method sets the value of the database column tb_address.create_date
     *
     * @param create_date the value for tb_address.create_date
     */
    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    /**
     * This method returns the value of the database column tb_address.alias
     *
     * @return the value of tb_address.alias
     */
    public String getAlias() {
        return alias;
    }

    /**
     */
    public TbAddress withAlias(String alias) {
        this.setAlias(alias);
        return this;
    }

    /**
     * This method sets the value of the database column tb_address.alias
     *
     * @param alias the value for tb_address.alias
     */
    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
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
        sb.append(", user_id=").append(user_id);
        sb.append(", province_id=").append(province_id);
        sb.append(", city_id=").append(city_id);
        sb.append(", town_id=").append(town_id);
        sb.append(", mobile=").append(mobile);
        sb.append(", address=").append(address);
        sb.append(", contact=").append(contact);
        sb.append(", is_default=").append(is_default);
        sb.append(", notes=").append(notes);
        sb.append(", create_date=").append(create_date);
        sb.append(", alias=").append(alias);
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
        TbAddress other = (TbAddress) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getProvince_id() == null ? other.getProvince_id() == null : this.getProvince_id().equals(other.getProvince_id()))
            && (this.getCity_id() == null ? other.getCity_id() == null : this.getCity_id().equals(other.getCity_id()))
            && (this.getTown_id() == null ? other.getTown_id() == null : this.getTown_id().equals(other.getTown_id()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getContact() == null ? other.getContact() == null : this.getContact().equals(other.getContact()))
            && (this.getIs_default() == null ? other.getIs_default() == null : this.getIs_default().equals(other.getIs_default()))
            && (this.getNotes() == null ? other.getNotes() == null : this.getNotes().equals(other.getNotes()))
            && (this.getCreate_date() == null ? other.getCreate_date() == null : this.getCreate_date().equals(other.getCreate_date()))
            && (this.getAlias() == null ? other.getAlias() == null : this.getAlias().equals(other.getAlias()));
    }

    /**
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getProvince_id() == null) ? 0 : getProvince_id().hashCode());
        result = prime * result + ((getCity_id() == null) ? 0 : getCity_id().hashCode());
        result = prime * result + ((getTown_id() == null) ? 0 : getTown_id().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getContact() == null) ? 0 : getContact().hashCode());
        result = prime * result + ((getIs_default() == null) ? 0 : getIs_default().hashCode());
        result = prime * result + ((getNotes() == null) ? 0 : getNotes().hashCode());
        result = prime * result + ((getCreate_date() == null) ? 0 : getCreate_date().hashCode());
        result = prime * result + ((getAlias() == null) ? 0 : getAlias().hashCode());
        return result;
    }

    /**
     */
    public enum Column {
        id("id", "id", "BIGINT", false),
        user_id("user_id", "user_id", "VARCHAR", false),
        province_id("province_id", "province_id", "VARCHAR", false),
        city_id("city_id", "city_id", "VARCHAR", false),
        town_id("town_id", "town_id", "VARCHAR", false),
        mobile("mobile", "mobile", "VARCHAR", false),
        address("address", "address", "VARCHAR", false),
        contact("contact", "contact", "VARCHAR", false),
        is_default("is_default", "is_default", "VARCHAR", false),
        notes("notes", "notes", "VARCHAR", false),
        create_date("create_date", "create_date", "TIMESTAMP", false),
        alias("alias", "alias", "VARCHAR", false);

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