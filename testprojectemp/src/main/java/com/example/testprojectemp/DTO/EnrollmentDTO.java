package com.example.testprojectemp.DTO;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.example.testprojectemp.Entity.Course;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnrollmentDTO {
	private String studentName;
    private String courseName;
    private String email;
    private Integer age;
    private String departmentName;
    private List<Course> courseList;
	public EnrollmentDTO(String studentName, String courseName,String email,Integer age,String departmentName,List<Course> courseList) {		 
		this.studentName = studentName;
		this.courseName = courseName;
		this.email = email;
		this.departmentName = departmentName; 
		this.courseList = courseList; 
	}
	 
	public EnrollmentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	@Override
	public String toString() {
		return "EnrollmentDTO [studentName=" + studentName + ", courseName=" + courseName +  age + departmentName + courseList +"]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
    
	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}
}
