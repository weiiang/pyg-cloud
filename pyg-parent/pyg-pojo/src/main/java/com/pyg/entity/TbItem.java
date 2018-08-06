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
public class TbItem implements Serializable {
    /**
     *   商品id，同时也是商品编号
     *
     */
    private Long id;

    /**
     *   商品标题
     *
     */
    private String title;

    /**
     *   商品卖点
     *
     */
    private String sell_point;

    /**
     *   商品价格，单位为：元
     *
     */
    private BigDecimal price;

    /**
     *
     */
    private Integer stock_count;

    /**
     *   库存数量
     *
     */
    private Integer num;

    /**
     *   商品条形码
     *
     */
    private String barcode;

    /**
     *   商品图片
     *
     */
    private String image;

    /**
     *   所属类目，叶子类目
     *
     */
    private Long categoryId;

    /**
     *   商品状态，1-正常，2-下架，3-删除
     *
     */
    private String status;

    /**
     *   创建时间
     *
     */
    private Date create_time;

    /**
     *   更新时间
     *
     */
    private Date update_time;

    /**
     *
     */
    private String item_sn;

    /**
     *
     */
    private BigDecimal cost_pirce;

    /**
     *
     */
    private BigDecimal market_price;

    /**
     *
     */
    private String is_default;

    /**
     *
     */
    private Long goods_id;

    /**
     *
     */
    private String seller_id;

    /**
     *
     */
    private String cart_thumbnail;

    /**
     *
     */
    private String category;

    /**
     *
     */
    private String brand;

    /**
     *
     */
    private String spec;

    /**
     *
     */
    private String seller;

    /**
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column tb_item.id
     *
     * @return the value of tb_item.id
     */
    public Long getId() {
        return id;
    }

    /**
     */
    public TbItem withId(Long id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_item.id
     *
     * @param id the value for tb_item.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column tb_item.title
     *
     * @return the value of tb_item.title
     */
    public String getTitle() {
        return title;
    }

    /**
     */
    public TbItem withTitle(String title) {
        this.setTitle(title);
        return this;
    }

    /**
     * This method sets the value of the database column tb_item.title
     *
     * @param title the value for tb_item.title
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method returns the value of the database column tb_item.sell_point
     *
     * @return the value of tb_item.sell_point
     */
    public String getSell_point() {
        return sell_point;
    }

    /**
     */
    public TbItem withSell_point(String sell_point) {
        this.setSell_point(sell_point);
        return this;
    }

    /**
     * This method sets the value of the database column tb_item.sell_point
     *
     * @param sell_point the value for tb_item.sell_point
     */
    public void setSell_point(String sell_point) {
        this.sell_point = sell_point == null ? null : sell_point.trim();
    }

    /**
     * This method returns the value of the database column tb_item.price
     *
     * @return the value of tb_item.price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     */
    public TbItem withPrice(BigDecimal price) {
        this.setPrice(price);
        return this;
    }

    /**
     * This method sets the value of the database column tb_item.price
     *
     * @param price the value for tb_item.price
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method returns the value of the database column tb_item.stock_count
     *
     * @return the value of tb_item.stock_count
     */
    public Integer getStock_count() {
        return stock_count;
    }

    /**
     */
    public TbItem withStock_count(Integer stock_count) {
        this.setStock_count(stock_count);
        return this;
    }

    /**
     * This method sets the value of the database column tb_item.stock_count
     *
     * @param stock_count the value for tb_item.stock_count
     */
    public void setStock_count(Integer stock_count) {
        this.stock_count = stock_count;
    }

    /**
     * This method returns the value of the database column tb_item.num
     *
     * @return the value of tb_item.num
     */
    public Integer getNum() {
        return num;
    }

    /**
     */
    public TbItem withNum(Integer num) {
        this.setNum(num);
        return this;
    }

    /**
     * This method sets the value of the database column tb_item.num
     *
     * @param num the value for tb_item.num
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * This method returns the value of the database column tb_item.barcode
     *
     * @return the value of tb_item.barcode
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     */
    public TbItem withBarcode(String barcode) {
        this.setBarcode(barcode);
        return this;
    }

    /**
     * This method sets the value of the database column tb_item.barcode
     *
     * @param barcode the value for tb_item.barcode
     */
    public void setBarcode(String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }

    /**
     * This method returns the value of the database column tb_item.image
     *
     * @return the value of tb_item.image
     */
    public String getImage() {
        return image;
    }

    /**
     */
    public TbItem withImage(String image) {
        this.setImage(image);
        return this;
    }

    /**
     * This method sets the value of the database column tb_item.image
     *
     * @param image the value for tb_item.image
     */
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    /**
     * This method returns the value of the database column tb_item.categoryId
     *
     * @return the value of tb_item.categoryId
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     */
    public TbItem withCategoryId(Long categoryId) {
        this.setCategoryId(categoryId);
        return this;
    }

    /**
     * This method sets the value of the database column tb_item.categoryId
     *
     * @param categoryId the value for tb_item.categoryId
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method returns the value of the database column tb_item.status
     *
     * @return the value of tb_item.status
     */
    public String getStatus() {
        return status;
    }

    /**
     */
    public TbItem withStatus(String status) {
        this.setStatus(status);
        return this;
    }

    /**
     * This method sets the value of the database column tb_item.status
     *
     * @param status the value for tb_item.status
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method returns the value of the database column tb_item.create_time
     *
     * @return the value of tb_item.create_time
     */
    public Date getCreate_time() {
        return create_time;
    }

    /**
     */
    public TbItem withCreate_time(Date create_time) {
        this.setCreate_time(create_time);
        return this;
    }

    /**
     * This method sets the value of the database column tb_item.create_time
     *
     * @param create_time the value for tb_item.create_time
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    /**
     * This method returns the value of the database column tb_item.update_time
     *
     * @return the value of tb_item.update_time
     */
    public Date getUpdate_time() {
        return update_time;
    }

    /**
     */
    public TbItem withUpdate_time(Date update_time) {
        this.setUpdate_time(update_time);
        return this;
    }

    /**
     * This method sets the value of the database column tb_item.update_time
     *
     * @param update_time the value for tb_item.update_time
     */
    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    /**
     * This method returns the value of the database column tb_item.item_sn
     *
     * @return the value of tb_item.item_sn
     */
    public String getItem_sn() {
        return item_sn;
    }

    /**
     */
    public TbItem withItem_sn(String item_sn) {
        this.setItem_sn(item_sn);
        return this;
    }

    /**
     * This method sets the value of the database column tb_item.item_sn
     *
     * @param item_sn the value for tb_item.item_sn
     */
    public void setItem_sn(String item_sn) {
        this.item_sn = item_sn == null ? null : item_sn.trim();
    }

    /**
     * This method returns the value of the database column tb_item.cost_pirce
     *
     * @return the value of tb_item.cost_pirce
     */
    public BigDecimal getCost_pirce() {
        return cost_pirce;
    }

    /**
     */
    public TbItem withCost_pirce(BigDecimal cost_pirce) {
        this.setCost_pirce(cost_pirce);
        return this;
    }

    /**
     * This method sets the value of the database column tb_item.cost_pirce
     *
     * @param cost_pirce the value for tb_item.cost_pirce
     */
    public void setCost_pirce(BigDecimal cost_pirce) {
        this.cost_pirce = cost_pirce;
    }

    /**
     * This method returns the value of the database column tb_item.market_price
     *
     * @return the value of tb_item.market_price
     */
    public BigDecimal getMarket_price() {
        return market_price;
    }

    /**
     */
    public TbItem withMarket_price(BigDecimal market_price) {
        this.setMarket_price(market_price);
        return this;
    }

    /**
     * This method sets the value of the database column tb_item.market_price
     *
     * @param market_price the value for tb_item.market_price
     */
    public void setMarket_price(BigDecimal market_price) {
        this.market_price = market_price;
    }

    /**
     * This method returns the value of the database column tb_item.is_default
     *
     * @return the value of tb_item.is_default
     */
    public String getIs_default() {
        return is_default;
    }

    /**
     */
    public TbItem withIs_default(String is_default) {
        this.setIs_default(is_default);
        return this;
    }

    /**
     * This method sets the value of the database column tb_item.is_default
     *
     * @param is_default the value for tb_item.is_default
     */
    public void setIs_default(String is_default) {
        this.is_default = is_default == null ? null : is_default.trim();
    }

    /**
     * This method returns the value of the database column tb_item.goods_id
     *
     * @return the value of tb_item.goods_id
     */
    public Long getGoods_id() {
        return goods_id;
    }

    /**
     */
    public TbItem withGoods_id(Long goods_id) {
        this.setGoods_id(goods_id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_item.goods_id
     *
     * @param goods_id the value for tb_item.goods_id
     */
    public void setGoods_id(Long goods_id) {
        this.goods_id = goods_id;
    }

    /**
     * This method returns the value of the database column tb_item.seller_id
     *
     * @return the value of tb_item.seller_id
     */
    public String getSeller_id() {
        return seller_id;
    }

    /**
     */
    public TbItem withSeller_id(String seller_id) {
        this.setSeller_id(seller_id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_item.seller_id
     *
     * @param seller_id the value for tb_item.seller_id
     */
    public void setSeller_id(String seller_id) {
        this.seller_id = seller_id == null ? null : seller_id.trim();
    }

    /**
     * This method returns the value of the database column tb_item.cart_thumbnail
     *
     * @return the value of tb_item.cart_thumbnail
     */
    public String getCart_thumbnail() {
        return cart_thumbnail;
    }

    /**
     */
    public TbItem withCart_thumbnail(String cart_thumbnail) {
        this.setCart_thumbnail(cart_thumbnail);
        return this;
    }

    /**
     * This method sets the value of the database column tb_item.cart_thumbnail
     *
     * @param cart_thumbnail the value for tb_item.cart_thumbnail
     */
    public void setCart_thumbnail(String cart_thumbnail) {
        this.cart_thumbnail = cart_thumbnail == null ? null : cart_thumbnail.trim();
    }

    /**
     * This method returns the value of the database column tb_item.category
     *
     * @return the value of tb_item.category
     */
    public String getCategory() {
        return category;
    }

    /**
     */
    public TbItem withCategory(String category) {
        this.setCategory(category);
        return this;
    }

    /**
     * This method sets the value of the database column tb_item.category
     *
     * @param category the value for tb_item.category
     */
    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    /**
     * This method returns the value of the database column tb_item.brand
     *
     * @return the value of tb_item.brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     */
    public TbItem withBrand(String brand) {
        this.setBrand(brand);
        return this;
    }

    /**
     * This method sets the value of the database column tb_item.brand
     *
     * @param brand the value for tb_item.brand
     */
    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    /**
     * This method returns the value of the database column tb_item.spec
     *
     * @return the value of tb_item.spec
     */
    public String getSpec() {
        return spec;
    }

    /**
     */
    public TbItem withSpec(String spec) {
        this.setSpec(spec);
        return this;
    }

    /**
     * This method sets the value of the database column tb_item.spec
     *
     * @param spec the value for tb_item.spec
     */
    public void setSpec(String spec) {
        this.spec = spec == null ? null : spec.trim();
    }

    /**
     * This method returns the value of the database column tb_item.seller
     *
     * @return the value of tb_item.seller
     */
    public String getSeller() {
        return seller;
    }

    /**
     */
    public TbItem withSeller(String seller) {
        this.setSeller(seller);
        return this;
    }

    /**
     * This method sets the value of the database column tb_item.seller
     *
     * @param seller the value for tb_item.seller
     */
    public void setSeller(String seller) {
        this.seller = seller == null ? null : seller.trim();
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
        sb.append(", title=").append(title);
        sb.append(", sell_point=").append(sell_point);
        sb.append(", price=").append(price);
        sb.append(", stock_count=").append(stock_count);
        sb.append(", num=").append(num);
        sb.append(", barcode=").append(barcode);
        sb.append(", image=").append(image);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", status=").append(status);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", item_sn=").append(item_sn);
        sb.append(", cost_pirce=").append(cost_pirce);
        sb.append(", market_price=").append(market_price);
        sb.append(", is_default=").append(is_default);
        sb.append(", goods_id=").append(goods_id);
        sb.append(", seller_id=").append(seller_id);
        sb.append(", cart_thumbnail=").append(cart_thumbnail);
        sb.append(", category=").append(category);
        sb.append(", brand=").append(brand);
        sb.append(", spec=").append(spec);
        sb.append(", seller=").append(seller);
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
        TbItem other = (TbItem) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getSell_point() == null ? other.getSell_point() == null : this.getSell_point().equals(other.getSell_point()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getStock_count() == null ? other.getStock_count() == null : this.getStock_count().equals(other.getStock_count()))
            && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()))
            && (this.getBarcode() == null ? other.getBarcode() == null : this.getBarcode().equals(other.getBarcode()))
            && (this.getImage() == null ? other.getImage() == null : this.getImage().equals(other.getImage()))
            && (this.getCategoryId() == null ? other.getCategoryId() == null : this.getCategoryId().equals(other.getCategoryId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getItem_sn() == null ? other.getItem_sn() == null : this.getItem_sn().equals(other.getItem_sn()))
            && (this.getCost_pirce() == null ? other.getCost_pirce() == null : this.getCost_pirce().equals(other.getCost_pirce()))
            && (this.getMarket_price() == null ? other.getMarket_price() == null : this.getMarket_price().equals(other.getMarket_price()))
            && (this.getIs_default() == null ? other.getIs_default() == null : this.getIs_default().equals(other.getIs_default()))
            && (this.getGoods_id() == null ? other.getGoods_id() == null : this.getGoods_id().equals(other.getGoods_id()))
            && (this.getSeller_id() == null ? other.getSeller_id() == null : this.getSeller_id().equals(other.getSeller_id()))
            && (this.getCart_thumbnail() == null ? other.getCart_thumbnail() == null : this.getCart_thumbnail().equals(other.getCart_thumbnail()))
            && (this.getCategory() == null ? other.getCategory() == null : this.getCategory().equals(other.getCategory()))
            && (this.getBrand() == null ? other.getBrand() == null : this.getBrand().equals(other.getBrand()))
            && (this.getSpec() == null ? other.getSpec() == null : this.getSpec().equals(other.getSpec()))
            && (this.getSeller() == null ? other.getSeller() == null : this.getSeller().equals(other.getSeller()));
    }

    /**
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getSell_point() == null) ? 0 : getSell_point().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getStock_count() == null) ? 0 : getStock_count().hashCode());
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
        result = prime * result + ((getBarcode() == null) ? 0 : getBarcode().hashCode());
        result = prime * result + ((getImage() == null) ? 0 : getImage().hashCode());
        result = prime * result + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getItem_sn() == null) ? 0 : getItem_sn().hashCode());
        result = prime * result + ((getCost_pirce() == null) ? 0 : getCost_pirce().hashCode());
        result = prime * result + ((getMarket_price() == null) ? 0 : getMarket_price().hashCode());
        result = prime * result + ((getIs_default() == null) ? 0 : getIs_default().hashCode());
        result = prime * result + ((getGoods_id() == null) ? 0 : getGoods_id().hashCode());
        result = prime * result + ((getSeller_id() == null) ? 0 : getSeller_id().hashCode());
        result = prime * result + ((getCart_thumbnail() == null) ? 0 : getCart_thumbnail().hashCode());
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getBrand() == null) ? 0 : getBrand().hashCode());
        result = prime * result + ((getSpec() == null) ? 0 : getSpec().hashCode());
        result = prime * result + ((getSeller() == null) ? 0 : getSeller().hashCode());
        return result;
    }

    /**
     */
    public enum Column {
        id("id", "id", "BIGINT", false),
        title("title", "title", "VARCHAR", false),
        sell_point("sell_point", "sell_point", "VARCHAR", false),
        price("price", "price", "DECIMAL", false),
        stock_count("stock_count", "stock_count", "INTEGER", false),
        num("num", "num", "INTEGER", false),
        barcode("barcode", "barcode", "VARCHAR", false),
        image("image", "image", "VARCHAR", false),
        categoryId("categoryId", "categoryId", "BIGINT", false),
        status("status", "status", "VARCHAR", false),
        create_time("create_time", "create_time", "TIMESTAMP", false),
        update_time("update_time", "update_time", "TIMESTAMP", false),
        item_sn("item_sn", "item_sn", "VARCHAR", false),
        cost_pirce("cost_pirce", "cost_pirce", "DECIMAL", false),
        market_price("market_price", "market_price", "DECIMAL", false),
        is_default("is_default", "is_default", "VARCHAR", false),
        goods_id("goods_id", "goods_id", "BIGINT", false),
        seller_id("seller_id", "seller_id", "VARCHAR", false),
        cart_thumbnail("cart_thumbnail", "cart_thumbnail", "VARCHAR", false),
        category("category", "category", "VARCHAR", false),
        brand("brand", "brand", "VARCHAR", false),
        spec("spec", "spec", "VARCHAR", false),
        seller("seller", "seller", "VARCHAR", false);

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