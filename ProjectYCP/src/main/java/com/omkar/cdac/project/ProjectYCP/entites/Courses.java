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
		
		@Column(name = "Name")
	    private String Name;

		@Override
		public String toString() {
			return "Courses [Course_Id=" + Course_Id + ", Name=" + Name + "]";
		}

		public Courses() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Courses(int course_Id, String name) {
			super();
			Course_Id = course_Id;
			Name = name;
		}

		public int getCourse_Id() {
			return Course_Id;
		}

		public void setCourse_Id(int course_Id) {
			Course_Id = course_Id;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}
	}


