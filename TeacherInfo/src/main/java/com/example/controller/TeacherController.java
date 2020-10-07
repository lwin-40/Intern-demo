package com.example.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Teacher;
import com.example.service.TeacherService;



@RestController

public class TeacherController {
	@Autowired
	TeacherService teacherService;
@GetMapping(value="/teacher")

	public List<Teacher> getTeacher() {
		return teacherService.getTeacher();
	}
@PostMapping(value="/teacher")
public Teacher addTeacher(@RequestBody Teacher teacher) {
	return teacherService.addTeacher(teacher);
}
@DeleteMapping(value="/teacher/{id}")
public void deleteTeacher(@PathVariable Long id) {
	 teacherService.deleteTeacher(id);
}
@GetMapping(value="/teacher/search")
public List<Teacher> searchTeacher(String teacherName,String teacherPhone) {
	return teacherService.searchTeacherInfo(teacherName,teacherPhone);
}
@GetMapping(value="/teacher/search")
public List<Teacher> findTeacherNameOrTeacherPhone(String teacherName,String teacherPhone) {
	return teacherService.findByTeacherNameOrTeacherPhone(teacherName, teacherPhone);
}
@GetMapping(value="/teacher/search")
public List<Teacher> searchNativeQuery(String teacherName) {
	return teacherService.searchWithNativeQuery(teacherName);
}
}
