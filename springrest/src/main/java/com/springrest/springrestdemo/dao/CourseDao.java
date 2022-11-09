package com.springrest.springrestdemo.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrestdemo.entities.Courses;

public interface CourseDao  extends JpaRepository<Courses, Long>{

}
