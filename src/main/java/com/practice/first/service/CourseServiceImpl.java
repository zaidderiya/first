package com.practice.first.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.first.dao.courseDao;
import com.practice.first.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseDao courseDao;
	

//	List<Course> list;

	public CourseServiceImpl() {
		// TODO Auto-generated constructor stub
//		list = new ArrayList<>();
//		list.add(new Course(122, "Core Java", "This course is based of Java fundamentals"));
//		list.add(new Course(131, "Think Python", "This course is based of Python fundamentals"));
	}

	@Override
	public List<Course> getCourses() {

		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub

//		Course c = null;
//		for (Course course : list) {
//			if (course.getId() == courseId) {
//				c = course;
//				break;
//			}
//		}
//		return c;
	}
	@Override
	public Course addCourse(Course course) {
//		list.add(course);
		return course;
	}
	@Override
	public Course updateCourse(Course course) {
//		list.forEach(e -> {
//			if (e.getId() == course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		return course;
	}
	
	@Override
	public void deleteCourse(long parseLong) {
//		list= this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
	}

}
