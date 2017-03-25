package org.tutorials.springboot.courses;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.tutorials.springboot.topics.Topic;

@Entity
public class Course {
	
	@Id
	private String courseId;
	private String courseName;
	private String courseDescription;
	
	@ManyToOne
	private Topic topic;
	
	//No-args constructor
	public Course(){}
	
	//Parameterized constructor
	public Course(String courseId, String courseName){
		this.courseId = courseId;
		this.courseName = courseName;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}
}
