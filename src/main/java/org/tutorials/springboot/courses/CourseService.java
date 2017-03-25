package org.tutorials.springboot.courses;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	/**
	 * Return all Courses.
	 * Note: uses Java 8 style method references
	 * @return
	 */
	public List<Course> getAllCourses(String topicId){
		List<Course> courses = new ArrayList<Course>();
		courseRepository.findCourseByTopicId(topicId).forEach(courses::add);
		return courses;
	}
	
	/**
	 * Return a Course for a given Course Id
	 * @param id
	 * @return
	 */
	public Course getCourseById(String id){
		return courseRepository.findOne(id);
	}
	
	/**
	 * Add a new course
	 * @param course
	 */
	public void addCourse(Course course){
		courseRepository.save(course);
	}
	
	/**
	 * Remove a course from the list
	 * @param id
	 */
	public void removeCourse(String id){
		courseRepository.delete(id);
	}

	/**
	 * Update a course with new details
	 * @param id
	 * @param Course
	 * @return
	 */
	public void updateCourse(String id, Course course) {
		courseRepository.save(course);
	}
}
