package com.dream.wave.education;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_student", schema = "education")
public class Student {
	@Id
	@GeneratedValue
	private Long studentId;
	private String studentName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "std_sch_fid")
	private School school;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Long studentId, String studentName, School school) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.school = school;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
