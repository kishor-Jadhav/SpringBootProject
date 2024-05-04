package com.example.testprojectemp.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.testprojectemp.Entity.Student;
import com.example.testprojectemp.Service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studSer;
	
	@GetMapping("/student")
    @ResponseBody
	public String home() {
		return "Welcome Sudent";
	}
    
    @GetMapping("/stud")
    @ResponseBody
	public List<Student> getAllEmployee() {
		return this.studSer.getAllSudentDetails();
		
	}
    
    @GetMapping("/studsql")
    @ResponseBody
	public List<Student> getAllStudentSql() {
		return this.studSer.getAllSudentDetailsFromDatabase();
		
	}
    
    @GetMapping("/studadd")
    @ResponseBody
	public String addStudentSql() {
    	Student newStudent = new Student();
    	newStudent.setName("John Doe");
    	newStudent.setEmail("john@d");
		return this.studSer.addStudent(newStudent);
		
	}
    
    @PostMapping("/studpostadd")
    @ResponseBody
    public String addStudentSql(@RequestBody Student student) {
        studSer.addStudent(student);
        return "Student added successfully!";
    }
    
    @PutMapping("/studupdate/{id}")
    public String updateStudent(@PathVariable Long id, @RequestBody Student studentDetails) {
    	Student existingStudentList = studSer.findById(id);
    	Student newStudent = new Student();
        // if (existingStudentList.isEmpty()) {
         //    return "Student not found!";
         //}
         
         // Update student details
         newStudent.setName(studentDetails.getName());
         newStudent.setEmail(studentDetails.getEmail());
         newStudent.setAge(studentDetails.getAge());
         newStudent.setDepId(studentDetails.getDepId());
     
         // Save updated student
         studSer.updateStudent(newStudent);
         
         return "Student updated successfully!";
    }
    
    @PutMapping("/studupdate1/{id}")
    public String updateStudentData(@PathVariable Long id, @RequestBody Student studentDetails) {
    	Student existingStudentList = studSer.findById(id);
    	Student newStudent = new Student();
        // if (existingStudentList) {
        //     return "Student not found!";
        // }
         
         // Update student details
         newStudent.setName(studentDetails.getName());
         newStudent.setEmail(studentDetails.getEmail());
         newStudent.setAge(studentDetails.getAge());
         newStudent.setDepId(studentDetails.getDepId());
     
         // Save updated student
         studSer.updateStudentData(newStudent,id);
         
         return "Student updated successfully!";
    }
    
}
