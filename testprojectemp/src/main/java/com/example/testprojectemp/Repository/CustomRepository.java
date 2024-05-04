package com.example.testprojectemp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.testprojectemp.DTO.EnrollmentDTO;
import com.example.testprojectemp.Entity.Course;
import com.example.testprojectemp.Entity.Enrollment;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
 
public interface CustomRepository extends JpaRepository<Enrollment, Integer>{
	
	 @Query(value="SELECT s.name AS studentName,s.age,s.email AS email, c.course_name as courseName, d.dep_name as departmentName FROM enrollment e "+
			    "INNER JOIN student s ON e.stud_id = s.id "+
			    "INNER JOIN course c ON e.course_id = c.course_id LEFT OUTER JOIN department d ON s.dep_id = d.dep_id", nativeQuery = true)	 
	 List<Object[]> getEnrollmentResult();
	 
	 @Query("SELECT s FROM Course s where s.course_name = :course_name")	 
	 List<Course> getcourse(String course_name);
}
