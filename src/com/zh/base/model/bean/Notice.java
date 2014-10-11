package com.zh.base.model.bean;

import java.util.Date;

import com.zh.core.model.IDataObject;

public class Notice extends IDataObject {
    /**
	 * 
	 */
	private static final long serialVersionUID = 5094213148556058878L;

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_NOTICE.ID
     *
     * @mbggenerated Fri Sep 05 16:10:08 CST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_NOTICE.TITLE
     *
     * @mbggenerated Fri Sep 05 16:10:08 CST 2014
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_NOTICE.CONTENT
     *
     * @mbggenerated Fri Sep 05 16:10:08 CST 2014
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_NOTICE.USERID
     *
     * @mbggenerated Fri Sep 05 16:10:08 CST 2014
     */
    private Integer userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_NOTICE.CREATEDATE
     *
     * @mbggenerated Fri Sep 05 16:10:08 CST 2014
     */
    private Date createdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_NOTICE.UPDATEDATE
     *
     * @mbggenerated Fri Sep 05 16:10:08 CST 2014
     */
    private Date updatedate;

    /**
     * 状态
     */
    private String enabled;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public Date getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}

	public String getEnabled() {
		return enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

}