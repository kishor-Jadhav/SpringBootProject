package com.example.testprojectemp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Enrollment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long enrollmentId;
	private Integer course_id;
	private Integer studId;
	public Enrollment(Long enrollmentId, Integer course_id, Integer studId) {
		super();
		this.enrollmentId = enrollmentId;
		this.course_id = course_id;
		this.studId = studId;
	}
	public Enrollment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getEnrollmentId() {
		return enrollmentId;
	}
	public void setEnrollmentId(Long enrollmentId) {
		this.enrollmentId = enrollmentId;
	}
	public Integer getCourse_id() {
		return course_id;
	}
	public void setCourse_id(Integer course_id) {
		this.course_id = course_id;
	}
	public Integer getStudId() {
		return studId;
	}
	public void setStudId(Integer studId) {
		this.studId = studId;
	}
    
   
    
}
