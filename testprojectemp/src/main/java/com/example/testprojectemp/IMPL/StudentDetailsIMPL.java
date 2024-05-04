package com.example.testprojectemp.IMPL;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testprojectemp.Entity.Student;
import com.example.testprojectemp.Repository.StudentRepository;
import com.example.testprojectemp.Service.StudentService;
@Service
public class StudentDetailsIMPL implements StudentService {
	List<Student> list; 
	@Autowired
	StudentRepository studentRepository;
	public StudentDetailsIMPL(StudentRepository studentRepository) {
		  this.studentRepository = studentRepository;
		  list = new ArrayList<>();
	      list.add(new Student(1,"Ram","Cricket",2,3));
	      list.add(new Student(2,"Sham","Song",4,5));
	      
	  }
	@Override
	public List<Student> getSudentDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getAllSudentDetails() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public List<Student> getAllSudentDetailsFromDatabase() {
		// TODO Auto-generated method stub
		return studentRepository.getAllStudentsSQL();
	}
	 // Method to add a new student record
	@Override
    public String addStudent(Student student) {
        studentRepository.save(student);
        return "Add Record";
    }
	@Override
    public Student findById(Long id) {
		return  studentRepository.findById(id);
        
    }
	@Override
    public void updateStudent(Student student) {
        studentRepository.save(student);
    }
	
	@Override
    public Student updateStudentData(Student student,Long id) {
		Student StudentDB = studentRepository.findById(id); 
		  if (Objects.nonNull(StudentDB.getName()) 
		            && !"".equalsIgnoreCase( 
		            		StudentDB.getName())) { 
			  StudentDB.setName(student.getName()); 
		        } 
		  if (Objects.nonNull(StudentDB.getEmail()) 
		            && !"".equalsIgnoreCase( 
		            		StudentDB.getEmail())) { 
			  StudentDB.setEmail(student.getEmail()); 
		        } 
		  
		  if (Objects.nonNull(student.getAge())) { 
			  StudentDB.setAge(student.getAge()); 
		        } 
		  
		  if (Objects.nonNull(student.getDepId())) { 
			  StudentDB.setDepId(student.getDepId()); 
		        } 
        return studentRepository.save(StudentDB);
    }
	 
}
