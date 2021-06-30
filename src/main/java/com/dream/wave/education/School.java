package com.dream.wave.education;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_school", schema = "education")
public class School {
	
	@Id
	@GeneratedValue
	private Long schoolId;
	private String schoolName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sch_std_fid")
	private Student student;
	
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
	public School(Long schoolId, String schoolName, Student student) {
		super();
		this.schoolId = schoolId;
		this.schoolName = schoolName;
		this.student = student;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Long getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(Long schoolId) {
		this.schoolId = schoolId;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	
	
}
