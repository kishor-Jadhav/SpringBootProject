package com.example.testprojectemp.IMPL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testprojectemp.DTO.EnrollmentDTO;
import com.example.testprojectemp.DTO.EnrollmentEntityManagerDTO;
import com.example.testprojectemp.Entity.Course;
import com.example.testprojectemp.Repository.CustomRepository;
import com.example.testprojectemp.Service.CustomService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Service
public class CustomServiceImpl implements CustomService{
	@PersistenceContext
    public EntityManager entityManager;
	 @Autowired
	    private CustomRepository customRepository;
	 
	@Override
	public List<EnrollmentDTO> getEnrollmentResult() {
		List<Object[]> results = customRepository.getEnrollmentResult();
		
		List<EnrollmentDTO> dtos = new ArrayList<>();
        for (Object[] result : results) {
        
        	EnrollmentDTO dto = new EnrollmentDTO();
            dto.setStudentName((String) result[0]);
            dto.setAge((Integer) result[1]);
            dto.setEmail((String) result[2]);
            dto.setCourseName((String) result[3]);
            dto.setDepartmentName((String) result[4]);
           // if(dto.getCourseName()!=null) {
            	List<Course> courseList = customRepository.getcourse(dto.getCourseName());
            	dto.setCourseList(courseList);
           // }
            
            // Add other fields if needed
            dtos.add(dto);
        }
        return dtos;
		 
	}
	@Override
	public List<Course> getCourseResByEntityManager() {
        Query query = entityManager.createQuery("SELECT s FROM Course s",Course.class);
        return query.getResultList();
    }
	
	@Override
	public List<EnrollmentEntityManagerDTO> getEnrollmentResByEntityManager() {
        Query query = entityManager.createNativeQuery("SELECT s.name AS studentName,s.age,s.email AS email, c.course_name as courseName, d.dep_name as departmentName FROM enrollment e "+
			    "INNER JOIN student s ON e.stud_id = s.id "+
			    "INNER JOIN course c ON e.course_id = c.course_id LEFT OUTER JOIN department d ON s.dep_id = d.dep_id" );
        List<Object[]> results = query.getResultList();
        List<EnrollmentEntityManagerDTO> entydtos = new ArrayList<>();
        for (Object[] result : results) {
        	 EnrollmentEntityManagerDTO dto = new EnrollmentEntityManagerDTO();           
        	 
             dto.setStudentName((String) result[0]);
             dto.setAge((Integer) result[1]);
             dto.setEmail((String) result[2]);
             dto.setCourseName((String) result[3]);
             dto.setDepartmentName((String) result[4]);
            // if(dto.getCourseName()!=null) {
             	List<Course> courseList = customRepository.getcourse(dto.getCourseName());
             	dto.setCourseList(courseList);
            // }
             	entydtos.add(dto);    
        }
        return entydtos;
    }

}
