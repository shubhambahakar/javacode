package com.employee;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="courses")
public class Courses {
	
	@Id
	@Column(name="c_id")
	public int courseid;
	
	@Column(name="c_name")
	public String coursename;
	
	@Column(name="c_provider")
	public String courseprovider;

	public Courses(int courseid, String coursename, String courseprovider) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
		this.courseprovider = courseprovider;
	}

	public int getCourseid() {
		return courseid;
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public String getCourseprovider() {
		return courseprovider;
	}

	public void setCourseprovider(String courseprovider) {
		this.courseprovider = courseprovider;
	}
	
	
	
	

}
