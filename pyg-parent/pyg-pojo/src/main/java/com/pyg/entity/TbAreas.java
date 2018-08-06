package com.pyg.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created By WQ
 * Description:
 * 
 */
public class TbAreas implements Serializable {
    /**
     *   唯一ID
     *
     */
    private Integer id;

    /**
     *   区域ID
     *
     */
    private String areaid;

    /**
     *   区域名称
     *
     */
    private String area;

    /**
     *   城市ID
     *
     */
    private String cityid;

    /**
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column tb_areas.id
     *
     * @return the value of tb_areas.id
     */
    public Integer getId() {
        return id;
    }

    /**
     */
    public TbAreas withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_areas.id
     *
     * @param id the value for tb_areas.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column tb_areas.areaid
     *
     * @return the value of tb_areas.areaid
     */
    public String getAreaid() {
        return areaid;
    }

    /**
     */
    public TbAreas withAreaid(String areaid) {
        this.setAreaid(areaid);
        return this;
    }

    /**
     * This method sets the value of the database column tb_areas.areaid
     *
     * @param areaid the value for tb_areas.areaid
     */
    public void setAreaid(String areaid) {
        this.areaid = areaid == null ? null : areaid.trim();
    }

    /**
     * This method returns the value of the database column tb_areas.area
     *
     * @return the value of tb_areas.area
     */
    public String getArea() {
        return area;
    }

    /**
     */
    public TbAreas withArea(String area) {
        this.setArea(area);
        return this;
    }

    /**
     * This method sets the value of the database column tb_areas.area
     *
     * @param area the value for tb_areas.area
     */
    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    /**
     * This method returns the value of the database column tb_areas.cityid
     *
     * @return the value of tb_areas.cityid
     */
    public String getCityid() {
        return cityid;
    }

    /**
     */
    public TbAreas withCityid(String cityid) {
        this.setCityid(cityid);
        return this;
    }

    /**
     * This method sets the value of the database column tb_areas.cityid
     *
     * @param cityid the value for tb_areas.cityid
     */
    public void setCityid(String cityid) {
        this.cityid = cityid == null ? null : cityid.trim();
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
        sb.append(", areaid=").append(areaid);
        sb.append(", area=").append(area);
        sb.append(", cityid=").append(cityid);
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
        TbAreas other = (TbAreas) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAreaid() == null ? other.getAreaid() == null : this.getAreaid().equals(other.getAreaid()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getCityid() == null ? other.getCityid() == null : this.getCityid().equals(other.getCityid()));
    }

    /**
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAreaid() == null) ? 0 : getAreaid().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getCityid() == null) ? 0 : getCityid().hashCode());
        return result;
    }

    /**
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        areaid("areaid", "areaid", "VARCHAR", false),
        area("area", "area", "VARCHAR", false),
        cityid("cityid", "cityid", "VARCHAR", false);

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