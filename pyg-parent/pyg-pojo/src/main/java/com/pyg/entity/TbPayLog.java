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
public class TbPayLog implements Serializable {
    /**
     *   支付订单号
     *
     */
    private String out_trade_no;

    /**
     *   创建日期
     *
     */
    private Date create_time;

    /**
     *   支付完成时间
     *
     */
    private Date pay_time;

    /**
     *   支付金额（分）
     *
     */
    private Long total_fee;

    /**
     *   用户ID
     *
     */
    private String user_id;

    /**
     *   交易号码
     *
     */
    private String transaction_id;

    /**
     *   交易状态
     *
     */
    private String trade_state;

    /**
     *   订单编号列表
     *
     */
    private String order_list;

    /**
     *   支付类型
     *
     */
    private String pay_type;

    /**
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column tb_pay_log.out_trade_no
     *
     * @return the value of tb_pay_log.out_trade_no
     */
    public String getOut_trade_no() {
        return out_trade_no;
    }

    /**
     */
    public TbPayLog withOut_trade_no(String out_trade_no) {
        this.setOut_trade_no(out_trade_no);
        return this;
    }

    /**
     * This method sets the value of the database column tb_pay_log.out_trade_no
     *
     * @param out_trade_no the value for tb_pay_log.out_trade_no
     */
    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no == null ? null : out_trade_no.trim();
    }

    /**
     * This method returns the value of the database column tb_pay_log.create_time
     *
     * @return the value of tb_pay_log.create_time
     */
    public Date getCreate_time() {
        return create_time;
    }

    /**
     */
    public TbPayLog withCreate_time(Date create_time) {
        this.setCreate_time(create_time);
        return this;
    }

    /**
     * This method sets the value of the database column tb_pay_log.create_time
     *
     * @param create_time the value for tb_pay_log.create_time
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    /**
     * This method returns the value of the database column tb_pay_log.pay_time
     *
     * @return the value of tb_pay_log.pay_time
     */
    public Date getPay_time() {
        return pay_time;
    }

    /**
     */
    public TbPayLog withPay_time(Date pay_time) {
        this.setPay_time(pay_time);
        return this;
    }

    /**
     * This method sets the value of the database column tb_pay_log.pay_time
     *
     * @param pay_time the value for tb_pay_log.pay_time
     */
    public void setPay_time(Date pay_time) {
        this.pay_time = pay_time;
    }

    /**
     * This method returns the value of the database column tb_pay_log.total_fee
     *
     * @return the value of tb_pay_log.total_fee
     */
    public Long getTotal_fee() {
        return total_fee;
    }

    /**
     */
    public TbPayLog withTotal_fee(Long total_fee) {
        this.setTotal_fee(total_fee);
        return this;
    }

    /**
     * This method sets the value of the database column tb_pay_log.total_fee
     *
     * @param total_fee the value for tb_pay_log.total_fee
     */
    public void setTotal_fee(Long total_fee) {
        this.total_fee = total_fee;
    }

    /**
     * This method returns the value of the database column tb_pay_log.user_id
     *
     * @return the value of tb_pay_log.user_id
     */
    public String getUser_id() {
        return user_id;
    }

    /**
     */
    public TbPayLog withUser_id(String user_id) {
        this.setUser_id(user_id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_pay_log.user_id
     *
     * @param user_id the value for tb_pay_log.user_id
     */
    public void setUser_id(String user_id) {
        this.user_id = user_id == null ? null : user_id.trim();
    }

    /**
     * This method returns the value of the database column tb_pay_log.transaction_id
     *
     * @return the value of tb_pay_log.transaction_id
     */
    public String getTransaction_id() {
        return transaction_id;
    }

    /**
     */
    public TbPayLog withTransaction_id(String transaction_id) {
        this.setTransaction_id(transaction_id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_pay_log.transaction_id
     *
     * @param transaction_id the value for tb_pay_log.transaction_id
     */
    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id == null ? null : transaction_id.trim();
    }

    /**
     * This method returns the value of the database column tb_pay_log.trade_state
     *
     * @return the value of tb_pay_log.trade_state
     */
    public String getTrade_state() {
        return trade_state;
    }

    /**
     */
    public TbPayLog withTrade_state(String trade_state) {
        this.setTrade_state(trade_state);
        return this;
    }

    /**
     * This method sets the value of the database column tb_pay_log.trade_state
     *
     * @param trade_state the value for tb_pay_log.trade_state
     */
    public void setTrade_state(String trade_state) {
        this.trade_state = trade_state == null ? null : trade_state.trim();
    }

    /**
     * This method returns the value of the database column tb_pay_log.order_list
     *
     * @return the value of tb_pay_log.order_list
     */
    public String getOrder_list() {
        return order_list;
    }

    /**
     */
    public TbPayLog withOrder_list(String order_list) {
        this.setOrder_list(order_list);
        return this;
    }

    /**
     * This method sets the value of the database column tb_pay_log.order_list
     *
     * @param order_list the value for tb_pay_log.order_list
     */
    public void setOrder_list(String order_list) {
        this.order_list = order_list == null ? null : order_list.trim();
    }

    /**
     * This method returns the value of the database column tb_pay_log.pay_type
     *
     * @return the value of tb_pay_log.pay_type
     */
    public String getPay_type() {
        return pay_type;
    }

    /**
     */
    public TbPayLog withPay_type(String pay_type) {
        this.setPay_type(pay_type);
        return this;
    }

    /**
     * This method sets the value of the database column tb_pay_log.pay_type
     *
     * @param pay_type the value for tb_pay_log.pay_type
     */
    public void setPay_type(String pay_type) {
        this.pay_type = pay_type == null ? null : pay_type.trim();
    }

    /**
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", out_trade_no=").append(out_trade_no);
        sb.append(", create_time=").append(create_time);
        sb.append(", pay_time=").append(pay_time);
        sb.append(", total_fee=").append(total_fee);
        sb.append(", user_id=").append(user_id);
        sb.append(", transaction_id=").append(transaction_id);
        sb.append(", trade_state=").append(trade_state);
        sb.append(", order_list=").append(order_list);
        sb.append(", pay_type=").append(pay_type);
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
        TbPayLog other = (TbPayLog) that;
        return (this.getOut_trade_no() == null ? other.getOut_trade_no() == null : this.getOut_trade_no().equals(other.getOut_trade_no()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getPay_time() == null ? other.getPay_time() == null : this.getPay_time().equals(other.getPay_time()))
            && (this.getTotal_fee() == null ? other.getTotal_fee() == null : this.getTotal_fee().equals(other.getTotal_fee()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getTransaction_id() == null ? other.getTransaction_id() == null : this.getTransaction_id().equals(other.getTransaction_id()))
            && (this.getTrade_state() == null ? other.getTrade_state() == null : this.getTrade_state().equals(other.getTrade_state()))
            && (this.getOrder_list() == null ? other.getOrder_list() == null : this.getOrder_list().equals(other.getOrder_list()))
            && (this.getPay_type() == null ? other.getPay_type() == null : this.getPay_type().equals(other.getPay_type()));
    }

    /**
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOut_trade_no() == null) ? 0 : getOut_trade_no().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getPay_time() == null) ? 0 : getPay_time().hashCode());
        result = prime * result + ((getTotal_fee() == null) ? 0 : getTotal_fee().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getTransaction_id() == null) ? 0 : getTransaction_id().hashCode());
        result = prime * result + ((getTrade_state() == null) ? 0 : getTrade_state().hashCode());
        result = prime * result + ((getOrder_list() == null) ? 0 : getOrder_list().hashCode());
        result = prime * result + ((getPay_type() == null) ? 0 : getPay_type().hashCode());
        return result;
    }

    /**
     */
    public enum Column {
        out_trade_no("out_trade_no", "out_trade_no", "VARCHAR", false),
        create_time("create_time", "create_time", "TIMESTAMP", false),
        pay_time("pay_time", "pay_time", "TIMESTAMP", false),
        total_fee("total_fee", "total_fee", "BIGINT", false),
        user_id("user_id", "user_id", "VARCHAR", false),
        transaction_id("transaction_id", "transaction_id", "VARCHAR", false),
        trade_state("trade_state", "trade_state", "VARCHAR", false),
        order_list("order_list", "order_list", "VARCHAR", false),
        pay_type("pay_type", "pay_type", "VARCHAR", false);

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