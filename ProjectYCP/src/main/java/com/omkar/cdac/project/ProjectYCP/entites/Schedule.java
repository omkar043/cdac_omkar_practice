package com.omkar.cdac.project.ProjectYCP.entites;
import java.time.LocalDate;
import java.time.LocalTime;
import jakarta.persistence.*;

/*This is Entity class Schedule
 * 
 *   This table contains information about class schedules.
Columns:
Id: Primary key for the schedule entry.
Course_Id: Foreign key referencing the Course_Id from the Courses table.
Date: Date of the scheduled class.
Time: Time of the scheduled class.

 */
@Entity
@Table(name = "Schedule")

public class Schedule {
	
		
		@Column(name = "Id")
		 private int Id;
		
		@Id
		@Column(name = "Course_Id")
		 private int Course_Id;
		
		@Column(name = "DATE")
		    private LocalDate DATE;
		
		@Column(name = "TIME")
		   private LocalTime TIME;
		
		public int getCourse_Id() {
			return Course_Id;
		}
		public void setCourse_Id(int course_Id) {
			Course_Id = course_Id;
		}
		public LocalDate getDATE() {
			return DATE;
		}
		public void setDATE(LocalDate dATE) {
			DATE = dATE;
		}
		public LocalTime getTIME() {
			return TIME;
		}
		public void setTIME(LocalTime tIME) {
			TIME = tIME;
		}
		public int getId() {
			return Id;
		}
		public void setId(int id) {
			Id = id;
		}
		public Schedule(int id, int course_Id, LocalDate dATE, LocalTime tIME) {
			super();
			Id = id;
			Course_Id = course_Id;
			DATE = dATE;
			TIME = tIME;
		}
		public Schedule() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Schedule [Id=" + Id + ", Course_Id=" + Course_Id + ", DATE=" + DATE + ", TIME=" + TIME + "]";
		}

	} 


