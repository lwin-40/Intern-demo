package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Teacher;
import com.example.repository.TeacherRepository;

@Service
public class TeacherService {
	@Autowired
	TeacherRepository teacherRepository;

	public List<Teacher> getTeacher() {
		return teacherRepository.findAll();
	}

	public Teacher addTeacher(Teacher teacher) {

		return teacherRepository.save(teacher);
	}

	public void deleteTeacher(Long id) {

 teacherRepository.deleteById(id);
		
	}
	public List<Teacher> searchTeacherInfo(String teacherName,String teacherPhone) {
		return teacherRepository.searchTeacher(teacherName, teacherPhone);
	}
	public List<Teacher> findByTeacherNameOrTeacherPhone(String teacherName,String teacherPhone) {
		return teacherRepository.findByTeacherNameOrTeacherPhone(teacherName, teacherPhone);
	}
	public List<Teacher> searchWithNativeQuery(String name) {
		return teacherRepository.searchWithNativeQuery(name);
	}
}
