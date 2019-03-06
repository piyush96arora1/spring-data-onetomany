package com.example.hb.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="repair_audit")
public class RepairAudit {
	@Column(name="auditid")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long auditId;
	@Column(name="approverid")
	String approverId;
	@Column(name="aproovedby")
	String approvedBy;
	
	Long repairid;


	public Long getRepairid() {
		return repairid;
	}


	public void setRepairid(Long repairid) {
		this.repairid = repairid;
	}


	public String getApproverId() {
		return approverId;
	}


	public void setApproverId(String approverId) {
		this.approverId = approverId;
	}


	public String getApprovedBy() {
		return approvedBy;
	}


	public Long getAuditId() {
		return auditId;
	}


	public void setAuditId(Long auditId) {
		this.auditId = auditId;
	}


	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}




	
}
