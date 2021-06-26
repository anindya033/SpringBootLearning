package com.dream.wave.party;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PartyController {
	
	@Autowired
	private PartyService objPartyService;
	
	@RequestMapping("/getAllPartyDetails")
	public List<TblParty> getPartyDetails() {
		return  objPartyService.getAllParty();
	}
	
	@RequestMapping("/getPartyById/{id}")
	public TblParty getPartyDetailsById(@PathVariable(value = "id") Long id) {
		return  objPartyService.getPartyDetailsById(id);
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/saveParty")
	public String addTopic(@RequestBody TblParty party) {
		
		String msg = objPartyService.saveParty(party);
		return msg;
	}
	
	
}
