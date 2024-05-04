package com.example.testprojectemp.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.testprojectemp.Entity.Student;
@Service
public interface StudentService {
	  public List<Student> getSudentDetails();
	  public List<Student> getAllSudentDetails();
	  public List<Student> getAllSudentDetailsFromDatabase();
	  String addStudent(Student student);
	  Student findById (Long id);
	  void updateStudent(Student student);
	  Student updateStudentData(Student student, 
	            Long id); 
}
