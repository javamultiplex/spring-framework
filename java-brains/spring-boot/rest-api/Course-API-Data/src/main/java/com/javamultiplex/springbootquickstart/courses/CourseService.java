package com.javamultiplex.springbootquickstart.courses;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses(String id) {
		List<Course> list=new ArrayList<>();
		courseRepository.findByTopicId(id)
		.forEach(list::add);
		return list;
	}

	
	public Course getCourse(String id) {
		return courseRepository.findOne(id);
	}


	public void addCourse(Course course) {
		courseRepository.save(course);
		
	}


	public void updateCourse(Course course) {
		courseRepository.save(course);
	}


	public void deleteCourse(String id) {
		courseRepository.delete(id);
	}
}
