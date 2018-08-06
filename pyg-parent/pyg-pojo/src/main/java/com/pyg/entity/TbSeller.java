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
public class TbSeller implements Serializable {
    /**
     *   用户ID
     *
     */
    private String seller_id;

    /**
     *   公司名
     *
     */
    private String name;

    /**
     *   店铺名称
     *
     */
    private String nick_name;

    /**
     *   密码
     *
     */
    private String password;

    /**
     *   EMAIL
     *
     */
    private String email;

    /**
     *   公司手机
     *
     */
    private String mobile;

    /**
     *   公司电话
     *
     */
    private String telephone;

    /**
     *   状态
     *
     */
    private String status;

    /**
     *   详细地址
     *
     */
    private String address_detail;

    /**
     *   联系人姓名
     *
     */
    private String linkman_name;

    /**
     *   联系人QQ
     *
     */
    private String linkman_qq;

    /**
     *   联系人电话
     *
     */
    private String linkman_mobile;

    /**
     *   联系人EMAIL
     *
     */
    private String linkman_email;

    /**
     *   营业执照号
     *
     */
    private String license_number;

    /**
     *   税务登记证号
     *
     */
    private String tax_number;

    /**
     *   组织机构代码
     *
     */
    private String org_number;

    /**
     *   公司地址
     *
     */
    private Long address;

    /**
     *   公司LOGO图
     *
     */
    private String logo_pic;

    /**
     *   简介
     *
     */
    private String brief;

    /**
     *   创建日期
     *
     */
    private Date create_time;

    /**
     *   法定代表人
     *
     */
    private String legal_person;

    /**
     *   法定代表人身份证
     *
     */
    private String legal_person_card_id;

    /**
     *   开户行账号名称
     *
     */
    private String bank_user;

    /**
     *   开户行
     *
     */
    private String bank_name;

    /**
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column tb_seller.seller_id
     *
     * @return the value of tb_seller.seller_id
     */
    public String getSeller_id() {
        return seller_id;
    }

    /**
     */
    public TbSeller withSeller_id(String seller_id) {
        this.setSeller_id(seller_id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seller.seller_id
     *
     * @param seller_id the value for tb_seller.seller_id
     */
    public void setSeller_id(String seller_id) {
        this.seller_id = seller_id == null ? null : seller_id.trim();
    }

    /**
     * This method returns the value of the database column tb_seller.name
     *
     * @return the value of tb_seller.name
     */
    public String getName() {
        return name;
    }

    /**
     */
    public TbSeller withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seller.name
     *
     * @param name the value for tb_seller.name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method returns the value of the database column tb_seller.nick_name
     *
     * @return the value of tb_seller.nick_name
     */
    public String getNick_name() {
        return nick_name;
    }

    /**
     */
    public TbSeller withNick_name(String nick_name) {
        this.setNick_name(nick_name);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seller.nick_name
     *
     * @param nick_name the value for tb_seller.nick_name
     */
    public void setNick_name(String nick_name) {
        this.nick_name = nick_name == null ? null : nick_name.trim();
    }

    /**
     * This method returns the value of the database column tb_seller.password
     *
     * @return the value of tb_seller.password
     */
    public String getPassword() {
        return password;
    }

    /**
     */
    public TbSeller withPassword(String password) {
        this.setPassword(password);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seller.password
     *
     * @param password the value for tb_seller.password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method returns the value of the database column tb_seller.email
     *
     * @return the value of tb_seller.email
     */
    public String getEmail() {
        return email;
    }

    /**
     */
    public TbSeller withEmail(String email) {
        this.setEmail(email);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seller.email
     *
     * @param email the value for tb_seller.email
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method returns the value of the database column tb_seller.mobile
     *
     * @return the value of tb_seller.mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     */
    public TbSeller withMobile(String mobile) {
        this.setMobile(mobile);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seller.mobile
     *
     * @param mobile the value for tb_seller.mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method returns the value of the database column tb_seller.telephone
     *
     * @return the value of tb_seller.telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     */
    public TbSeller withTelephone(String telephone) {
        this.setTelephone(telephone);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seller.telephone
     *
     * @param telephone the value for tb_seller.telephone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * This method returns the value of the database column tb_seller.status
     *
     * @return the value of tb_seller.status
     */
    public String getStatus() {
        return status;
    }

    /**
     */
    public TbSeller withStatus(String status) {
        this.setStatus(status);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seller.status
     *
     * @param status the value for tb_seller.status
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method returns the value of the database column tb_seller.address_detail
     *
     * @return the value of tb_seller.address_detail
     */
    public String getAddress_detail() {
        return address_detail;
    }

    /**
     */
    public TbSeller withAddress_detail(String address_detail) {
        this.setAddress_detail(address_detail);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seller.address_detail
     *
     * @param address_detail the value for tb_seller.address_detail
     */
    public void setAddress_detail(String address_detail) {
        this.address_detail = address_detail == null ? null : address_detail.trim();
    }

    /**
     * This method returns the value of the database column tb_seller.linkman_name
     *
     * @return the value of tb_seller.linkman_name
     */
    public String getLinkman_name() {
        return linkman_name;
    }

    /**
     */
    public TbSeller withLinkman_name(String linkman_name) {
        this.setLinkman_name(linkman_name);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seller.linkman_name
     *
     * @param linkman_name the value for tb_seller.linkman_name
     */
    public void setLinkman_name(String linkman_name) {
        this.linkman_name = linkman_name == null ? null : linkman_name.trim();
    }

    /**
     * This method returns the value of the database column tb_seller.linkman_qq
     *
     * @return the value of tb_seller.linkman_qq
     */
    public String getLinkman_qq() {
        return linkman_qq;
    }

    /**
     */
    public TbSeller withLinkman_qq(String linkman_qq) {
        this.setLinkman_qq(linkman_qq);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seller.linkman_qq
     *
     * @param linkman_qq the value for tb_seller.linkman_qq
     */
    public void setLinkman_qq(String linkman_qq) {
        this.linkman_qq = linkman_qq == null ? null : linkman_qq.trim();
    }

    /**
     * This method returns the value of the database column tb_seller.linkman_mobile
     *
     * @return the value of tb_seller.linkman_mobile
     */
    public String getLinkman_mobile() {
        return linkman_mobile;
    }

    /**
     */
    public TbSeller withLinkman_mobile(String linkman_mobile) {
        this.setLinkman_mobile(linkman_mobile);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seller.linkman_mobile
     *
     * @param linkman_mobile the value for tb_seller.linkman_mobile
     */
    public void setLinkman_mobile(String linkman_mobile) {
        this.linkman_mobile = linkman_mobile == null ? null : linkman_mobile.trim();
    }

    /**
     * This method returns the value of the database column tb_seller.linkman_email
     *
     * @return the value of tb_seller.linkman_email
     */
    public String getLinkman_email() {
        return linkman_email;
    }

    /**
     */
    public TbSeller withLinkman_email(String linkman_email) {
        this.setLinkman_email(linkman_email);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seller.linkman_email
     *
     * @param linkman_email the value for tb_seller.linkman_email
     */
    public void setLinkman_email(String linkman_email) {
        this.linkman_email = linkman_email == null ? null : linkman_email.trim();
    }

    /**
     * This method returns the value of the database column tb_seller.license_number
     *
     * @return the value of tb_seller.license_number
     */
    public String getLicense_number() {
        return license_number;
    }

    /**
     */
    public TbSeller withLicense_number(String license_number) {
        this.setLicense_number(license_number);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seller.license_number
     *
     * @param license_number the value for tb_seller.license_number
     */
    public void setLicense_number(String license_number) {
        this.license_number = license_number == null ? null : license_number.trim();
    }

    /**
     * This method returns the value of the database column tb_seller.tax_number
     *
     * @return the value of tb_seller.tax_number
     */
    public String getTax_number() {
        return tax_number;
    }

    /**
     */
    public TbSeller withTax_number(String tax_number) {
        this.setTax_number(tax_number);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seller.tax_number
     *
     * @param tax_number the value for tb_seller.tax_number
     */
    public void setTax_number(String tax_number) {
        this.tax_number = tax_number == null ? null : tax_number.trim();
    }

    /**
     * This method returns the value of the database column tb_seller.org_number
     *
     * @return the value of tb_seller.org_number
     */
    public String getOrg_number() {
        return org_number;
    }

    /**
     */
    public TbSeller withOrg_number(String org_number) {
        this.setOrg_number(org_number);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seller.org_number
     *
     * @param org_number the value for tb_seller.org_number
     */
    public void setOrg_number(String org_number) {
        this.org_number = org_number == null ? null : org_number.trim();
    }

    /**
     * This method returns the value of the database column tb_seller.address
     *
     * @return the value of tb_seller.address
     */
    public Long getAddress() {
        return address;
    }

    /**
     */
    public TbSeller withAddress(Long address) {
        this.setAddress(address);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seller.address
     *
     * @param address the value for tb_seller.address
     */
    public void setAddress(Long address) {
        this.address = address;
    }

    /**
     * This method returns the value of the database column tb_seller.logo_pic
     *
     * @return the value of tb_seller.logo_pic
     */
    public String getLogo_pic() {
        return logo_pic;
    }

    /**
     */
    public TbSeller withLogo_pic(String logo_pic) {
        this.setLogo_pic(logo_pic);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seller.logo_pic
     *
     * @param logo_pic the value for tb_seller.logo_pic
     */
    public void setLogo_pic(String logo_pic) {
        this.logo_pic = logo_pic == null ? null : logo_pic.trim();
    }

    /**
     * This method returns the value of the database column tb_seller.brief
     *
     * @return the value of tb_seller.brief
     */
    public String getBrief() {
        return brief;
    }

    /**
     */
    public TbSeller withBrief(String brief) {
        this.setBrief(brief);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seller.brief
     *
     * @param brief the value for tb_seller.brief
     */
    public void setBrief(String brief) {
        this.brief = brief == null ? null : brief.trim();
    }

    /**
     * This method returns the value of the database column tb_seller.create_time
     *
     * @return the value of tb_seller.create_time
     */
    public Date getCreate_time() {
        return create_time;
    }

    /**
     */
    public TbSeller withCreate_time(Date create_time) {
        this.setCreate_time(create_time);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seller.create_time
     *
     * @param create_time the value for tb_seller.create_time
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    /**
     * This method returns the value of the database column tb_seller.legal_person
     *
     * @return the value of tb_seller.legal_person
     */
    public String getLegal_person() {
        return legal_person;
    }

    /**
     */
    public TbSeller withLegal_person(String legal_person) {
        this.setLegal_person(legal_person);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seller.legal_person
     *
     * @param legal_person the value for tb_seller.legal_person
     */
    public void setLegal_person(String legal_person) {
        this.legal_person = legal_person == null ? null : legal_person.trim();
    }

    /**
     * This method returns the value of the database column tb_seller.legal_person_card_id
     *
     * @return the value of tb_seller.legal_person_card_id
     */
    public String getLegal_person_card_id() {
        return legal_person_card_id;
    }

    /**
     */
    public TbSeller withLegal_person_card_id(String legal_person_card_id) {
        this.setLegal_person_card_id(legal_person_card_id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seller.legal_person_card_id
     *
     * @param legal_person_card_id the value for tb_seller.legal_person_card_id
     */
    public void setLegal_person_card_id(String legal_person_card_id) {
        this.legal_person_card_id = legal_person_card_id == null ? null : legal_person_card_id.trim();
    }

    /**
     * This method returns the value of the database column tb_seller.bank_user
     *
     * @return the value of tb_seller.bank_user
     */
    public String getBank_user() {
        return bank_user;
    }

    /**
     */
    public TbSeller withBank_user(String bank_user) {
        this.setBank_user(bank_user);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seller.bank_user
     *
     * @param bank_user the value for tb_seller.bank_user
     */
    public void setBank_user(String bank_user) {
        this.bank_user = bank_user == null ? null : bank_user.trim();
    }

    /**
     * This method returns the value of the database column tb_seller.bank_name
     *
     * @return the value of tb_seller.bank_name
     */
    public String getBank_name() {
        return bank_name;
    }

    /**
     */
    public TbSeller withBank_name(String bank_name) {
        this.setBank_name(bank_name);
        return this;
    }

    /**
     * This method sets the value of the database column tb_seller.bank_name
     *
     * @param bank_name the value for tb_seller.bank_name
     */
    public void setBank_name(String bank_name) {
        this.bank_name = bank_name == null ? null : bank_name.trim();
    }

    /**
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", seller_id=").append(seller_id);
        sb.append(", name=").append(name);
        sb.append(", nick_name=").append(nick_name);
        sb.append(", password=").append(password);
        sb.append(", email=").append(email);
        sb.append(", mobile=").append(mobile);
        sb.append(", telephone=").append(telephone);
        sb.append(", status=").append(status);
        sb.append(", address_detail=").append(address_detail);
        sb.append(", linkman_name=").append(linkman_name);
        sb.append(", linkman_qq=").append(linkman_qq);
        sb.append(", linkman_mobile=").append(linkman_mobile);
        sb.append(", linkman_email=").append(linkman_email);
        sb.append(", license_number=").append(license_number);
        sb.append(", tax_number=").append(tax_number);
        sb.append(", org_number=").append(org_number);
        sb.append(", address=").append(address);
        sb.append(", logo_pic=").append(logo_pic);
        sb.append(", brief=").append(brief);
        sb.append(", create_time=").append(create_time);
        sb.append(", legal_person=").append(legal_person);
        sb.append(", legal_person_card_id=").append(legal_person_card_id);
        sb.append(", bank_user=").append(bank_user);
        sb.append(", bank_name=").append(bank_name);
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
        TbSeller other = (TbSeller) that;
        return (this.getSeller_id() == null ? other.getSeller_id() == null : this.getSeller_id().equals(other.getSeller_id()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getNick_name() == null ? other.getNick_name() == null : this.getNick_name().equals(other.getNick_name()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getTelephone() == null ? other.getTelephone() == null : this.getTelephone().equals(other.getTelephone()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getAddress_detail() == null ? other.getAddress_detail() == null : this.getAddress_detail().equals(other.getAddress_detail()))
            && (this.getLinkman_name() == null ? other.getLinkman_name() == null : this.getLinkman_name().equals(other.getLinkman_name()))
            && (this.getLinkman_qq() == null ? other.getLinkman_qq() == null : this.getLinkman_qq().equals(other.getLinkman_qq()))
            && (this.getLinkman_mobile() == null ? other.getLinkman_mobile() == null : this.getLinkman_mobile().equals(other.getLinkman_mobile()))
            && (this.getLinkman_email() == null ? other.getLinkman_email() == null : this.getLinkman_email().equals(other.getLinkman_email()))
            && (this.getLicense_number() == null ? other.getLicense_number() == null : this.getLicense_number().equals(other.getLicense_number()))
            && (this.getTax_number() == null ? other.getTax_number() == null : this.getTax_number().equals(other.getTax_number()))
            && (this.getOrg_number() == null ? other.getOrg_number() == null : this.getOrg_number().equals(other.getOrg_number()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getLogo_pic() == null ? other.getLogo_pic() == null : this.getLogo_pic().equals(other.getLogo_pic()))
            && (this.getBrief() == null ? other.getBrief() == null : this.getBrief().equals(other.getBrief()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getLegal_person() == null ? other.getLegal_person() == null : this.getLegal_person().equals(other.getLegal_person()))
            && (this.getLegal_person_card_id() == null ? other.getLegal_person_card_id() == null : this.getLegal_person_card_id().equals(other.getLegal_person_card_id()))
            && (this.getBank_user() == null ? other.getBank_user() == null : this.getBank_user().equals(other.getBank_user()))
            && (this.getBank_name() == null ? other.getBank_name() == null : this.getBank_name().equals(other.getBank_name()));
    }

    /**
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSeller_id() == null) ? 0 : getSeller_id().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getNick_name() == null) ? 0 : getNick_name().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getTelephone() == null) ? 0 : getTelephone().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getAddress_detail() == null) ? 0 : getAddress_detail().hashCode());
        result = prime * result + ((getLinkman_name() == null) ? 0 : getLinkman_name().hashCode());
        result = prime * result + ((getLinkman_qq() == null) ? 0 : getLinkman_qq().hashCode());
        result = prime * result + ((getLinkman_mobile() == null) ? 0 : getLinkman_mobile().hashCode());
        result = prime * result + ((getLinkman_email() == null) ? 0 : getLinkman_email().hashCode());
        result = prime * result + ((getLicense_number() == null) ? 0 : getLicense_number().hashCode());
        result = prime * result + ((getTax_number() == null) ? 0 : getTax_number().hashCode());
        result = prime * result + ((getOrg_number() == null) ? 0 : getOrg_number().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getLogo_pic() == null) ? 0 : getLogo_pic().hashCode());
        result = prime * result + ((getBrief() == null) ? 0 : getBrief().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getLegal_person() == null) ? 0 : getLegal_person().hashCode());
        result = prime * result + ((getLegal_person_card_id() == null) ? 0 : getLegal_person_card_id().hashCode());
        result = prime * result + ((getBank_user() == null) ? 0 : getBank_user().hashCode());
        result = prime * result + ((getBank_name() == null) ? 0 : getBank_name().hashCode());
        return result;
    }

    /**
     */
    public enum Column {
        seller_id("seller_id", "seller_id", "VARCHAR", false),
        name("name", "name", "VARCHAR", false),
        nick_name("nick_name", "nick_name", "VARCHAR", false),
        password("password", "password", "VARCHAR", false),
        email("email", "email", "VARCHAR", false),
        mobile("mobile", "mobile", "VARCHAR", false),
        telephone("telephone", "telephone", "VARCHAR", false),
        status("status", "status", "VARCHAR", false),
        address_detail("address_detail", "address_detail", "VARCHAR", false),
        linkman_name("linkman_name", "linkman_name", "VARCHAR", false),
        linkman_qq("linkman_qq", "linkman_qq", "VARCHAR", false),
        linkman_mobile("linkman_mobile", "linkman_mobile", "VARCHAR", false),
        linkman_email("linkman_email", "linkman_email", "VARCHAR", false),
        license_number("license_number", "license_number", "VARCHAR", false),
        tax_number("tax_number", "tax_number", "VARCHAR", false),
        org_number("org_number", "org_number", "VARCHAR", false),
        address("address", "address", "BIGINT", false),
        logo_pic("logo_pic", "logo_pic", "VARCHAR", false),
        brief("brief", "brief", "VARCHAR", false),
        create_time("create_time", "create_time", "TIMESTAMP", false),
        legal_person("legal_person", "legal_person", "VARCHAR", false),
        legal_person_card_id("legal_person_card_id", "legal_person_card_id", "VARCHAR", false),
        bank_user("bank_user", "bank_user", "VARCHAR", false),
        bank_name("bank_name", "bank_name", "VARCHAR", false);

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