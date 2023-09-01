package com.omkar.cdac.project.ProjectYCP.entites;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import jakarta.persistence.*;
@Entity
@Table(name = "Courses")
public class Courses {
	
		@Id
		@Column(name = "Course_Id")
		private int Course_Id ;
		
		
		@Column(name = "Course_Name")
	    private String Course_Name;


		public Courses(int course_Id, String course_Name) {
			super();
			Course_Id = course_Id;
			Course_Name = course_Name;
		}

		public String getCourse_Name() {
			return Course_Name;
		}


		public void setCourse_Name(String course_Name) {
			Course_Name = course_Name;
		}

		@Override
		public String toString() {
			return "Courses [Course_Id=" + Course_Id + ", Course_Name=" + Course_Name + "]";
		}

		public Courses() {
			super();
			// TODO Auto-generated constructor stub
		}


		public int getCourse_Id() {
			return Course_Id;
		}

		public void setCourse_Id(int course_Id) {
			Course_Id = course_Id;
		}

	
	}


