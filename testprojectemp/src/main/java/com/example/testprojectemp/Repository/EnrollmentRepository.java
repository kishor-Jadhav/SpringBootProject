package com.example.testprojectemp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.testprojectemp.DTO.EnrollmentDTO;
import com.example.testprojectemp.Entity.Course;
import com.example.testprojectemp.Entity.Enrollment;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Integer>{
	 @Query("SELECT s FROM Enrollment s")
	 List<Enrollment> getEnrollmentTable();
	 
	 @Query("SELECT c FROM Enrollment c WHERE c.enrollmentId = ?1")
	 Enrollment findByEnrollmentId(Long enrollmentId);
	 //Enrollment findById(@Param("enrollmentId") Long enrollmentId);
	 Enrollment save(Enrollment enrollment);
	 
	// @Query(value="SELECT s.name AS studentName, c.course_name as courseName FROM enrollment e "+
	//		    "INNER JOIN student s ON e.stud_id = s.id "+
	//		    "INNER JOIN course c ON e.course_id = c.course_id", nativeQuery = true)	
	   @Query("SELECT s FROM Enrollment s")
		List<EnrollmentDTO> getEnrollmentResult();
}
