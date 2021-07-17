package com.dream.wave.oneToMany;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dream.wave.BuildYourHomeApplication;
import com.dream.wave.party.PartyRepository;
import com.dream.wave.party.TblParty;
import com.dream.wave.party.address.TblPartyAddress;

@Service
public class UniversityService {
	
	@Autowired
	private UniversityRepository uniRepo;
	static final Logger logger = LogManager.getLogger(BuildYourHomeApplication.class.getName());

	public String saveUniversity(University universityData) {
		String msg = "";
		try {
			
			University objUni = universityData;
			
			Teacher objTeacher1 = new Teacher();
			objTeacher1.setTeacherName("Nayan");
			
			Teacher objTeacher2 = new Teacher();
			objTeacher2.setTeacherName("Pritam");

			List<Teacher> teachers = Arrays.asList(objTeacher1, objTeacher2);
			objUni.setTeachers(teachers);
			
			uniRepo.save(objUni);
			
			msg = "SuccessFull";
			logger.info("Data save is successful 2 !!"); // Still log is printed in the external file.
			
		}catch (Exception e) {
			// TODO: handle exception
			msg = "Error";
			System.out.println(e);
		}
		
		return msg;
		
	}
}
