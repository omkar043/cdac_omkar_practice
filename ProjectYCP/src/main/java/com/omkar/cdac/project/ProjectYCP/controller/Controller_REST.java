package com.omkar.cdac.project.ProjectYCP.controller;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.omkar.cdac.project.ProjectYCP.Dao.Courses_Repo;
import com.omkar.cdac.project.ProjectYCP.Dao.Schedule_Repo;
import com.omkar.cdac.project.ProjectYCP.entites.*;


@RestController
public class Controller_REST {
	
	

		@Autowired
	        private  Courses_Repo course;
		
		@Autowired
		    private Schedule_Repo schedule;
		
		@GetMapping("/getSchedule_all")
		public List<Schedule> getCourse_All()
		{
			return (List<Schedule>)schedule.findAll();		
		}
		
		@PutMapping("/update_Schedule/{")
		public Schedule update_schedule(@RequestBody  Schedule sch1)
		{
			return this.schedule.save(sch1);
		}
		
		@DeleteMapping("/delete_Schedule/{Course_Id}")
		public 
		
	}

