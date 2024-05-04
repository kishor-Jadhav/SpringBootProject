package com.example.testprojectemp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Course {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long course_id;
	    private String course_name;
	    private Integer id;
	    

		public Course(Long courseId, String courseName, Integer id) {
			super();
			this.course_id = courseId;
			this.course_name = courseName;
			this.id = id;
		}

		public Course() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Long getCourseId() {
			return course_id;
		}

		public void setCourseId(Long courseId) {
			this.course_id = courseId;
		}

		public String getCourseName() {
			return course_name;
		}

		public void setCourseName(String courseName) {
			this.course_name = courseName;
		}

		public Integer getid() {
			return id;
		}

		public void setid(Integer id) {
			this.id = id;
		}

		@Override
		public String toString() {
			return "Course [courseId=" + course_id + ", courseName=" + course_name + ", id=" + id + "]";
		}
	    
	    
}
