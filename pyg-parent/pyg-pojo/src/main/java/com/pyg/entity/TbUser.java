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
public class TbUser implements Serializable {
    /**
     *
     */
    private Long id;

    /**
     *   用户名
     *
     */
    private String username;

    /**
     *   密码，加密存储
     *
     */
    private String password;

    /**
     *   注册手机号
     *
     */
    private String phone;

    /**
     *   注册邮箱
     *
     */
    private String email;

    /**
     *   创建时间
     *
     */
    private Date created;

    /**
     *
     */
    private Date updated;

    /**
     *   会员来源：1:PC，2：H5，3：Android，4：IOS，5：WeChat
     *
     */
    private String source_type;

    /**
     *   昵称
     *
     */
    private String nick_name;

    /**
     *   真实姓名
     *
     */
    private String name;

    /**
     *   使用状态（Y正常 N非正常）
     *
     */
    private String status;

    /**
     *   头像地址
     *
     */
    private String head_pic;

    /**
     *   QQ号码
     *
     */
    private String qq;

    /**
     *   账户余额
     *
     */
    private Long account_balance;

    /**
     *   手机是否验证 （0否  1是）
     *
     */
    private String is_mobile_check;

    /**
     *   邮箱是否检测（0否  1是）
     *
     */
    private String is_email_check;

    /**
     *   性别，1男，2女
     *
     */
    private String sex;

    /**
     *   会员等级
     *
     */
    private Integer user_level;

    /**
     *   积分
     *
     */
    private Integer points;

    /**
     *   经验值
     *
     */
    private Integer experience_value;

    /**
     *   生日
     *
     */
    private Date birthday;

    /**
     *   最后登录时间
     *
     */
    private Date last_login_time;

    /**
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column tb_user.id
     *
     * @return the value of tb_user.id
     */
    public Long getId() {
        return id;
    }

    /**
     */
    public TbUser withId(Long id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_user.id
     *
     * @param id the value for tb_user.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column tb_user.username
     *
     * @return the value of tb_user.username
     */
    public String getUsername() {
        return username;
    }

    /**
     */
    public TbUser withUsername(String username) {
        this.setUsername(username);
        return this;
    }

    /**
     * This method sets the value of the database column tb_user.username
     *
     * @param username the value for tb_user.username
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method returns the value of the database column tb_user.password
     *
     * @return the value of tb_user.password
     */
    public String getPassword() {
        return password;
    }

    /**
     */
    public TbUser withPassword(String password) {
        this.setPassword(password);
        return this;
    }

    /**
     * This method sets the value of the database column tb_user.password
     *
     * @param password the value for tb_user.password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method returns the value of the database column tb_user.phone
     *
     * @return the value of tb_user.phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     */
    public TbUser withPhone(String phone) {
        this.setPhone(phone);
        return this;
    }

    /**
     * This method sets the value of the database column tb_user.phone
     *
     * @param phone the value for tb_user.phone
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method returns the value of the database column tb_user.email
     *
     * @return the value of tb_user.email
     */
    public String getEmail() {
        return email;
    }

    /**
     */
    public TbUser withEmail(String email) {
        this.setEmail(email);
        return this;
    }

    /**
     * This method sets the value of the database column tb_user.email
     *
     * @param email the value for tb_user.email
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method returns the value of the database column tb_user.created
     *
     * @return the value of tb_user.created
     */
    public Date getCreated() {
        return created;
    }

    /**
     */
    public TbUser withCreated(Date created) {
        this.setCreated(created);
        return this;
    }

    /**
     * This method sets the value of the database column tb_user.created
     *
     * @param created the value for tb_user.created
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method returns the value of the database column tb_user.updated
     *
     * @return the value of tb_user.updated
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     */
    public TbUser withUpdated(Date updated) {
        this.setUpdated(updated);
        return this;
    }

    /**
     * This method sets the value of the database column tb_user.updated
     *
     * @param updated the value for tb_user.updated
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * This method returns the value of the database column tb_user.source_type
     *
     * @return the value of tb_user.source_type
     */
    public String getSource_type() {
        return source_type;
    }

    /**
     */
    public TbUser withSource_type(String source_type) {
        this.setSource_type(source_type);
        return this;
    }

    /**
     * This method sets the value of the database column tb_user.source_type
     *
     * @param source_type the value for tb_user.source_type
     */
    public void setSource_type(String source_type) {
        this.source_type = source_type == null ? null : source_type.trim();
    }

    /**
     * This method returns the value of the database column tb_user.nick_name
     *
     * @return the value of tb_user.nick_name
     */
    public String getNick_name() {
        return nick_name;
    }

    /**
     */
    public TbUser withNick_name(String nick_name) {
        this.setNick_name(nick_name);
        return this;
    }

    /**
     * This method sets the value of the database column tb_user.nick_name
     *
     * @param nick_name the value for tb_user.nick_name
     */
    public void setNick_name(String nick_name) {
        this.nick_name = nick_name == null ? null : nick_name.trim();
    }

    /**
     * This method returns the value of the database column tb_user.name
     *
     * @return the value of tb_user.name
     */
    public String getName() {
        return name;
    }

    /**
     */
    public TbUser withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * This method sets the value of the database column tb_user.name
     *
     * @param name the value for tb_user.name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method returns the value of the database column tb_user.status
     *
     * @return the value of tb_user.status
     */
    public String getStatus() {
        return status;
    }

    /**
     */
    public TbUser withStatus(String status) {
        this.setStatus(status);
        return this;
    }

    /**
     * This method sets the value of the database column tb_user.status
     *
     * @param status the value for tb_user.status
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method returns the value of the database column tb_user.head_pic
     *
     * @return the value of tb_user.head_pic
     */
    public String getHead_pic() {
        return head_pic;
    }

    /**
     */
    public TbUser withHead_pic(String head_pic) {
        this.setHead_pic(head_pic);
        return this;
    }

    /**
     * This method sets the value of the database column tb_user.head_pic
     *
     * @param head_pic the value for tb_user.head_pic
     */
    public void setHead_pic(String head_pic) {
        this.head_pic = head_pic == null ? null : head_pic.trim();
    }

    /**
     * This method returns the value of the database column tb_user.qq
     *
     * @return the value of tb_user.qq
     */
    public String getQq() {
        return qq;
    }

    /**
     */
    public TbUser withQq(String qq) {
        this.setQq(qq);
        return this;
    }

    /**
     * This method sets the value of the database column tb_user.qq
     *
     * @param qq the value for tb_user.qq
     */
    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    /**
     * This method returns the value of the database column tb_user.account_balance
     *
     * @return the value of tb_user.account_balance
     */
    public Long getAccount_balance() {
        return account_balance;
    }

    /**
     */
    public TbUser withAccount_balance(Long account_balance) {
        this.setAccount_balance(account_balance);
        return this;
    }

    /**
     * This method sets the value of the database column tb_user.account_balance
     *
     * @param account_balance the value for tb_user.account_balance
     */
    public void setAccount_balance(Long account_balance) {
        this.account_balance = account_balance;
    }

    /**
     * This method returns the value of the database column tb_user.is_mobile_check
     *
     * @return the value of tb_user.is_mobile_check
     */
    public String getIs_mobile_check() {
        return is_mobile_check;
    }

    /**
     */
    public TbUser withIs_mobile_check(String is_mobile_check) {
        this.setIs_mobile_check(is_mobile_check);
        return this;
    }

    /**
     * This method sets the value of the database column tb_user.is_mobile_check
     *
     * @param is_mobile_check the value for tb_user.is_mobile_check
     */
    public void setIs_mobile_check(String is_mobile_check) {
        this.is_mobile_check = is_mobile_check == null ? null : is_mobile_check.trim();
    }

    /**
     * This method returns the value of the database column tb_user.is_email_check
     *
     * @return the value of tb_user.is_email_check
     */
    public String getIs_email_check() {
        return is_email_check;
    }

    /**
     */
    public TbUser withIs_email_check(String is_email_check) {
        this.setIs_email_check(is_email_check);
        return this;
    }

    /**
     * This method sets the value of the database column tb_user.is_email_check
     *
     * @param is_email_check the value for tb_user.is_email_check
     */
    public void setIs_email_check(String is_email_check) {
        this.is_email_check = is_email_check == null ? null : is_email_check.trim();
    }

    /**
     * This method returns the value of the database column tb_user.sex
     *
     * @return the value of tb_user.sex
     */
    public String getSex() {
        return sex;
    }

    /**
     */
    public TbUser withSex(String sex) {
        this.setSex(sex);
        return this;
    }

    /**
     * This method sets the value of the database column tb_user.sex
     *
     * @param sex the value for tb_user.sex
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method returns the value of the database column tb_user.user_level
     *
     * @return the value of tb_user.user_level
     */
    public Integer getUser_level() {
        return user_level;
    }

    /**
     */
    public TbUser withUser_level(Integer user_level) {
        this.setUser_level(user_level);
        return this;
    }

    /**
     * This method sets the value of the database column tb_user.user_level
     *
     * @param user_level the value for tb_user.user_level
     */
    public void setUser_level(Integer user_level) {
        this.user_level = user_level;
    }

    /**
     * This method returns the value of the database column tb_user.points
     *
     * @return the value of tb_user.points
     */
    public Integer getPoints() {
        return points;
    }

    /**
     */
    public TbUser withPoints(Integer points) {
        this.setPoints(points);
        return this;
    }

    /**
     * This method sets the value of the database column tb_user.points
     *
     * @param points the value for tb_user.points
     */
    public void setPoints(Integer points) {
        this.points = points;
    }

    /**
     * This method returns the value of the database column tb_user.experience_value
     *
     * @return the value of tb_user.experience_value
     */
    public Integer getExperience_value() {
        return experience_value;
    }

    /**
     */
    public TbUser withExperience_value(Integer experience_value) {
        this.setExperience_value(experience_value);
        return this;
    }

    /**
     * This method sets the value of the database column tb_user.experience_value
     *
     * @param experience_value the value for tb_user.experience_value
     */
    public void setExperience_value(Integer experience_value) {
        this.experience_value = experience_value;
    }

    /**
     * This method returns the value of the database column tb_user.birthday
     *
     * @return the value of tb_user.birthday
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     */
    public TbUser withBirthday(Date birthday) {
        this.setBirthday(birthday);
        return this;
    }

    /**
     * This method sets the value of the database column tb_user.birthday
     *
     * @param birthday the value for tb_user.birthday
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method returns the value of the database column tb_user.last_login_time
     *
     * @return the value of tb_user.last_login_time
     */
    public Date getLast_login_time() {
        return last_login_time;
    }

    /**
     */
    public TbUser withLast_login_time(Date last_login_time) {
        this.setLast_login_time(last_login_time);
        return this;
    }

    /**
     * This method sets the value of the database column tb_user.last_login_time
     *
     * @param last_login_time the value for tb_user.last_login_time
     */
    public void setLast_login_time(Date last_login_time) {
        this.last_login_time = last_login_time;
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
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", phone=").append(phone);
        sb.append(", email=").append(email);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", source_type=").append(source_type);
        sb.append(", nick_name=").append(nick_name);
        sb.append(", name=").append(name);
        sb.append(", status=").append(status);
        sb.append(", head_pic=").append(head_pic);
        sb.append(", qq=").append(qq);
        sb.append(", account_balance=").append(account_balance);
        sb.append(", is_mobile_check=").append(is_mobile_check);
        sb.append(", is_email_check=").append(is_email_check);
        sb.append(", sex=").append(sex);
        sb.append(", user_level=").append(user_level);
        sb.append(", points=").append(points);
        sb.append(", experience_value=").append(experience_value);
        sb.append(", birthday=").append(birthday);
        sb.append(", last_login_time=").append(last_login_time);
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
        TbUser other = (TbUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getCreated() == null ? other.getCreated() == null : this.getCreated().equals(other.getCreated()))
            && (this.getUpdated() == null ? other.getUpdated() == null : this.getUpdated().equals(other.getUpdated()))
            && (this.getSource_type() == null ? other.getSource_type() == null : this.getSource_type().equals(other.getSource_type()))
            && (this.getNick_name() == null ? other.getNick_name() == null : this.getNick_name().equals(other.getNick_name()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getHead_pic() == null ? other.getHead_pic() == null : this.getHead_pic().equals(other.getHead_pic()))
            && (this.getQq() == null ? other.getQq() == null : this.getQq().equals(other.getQq()))
            && (this.getAccount_balance() == null ? other.getAccount_balance() == null : this.getAccount_balance().equals(other.getAccount_balance()))
            && (this.getIs_mobile_check() == null ? other.getIs_mobile_check() == null : this.getIs_mobile_check().equals(other.getIs_mobile_check()))
            && (this.getIs_email_check() == null ? other.getIs_email_check() == null : this.getIs_email_check().equals(other.getIs_email_check()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getUser_level() == null ? other.getUser_level() == null : this.getUser_level().equals(other.getUser_level()))
            && (this.getPoints() == null ? other.getPoints() == null : this.getPoints().equals(other.getPoints()))
            && (this.getExperience_value() == null ? other.getExperience_value() == null : this.getExperience_value().equals(other.getExperience_value()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getLast_login_time() == null ? other.getLast_login_time() == null : this.getLast_login_time().equals(other.getLast_login_time()));
    }

    /**
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getCreated() == null) ? 0 : getCreated().hashCode());
        result = prime * result + ((getUpdated() == null) ? 0 : getUpdated().hashCode());
        result = prime * result + ((getSource_type() == null) ? 0 : getSource_type().hashCode());
        result = prime * result + ((getNick_name() == null) ? 0 : getNick_name().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getHead_pic() == null) ? 0 : getHead_pic().hashCode());
        result = prime * result + ((getQq() == null) ? 0 : getQq().hashCode());
        result = prime * result + ((getAccount_balance() == null) ? 0 : getAccount_balance().hashCode());
        result = prime * result + ((getIs_mobile_check() == null) ? 0 : getIs_mobile_check().hashCode());
        result = prime * result + ((getIs_email_check() == null) ? 0 : getIs_email_check().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getUser_level() == null) ? 0 : getUser_level().hashCode());
        result = prime * result + ((getPoints() == null) ? 0 : getPoints().hashCode());
        result = prime * result + ((getExperience_value() == null) ? 0 : getExperience_value().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getLast_login_time() == null) ? 0 : getLast_login_time().hashCode());
        return result;
    }

    /**
     */
    public enum Column {
        id("id", "id", "BIGINT", false),
        username("username", "username", "VARCHAR", false),
        password("password", "password", "VARCHAR", false),
        phone("phone", "phone", "VARCHAR", false),
        email("email", "email", "VARCHAR", false),
        created("created", "created", "TIMESTAMP", false),
        updated("updated", "updated", "TIMESTAMP", false),
        source_type("source_type", "source_type", "VARCHAR", false),
        nick_name("nick_name", "nick_name", "VARCHAR", false),
        name("name", "name", "VARCHAR", false),
        status("status", "status", "VARCHAR", false),
        head_pic("head_pic", "head_pic", "VARCHAR", false),
        qq("qq", "qq", "VARCHAR", false),
        account_balance("account_balance", "account_balance", "DECIMAL", false),
        is_mobile_check("is_mobile_check", "is_mobile_check", "VARCHAR", false),
        is_email_check("is_email_check", "is_email_check", "VARCHAR", false),
        sex("sex", "sex", "VARCHAR", false),
        user_level("user_level", "user_level", "INTEGER", false),
        points("points", "points", "INTEGER", false),
        experience_value("experience_value", "experience_value", "INTEGER", false),
        birthday("birthday", "birthday", "TIMESTAMP", false),
        last_login_time("last_login_time", "last_login_time", "TIMESTAMP", false);

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