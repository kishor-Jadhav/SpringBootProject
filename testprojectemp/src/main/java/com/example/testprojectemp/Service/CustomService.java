package com.example.testprojectemp.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.testprojectemp.DTO.EnrollmentDTO;
import com.example.testprojectemp.DTO.EnrollmentEntityManagerDTO;
import com.example.testprojectemp.Entity.Course;

@Service
public interface CustomService {
	List<EnrollmentDTO> getEnrollmentResult();
	List<Course> getCourseResByEntityManager();
	List<EnrollmentEntityManagerDTO> getEnrollmentResByEntityManager();
}
