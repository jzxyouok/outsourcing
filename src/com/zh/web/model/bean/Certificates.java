package com.zh.web.model.bean;

import java.util.Date;

import com.zh.core.base.model.IdataObject;

public class Certificates implements IdataObject{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_CERTIFICATES.ID
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_CERTIFICATES.WORKFLOWID
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    private String workflowid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_CERTIFICATES.NAME
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_CERTIFICATES.HANDLEDATE
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    private Date handledate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_CERTIFICATES.RECEIVEDATE
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    private Date receivedate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_CERTIFICATES.VALIDSTARTDATE
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    private Date validstartdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_CERTIFICATES.VALIDENDDATE
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    private Date validenddate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_CERTIFICATES.TYPE
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_CERTIFICATES.CREATEDATE
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    private String createdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_CERTIFICATES.UPDATEDATE
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    private String updatedate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_CERTIFICATES.STATUS
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_CERTIFICATES.TECHNOLOGICALPROCESSID
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    private Integer technologicalprocessid;

    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_CERTIFICATES.WORKFLOWID
     *
     * @return the value of T_CERTIFICATES.WORKFLOWID
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    public String getWorkflowid() {
        return workflowid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_CERTIFICATES.WORKFLOWID
     *
     * @param workflowid the value for T_CERTIFICATES.WORKFLOWID
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    public void setWorkflowid(String workflowid) {
        this.workflowid = workflowid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_CERTIFICATES.NAME
     *
     * @return the value of T_CERTIFICATES.NAME
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_CERTIFICATES.NAME
     *
     * @param name the value for T_CERTIFICATES.NAME
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_CERTIFICATES.HANDLEDATE
     *
     * @return the value of T_CERTIFICATES.HANDLEDATE
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    public Date getHandledate() {
        return handledate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_CERTIFICATES.HANDLEDATE
     *
     * @param handledate the value for T_CERTIFICATES.HANDLEDATE
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    public void setHandledate(Date handledate) {
        this.handledate = handledate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_CERTIFICATES.RECEIVEDATE
     *
     * @return the value of T_CERTIFICATES.RECEIVEDATE
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    public Date getReceivedate() {
        return receivedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_CERTIFICATES.RECEIVEDATE
     *
     * @param receivedate the value for T_CERTIFICATES.RECEIVEDATE
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    public void setReceivedate(Date receivedate) {
        this.receivedate = receivedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_CERTIFICATES.VALIDSTARTDATE
     *
     * @return the value of T_CERTIFICATES.VALIDSTARTDATE
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    public Date getValidstartdate() {
        return validstartdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_CERTIFICATES.VALIDSTARTDATE
     *
     * @param validstartdate the value for T_CERTIFICATES.VALIDSTARTDATE
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    public void setValidstartdate(Date validstartdate) {
        this.validstartdate = validstartdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_CERTIFICATES.VALIDENDDATE
     *
     * @return the value of T_CERTIFICATES.VALIDENDDATE
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    public Date getValidenddate() {
        return validenddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_CERTIFICATES.VALIDENDDATE
     *
     * @param validenddate the value for T_CERTIFICATES.VALIDENDDATE
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    public void setValidenddate(Date validenddate) {
        this.validenddate = validenddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_CERTIFICATES.TYPE
     *
     * @return the value of T_CERTIFICATES.TYPE
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_CERTIFICATES.TYPE
     *
     * @param type the value for T_CERTIFICATES.TYPE
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_CERTIFICATES.CREATEDATE
     *
     * @return the value of T_CERTIFICATES.CREATEDATE
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    public String getCreatedate() {
        return createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_CERTIFICATES.CREATEDATE
     *
     * @param createdate the value for T_CERTIFICATES.CREATEDATE
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_CERTIFICATES.UPDATEDATE
     *
     * @return the value of T_CERTIFICATES.UPDATEDATE
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    public String getUpdatedate() {
        return updatedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_CERTIFICATES.UPDATEDATE
     *
     * @param updatedate the value for T_CERTIFICATES.UPDATEDATE
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    public void setUpdatedate(String updatedate) {
        this.updatedate = updatedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_CERTIFICATES.STATUS
     *
     * @return the value of T_CERTIFICATES.STATUS
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_CERTIFICATES.STATUS
     *
     * @param status the value for T_CERTIFICATES.STATUS
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_CERTIFICATES.TECHNOLOGICALPROCESSID
     *
     * @return the value of T_CERTIFICATES.TECHNOLOGICALPROCESSID
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    public Integer getTechnologicalprocessid() {
        return technologicalprocessid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_CERTIFICATES.TECHNOLOGICALPROCESSID
     *
     * @param technologicalprocessid the value for T_CERTIFICATES.TECHNOLOGICALPROCESSID
     *
     * @mbggenerated Sat Aug 16 17:00:38 CST 2014
     */
    public void setTechnologicalprocessid(Integer technologicalprocessid) {
        this.technologicalprocessid = technologicalprocessid;
    }
}