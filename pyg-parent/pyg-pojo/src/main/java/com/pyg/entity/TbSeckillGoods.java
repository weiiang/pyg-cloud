package com.pyg.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 * Created By WQ
 * Description:
 * 
 */
public class TbSeckillGoods implements Serializable {
    /**
     *
     */
    private Long id;

    /**
     *   spu ID
     *
     */
    private Long goods_id;

    /**
     *   sku ID
     *
     */
    private Long item_id;

    /**
     *   标题
     *
     */
    private String title;

    /**
     *   商品图片
     *
     */
    private String small_pic;

    /**
     *   原价格
     *
     */
    private BigDecimal price;

    /**
     *   秒杀价格
     *
     */
    private BigDecimal cost_price;

    /**
     *   商家ID
     *
     */
    private String seller_id;

    /**
     *   添加日期
     *
     */
    private Date create_time;

    /**
     *   审核日期
     *
     */
    private Date check_time;

    /**
     *   审核状态
     *
     */
    private String status;

    /**
     *   开始时间
     *
     */
    private Date start_time;

    /**
     *   结束时间
     *
     */
    private Date end_time;

    /**
     *   秒杀商品数
     *
     */
    private Integer num;

    /**
     *   剩余库存数
     *
     */
    private Integer stock_count;

    /**
     *   描述
     *
     */
    private String introduction;

    /**
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column tb_seckill_goods.id
     *
     * @return the value of tb_seckill_goods.id
     */
    public Long getId() {
        return id;
    }

    /**
     */
    public TbSeckillGoods withId(Long id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seckill_goods.id
     *
     * @param id the value for tb_seckill_goods.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column tb_seckill_goods.goods_id
     *
     * @return the value of tb_seckill_goods.goods_id
     */
    public Long getGoods_id() {
        return goods_id;
    }

    /**
     */
    public TbSeckillGoods withGoods_id(Long goods_id) {
        this.setGoods_id(goods_id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seckill_goods.goods_id
     *
     * @param goods_id the value for tb_seckill_goods.goods_id
     */
    public void setGoods_id(Long goods_id) {
        this.goods_id = goods_id;
    }

    /**
     * This method returns the value of the database column tb_seckill_goods.item_id
     *
     * @return the value of tb_seckill_goods.item_id
     */
    public Long getItem_id() {
        return item_id;
    }

    /**
     */
    public TbSeckillGoods withItem_id(Long item_id) {
        this.setItem_id(item_id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seckill_goods.item_id
     *
     * @param item_id the value for tb_seckill_goods.item_id
     */
    public void setItem_id(Long item_id) {
        this.item_id = item_id;
    }

    /**
     * This method returns the value of the database column tb_seckill_goods.title
     *
     * @return the value of tb_seckill_goods.title
     */
    public String getTitle() {
        return title;
    }

    /**
     */
    public TbSeckillGoods withTitle(String title) {
        this.setTitle(title);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seckill_goods.title
     *
     * @param title the value for tb_seckill_goods.title
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method returns the value of the database column tb_seckill_goods.small_pic
     *
     * @return the value of tb_seckill_goods.small_pic
     */
    public String getSmall_pic() {
        return small_pic;
    }

    /**
     */
    public TbSeckillGoods withSmall_pic(String small_pic) {
        this.setSmall_pic(small_pic);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seckill_goods.small_pic
     *
     * @param small_pic the value for tb_seckill_goods.small_pic
     */
    public void setSmall_pic(String small_pic) {
        this.small_pic = small_pic == null ? null : small_pic.trim();
    }

    /**
     * This method returns the value of the database column tb_seckill_goods.price
     *
     * @return the value of tb_seckill_goods.price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     */
    public TbSeckillGoods withPrice(BigDecimal price) {
        this.setPrice(price);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seckill_goods.price
     *
     * @param price the value for tb_seckill_goods.price
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method returns the value of the database column tb_seckill_goods.cost_price
     *
     * @return the value of tb_seckill_goods.cost_price
     */
    public BigDecimal getCost_price() {
        return cost_price;
    }

    /**
     */
    public TbSeckillGoods withCost_price(BigDecimal cost_price) {
        this.setCost_price(cost_price);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seckill_goods.cost_price
     *
     * @param cost_price the value for tb_seckill_goods.cost_price
     */
    public void setCost_price(BigDecimal cost_price) {
        this.cost_price = cost_price;
    }

    /**
     * This method returns the value of the database column tb_seckill_goods.seller_id
     *
     * @return the value of tb_seckill_goods.seller_id
     */
    public String getSeller_id() {
        return seller_id;
    }

    /**
     */
    public TbSeckillGoods withSeller_id(String seller_id) {
        this.setSeller_id(seller_id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seckill_goods.seller_id
     *
     * @param seller_id the value for tb_seckill_goods.seller_id
     */
    public void setSeller_id(String seller_id) {
        this.seller_id = seller_id == null ? null : seller_id.trim();
    }

    /**
     * This method returns the value of the database column tb_seckill_goods.create_time
     *
     * @return the value of tb_seckill_goods.create_time
     */
    public Date getCreate_time() {
        return create_time;
    }

    /**
     */
    public TbSeckillGoods withCreate_time(Date create_time) {
        this.setCreate_time(create_time);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seckill_goods.create_time
     *
     * @param create_time the value for tb_seckill_goods.create_time
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    /**
     * This method returns the value of the database column tb_seckill_goods.check_time
     *
     * @return the value of tb_seckill_goods.check_time
     */
    public Date getCheck_time() {
        return check_time;
    }

    /**
     */
    public TbSeckillGoods withCheck_time(Date check_time) {
        this.setCheck_time(check_time);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seckill_goods.check_time
     *
     * @param check_time the value for tb_seckill_goods.check_time
     */
    public void setCheck_time(Date check_time) {
        this.check_time = check_time;
    }

    /**
     * This method returns the value of the database column tb_seckill_goods.status
     *
     * @return the value of tb_seckill_goods.status
     */
    public String getStatus() {
        return status;
    }

    /**
     */
    public TbSeckillGoods withStatus(String status) {
        this.setStatus(status);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seckill_goods.status
     *
     * @param status the value for tb_seckill_goods.status
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method returns the value of the database column tb_seckill_goods.start_time
     *
     * @return the value of tb_seckill_goods.start_time
     */
    public Date getStart_time() {
        return start_time;
    }

    /**
     */
    public TbSeckillGoods withStart_time(Date start_time) {
        this.setStart_time(start_time);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seckill_goods.start_time
     *
     * @param start_time the value for tb_seckill_goods.start_time
     */
    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    /**
     * This method returns the value of the database column tb_seckill_goods.end_time
     *
     * @return the value of tb_seckill_goods.end_time
     */
    public Date getEnd_time() {
        return end_time;
    }

    /**
     */
    public TbSeckillGoods withEnd_time(Date end_time) {
        this.setEnd_time(end_time);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seckill_goods.end_time
     *
     * @param end_time the value for tb_seckill_goods.end_time
     */
    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    /**
     * This method returns the value of the database column tb_seckill_goods.num
     *
     * @return the value of tb_seckill_goods.num
     */
    public Integer getNum() {
        return num;
    }

    /**
     */
    public TbSeckillGoods withNum(Integer num) {
        this.setNum(num);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seckill_goods.num
     *
     * @param num the value for tb_seckill_goods.num
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * This method returns the value of the database column tb_seckill_goods.stock_count
     *
     * @return the value of tb_seckill_goods.stock_count
     */
    public Integer getStock_count() {
        return stock_count;
    }

    /**
     */
    public TbSeckillGoods withStock_count(Integer stock_count) {
        this.setStock_count(stock_count);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seckill_goods.stock_count
     *
     * @param stock_count the value for tb_seckill_goods.stock_count
     */
    public void setStock_count(Integer stock_count) {
        this.stock_count = stock_count;
    }

    /**
     * This method returns the value of the database column tb_seckill_goods.introduction
     *
     * @return the value of tb_seckill_goods.introduction
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     */
    public TbSeckillGoods withIntroduction(String introduction) {
        this.setIntroduction(introduction);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seckill_goods.introduction
     *
     * @param introduction the value for tb_seckill_goods.introduction
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
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
        sb.append(", goods_id=").append(goods_id);
        sb.append(", item_id=").append(item_id);
        sb.append(", title=").append(title);
        sb.append(", small_pic=").append(small_pic);
        sb.append(", price=").append(price);
        sb.append(", cost_price=").append(cost_price);
        sb.append(", seller_id=").append(seller_id);
        sb.append(", create_time=").append(create_time);
        sb.append(", check_time=").append(check_time);
        sb.append(", status=").append(status);
        sb.append(", start_time=").append(start_time);
        sb.append(", end_time=").append(end_time);
        sb.append(", num=").append(num);
        sb.append(", stock_count=").append(stock_count);
        sb.append(", introduction=").append(introduction);
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
        TbSeckillGoods other = (TbSeckillGoods) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGoods_id() == null ? other.getGoods_id() == null : this.getGoods_id().equals(other.getGoods_id()))
            && (this.getItem_id() == null ? other.getItem_id() == null : this.getItem_id().equals(other.getItem_id()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getSmall_pic() == null ? other.getSmall_pic() == null : this.getSmall_pic().equals(other.getSmall_pic()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getCost_price() == null ? other.getCost_price() == null : this.getCost_price().equals(other.getCost_price()))
            && (this.getSeller_id() == null ? other.getSeller_id() == null : this.getSeller_id().equals(other.getSeller_id()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getCheck_time() == null ? other.getCheck_time() == null : this.getCheck_time().equals(other.getCheck_time()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getStart_time() == null ? other.getStart_time() == null : this.getStart_time().equals(other.getStart_time()))
            && (this.getEnd_time() == null ? other.getEnd_time() == null : this.getEnd_time().equals(other.getEnd_time()))
            && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()))
            && (this.getStock_count() == null ? other.getStock_count() == null : this.getStock_count().equals(other.getStock_count()))
            && (this.getIntroduction() == null ? other.getIntroduction() == null : this.getIntroduction().equals(other.getIntroduction()));
    }

    /**
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGoods_id() == null) ? 0 : getGoods_id().hashCode());
        result = prime * result + ((getItem_id() == null) ? 0 : getItem_id().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getSmall_pic() == null) ? 0 : getSmall_pic().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getCost_price() == null) ? 0 : getCost_price().hashCode());
        result = prime * result + ((getSeller_id() == null) ? 0 : getSeller_id().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getCheck_time() == null) ? 0 : getCheck_time().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getStart_time() == null) ? 0 : getStart_time().hashCode());
        result = prime * result + ((getEnd_time() == null) ? 0 : getEnd_time().hashCode());
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
        result = prime * result + ((getStock_count() == null) ? 0 : getStock_count().hashCode());
        result = prime * result + ((getIntroduction() == null) ? 0 : getIntroduction().hashCode());
        return result;
    }

    /**
     */
    public enum Column {
        id("id", "id", "BIGINT", false),
        goods_id("goods_id", "goods_id", "BIGINT", false),
        item_id("item_id", "item_id", "BIGINT", false),
        title("title", "title", "VARCHAR", false),
        small_pic("small_pic", "small_pic", "VARCHAR", false),
        price("price", "price", "DECIMAL", false),
        cost_price("cost_price", "cost_price", "DECIMAL", false),
        seller_id("seller_id", "seller_id", "VARCHAR", false),
        create_time("create_time", "create_time", "TIMESTAMP", false),
        check_time("check_time", "check_time", "TIMESTAMP", false),
        status("status", "status", "VARCHAR", false),
        start_time("start_time", "start_time", "TIMESTAMP", false),
        end_time("end_time", "end_time", "TIMESTAMP", false),
        num("num", "num", "INTEGER", false),
        stock_count("stock_count", "stock_count", "INTEGER", false),
        introduction("introduction", "introduction", "VARCHAR", false);

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