package com.dream.wave.oneToMany;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dream.wave.party.TblParty;

@RestController
public class UniversityController {
	
	@Autowired
	private UniversityService universityRepo;

	@RequestMapping(method = RequestMethod.POST, value = "/saveUniversity")
	public String addTopic(@RequestBody University uni) {
		
		String msg = universityRepo.saveUniversity(uni);
		return msg;
	}
	
	
}
