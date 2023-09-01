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
		
		@PostMapping("/addSchedule")
		public Schedule addSchedule(@RequestBody Schedule add )
		{
			return schedule.save(add);
		}
		
		@GetMapping("/getSchedule_all")
		public List<Schedule> getSchedule_All()
		{
			return (List<Schedule>)schedule.findAll();		
		}
		
		@PutMapping("/update_Schedule")
		public Schedule update_schedule(@RequestBody  Schedule sch1)
		{
			return this.schedule.save(sch1);
		}
		
		@DeleteMapping("/delete_Schedule/{Id}")
		public void delete_schedule(@PathVariable Schedule Id)
		{
			schedule.delete(Id);
		}
		
		@DeleteMapping("/delete_ScheduleAll")
		public void delete_ScheduleAll()
		{
			schedule.deleteAll();
		}
		
		@GetMapping("/getCourses_All")
		public List<Courses> getCourses_All() {
		    return (List<Courses>)course.findAll();
		}
	    
		
		
		 
		
	}

