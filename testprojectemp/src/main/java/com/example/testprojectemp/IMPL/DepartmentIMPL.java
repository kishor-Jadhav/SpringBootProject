package com.example.testprojectemp.IMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testprojectemp.Entity.Department;
import com.example.testprojectemp.Repository.DepartmentRepository;
import com.example.testprojectemp.Service.DepartmentService;

@Service
public class DepartmentIMPL implements DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;
    
	public DepartmentIMPL( DepartmentRepository departmentRepository) {		 
		this.departmentRepository = departmentRepository;
	}

	@Override
	public List<Department> getAllDepartment() {
		return departmentRepository.getAllDepartment();
	 
	}

	@Override
	public Department findById(Long depId) {
		return departmentRepository.findByDepartmentId(depId);
	}

	@Override
	public String addDepartment(Department department) {
		departmentRepository.save(department);
		return "Department Name added";
	}
	

}
