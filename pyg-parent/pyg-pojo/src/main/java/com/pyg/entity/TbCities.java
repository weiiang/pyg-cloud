package com.pyg.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created By WQ
 * Description:
 * 
 */
public class TbCities implements Serializable {
    /**
     *   唯一ID
     *
     */
    private Integer id;

    /**
     *   城市ID
     *
     */
    private String cityid;

    /**
     *   城市名称
     *
     */
    private String city;

    /**
     *   省份ID
     *
     */
    private String provinceid;

    /**
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column tb_cities.id
     *
     * @return the value of tb_cities.id
     */
    public Integer getId() {
        return id;
    }

    /**
     */
    public TbCities withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_cities.id
     *
     * @param id the value for tb_cities.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column tb_cities.cityid
     *
     * @return the value of tb_cities.cityid
     */
    public String getCityid() {
        return cityid;
    }

    /**
     */
    public TbCities withCityid(String cityid) {
        this.setCityid(cityid);
        return this;
    }

    /**
     * This method sets the value of the database column tb_cities.cityid
     *
     * @param cityid the value for tb_cities.cityid
     */
    public void setCityid(String cityid) {
        this.cityid = cityid == null ? null : cityid.trim();
    }

    /**
     * This method returns the value of the database column tb_cities.city
     *
     * @return the value of tb_cities.city
     */
    public String getCity() {
        return city;
    }

    /**
     */
    public TbCities withCity(String city) {
        this.setCity(city);
        return this;
    }

    /**
     * This method sets the value of the database column tb_cities.city
     *
     * @param city the value for tb_cities.city
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method returns the value of the database column tb_cities.provinceid
     *
     * @return the value of tb_cities.provinceid
     */
    public String getProvinceid() {
        return provinceid;
    }

    /**
     */
    public TbCities withProvinceid(String provinceid) {
        this.setProvinceid(provinceid);
        return this;
    }

    /**
     * This method sets the value of the database column tb_cities.provinceid
     *
     * @param provinceid the value for tb_cities.provinceid
     */
    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid == null ? null : provinceid.trim();
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
        sb.append(", cityid=").append(cityid);
        sb.append(", city=").append(city);
        sb.append(", provinceid=").append(provinceid);
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
        TbCities other = (TbCities) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCityid() == null ? other.getCityid() == null : this.getCityid().equals(other.getCityid()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getProvinceid() == null ? other.getProvinceid() == null : this.getProvinceid().equals(other.getProvinceid()));
    }

    /**
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCityid() == null) ? 0 : getCityid().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getProvinceid() == null) ? 0 : getProvinceid().hashCode());
        return result;
    }

    /**
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        cityid("cityid", "cityid", "VARCHAR", false),
        city("city", "city", "VARCHAR", false),
        provinceid("provinceid", "provinceid", "VARCHAR", false);

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