package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table ( name = "teacher")
@SequenceGenerator(name="seq", initialValue=1, allocationSize=100)
public class Teacher {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	long id;
	
	@Column (name = "TEACHER_NAME")
	 String teacherName ;
	@Column (name = "TEACHER_SUBJECT")
	 String teacherSubject;
	@Column (name = "TEACHER_ADDRESS")
	 String teacherAddress;
	@Column (name = "TEACHER_PHONE")
	 String teacherPhone;
	public Teacher() {
		super();
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getTeacherSubject() {
		return teacherSubject;
	}
	public void setTeacherSubject(String teacherSubject) {
		this.teacherSubject = teacherSubject;
	}
	public String getTeacherAddress() {
		return teacherAddress;
	}
	public void setTeacherAddress(String teacherAddress) {
		this.teacherAddress = teacherAddress;
	}
	public String getTeacherPhone() {
		return teacherPhone;
	}
	public void setTeacherPhone(String teacherPhone) {
		this.teacherPhone = teacherPhone;
	}
	
}
