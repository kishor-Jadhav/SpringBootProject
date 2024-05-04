package com.example.testprojectemp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.testprojectemp.Entity.Course;
import com.example.testprojectemp.Entity.Student;

public interface CourseRepository extends JpaRepository<Course, Integer>{
	 @Query("SELECT s FROM Course s")
	 List<Course> getAllCourse();
	 
	 @Query("SELECT c FROM Course c WHERE c.course_id = ?1")
	  Course findByCourseId(Long courseId);
	// Course findById(@Param("courseId") Long courseId);
	 Course save(Course course);
}
