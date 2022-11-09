package com.springrest.springrestdemo.services;

import java.util.List;

import com.springrest.springrestdemo.entities.Courses;

public interface CourseServices {
	
	public List<Courses> getCourses();
	
	public Courses getCourse(long courseId);
	
	public Courses addCourse(Courses courses);
	
	public Courses updateCourse(Courses courses);
	
	public void deleteCourse(long parseLong);
	
	


}
