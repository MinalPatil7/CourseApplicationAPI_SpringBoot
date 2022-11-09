package com.springrest.springrestdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrestdemo.entities.Courses;
import com.springrest.springrestdemo.services.CourseServices;

@RestController                       //  full form of Rest   representational state transfer
public class MyController {
	
	@Autowired                                      // to create an object of interface
	private CourseServices courseServices;
	
	@GetMapping("/home")
	public String home() {
		return "this is home page";
	}
	
	//get the course
	
	@GetMapping("/courses")
	public List<Courses> getCourses(){
		
		return this.courseServices.getCourses();
		
	}
	
	//get single course by id
	
	@GetMapping("/courses/{courseId}")
	public Courses getCourse(@PathVariable String courseId)
	{
		return this.courseServices.getCourse(Long.parseLong(courseId));
	}
	
	//add courses to list
	
	@PostMapping("/courses")
	public Courses addCourse(@RequestBody Courses courses) 
	{
	 return this.courseServices.addCourse(courses);
	 
	}
	
	//update single course using put
	
	@PutMapping("/courses")
	public Courses updateCourse(@RequestBody Courses courses)
	{
		return this.courseServices.updateCourse(courses);
	}
	
	//delete the course
	
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse( @PathVariable String courseId) {
		
		try {
			this.courseServices.deleteCourse(Long.parseLong(courseId));
			return new ResponseEntity<>(HttpStatus.OK);
			
		}catch (Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

		}
		
	}

}

