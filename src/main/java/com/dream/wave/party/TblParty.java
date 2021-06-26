package com.dream.wave.party;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_party", schema = "party")
public class TblParty {
	
	@Id
	@GeneratedValue
	private Long ptyId;
	public Long getPtyId() {
		return ptyId;
	}
	public void setPtyId(Long ptyId) {
		this.ptyId = ptyId;
	}
	private String ptyTenantCode;
	private String ptyPartyId;
	private String ptyPartyCode;
	private String ptyPartyType;
	private String ptyPartyStatus;
	private Date ptyCreatedDate;
	private String ptyCreatedBy;
	private Date ptyLastUpdateDate;
	private String ptyLastUpdatedBy;
	
	
	public String getPtyTenantCode() {
		return ptyTenantCode;
	}
	public void setPtyTenantCode(String ptyTenantCode) {
		this.ptyTenantCode = ptyTenantCode;
	}
	public String getPtyPartyId() {
		return ptyPartyId;
	}
	public void setPtyPartyId(String ptyPartyId) {
		this.ptyPartyId = ptyPartyId;
	}
	public String getPtyPartyCode() {
		return ptyPartyCode;
	}
	public void setPtyPartyCode(String ptyPartyCode) {
		this.ptyPartyCode = ptyPartyCode;
	}
	public String getPtyPartyType() {
		return ptyPartyType;
	}
	public void setPtyPartyType(String ptyPartyType) {
		this.ptyPartyType = ptyPartyType;
	}
	public String getPtyPartyStatus() {
		return ptyPartyStatus;
	}
	public void setPtyPartyStatus(String ptyPartyStatus) {
		this.ptyPartyStatus = ptyPartyStatus;
	}
	public Date getPtyCreatedDate() {
		return ptyCreatedDate;
	}
	public void setPtyCreatedDate(Date ptyCreatedDate) {
		this.ptyCreatedDate = ptyCreatedDate;
	}
	public String getPtyCreatedBy() {
		return ptyCreatedBy;
	}
	public void setPtyCreatedBy(String ptyCreatedBy) {
		this.ptyCreatedBy = ptyCreatedBy;
	}
	public Date getPtyLastUpdateDate() {
		return ptyLastUpdateDate;
	}
	public void setPtyLastUpdateDate(Date ptyLastUpdateDate) {
		this.ptyLastUpdateDate = ptyLastUpdateDate;
	}
	public String getPtyLastUpdatedBy() {
		return ptyLastUpdatedBy;
	}
	public void setPtyLastUpdatedBy(String ptyLastUpdatedBy) {
		this.ptyLastUpdatedBy = ptyLastUpdatedBy;
	}
	
	

}
