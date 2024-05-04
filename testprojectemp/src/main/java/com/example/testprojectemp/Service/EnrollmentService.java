package com.example.testprojectemp.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.testprojectemp.DTO.EnrollmentDTO;
import com.example.testprojectemp.Entity.Course;
import com.example.testprojectemp.Entity.Enrollment;

@Service
public interface EnrollmentService {
	public List<Enrollment> getEnrollmentTable();
	Enrollment findById (Long enrollmentId);
	String addEnrollment(Enrollment enrollment);
	List<EnrollmentDTO> getEnrollmentResult();
}
