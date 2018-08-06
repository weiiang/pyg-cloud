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
public class TbSeckillOrder implements Serializable {
    /**
     *   主键
     *
     */
    private Long id;

    /**
     *   秒杀商品ID
     *
     */
    private Long seckill_id;

    /**
     *   支付金额
     *
     */
    private BigDecimal money;

    /**
     *   用户
     *
     */
    private String user_id;

    /**
     *   商家
     *
     */
    private String seller_id;

    /**
     *   创建时间
     *
     */
    private Date create_time;

    /**
     *   支付时间
     *
     */
    private Date pay_time;

    /**
     *   状态
     *
     */
    private String status;

    /**
     *   收货人地址
     *
     */
    private String receiver_address;

    /**
     *   收货人电话
     *
     */
    private String receiver_mobile;

    /**
     *   收货人
     *
     */
    private String receiver;

    /**
     *   交易流水
     *
     */
    private String transaction_id;

    /**
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column tb_seckill_order.id
     *
     * @return the value of tb_seckill_order.id
     */
    public Long getId() {
        return id;
    }

    /**
     */
    public TbSeckillOrder withId(Long id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seckill_order.id
     *
     * @param id the value for tb_seckill_order.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column tb_seckill_order.seckill_id
     *
     * @return the value of tb_seckill_order.seckill_id
     */
    public Long getSeckill_id() {
        return seckill_id;
    }

    /**
     */
    public TbSeckillOrder withSeckill_id(Long seckill_id) {
        this.setSeckill_id(seckill_id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seckill_order.seckill_id
     *
     * @param seckill_id the value for tb_seckill_order.seckill_id
     */
    public void setSeckill_id(Long seckill_id) {
        this.seckill_id = seckill_id;
    }

    /**
     * This method returns the value of the database column tb_seckill_order.money
     *
     * @return the value of tb_seckill_order.money
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     */
    public TbSeckillOrder withMoney(BigDecimal money) {
        this.setMoney(money);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seckill_order.money
     *
     * @param money the value for tb_seckill_order.money
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * This method returns the value of the database column tb_seckill_order.user_id
     *
     * @return the value of tb_seckill_order.user_id
     */
    public String getUser_id() {
        return user_id;
    }

    /**
     */
    public TbSeckillOrder withUser_id(String user_id) {
        this.setUser_id(user_id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seckill_order.user_id
     *
     * @param user_id the value for tb_seckill_order.user_id
     */
    public void setUser_id(String user_id) {
        this.user_id = user_id == null ? null : user_id.trim();
    }

    /**
     * This method returns the value of the database column tb_seckill_order.seller_id
     *
     * @return the value of tb_seckill_order.seller_id
     */
    public String getSeller_id() {
        return seller_id;
    }

    /**
     */
    public TbSeckillOrder withSeller_id(String seller_id) {
        this.setSeller_id(seller_id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seckill_order.seller_id
     *
     * @param seller_id the value for tb_seckill_order.seller_id
     */
    public void setSeller_id(String seller_id) {
        this.seller_id = seller_id == null ? null : seller_id.trim();
    }

    /**
     * This method returns the value of the database column tb_seckill_order.create_time
     *
     * @return the value of tb_seckill_order.create_time
     */
    public Date getCreate_time() {
        return create_time;
    }

    /**
     */
    public TbSeckillOrder withCreate_time(Date create_time) {
        this.setCreate_time(create_time);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seckill_order.create_time
     *
     * @param create_time the value for tb_seckill_order.create_time
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    /**
     * This method returns the value of the database column tb_seckill_order.pay_time
     *
     * @return the value of tb_seckill_order.pay_time
     */
    public Date getPay_time() {
        return pay_time;
    }

    /**
     */
    public TbSeckillOrder withPay_time(Date pay_time) {
        this.setPay_time(pay_time);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seckill_order.pay_time
     *
     * @param pay_time the value for tb_seckill_order.pay_time
     */
    public void setPay_time(Date pay_time) {
        this.pay_time = pay_time;
    }

    /**
     * This method returns the value of the database column tb_seckill_order.status
     *
     * @return the value of tb_seckill_order.status
     */
    public String getStatus() {
        return status;
    }

    /**
     */
    public TbSeckillOrder withStatus(String status) {
        this.setStatus(status);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seckill_order.status
     *
     * @param status the value for tb_seckill_order.status
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method returns the value of the database column tb_seckill_order.receiver_address
     *
     * @return the value of tb_seckill_order.receiver_address
     */
    public String getReceiver_address() {
        return receiver_address;
    }

    /**
     */
    public TbSeckillOrder withReceiver_address(String receiver_address) {
        this.setReceiver_address(receiver_address);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seckill_order.receiver_address
     *
     * @param receiver_address the value for tb_seckill_order.receiver_address
     */
    public void setReceiver_address(String receiver_address) {
        this.receiver_address = receiver_address == null ? null : receiver_address.trim();
    }

    /**
     * This method returns the value of the database column tb_seckill_order.receiver_mobile
     *
     * @return the value of tb_seckill_order.receiver_mobile
     */
    public String getReceiver_mobile() {
        return receiver_mobile;
    }

    /**
     */
    public TbSeckillOrder withReceiver_mobile(String receiver_mobile) {
        this.setReceiver_mobile(receiver_mobile);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seckill_order.receiver_mobile
     *
     * @param receiver_mobile the value for tb_seckill_order.receiver_mobile
     */
    public void setReceiver_mobile(String receiver_mobile) {
        this.receiver_mobile = receiver_mobile == null ? null : receiver_mobile.trim();
    }

    /**
     * This method returns the value of the database column tb_seckill_order.receiver
     *
     * @return the value of tb_seckill_order.receiver
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     */
    public TbSeckillOrder withReceiver(String receiver) {
        this.setReceiver(receiver);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seckill_order.receiver
     *
     * @param receiver the value for tb_seckill_order.receiver
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
    }

    /**
     * This method returns the value of the database column tb_seckill_order.transaction_id
     *
     * @return the value of tb_seckill_order.transaction_id
     */
    public String getTransaction_id() {
        return transaction_id;
    }

    /**
     */
    public TbSeckillOrder withTransaction_id(String transaction_id) {
        this.setTransaction_id(transaction_id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seckill_order.transaction_id
     *
     * @param transaction_id the value for tb_seckill_order.transaction_id
     */
    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id == null ? null : transaction_id.trim();
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
        sb.append(", seckill_id=").append(seckill_id);
        sb.append(", money=").append(money);
        sb.append(", user_id=").append(user_id);
        sb.append(", seller_id=").append(seller_id);
        sb.append(", create_time=").append(create_time);
        sb.append(", pay_time=").append(pay_time);
        sb.append(", status=").append(status);
        sb.append(", receiver_address=").append(receiver_address);
        sb.append(", receiver_mobile=").append(receiver_mobile);
        sb.append(", receiver=").append(receiver);
        sb.append(", transaction_id=").append(transaction_id);
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
        TbSeckillOrder other = (TbSeckillOrder) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSeckill_id() == null ? other.getSeckill_id() == null : this.getSeckill_id().equals(other.getSeckill_id()))
            && (this.getMoney() == null ? other.getMoney() == null : this.getMoney().equals(other.getMoney()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getSeller_id() == null ? other.getSeller_id() == null : this.getSeller_id().equals(other.getSeller_id()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getPay_time() == null ? other.getPay_time() == null : this.getPay_time().equals(other.getPay_time()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getReceiver_address() == null ? other.getReceiver_address() == null : this.getReceiver_address().equals(other.getReceiver_address()))
            && (this.getReceiver_mobile() == null ? other.getReceiver_mobile() == null : this.getReceiver_mobile().equals(other.getReceiver_mobile()))
            && (this.getReceiver() == null ? other.getReceiver() == null : this.getReceiver().equals(other.getReceiver()))
            && (this.getTransaction_id() == null ? other.getTransaction_id() == null : this.getTransaction_id().equals(other.getTransaction_id()));
    }

    /**
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSeckill_id() == null) ? 0 : getSeckill_id().hashCode());
        result = prime * result + ((getMoney() == null) ? 0 : getMoney().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getSeller_id() == null) ? 0 : getSeller_id().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getPay_time() == null) ? 0 : getPay_time().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getReceiver_address() == null) ? 0 : getReceiver_address().hashCode());
        result = prime * result + ((getReceiver_mobile() == null) ? 0 : getReceiver_mobile().hashCode());
        result = prime * result + ((getReceiver() == null) ? 0 : getReceiver().hashCode());
        result = prime * result + ((getTransaction_id() == null) ? 0 : getTransaction_id().hashCode());
        return result;
    }

    /**
     */
    public enum Column {
        id("id", "id", "BIGINT", false),
        seckill_id("seckill_id", "seckill_id", "BIGINT", false),
        money("money", "money", "DECIMAL", false),
        user_id("user_id", "user_id", "VARCHAR", false),
        seller_id("seller_id", "seller_id", "VARCHAR", false),
        create_time("create_time", "create_time", "TIMESTAMP", false),
        pay_time("pay_time", "pay_time", "TIMESTAMP", false),
        status("status", "status", "VARCHAR", false),
        receiver_address("receiver_address", "receiver_address", "VARCHAR", false),
        receiver_mobile("receiver_mobile", "receiver_mobile", "VARCHAR", false),
        receiver("receiver", "receiver", "VARCHAR", false),
        transaction_id("transaction_id", "transaction_id", "VARCHAR", false);

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