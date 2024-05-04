package com.example.testprojectemp.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.testprojectemp.Entity.Course;
import com.example.testprojectemp.Entity.Student;
 

@Service
public interface CourseService {
	public List<Course> getAllCourse();
	Course findById (Long courseId);
	String addCourse(Course courseId);
}
