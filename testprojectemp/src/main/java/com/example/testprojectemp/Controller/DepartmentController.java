package com.example.testprojectemp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.testprojectemp.Entity.Department;
import com.example.testprojectemp.Service.DepartmentService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class DepartmentController {
	@Autowired
	DepartmentService departmentService;
	
	@GetMapping("/departmets")
	@ResponseBody
	public List<Department> getAllDepartment() {
		return this.departmentService.getAllDepartment();
		
	}
	
	@GetMapping("/departmets/{id}")
	@ResponseBody
	public Department getDepartmentByID(@PathVariable Long id) {
		 return  departmentService.findById(id);
	}
	
	@PostMapping("departmetadd")
	public String addDepartment(@RequestBody Department department) {
		return departmentService.addDepartment(department);
	}
	
	
}
