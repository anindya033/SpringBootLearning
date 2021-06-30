package com.dream.wave.education;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dream.wave.party.PartyRepository;
import com.dream.wave.party.TblParty;
import com.dream.wave.party.address.TblPartyAddress;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepo;
	
	@Autowired
	private SchoolRepository schoolRepo;
	
	public List<Student> getStudentDetail() {
		
		return studentRepo.findAll();
	}

	public String saveStudent(Student student) {
		String msg = "";
		try {
			
			Student objStudent = student;
			
			School objSchool = new School();
			objSchool.setSchoolName("Municipal High School");
			objStudent.setSchool(objSchool);
			
			
			studentRepo.save(objStudent);
			msg = "SuccessFull";
			
		}catch (Exception e) {
			// TODO: handle exception
			msg = "Error";
			System.out.println(e);
		}
		
		return msg;
		
	}
}
