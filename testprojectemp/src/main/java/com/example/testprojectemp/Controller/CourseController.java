package com.example.testprojectemp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.testprojectemp.Entity.Course;
import com.example.testprojectemp.Entity.Student;
import com.example.testprojectemp.Service.CourseService;

@RestController
public class CourseController {
	@Autowired
	private CourseService courseService;
	
	 @GetMapping("/courses")
	    @ResponseBody
		public List<Course> getAllCourse() {
			return this.courseService.getAllCourse();
			
		}
	 
	  @PostMapping("/coursesadd")
	    @ResponseBody
	    public String addCourse(@RequestBody Course course) {
		  courseService.addCourse(course);
	        return "Course added successfully!";
	    }
	  
	  @GetMapping("/courses/{id}")
	  @ResponseBody
	    public Course getCourse(@PathVariable Long id) {
		 
	        return  courseService.findById(id);
	    }
}
