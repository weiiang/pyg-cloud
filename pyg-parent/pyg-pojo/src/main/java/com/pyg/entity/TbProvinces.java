package com.pyg.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created By WQ
 * Description:
 * 
 */
public class TbProvinces implements Serializable {
    /**
     *   唯一ID
     *
     */
    private Integer id;

    /**
     *   省份ID
     *
     */
    private String provinceid;

    /**
     *   省份名称
     *
     */
    private String province;

    /**
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column tb_provinces.id
     *
     * @return the value of tb_provinces.id
     */
    public Integer getId() {
        return id;
    }

    /**
     */
    public TbProvinces withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_provinces.id
     *
     * @param id the value for tb_provinces.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column tb_provinces.provinceid
     *
     * @return the value of tb_provinces.provinceid
     */
    public String getProvinceid() {
        return provinceid;
    }

    /**
     */
    public TbProvinces withProvinceid(String provinceid) {
        this.setProvinceid(provinceid);
        return this;
    }

    /**
     * This method sets the value of the database column tb_provinces.provinceid
     *
     * @param provinceid the value for tb_provinces.provinceid
     */
    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid == null ? null : provinceid.trim();
    }

    /**
     * This method returns the value of the database column tb_provinces.province
     *
     * @return the value of tb_provinces.province
     */
    public String getProvince() {
        return province;
    }

    /**
     */
    public TbProvinces withProvince(String province) {
        this.setProvince(province);
        return this;
    }

    /**
     * This method sets the value of the database column tb_provinces.province
     *
     * @param province the value for tb_provinces.province
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
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
        sb.append(", provinceid=").append(provinceid);
        sb.append(", province=").append(province);
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
        TbProvinces other = (TbProvinces) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProvinceid() == null ? other.getProvinceid() == null : this.getProvinceid().equals(other.getProvinceid()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()));
    }

    /**
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProvinceid() == null) ? 0 : getProvinceid().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        return result;
    }

    /**
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        provinceid("provinceid", "provinceid", "VARCHAR", false),
        province("province", "province", "VARCHAR", false);

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