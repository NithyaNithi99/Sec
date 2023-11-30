package com.jobs.ags.hr.interviewprocess;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CandidateDetail implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String id;
	private java.lang.String name;
	private java.lang.String lob;
	private java.lang.String applicationId;

	private Boolean isGREApproved;

	private java.lang.Boolean isFresher;

	public CandidateDetail() {
	}

	public java.lang.String getId() {
		return this.id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getLob() {
		return this.lob;
	}

	public void setLob(java.lang.String lob) {
		this.lob = lob;
	}

	public java.lang.String getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(java.lang.String applicationId) {
		this.applicationId = applicationId;
	}

	public java.lang.Boolean getIsGREApproved() {
		return this.isGREApproved;
	}

	public void setIsGREApproved(java.lang.Boolean isGREApproved) {
		this.isGREApproved = isGREApproved;
	}

	public java.lang.Boolean getIsFresher() {
		return this.isFresher;
	}

	public void setIsFresher(java.lang.Boolean isFresher) {
		this.isFresher = isFresher;
	}

	public CandidateDetail(java.lang.String id, java.lang.String name,
			java.lang.String lob, java.lang.String applicationId,
			java.lang.Boolean isGREApproved, java.lang.Boolean isFresher) {
		this.id = id;
		this.name = name;
		this.lob = lob;
		this.applicationId = applicationId;
		this.isGREApproved = isGREApproved;
		this.isFresher = isFresher;
	}

}