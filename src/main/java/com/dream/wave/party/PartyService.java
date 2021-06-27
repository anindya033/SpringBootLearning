package com.dream.wave.party;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dream.wave.party.address.PartyAddressRepository;
import com.dream.wave.party.address.TblPartyAddress;

@Service
public class PartyService {
	
	@Autowired
	private PartyRepository tblParty;
	
	@Autowired
	private PartyAddressRepository tblPartyAddress;
		
	public List<TblParty> getAllParty() {
		
		return tblParty.findAll();
	}
	
	public TblParty getPartyDetailsById(Long id) {
		
		//return tblParty.findOne(id);
		return tblParty.findByPtyId(id);
	}
	
	public String saveParty(TblParty party) {
		String msg = "";
		try {
			
			TblParty partyObj = party;
			
			partyObj.setPtyCreatedBy("Admin");
			partyObj.setPtyCreatedDate(new Date());
			partyObj.setPtyLastUpdatedBy("Admin");
			partyObj.setPtyLastUpdateDate(new Date());
			
			
			TblPartyAddress objAddress = new TblPartyAddress();
			objAddress.setPtyaddAddress1("Burdwan");
			objAddress.setPtyyadPtyIdRef(partyObj.getPtyId());
			objAddress.setPtyaddTenantCode("2");
			objAddress.setPtyaddCreatedDate(new Date());
			objAddress.setPtyaddCreatedBy("Admin");
			objAddress.setPtyaddLastUpdateDate(new Date());
			objAddress.setPtyaddLastUpdatedBy("Admin");
			
			//objAddress.setTblParty(partyObj);
			partyObj.setPartyAddress(objAddress);
			
			
			tblParty.save(partyObj);
			//tblPartyAddress.save(objAddress);
			msg = "SuccessFull";
			
		}catch (Exception e) {
			// TODO: handle exception
			msg = "Error";
			System.out.println(e);
		}
		
		return msg;
		
	}
}
