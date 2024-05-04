package com.example.testprojectemp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

 
import com.example.testprojectemp.Entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{
	 @Query("SELECT s FROM Department s")
	 List<Department> getAllDepartment();
	 
	 @Query("SELECT c FROM Department c WHERE c.depId = ?1")
	 Department findByDepartmentId(Long courseId);
	// Course findById(@Param("courseId") Long courseId);
	 Department save(Department department);
}
