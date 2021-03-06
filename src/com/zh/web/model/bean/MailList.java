package com.zh.web.model.bean;

import com.zh.core.model.IDataObject;


/**
 * 通讯录
 * @author taozhaoping 26078
 * @author mail taozhaoping@gmail.com
 */
public class MailList extends IDataObject {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_MAIL_LIST.ID
     *
     * @mbggenerated Fri Jan 09 09:43:20 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_MAIL_LIST.CREATEDATE
     *
     * @mbggenerated Fri Jan 09 09:43:20 CST 2015
     */
    private String createdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_MAIL_LIST.UPDATEDATE
     *
     * @mbggenerated Fri Jan 09 09:43:20 CST 2015
     */
    private String updatedate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_MAIL_LIST.PHONE
     *
     * @mbggenerated Fri Jan 09 09:43:20 CST 2015
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_MAIL_LIST.NAME
     *
     * @mbggenerated Fri Jan 09 09:43:20 CST 2015
     */
    private String name;
    
    private Integer franchiseeId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCreatedate() {
		return createdate;
	}

	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}

	public String getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(String updatedate) {
		this.updatedate = updatedate;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getFranchiseeId() {
		return franchiseeId;
	}

	public void setFranchiseeId(Integer franchiseeId) {
		this.franchiseeId = franchiseeId;
	}

}