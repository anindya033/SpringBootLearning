package com.dream.wave.oneToMany;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dream.wave.party.PartyRepository;
import com.dream.wave.party.TblParty;
import com.dream.wave.party.address.TblPartyAddress;

@Service
public class UniversityService {
	
	@Autowired
	private UniversityRepository uniRepo;
	

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
			
		}catch (Exception e) {
			// TODO: handle exception
			msg = "Error";
			System.out.println(e);
		}
		
		return msg;
		
	}
}
