package com.huchx.shm.entity;

import java.util.Date;

public class UserEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user.ID
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user.IDENTITY_NO
     *
     * @mbg.generated
     */
    private String identityNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user.REAL_NAME
     *
     * @mbg.generated
     */
    private String realName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user.NICK_NAME
     *
     * @mbg.generated
     */
    private String nickName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user.LOGIN_NAME
     *
     * @mbg.generated
     */
    private String loginName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user.SALT
     *
     * @mbg.generated
     */
    private String salt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user.PASSWORD
     *
     * @mbg.generated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user.MOBILE
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user.SEX
     *
     * @mbg.generated
     */
    private Byte sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user.BIRTHDAY
     *
     * @mbg.generated
     */
    private Date birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user.CREATE_TIME
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user.UPDATE_TIME
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user.SOURCE
     *
     * @mbg.generated
     */
    private Integer source;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user.STATUS
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user.FLG_FREEZE
     *
     * @mbg.generated
     */
    private Byte flgFreeze;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user.FLG_DELETED
     *
     * @mbg.generated
     */
    private Byte flgDeleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user.FLG_AUTH_REALNAME
     *
     * @mbg.generated
     */
    private Integer flgAuthRealname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user.ID
     *
     * @return the value of m_user.ID
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user.ID
     *
     * @param id the value for m_user.ID
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user.IDENTITY_NO
     *
     * @return the value of m_user.IDENTITY_NO
     *
     * @mbg.generated
     */
    public String getIdentityNo() {
        return identityNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user.IDENTITY_NO
     *
     * @param identityNo the value for m_user.IDENTITY_NO
     *
     * @mbg.generated
     */
    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo == null ? null : identityNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user.REAL_NAME
     *
     * @return the value of m_user.REAL_NAME
     *
     * @mbg.generated
     */
    public String getRealName() {
        return realName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user.REAL_NAME
     *
     * @param realName the value for m_user.REAL_NAME
     *
     * @mbg.generated
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user.NICK_NAME
     *
     * @return the value of m_user.NICK_NAME
     *
     * @mbg.generated
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user.NICK_NAME
     *
     * @param nickName the value for m_user.NICK_NAME
     *
     * @mbg.generated
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user.LOGIN_NAME
     *
     * @return the value of m_user.LOGIN_NAME
     *
     * @mbg.generated
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user.LOGIN_NAME
     *
     * @param loginName the value for m_user.LOGIN_NAME
     *
     * @mbg.generated
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user.SALT
     *
     * @return the value of m_user.SALT
     *
     * @mbg.generated
     */
    public String getSalt() {
        return salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user.SALT
     *
     * @param salt the value for m_user.SALT
     *
     * @mbg.generated
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user.PASSWORD
     *
     * @return the value of m_user.PASSWORD
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user.PASSWORD
     *
     * @param password the value for m_user.PASSWORD
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user.MOBILE
     *
     * @return the value of m_user.MOBILE
     *
     * @mbg.generated
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user.MOBILE
     *
     * @param mobile the value for m_user.MOBILE
     *
     * @mbg.generated
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user.SEX
     *
     * @return the value of m_user.SEX
     *
     * @mbg.generated
     */
    public Byte getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user.SEX
     *
     * @param sex the value for m_user.SEX
     *
     * @mbg.generated
     */
    public void setSex(Byte sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user.BIRTHDAY
     *
     * @return the value of m_user.BIRTHDAY
     *
     * @mbg.generated
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user.BIRTHDAY
     *
     * @param birthday the value for m_user.BIRTHDAY
     *
     * @mbg.generated
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user.CREATE_TIME
     *
     * @return the value of m_user.CREATE_TIME
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user.CREATE_TIME
     *
     * @param createTime the value for m_user.CREATE_TIME
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user.UPDATE_TIME
     *
     * @return the value of m_user.UPDATE_TIME
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user.UPDATE_TIME
     *
     * @param updateTime the value for m_user.UPDATE_TIME
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user.SOURCE
     *
     * @return the value of m_user.SOURCE
     *
     * @mbg.generated
     */
    public Integer getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user.SOURCE
     *
     * @param source the value for m_user.SOURCE
     *
     * @mbg.generated
     */
    public void setSource(Integer source) {
        this.source = source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user.STATUS
     *
     * @return the value of m_user.STATUS
     *
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user.STATUS
     *
     * @param status the value for m_user.STATUS
     *
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user.FLG_FREEZE
     *
     * @return the value of m_user.FLG_FREEZE
     *
     * @mbg.generated
     */
    public Byte getFlgFreeze() {
        return flgFreeze;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user.FLG_FREEZE
     *
     * @param flgFreeze the value for m_user.FLG_FREEZE
     *
     * @mbg.generated
     */
    public void setFlgFreeze(Byte flgFreeze) {
        this.flgFreeze = flgFreeze;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user.FLG_DELETED
     *
     * @return the value of m_user.FLG_DELETED
     *
     * @mbg.generated
     */
    public Byte getFlgDeleted() {
        return flgDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user.FLG_DELETED
     *
     * @param flgDeleted the value for m_user.FLG_DELETED
     *
     * @mbg.generated
     */
    public void setFlgDeleted(Byte flgDeleted) {
        this.flgDeleted = flgDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user.FLG_AUTH_REALNAME
     *
     * @return the value of m_user.FLG_AUTH_REALNAME
     *
     * @mbg.generated
     */
    public Integer getFlgAuthRealname() {
        return flgAuthRealname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user.FLG_AUTH_REALNAME
     *
     * @param flgAuthRealname the value for m_user.FLG_AUTH_REALNAME
     *
     * @mbg.generated
     */
    public void setFlgAuthRealname(Integer flgAuthRealname) {
        this.flgAuthRealname = flgAuthRealname;
    }
}