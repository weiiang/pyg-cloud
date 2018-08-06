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
public class TbOrder implements Serializable {
    /**
     *   订单id
     *
     */
    private Long order_id;

    /**
     *   实付金额。精确到2位小数;单位:元。如:200.07，表示:200元7分
     *
     */
    private BigDecimal payment;

    /**
     *   支付类型，1、在线支付，2、货到付款
     *
     */
    private String payment_type;

    /**
     *   邮费。精确到2位小数;单位:元。如:200.07，表示:200元7分
     *
     */
    private String post_fee;

    /**
     *   状态：1、未付款，2、已付款，3、未发货，4、已发货，5、交易成功，6、交易关闭,7、待评价
     *
     */
    private String status;

    /**
     *   订单创建时间
     *
     */
    private Date create_time;

    /**
     *   订单更新时间
     *
     */
    private Date update_time;

    /**
     *   付款时间
     *
     */
    private Date payment_time;

    /**
     *   发货时间
     *
     */
    private Date consign_time;

    /**
     *   交易完成时间
     *
     */
    private Date end_time;

    /**
     *   交易关闭时间
     *
     */
    private Date close_time;

    /**
     *   物流名称
     *
     */
    private String shipping_name;

    /**
     *   物流单号
     *
     */
    private String shipping_code;

    /**
     *   用户id
     *
     */
    private String user_id;

    /**
     *   买家留言
     *
     */
    private String buyer_message;

    /**
     *   买家昵称
     *
     */
    private String buyer_nick;

    /**
     *   买家是否已经评价
     *
     */
    private String buyer_rate;

    /**
     *   收货人地区名称(省，市，县)街道
     *
     */
    private String receiver_area_name;

    /**
     *   收货人手机
     *
     */
    private String receiver_mobile;

    /**
     *   收货人邮编
     *
     */
    private String receiver_zip_code;

    /**
     *   收货人
     *
     */
    private String receiver;

    /**
     *   过期时间，定期清理
     *
     */
    private Date expire;

    /**
     *   发票类型(普通发票，电子发票，增值税发票)
     *
     */
    private String invoice_type;

    /**
     *   订单来源：1:app端，2：pc端，3：M端，4：微信端，5：手机qq端
     *
     */
    private String source_type;

    /**
     *   商家ID
     *
     */
    private String seller_id;

    /**
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column tb_order.order_id
     *
     * @return the value of tb_order.order_id
     */
    public Long getOrder_id() {
        return order_id;
    }

    /**
     */
    public TbOrder withOrder_id(Long order_id) {
        this.setOrder_id(order_id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_order.order_id
     *
     * @param order_id the value for tb_order.order_id
     */
    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    /**
     * This method returns the value of the database column tb_order.payment
     *
     * @return the value of tb_order.payment
     */
    public BigDecimal getPayment() {
        return payment;
    }

    /**
     */
    public TbOrder withPayment(BigDecimal payment) {
        this.setPayment(payment);
        return this;
    }

    /**
     * This method sets the value of the database column tb_order.payment
     *
     * @param payment the value for tb_order.payment
     */
    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    /**
     * This method returns the value of the database column tb_order.payment_type
     *
     * @return the value of tb_order.payment_type
     */
    public String getPayment_type() {
        return payment_type;
    }

    /**
     */
    public TbOrder withPayment_type(String payment_type) {
        this.setPayment_type(payment_type);
        return this;
    }

    /**
     * This method sets the value of the database column tb_order.payment_type
     *
     * @param payment_type the value for tb_order.payment_type
     */
    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type == null ? null : payment_type.trim();
    }

    /**
     * This method returns the value of the database column tb_order.post_fee
     *
     * @return the value of tb_order.post_fee
     */
    public String getPost_fee() {
        return post_fee;
    }

    /**
     */
    public TbOrder withPost_fee(String post_fee) {
        this.setPost_fee(post_fee);
        return this;
    }

    /**
     * This method sets the value of the database column tb_order.post_fee
     *
     * @param post_fee the value for tb_order.post_fee
     */
    public void setPost_fee(String post_fee) {
        this.post_fee = post_fee == null ? null : post_fee.trim();
    }

    /**
     * This method returns the value of the database column tb_order.status
     *
     * @return the value of tb_order.status
     */
    public String getStatus() {
        return status;
    }

    /**
     */
    public TbOrder withStatus(String status) {
        this.setStatus(status);
        return this;
    }

    /**
     * This method sets the value of the database column tb_order.status
     *
     * @param status the value for tb_order.status
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method returns the value of the database column tb_order.create_time
     *
     * @return the value of tb_order.create_time
     */
    public Date getCreate_time() {
        return create_time;
    }

    /**
     */
    public TbOrder withCreate_time(Date create_time) {
        this.setCreate_time(create_time);
        return this;
    }

    /**
     * This method sets the value of the database column tb_order.create_time
     *
     * @param create_time the value for tb_order.create_time
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    /**
     * This method returns the value of the database column tb_order.update_time
     *
     * @return the value of tb_order.update_time
     */
    public Date getUpdate_time() {
        return update_time;
    }

    /**
     */
    public TbOrder withUpdate_time(Date update_time) {
        this.setUpdate_time(update_time);
        return this;
    }

    /**
     * This method sets the value of the database column tb_order.update_time
     *
     * @param update_time the value for tb_order.update_time
     */
    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    /**
     * This method returns the value of the database column tb_order.payment_time
     *
     * @return the value of tb_order.payment_time
     */
    public Date getPayment_time() {
        return payment_time;
    }

    /**
     */
    public TbOrder withPayment_time(Date payment_time) {
        this.setPayment_time(payment_time);
        return this;
    }

    /**
     * This method sets the value of the database column tb_order.payment_time
     *
     * @param payment_time the value for tb_order.payment_time
     */
    public void setPayment_time(Date payment_time) {
        this.payment_time = payment_time;
    }

    /**
     * This method returns the value of the database column tb_order.consign_time
     *
     * @return the value of tb_order.consign_time
     */
    public Date getConsign_time() {
        return consign_time;
    }

    /**
     */
    public TbOrder withConsign_time(Date consign_time) {
        this.setConsign_time(consign_time);
        return this;
    }

    /**
     * This method sets the value of the database column tb_order.consign_time
     *
     * @param consign_time the value for tb_order.consign_time
     */
    public void setConsign_time(Date consign_time) {
        this.consign_time = consign_time;
    }

    /**
     * This method returns the value of the database column tb_order.end_time
     *
     * @return the value of tb_order.end_time
     */
    public Date getEnd_time() {
        return end_time;
    }

    /**
     */
    public TbOrder withEnd_time(Date end_time) {
        this.setEnd_time(end_time);
        return this;
    }

    /**
     * This method sets the value of the database column tb_order.end_time
     *
     * @param end_time the value for tb_order.end_time
     */
    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    /**
     * This method returns the value of the database column tb_order.close_time
     *
     * @return the value of tb_order.close_time
     */
    public Date getClose_time() {
        return close_time;
    }

    /**
     */
    public TbOrder withClose_time(Date close_time) {
        this.setClose_time(close_time);
        return this;
    }

    /**
     * This method sets the value of the database column tb_order.close_time
     *
     * @param close_time the value for tb_order.close_time
     */
    public void setClose_time(Date close_time) {
        this.close_time = close_time;
    }

    /**
     * This method returns the value of the database column tb_order.shipping_name
     *
     * @return the value of tb_order.shipping_name
     */
    public String getShipping_name() {
        return shipping_name;
    }

    /**
     */
    public TbOrder withShipping_name(String shipping_name) {
        this.setShipping_name(shipping_name);
        return this;
    }

    /**
     * This method sets the value of the database column tb_order.shipping_name
     *
     * @param shipping_name the value for tb_order.shipping_name
     */
    public void setShipping_name(String shipping_name) {
        this.shipping_name = shipping_name == null ? null : shipping_name.trim();
    }

    /**
     * This method returns the value of the database column tb_order.shipping_code
     *
     * @return the value of tb_order.shipping_code
     */
    public String getShipping_code() {
        return shipping_code;
    }

    /**
     */
    public TbOrder withShipping_code(String shipping_code) {
        this.setShipping_code(shipping_code);
        return this;
    }

    /**
     * This method sets the value of the database column tb_order.shipping_code
     *
     * @param shipping_code the value for tb_order.shipping_code
     */
    public void setShipping_code(String shipping_code) {
        this.shipping_code = shipping_code == null ? null : shipping_code.trim();
    }

    /**
     * This method returns the value of the database column tb_order.user_id
     *
     * @return the value of tb_order.user_id
     */
    public String getUser_id() {
        return user_id;
    }

    /**
     */
    public TbOrder withUser_id(String user_id) {
        this.setUser_id(user_id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_order.user_id
     *
     * @param user_id the value for tb_order.user_id
     */
    public void setUser_id(String user_id) {
        this.user_id = user_id == null ? null : user_id.trim();
    }

    /**
     * This method returns the value of the database column tb_order.buyer_message
     *
     * @return the value of tb_order.buyer_message
     */
    public String getBuyer_message() {
        return buyer_message;
    }

    /**
     */
    public TbOrder withBuyer_message(String buyer_message) {
        this.setBuyer_message(buyer_message);
        return this;
    }

    /**
     * This method sets the value of the database column tb_order.buyer_message
     *
     * @param buyer_message the value for tb_order.buyer_message
     */
    public void setBuyer_message(String buyer_message) {
        this.buyer_message = buyer_message == null ? null : buyer_message.trim();
    }

    /**
     * This method returns the value of the database column tb_order.buyer_nick
     *
     * @return the value of tb_order.buyer_nick
     */
    public String getBuyer_nick() {
        return buyer_nick;
    }

    /**
     */
    public TbOrder withBuyer_nick(String buyer_nick) {
        this.setBuyer_nick(buyer_nick);
        return this;
    }

    /**
     * This method sets the value of the database column tb_order.buyer_nick
     *
     * @param buyer_nick the value for tb_order.buyer_nick
     */
    public void setBuyer_nick(String buyer_nick) {
        this.buyer_nick = buyer_nick == null ? null : buyer_nick.trim();
    }

    /**
     * This method returns the value of the database column tb_order.buyer_rate
     *
     * @return the value of tb_order.buyer_rate
     */
    public String getBuyer_rate() {
        return buyer_rate;
    }

    /**
     */
    public TbOrder withBuyer_rate(String buyer_rate) {
        this.setBuyer_rate(buyer_rate);
        return this;
    }

    /**
     * This method sets the value of the database column tb_order.buyer_rate
     *
     * @param buyer_rate the value for tb_order.buyer_rate
     */
    public void setBuyer_rate(String buyer_rate) {
        this.buyer_rate = buyer_rate == null ? null : buyer_rate.trim();
    }

    /**
     * This method returns the value of the database column tb_order.receiver_area_name
     *
     * @return the value of tb_order.receiver_area_name
     */
    public String getReceiver_area_name() {
        return receiver_area_name;
    }

    /**
     */
    public TbOrder withReceiver_area_name(String receiver_area_name) {
        this.setReceiver_area_name(receiver_area_name);
        return this;
    }

    /**
     * This method sets the value of the database column tb_order.receiver_area_name
     *
     * @param receiver_area_name the value for tb_order.receiver_area_name
     */
    public void setReceiver_area_name(String receiver_area_name) {
        this.receiver_area_name = receiver_area_name == null ? null : receiver_area_name.trim();
    }

    /**
     * This method returns the value of the database column tb_order.receiver_mobile
     *
     * @return the value of tb_order.receiver_mobile
     */
    public String getReceiver_mobile() {
        return receiver_mobile;
    }

    /**
     */
    public TbOrder withReceiver_mobile(String receiver_mobile) {
        this.setReceiver_mobile(receiver_mobile);
        return this;
    }

    /**
     * This method sets the value of the database column tb_order.receiver_mobile
     *
     * @param receiver_mobile the value for tb_order.receiver_mobile
     */
    public void setReceiver_mobile(String receiver_mobile) {
        this.receiver_mobile = receiver_mobile == null ? null : receiver_mobile.trim();
    }

    /**
     * This method returns the value of the database column tb_order.receiver_zip_code
     *
     * @return the value of tb_order.receiver_zip_code
     */
    public String getReceiver_zip_code() {
        return receiver_zip_code;
    }

    /**
     */
    public TbOrder withReceiver_zip_code(String receiver_zip_code) {
        this.setReceiver_zip_code(receiver_zip_code);
        return this;
    }

    /**
     * This method sets the value of the database column tb_order.receiver_zip_code
     *
     * @param receiver_zip_code the value for tb_order.receiver_zip_code
     */
    public void setReceiver_zip_code(String receiver_zip_code) {
        this.receiver_zip_code = receiver_zip_code == null ? null : receiver_zip_code.trim();
    }

    /**
     * This method returns the value of the database column tb_order.receiver
     *
     * @return the value of tb_order.receiver
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     */
    public TbOrder withReceiver(String receiver) {
        this.setReceiver(receiver);
        return this;
    }

    /**
     * This method sets the value of the database column tb_order.receiver
     *
     * @param receiver the value for tb_order.receiver
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
    }

    /**
     * This method returns the value of the database column tb_order.expire
     *
     * @return the value of tb_order.expire
     */
    public Date getExpire() {
        return expire;
    }

    /**
     */
    public TbOrder withExpire(Date expire) {
        this.setExpire(expire);
        return this;
    }

    /**
     * This method sets the value of the database column tb_order.expire
     *
     * @param expire the value for tb_order.expire
     */
    public void setExpire(Date expire) {
        this.expire = expire;
    }

    /**
     * This method returns the value of the database column tb_order.invoice_type
     *
     * @return the value of tb_order.invoice_type
     */
    public String getInvoice_type() {
        return invoice_type;
    }

    /**
     */
    public TbOrder withInvoice_type(String invoice_type) {
        this.setInvoice_type(invoice_type);
        return this;
    }

    /**
     * This method sets the value of the database column tb_order.invoice_type
     *
     * @param invoice_type the value for tb_order.invoice_type
     */
    public void setInvoice_type(String invoice_type) {
        this.invoice_type = invoice_type == null ? null : invoice_type.trim();
    }

    /**
     * This method returns the value of the database column tb_order.source_type
     *
     * @return the value of tb_order.source_type
     */
    public String getSource_type() {
        return source_type;
    }

    /**
     */
    public TbOrder withSource_type(String source_type) {
        this.setSource_type(source_type);
        return this;
    }

    /**
     * This method sets the value of the database column tb_order.source_type
     *
     * @param source_type the value for tb_order.source_type
     */
    public void setSource_type(String source_type) {
        this.source_type = source_type == null ? null : source_type.trim();
    }

    /**
     * This method returns the value of the database column tb_order.seller_id
     *
     * @return the value of tb_order.seller_id
     */
    public String getSeller_id() {
        return seller_id;
    }

    /**
     */
    public TbOrder withSeller_id(String seller_id) {
        this.setSeller_id(seller_id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_order.seller_id
     *
     * @param seller_id the value for tb_order.seller_id
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
        sb.append(", order_id=").append(order_id);
        sb.append(", payment=").append(payment);
        sb.append(", payment_type=").append(payment_type);
        sb.append(", post_fee=").append(post_fee);
        sb.append(", status=").append(status);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", payment_time=").append(payment_time);
        sb.append(", consign_time=").append(consign_time);
        sb.append(", end_time=").append(end_time);
        sb.append(", close_time=").append(close_time);
        sb.append(", shipping_name=").append(shipping_name);
        sb.append(", shipping_code=").append(shipping_code);
        sb.append(", user_id=").append(user_id);
        sb.append(", buyer_message=").append(buyer_message);
        sb.append(", buyer_nick=").append(buyer_nick);
        sb.append(", buyer_rate=").append(buyer_rate);
        sb.append(", receiver_area_name=").append(receiver_area_name);
        sb.append(", receiver_mobile=").append(receiver_mobile);
        sb.append(", receiver_zip_code=").append(receiver_zip_code);
        sb.append(", receiver=").append(receiver);
        sb.append(", expire=").append(expire);
        sb.append(", invoice_type=").append(invoice_type);
        sb.append(", source_type=").append(source_type);
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
        TbOrder other = (TbOrder) that;
        return (this.getOrder_id() == null ? other.getOrder_id() == null : this.getOrder_id().equals(other.getOrder_id()))
            && (this.getPayment() == null ? other.getPayment() == null : this.getPayment().equals(other.getPayment()))
            && (this.getPayment_type() == null ? other.getPayment_type() == null : this.getPayment_type().equals(other.getPayment_type()))
            && (this.getPost_fee() == null ? other.getPost_fee() == null : this.getPost_fee().equals(other.getPost_fee()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getPayment_time() == null ? other.getPayment_time() == null : this.getPayment_time().equals(other.getPayment_time()))
            && (this.getConsign_time() == null ? other.getConsign_time() == null : this.getConsign_time().equals(other.getConsign_time()))
            && (this.getEnd_time() == null ? other.getEnd_time() == null : this.getEnd_time().equals(other.getEnd_time()))
            && (this.getClose_time() == null ? other.getClose_time() == null : this.getClose_time().equals(other.getClose_time()))
            && (this.getShipping_name() == null ? other.getShipping_name() == null : this.getShipping_name().equals(other.getShipping_name()))
            && (this.getShipping_code() == null ? other.getShipping_code() == null : this.getShipping_code().equals(other.getShipping_code()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getBuyer_message() == null ? other.getBuyer_message() == null : this.getBuyer_message().equals(other.getBuyer_message()))
            && (this.getBuyer_nick() == null ? other.getBuyer_nick() == null : this.getBuyer_nick().equals(other.getBuyer_nick()))
            && (this.getBuyer_rate() == null ? other.getBuyer_rate() == null : this.getBuyer_rate().equals(other.getBuyer_rate()))
            && (this.getReceiver_area_name() == null ? other.getReceiver_area_name() == null : this.getReceiver_area_name().equals(other.getReceiver_area_name()))
            && (this.getReceiver_mobile() == null ? other.getReceiver_mobile() == null : this.getReceiver_mobile().equals(other.getReceiver_mobile()))
            && (this.getReceiver_zip_code() == null ? other.getReceiver_zip_code() == null : this.getReceiver_zip_code().equals(other.getReceiver_zip_code()))
            && (this.getReceiver() == null ? other.getReceiver() == null : this.getReceiver().equals(other.getReceiver()))
            && (this.getExpire() == null ? other.getExpire() == null : this.getExpire().equals(other.getExpire()))
            && (this.getInvoice_type() == null ? other.getInvoice_type() == null : this.getInvoice_type().equals(other.getInvoice_type()))
            && (this.getSource_type() == null ? other.getSource_type() == null : this.getSource_type().equals(other.getSource_type()))
            && (this.getSeller_id() == null ? other.getSeller_id() == null : this.getSeller_id().equals(other.getSeller_id()));
    }

    /**
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrder_id() == null) ? 0 : getOrder_id().hashCode());
        result = prime * result + ((getPayment() == null) ? 0 : getPayment().hashCode());
        result = prime * result + ((getPayment_type() == null) ? 0 : getPayment_type().hashCode());
        result = prime * result + ((getPost_fee() == null) ? 0 : getPost_fee().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getPayment_time() == null) ? 0 : getPayment_time().hashCode());
        result = prime * result + ((getConsign_time() == null) ? 0 : getConsign_time().hashCode());
        result = prime * result + ((getEnd_time() == null) ? 0 : getEnd_time().hashCode());
        result = prime * result + ((getClose_time() == null) ? 0 : getClose_time().hashCode());
        result = prime * result + ((getShipping_name() == null) ? 0 : getShipping_name().hashCode());
        result = prime * result + ((getShipping_code() == null) ? 0 : getShipping_code().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getBuyer_message() == null) ? 0 : getBuyer_message().hashCode());
        result = prime * result + ((getBuyer_nick() == null) ? 0 : getBuyer_nick().hashCode());
        result = prime * result + ((getBuyer_rate() == null) ? 0 : getBuyer_rate().hashCode());
        result = prime * result + ((getReceiver_area_name() == null) ? 0 : getReceiver_area_name().hashCode());
        result = prime * result + ((getReceiver_mobile() == null) ? 0 : getReceiver_mobile().hashCode());
        result = prime * result + ((getReceiver_zip_code() == null) ? 0 : getReceiver_zip_code().hashCode());
        result = prime * result + ((getReceiver() == null) ? 0 : getReceiver().hashCode());
        result = prime * result + ((getExpire() == null) ? 0 : getExpire().hashCode());
        result = prime * result + ((getInvoice_type() == null) ? 0 : getInvoice_type().hashCode());
        result = prime * result + ((getSource_type() == null) ? 0 : getSource_type().hashCode());
        result = prime * result + ((getSeller_id() == null) ? 0 : getSeller_id().hashCode());
        return result;
    }

    /**
     */
    public enum Column {
        order_id("order_id", "order_id", "BIGINT", false),
        payment("payment", "payment", "DECIMAL", false),
        payment_type("payment_type", "payment_type", "VARCHAR", false),
        post_fee("post_fee", "post_fee", "VARCHAR", false),
        status("status", "status", "VARCHAR", false),
        create_time("create_time", "create_time", "TIMESTAMP", false),
        update_time("update_time", "update_time", "TIMESTAMP", false),
        payment_time("payment_time", "payment_time", "TIMESTAMP", false),
        consign_time("consign_time", "consign_time", "TIMESTAMP", false),
        end_time("end_time", "end_time", "TIMESTAMP", false),
        close_time("close_time", "close_time", "TIMESTAMP", false),
        shipping_name("shipping_name", "shipping_name", "VARCHAR", false),
        shipping_code("shipping_code", "shipping_code", "VARCHAR", false),
        user_id("user_id", "user_id", "VARCHAR", false),
        buyer_message("buyer_message", "buyer_message", "VARCHAR", false),
        buyer_nick("buyer_nick", "buyer_nick", "VARCHAR", false),
        buyer_rate("buyer_rate", "buyer_rate", "VARCHAR", false),
        receiver_area_name("receiver_area_name", "receiver_area_name", "VARCHAR", false),
        receiver_mobile("receiver_mobile", "receiver_mobile", "VARCHAR", false),
        receiver_zip_code("receiver_zip_code", "receiver_zip_code", "VARCHAR", false),
        receiver("receiver", "receiver", "VARCHAR", false),
        expire("expire", "expire", "TIMESTAMP", false),
        invoice_type("invoice_type", "invoice_type", "VARCHAR", false),
        source_type("source_type", "source_type", "VARCHAR", false),
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