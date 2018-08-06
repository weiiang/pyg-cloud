package com.pyg.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created By WQ
 * Description:
 * 
 */
public class TbOrderItem implements Serializable {
    /**
     *
     */
    private Long id;

    /**
     *   商品id
     *
     */
    private Long item_id;

    /**
     *   SPU_ID
     *
     */
    private Long goods_id;

    /**
     *   订单id
     *
     */
    private Long order_id;

    /**
     *   商品标题
     *
     */
    private String title;

    /**
     *   商品单价
     *
     */
    private BigDecimal price;

    /**
     *   商品购买数量
     *
     */
    private Integer num;

    /**
     *   商品总金额
     *
     */
    private BigDecimal total_fee;

    /**
     *   商品图片地址
     *
     */
    private String pic_path;

    /**
     *
     */
    private String seller_id;

    /**
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column tb_order_item.id
     *
     * @return the value of tb_order_item.id
     */
    public Long getId() {
        return id;
    }

    /**
     */
    public TbOrderItem withId(Long id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_order_item.id
     *
     * @param id the value for tb_order_item.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column tb_order_item.item_id
     *
     * @return the value of tb_order_item.item_id
     */
    public Long getItem_id() {
        return item_id;
    }

    /**
     */
    public TbOrderItem withItem_id(Long item_id) {
        this.setItem_id(item_id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_order_item.item_id
     *
     * @param item_id the value for tb_order_item.item_id
     */
    public void setItem_id(Long item_id) {
        this.item_id = item_id;
    }

    /**
     * This method returns the value of the database column tb_order_item.goods_id
     *
     * @return the value of tb_order_item.goods_id
     */
    public Long getGoods_id() {
        return goods_id;
    }

    /**
     */
    public TbOrderItem withGoods_id(Long goods_id) {
        this.setGoods_id(goods_id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_order_item.goods_id
     *
     * @param goods_id the value for tb_order_item.goods_id
     */
    public void setGoods_id(Long goods_id) {
        this.goods_id = goods_id;
    }

    /**
     * This method returns the value of the database column tb_order_item.order_id
     *
     * @return the value of tb_order_item.order_id
     */
    public Long getOrder_id() {
        return order_id;
    }

    /**
     */
    public TbOrderItem withOrder_id(Long order_id) {
        this.setOrder_id(order_id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_order_item.order_id
     *
     * @param order_id the value for tb_order_item.order_id
     */
    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    /**
     * This method returns the value of the database column tb_order_item.title
     *
     * @return the value of tb_order_item.title
     */
    public String getTitle() {
        return title;
    }

    /**
     */
    public TbOrderItem withTitle(String title) {
        this.setTitle(title);
        return this;
    }

    /**
     * This method sets the value of the database column tb_order_item.title
     *
     * @param title the value for tb_order_item.title
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method returns the value of the database column tb_order_item.price
     *
     * @return the value of tb_order_item.price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     */
    public TbOrderItem withPrice(BigDecimal price) {
        this.setPrice(price);
        return this;
    }

    /**
     * This method sets the value of the database column tb_order_item.price
     *
     * @param price the value for tb_order_item.price
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method returns the value of the database column tb_order_item.num
     *
     * @return the value of tb_order_item.num
     */
    public Integer getNum() {
        return num;
    }

    /**
     */
    public TbOrderItem withNum(Integer num) {
        this.setNum(num);
        return this;
    }

    /**
     * This method sets the value of the database column tb_order_item.num
     *
     * @param num the value for tb_order_item.num
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * This method returns the value of the database column tb_order_item.total_fee
     *
     * @return the value of tb_order_item.total_fee
     */
    public BigDecimal getTotal_fee() {
        return total_fee;
    }

    /**
     */
    public TbOrderItem withTotal_fee(BigDecimal total_fee) {
        this.setTotal_fee(total_fee);
        return this;
    }

    /**
     * This method sets the value of the database column tb_order_item.total_fee
     *
     * @param total_fee the value for tb_order_item.total_fee
     */
    public void setTotal_fee(BigDecimal total_fee) {
        this.total_fee = total_fee;
    }

    /**
     * This method returns the value of the database column tb_order_item.pic_path
     *
     * @return the value of tb_order_item.pic_path
     */
    public String getPic_path() {
        return pic_path;
    }

    /**
     */
    public TbOrderItem withPic_path(String pic_path) {
        this.setPic_path(pic_path);
        return this;
    }

    /**
     * This method sets the value of the database column tb_order_item.pic_path
     *
     * @param pic_path the value for tb_order_item.pic_path
     */
    public void setPic_path(String pic_path) {
        this.pic_path = pic_path == null ? null : pic_path.trim();
    }

    /**
     * This method returns the value of the database column tb_order_item.seller_id
     *
     * @return the value of tb_order_item.seller_id
     */
    public String getSeller_id() {
        return seller_id;
    }

    /**
     */
    public TbOrderItem withSeller_id(String seller_id) {
        this.setSeller_id(seller_id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_order_item.seller_id
     *
     * @param seller_id the value for tb_order_item.seller_id
     */
    public void setSeller_id(String seller_id) {
        this.seller_id = seller_id == null ? null : seller_id.trim();
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
        sb.append(", item_id=").append(item_id);
        sb.append(", goods_id=").append(goods_id);
        sb.append(", order_id=").append(order_id);
        sb.append(", title=").append(title);
        sb.append(", price=").append(price);
        sb.append(", num=").append(num);
        sb.append(", total_fee=").append(total_fee);
        sb.append(", pic_path=").append(pic_path);
        sb.append(", seller_id=").append(seller_id);
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
        TbOrderItem other = (TbOrderItem) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getItem_id() == null ? other.getItem_id() == null : this.getItem_id().equals(other.getItem_id()))
            && (this.getGoods_id() == null ? other.getGoods_id() == null : this.getGoods_id().equals(other.getGoods_id()))
            && (this.getOrder_id() == null ? other.getOrder_id() == null : this.getOrder_id().equals(other.getOrder_id()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()))
            && (this.getTotal_fee() == null ? other.getTotal_fee() == null : this.getTotal_fee().equals(other.getTotal_fee()))
            && (this.getPic_path() == null ? other.getPic_path() == null : this.getPic_path().equals(other.getPic_path()))
            && (this.getSeller_id() == null ? other.getSeller_id() == null : this.getSeller_id().equals(other.getSeller_id()));
    }

    /**
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getItem_id() == null) ? 0 : getItem_id().hashCode());
        result = prime * result + ((getGoods_id() == null) ? 0 : getGoods_id().hashCode());
        result = prime * result + ((getOrder_id() == null) ? 0 : getOrder_id().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
        result = prime * result + ((getTotal_fee() == null) ? 0 : getTotal_fee().hashCode());
        result = prime * result + ((getPic_path() == null) ? 0 : getPic_path().hashCode());
        result = prime * result + ((getSeller_id() == null) ? 0 : getSeller_id().hashCode());
        return result;
    }

    /**
     */
    public enum Column {
        id("id", "id", "BIGINT", false),
        item_id("item_id", "item_id", "BIGINT", false),
        goods_id("goods_id", "goods_id", "BIGINT", false),
        order_id("order_id", "order_id", "BIGINT", false),
        title("title", "title", "VARCHAR", false),
        price("price", "price", "DECIMAL", false),
        num("num", "num", "INTEGER", false),
        total_fee("total_fee", "total_fee", "DECIMAL", false),
        pic_path("pic_path", "pic_path", "VARCHAR", false),
        seller_id("seller_id", "seller_id", "VARCHAR", false);

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