package com.jobs.ags.hr.interviewprocess;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class InterviewDetail implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String interviewProcessId;
	private java.lang.String waitingTime;

	private java.lang.String assesmentTime;

	private java.lang.String status;

	public InterviewDetail() {
	}

	public java.lang.String getInterviewProcessId() {
		return this.interviewProcessId;
	}

	public void setInterviewProcessId(java.lang.String interviewProcessId) {
		this.interviewProcessId = interviewProcessId;
	}

	public java.lang.String getWaitingTime() {
		return this.waitingTime;
	}

	public void setWaitingTime(java.lang.String waitingTime) {
		this.waitingTime = waitingTime;
	}

	public java.lang.String getAssesmentTime() {
		return this.assesmentTime;
	}

	public void setAssesmentTime(java.lang.String assesmentTime) {
		this.assesmentTime = assesmentTime;
	}

	public java.lang.String getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public InterviewDetail(java.lang.String interviewProcessId,
			java.lang.String waitingTime, java.lang.String assesmentTime,
			java.lang.String status) {
		this.interviewProcessId = interviewProcessId;
		this.waitingTime = waitingTime;
		this.assesmentTime = assesmentTime;
		this.status = status;
	}

}