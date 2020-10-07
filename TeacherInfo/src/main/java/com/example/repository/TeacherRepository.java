package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long>{
@Query (value = "Select t from Teacher t where t.teacherName like concat ('%',concat(?1,'%'))" + "and t.teacherPhone like concat ('%',concat(?2,'%')) ")
List<Teacher> searchTeacher(String teacherName,String teacherPhone);

List<Teacher> findByTeacherNameOrTeacherPhone(String teacherName,String teacherPhone);
@Query(value="select * from Teacher where teacher_name like  concat('%',?1,'%')" 
, nativeQuery =  true)
List<Teacher> searchWithNativeQuery(String name);
}
