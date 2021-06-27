package com.dream.wave.party.address;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.dream.wave.party.TblParty;

import java.util.Date;
@Entity
@Table(name = "tbl_party_address", schema = "party")
public class TblPartyAddress {
	@Id
	@GeneratedValue
	private Long ptyaddId;
	private String ptyaddTenantCode;
	private Long ptyyadPtyIdRef;
	private String ptyaddAddress1;
	private String ptyaddAddress2;
	private String ptyaddAddress3;
	private String ptyaddDistrict;
	private String ptyaddCity;
	private String ptyaddState;
	private String ptyaddCountry;
	private Date ptyaddCreatedDate;
	private String ptyaddCreatedBy;
	private Date ptyaddLastUpdateDate ;
	private String ptyaddLastUpdatedBy;
	
	//@OneToOne(mappedBy = "tblPartyAddress")
	//private TblParty tblParty;
	
//	public TblParty getTblParty() {
//		return tblParty;
//	}
//
//
//	public void setTblParty(TblParty tblParty) {
//		this.tblParty = tblParty;
//	}


	public TblPartyAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public TblPartyAddress(Long ptyaddId, String ptyaddTenantCode, Long ptyyadPtyIdRef, String ptyaddAddress1,
			String ptyaddAddress2, String ptyaddAddress3, String ptyaddDistrict, String ptyaddCity, String ptyaddState,
			String ptyaddCountry, Date ptyaddCreatedDate, String ptyaddCreatedBy, Date ptyaddLastUpdateDate,
			String ptyaddLastUpdatedBy, TblParty tblParty) {
		super();
		this.ptyaddId = ptyaddId;
		this.ptyaddTenantCode = ptyaddTenantCode;
		this.ptyyadPtyIdRef = ptyyadPtyIdRef;
		this.ptyaddAddress1 = ptyaddAddress1;
		this.ptyaddAddress2 = ptyaddAddress2;
		this.ptyaddAddress3 = ptyaddAddress3;
		this.ptyaddDistrict = ptyaddDistrict;
		this.ptyaddCity = ptyaddCity;
		this.ptyaddState = ptyaddState;
		this.ptyaddCountry = ptyaddCountry;
		this.ptyaddCreatedDate = ptyaddCreatedDate;
		this.ptyaddCreatedBy = ptyaddCreatedBy;
		this.ptyaddLastUpdateDate = ptyaddLastUpdateDate;
		this.ptyaddLastUpdatedBy = ptyaddLastUpdatedBy;
		//this.tblParty = tblParty;
	}

	public Long getPtyyadPtyIdRef() {
		return ptyyadPtyIdRef;
	}


	public void setPtyyadPtyIdRef(Long ptyyadPtyIdRef) {
		this.ptyyadPtyIdRef = ptyyadPtyIdRef;
	}

	public Long getPtyaddId() {
		return ptyaddId;
	}
	public void setPtyaddId(Long ptyaddId) {
		this.ptyaddId = ptyaddId;
	}
	public String getPtyaddTenantCode() {
		return ptyaddTenantCode;
	}
	public void setPtyaddTenantCode(String ptyaddTenantCode) {
		this.ptyaddTenantCode = ptyaddTenantCode;
	}
	public String getPtyaddAddress1() {
		return ptyaddAddress1;
	}
	public void setPtyaddAddress1(String ptyaddAddress1) {
		this.ptyaddAddress1 = ptyaddAddress1;
	}
	public String getPtyaddAddress2() {
		return ptyaddAddress2;
	}
	public void setPtyaddAddress2(String ptyaddAddress2) {
		this.ptyaddAddress2 = ptyaddAddress2;
	}
	public String getPtyaddAddress3() {
		return ptyaddAddress3;
	}
	public void setPtyaddAddress3(String ptyaddAddress3) {
		this.ptyaddAddress3 = ptyaddAddress3;
	}
	public String getPtyaddDistrict() {
		return ptyaddDistrict;
	}
	public void setPtyaddDistrict(String ptyaddDistrict) {
		this.ptyaddDistrict = ptyaddDistrict;
	}
	public String getPtyaddCity() {
		return ptyaddCity;
	}
	public void setPtyaddCity(String ptyaddCity) {
		this.ptyaddCity = ptyaddCity;
	}
	public String getPtyaddState() {
		return ptyaddState;
	}
	public void setPtyaddState(String ptyaddState) {
		this.ptyaddState = ptyaddState;
	}
	public String getPtyaddCountry() {
		return ptyaddCountry;
	}
	public void setPtyaddCountry(String ptyaddCountry) {
		this.ptyaddCountry = ptyaddCountry;
	}
	public Date getPtyaddCreatedDate() {
		return ptyaddCreatedDate;
	}
	public void setPtyaddCreatedDate(Date ptyaddCreatedDate) {
		this.ptyaddCreatedDate = ptyaddCreatedDate;
	}
	public String getPtyaddCreatedBy() {
		return ptyaddCreatedBy;
	}
	public void setPtyaddCreatedBy(String ptyaddCreatedBy) {
		this.ptyaddCreatedBy = ptyaddCreatedBy;
	}
	public Date getPtyaddLastUpdateDate() {
		return ptyaddLastUpdateDate;
	}
	public void setPtyaddLastUpdateDate(Date ptyaddLastUpdateDate) {
		this.ptyaddLastUpdateDate = ptyaddLastUpdateDate;
	}
	public String getPtyaddLastUpdatedBy() {
		return ptyaddLastUpdatedBy;
	}
	public void setPtyaddLastUpdatedBy(String ptyaddLastUpdatedBy) {
		this.ptyaddLastUpdatedBy = ptyaddLastUpdatedBy;
	}
	
	
}
