package com.omkar.cdac.project.ProjectYCP.Dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.omkar.cdac.project.ProjectYCP.entites.Schedule;


@Repository("schedule")
public interface Schedule_Repo extends JpaRepository<Schedule, Integer> {

} 
