package com.example.testprojectemp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long depId;
	    private String dep_name;
		public Department(Long depId, String dep_name) {
			super();
			this.depId = depId;
			this.dep_name = dep_name;
		}
		public Department() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Long getDepId() {
			return depId;
		}
		public void setDepId(Long depId) {
			this.depId = depId;
		}
		public String getDep_name() {
			return dep_name;
		}
		public void setDep_name(String dep_name) {
			this.dep_name = dep_name;
		}
		@Override
		public String toString() {
			return "Department [depId=" + depId + ", dep_name=" + dep_name + "]";
		}
	    
}
