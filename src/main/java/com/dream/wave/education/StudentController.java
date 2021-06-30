package com.dream.wave.education;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dream.wave.party.TblParty;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService objStudent;

	@RequestMapping("/getStudentDetail")
	public List<Student> getPartyDetails() {
		return  objStudent.getStudentDetail();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/saveStudent")
	public String addTopic(@RequestBody Student student) {
		
		String msg = objStudent.saveStudent(student);
		return msg;
	}
	
	
}
