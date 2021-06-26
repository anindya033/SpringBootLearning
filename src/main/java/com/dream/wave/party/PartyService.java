package com.dream.wave.party;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartyService {
	
	@Autowired
	private PartyRepository tblParty;
		
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
			
			tblParty.save(partyObj);
			
			msg = "SuccessFull";
			
		}catch (Exception e) {
			// TODO: handle exception
			msg = "Error";
			System.out.println(e);
		}
		
		return msg;
		
	}
}
