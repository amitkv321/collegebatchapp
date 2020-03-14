package com.avion.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({
	@NamedQuery(name="getAllBatchDetails", query="select b from BatchDetails b")
})
@Table(name="batch_details")
public class BatchDetails {
	
	@Id
	int batchId;
	
	String batchName;
	int strength;
	String subject;
	Date startDate;
	Date endDate;
	
	public int getBatchId() {
		return batchId;
	}
	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	@Override
	public String toString() {
		return "BatchDetails [batchId=" + batchId + ", batchName=" + batchName + ", strength=" + strength + ", subject="
				+ subject + ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}

}
