package com.example.testprojectemp.IMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testprojectemp.DTO.EnrollmentDTO;
import com.example.testprojectemp.Entity.Course;
import com.example.testprojectemp.Entity.Enrollment;
import com.example.testprojectemp.Repository.CourseRepository;
import com.example.testprojectemp.Repository.EnrollmentRepository;
import com.example.testprojectemp.Service.CourseService;
import com.example.testprojectemp.Service.EnrollmentService;

@Service
public class EnrollmentIMPL implements EnrollmentService{
	List<Enrollment> list;
	
	@Autowired
	EnrollmentRepository enrollmentRepository;
	public EnrollmentIMPL(EnrollmentRepository enrollmentRepository) {
		  this.enrollmentRepository = enrollmentRepository;		   
	  }
	
	@Override
	public List<Enrollment> getEnrollmentTable() {
		return enrollmentRepository.getEnrollmentTable();
	}

	@Override
	public String addEnrollment(Enrollment enrollment) {
		enrollmentRepository.save(enrollment);
        return "Add Record";
	}
	@Override
	public Enrollment findById(Long enrollmentId) {
		Enrollment EnrollmentDB = enrollmentRepository.findByEnrollmentId(enrollmentId);		 
		 return EnrollmentDB;
	}
	@Override
	public List<EnrollmentDTO> getEnrollmentResult() {
		List<EnrollmentDTO> EnrollmentDB = enrollmentRepository.getEnrollmentResult();		 
		 return EnrollmentDB;
	}
}
