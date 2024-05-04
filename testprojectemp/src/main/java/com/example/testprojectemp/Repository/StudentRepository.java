package com.example.testprojectemp.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.testprojectemp.Entity.Student;
public interface StudentRepository extends JpaRepository<Student, Integer>{
	
	 
	 @Query("SELECT s FROM Student s")
	    List<Student> getAllStudentsSQL();
	 
	    Student findById(@Param("id") Long id);
	    Student save(Student student);
}
