package com.example.hb.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.engine.internal.Cascade;
@Entity
@Table(name="repair")
public class Repair {
	@Column(name="repairid")
	@Id
Long repairId;
	@Column(name="approverid")
String approverId;
	@Column(name="approverdby")
String approvedBy;
	@OneToMany(cascade= {CascadeType.ALL})
	@JoinColumn(name="repairid")
	Set<RepairAudit> audit;
	
	/*@OneToOne(cascade=CascadeType.ALL)
	RepairAudit audit;*/
	
/*public RepairAudit getAudit() {
		return audit;
	}
	public void setAudit(RepairAudit audit) {
		this.audit = audit;
	}*/
public Long getRepairId() {
	return repairId;
}
public Set<RepairAudit> getAudit() {
	return audit;
}
public void setAudit(Set<RepairAudit> audit) {
	this.audit = audit;
}
public void setRepairId(Long repairId) {
	this.repairId = repairId;
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
public void setApprovedBy(String approvedBy) {
	this.approvedBy = approvedBy;
}
public Repair() {
	super();
}

}
