package com.example.testprojectemp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.testprojectemp.DTO.EnrollmentDTO;
import com.example.testprojectemp.DTO.EnrollmentEntityManagerDTO;
import com.example.testprojectemp.Entity.Course;
import com.example.testprojectemp.Entity.Enrollment;
import com.example.testprojectemp.Service.CustomService;
import com.example.testprojectemp.Service.EnrollmentService;

@RestController
public class EnrollmentController {
@Autowired
private EnrollmentService enrollmentService;

@Autowired
private CustomService customService;

@GetMapping("/enrollment")
@ResponseBody
public List<Enrollment> getAllEnrollment() {
	return this.enrollmentService.getEnrollmentTable();
	
}

@PostMapping("/enrollmentadd")
@ResponseBody
public String addEnrollment(@RequestBody Enrollment enrollment) {
	enrollmentService.addEnrollment(enrollment);
    return "Enrollment added successfully!";
}

@GetMapping("/enrollment/{id}")
@ResponseBody
public Enrollment getEnrollment(@PathVariable Long id) {
 
    return  enrollmentService.findById(id);
}

@GetMapping("/enrollmentRes")
@ResponseBody
public List<EnrollmentDTO> getEnrollmentResult() {
	return this.customService.getEnrollmentResult();
	
}
@GetMapping("/entityCourseRes")
@ResponseBody
public List<Course> getCourseResByEntity() {
	return this.customService.getCourseResByEntityManager();
	
}
@GetMapping("/entityEnrollmentRes")
@ResponseBody
public List<EnrollmentEntityManagerDTO> getEnrollmentResByEntityManager() {
	return this.customService.getEnrollmentResByEntityManager();
	
}
}
