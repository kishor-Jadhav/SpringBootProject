package com.example.testprojectemp.Service;

import java.util.List;

import org.springframework.stereotype.Service;

 
import com.example.testprojectemp.Entity.Department;

@Service
public interface DepartmentService {
	public List<Department> getAllDepartment();
	Department findById (Long depId);
	String addDepartment(Department department);
}
