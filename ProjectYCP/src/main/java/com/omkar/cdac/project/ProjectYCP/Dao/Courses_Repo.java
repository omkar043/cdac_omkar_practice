package com.omkar.cdac.project.ProjectYCP.Dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.omkar.cdac.project.ProjectYCP.entites.Courses;

    @Repository("course")
	public interface Courses_Repo extends JpaRepository<Courses , Integer>{
		

	}

