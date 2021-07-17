package com.dream.wave.oneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_university", schema = "onetomany")
public class University {
	
	@Id
	@GeneratedValue
	private Long universityId;
	private String universityName;
	
	@OneToMany(
			cascade = CascadeType.ALL,
			orphanRemoval = true
			)
	@JoinColumn(name ="university_fid")
	private List<Teacher> teachers = new ArrayList<Teacher>();
		
	
	
	public University() {
		super();
		// TODO Auto-generated constructor stub
	}

	public University(Long universityId, String universityName, List<Teacher> teachers) {
		super();
		this.universityId = universityId;
		this.universityName = universityName;
		this.teachers = teachers;
	}

	public Long getUniversityId() {
		return universityId;
	}

	public void setUniversityId(Long universityId) {
		this.universityId = universityId;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	
	
}
