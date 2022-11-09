package com.springrest.springrestdemo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrestdemo.dao.CourseDao;
import com.springrest.springrestdemo.entities.Courses;


@Service
public class CourseServicesImpl implements CourseServices {
	
	@Autowired
	private CourseDao courseDao;
	
//	List<Courses> list;
	
	
	public CourseServicesImpl() {
		
//		list = new ArrayList<>();
//	    list.add(new Courses (121, "java", "this is very useful lang"));
//	    list.add(new Courses (122, "python", "easy to handle"));
//	    list.add(new Courses (123, "RWD", "used for frontend"));
//	    list.add(new Courses (124, "c#", "this is basics of programming"));
//	    list.add(new Courses (125, "c++", "this is imp"));

	}

	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
//		return list;
		
		return courseDao.findAll();
	}

	@Override
	public Courses getCourse(long courseId) {
		// TODO Auto-generated method stub
//		Courses c = null;
//		for(Courses courses :list) {
//			if(courses.getId() == courseId) {
//				c =courses;
//				break;
//				
//			}
//			
//		}
//		return c;
		return courseDao.getById(courseId);
	}

	@Override
	public Courses addCourse(Courses courses) {
		// TODO Auto-generated method stub
//		list.add(courses);
		
		courseDao.save(courses);
     	return courses;
		
	}

	@Override
	public Courses updateCourse(Courses courses) {
		// TODO Auto-generated method stub
//		list.forEach(e->{                                                  //used lambda method here
//			if(e.getId()==courses.getId()) {
//				e.setName(courses.getName());
//				e.setDescription(courses.getDescription());
//			}
//		});
//		
//			
		courseDao.save(courses);
		return courses;

       
	}

	@Override
	public void deleteCourse(long parseLong) {
		// TODO Auto-generated method stub
//		list= this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		
		Courses entity= courseDao.getById(parseLong);
		courseDao.delete(entity);
	}
	
	

}
