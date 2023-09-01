package com.omkar.cdac.project.ProjectYCP.entites;
import java.time.LocalDate;
import java.time.LocalTime;
import java.sql.Time;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.*;

/*This is Entity class Schedule
 * 
 *   This table contains information about class schedules.
Columns:
Id: Primary key for the schedule entry.
Course_Id: Foreign key referencing the Course_Id from the Courses table.
Date: Date of the scheduled class.
Time: Time of the scheduled class.
faculty_name : name of faculty
type_of_course : pg or master or diploma

 */
@Entity
@Table(name = "Schedule")

public class Schedule {
	    
	//@GeneratedValue (strategy = GenerationType.AUTO)
		@Id
		@Column(name = "Id")
		 private int Id;
		
		@ManyToOne
		@JoinColumn(name = "Course_Id")
		private Courses course;
		
		@Column(name = "Faculty_Name")
		private String Faculty_Name;
		
		@Column(name = "Type_of_course")
		private String Type_of_course;
		
		//@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
		@Column(name = "Lecture_Date")
		    private LocalDate Lecture_Date;
		
		//@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="HH:mm:ss")
		@Column(name = "Start_tme")
		   private Time Start_tme;

		public int getId() {
			return Id;
		}

		public void setId(int id) {
			Id = id;
		}

		public Courses getCourse() {
			return course;
		}

		public void setCourse(Courses course) {
			this.course = course;
		}

		public String getFaculty_Name() {
			return Faculty_Name;
		}

		public void setFaculty_Name(String faculty_Name) {
			Faculty_Name = faculty_Name;
		}

		public String getType_of_course() {
			return Type_of_course;
		}

		public void setType_of_course(String type_of_course) {
			Type_of_course = type_of_course;
		}

		public LocalDate getLecture_Date() {
			return Lecture_Date;
		}

		public void setLecture_Date(LocalDate lecture_Date) {
			Lecture_Date = lecture_Date;
		}

		public Time getStart_tme() {
			return Start_tme;
		}

		public void setStart_tme(Time start_tme) {
			Start_tme = start_tme;
		}

		public Schedule(int id, Courses course, String faculty_Name, String type_of_course, LocalDate lecture_Date,
				Time start_tme) {
			super();
			Id = id;
			this.course = course;
			Faculty_Name = faculty_Name;
			Type_of_course = type_of_course;
			Lecture_Date = lecture_Date;
			Start_tme = start_tme;
		}

		public Schedule() {
			super();
			// TODO Auto-generated constructor stub
		}
		
}
		
		
	