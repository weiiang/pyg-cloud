package com.pyg.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created By WQ
 * Description:
 * 
 */
public class TbContent implements Serializable {
    /**
     *
     */
    private Long id;

    /**
     *   内容类目ID
     *
     */
    private Long category_id;

    /**
     *   内容标题
     *
     */
    private String title;

    /**
     *   链接
     *
     */
    private String url;

    /**
     *   图片绝对路径
     *
     */
    private String pic;

    /**
     *   状态
     *
     */
    private String status;

    /**
     *   排序
     *
     */
    private Integer sort_order;

    /**
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column tb_content.id
     *
     * @return the value of tb_content.id
     */
    public Long getId() {
        return id;
    }

    /**
     */
    public TbContent withId(Long id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_content.id
     *
     * @param id the value for tb_content.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column tb_content.category_id
     *
     * @return the value of tb_content.category_id
     */
    public Long getCategory_id() {
        return category_id;
    }

    /**
     */
    public TbContent withCategory_id(Long category_id) {
        this.setCategory_id(category_id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_content.category_id
     *
     * @param category_id the value for tb_content.category_id
     */
    public void setCategory_id(Long category_id) {
        this.category_id = category_id;
    }

    /**
     * This method returns the value of the database column tb_content.title
     *
     * @return the value of tb_content.title
     */
    public String getTitle() {
        return title;
    }

    /**
     */
    public TbContent withTitle(String title) {
        this.setTitle(title);
        return this;
    }

    /**
     * This method sets the value of the database column tb_content.title
     *
     * @param title the value for tb_content.title
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method returns the value of the database column tb_content.url
     *
     * @return the value of tb_content.url
     */
    public String getUrl() {
        return url;
    }

    /**
     */
    public TbContent withUrl(String url) {
        this.setUrl(url);
        return this;
    }

    /**
     * This method sets the value of the database column tb_content.url
     *
     * @param url the value for tb_content.url
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method returns the value of the database column tb_content.pic
     *
     * @return the value of tb_content.pic
     */
    public String getPic() {
        return pic;
    }

    /**
     */
    public TbContent withPic(String pic) {
        this.setPic(pic);
        return this;
    }

    /**
     * This method sets the value of the database column tb_content.pic
     *
     * @param pic the value for tb_content.pic
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    /**
     * This method returns the value of the database column tb_content.status
     *
     * @return the value of tb_content.status
     */
    public String getStatus() {
        return status;
    }

    /**
     */
    public TbContent withStatus(String status) {
        this.setStatus(status);
        return this;
    }

    /**
     * This method sets the value of the database column tb_content.status
     *
     * @param status the value for tb_content.status
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method returns the value of the database column tb_content.sort_order
     *
     * @return the value of tb_content.sort_order
     */
    public Integer getSort_order() {
        return sort_order;
    }

    /**
     */
    public TbContent withSort_order(Integer sort_order) {
        this.setSort_order(sort_order);
        return this;
    }

    /**
     * This method sets the value of the database column tb_content.sort_order
     *
     * @param sort_order the value for tb_content.sort_order
     */
    public void setSort_order(Integer sort_order) {
        this.sort_order = sort_order;
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
        sb.append(", category_id=").append(category_id);
        sb.append(", title=").append(title);
        sb.append(", url=").append(url);
        sb.append(", pic=").append(pic);
        sb.append(", status=").append(status);
        sb.append(", sort_order=").append(sort_order);
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
        TbContent other = (TbContent) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCategory_id() == null ? other.getCategory_id() == null : this.getCategory_id().equals(other.getCategory_id()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getPic() == null ? other.getPic() == null : this.getPic().equals(other.getPic()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getSort_order() == null ? other.getSort_order() == null : this.getSort_order().equals(other.getSort_order()));
    }

    /**
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCategory_id() == null) ? 0 : getCategory_id().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getPic() == null) ? 0 : getPic().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSort_order() == null) ? 0 : getSort_order().hashCode());
        return result;
    }

    /**
     */
    public enum Column {
        id("id", "id", "BIGINT", false),
        category_id("category_id", "category_id", "BIGINT", false),
        title("title", "title", "VARCHAR", false),
        url("url", "url", "VARCHAR", false),
        pic("pic", "pic", "VARCHAR", false),
        status("status", "status", "VARCHAR", false),
        sort_order("sort_order", "sort_order", "INTEGER", false);

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