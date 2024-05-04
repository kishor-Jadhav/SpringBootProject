package com.example.testprojectemp.IMPL;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testprojectemp.Entity.Course;
 
import com.example.testprojectemp.Repository.CourseRepository;
 
import com.example.testprojectemp.Service.CourseService;

@Service
public class CourseIMPL implements CourseService {
	List<Course> list;
	
	@Autowired
	CourseRepository courseRepository;
	public CourseIMPL(CourseRepository courseRepository) {
		  this.courseRepository = courseRepository;		   
	  }
	@Override
	public List<Course> getAllCourse() {
		return courseRepository.getAllCourse();
	}

	@Override
	public String addCourse(Course course) {
		courseRepository.save(course);
        return "Add Record";
	}
	
	@Override
    public Course findById(Long courseId) {
		 Course CourseDB = courseRepository.findByCourseId(courseId);		 
		 return CourseDB;
    }

}
