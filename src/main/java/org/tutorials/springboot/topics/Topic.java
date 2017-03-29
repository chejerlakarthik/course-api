package org.tutorials.springboot.topics;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.tutorials.springboot.courses.Course;

@Entity
public class Topic {
	
	@Id
	private String id;
	private String topicName;
	private String topicDescription;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "courseId")
	private Set<Course> courses;
	
	public Topic(){}
	
	public Topic(String topicId, String topicName, String topicDescription){
		this.id = topicId;
		this.topicName = topicName;
		this.topicDescription = topicDescription;
	}
	
	public String getTopicId() {
		return id;
	}
	public void setTopicId(String topicId) {
		this.id = topicId;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public String getTopicDescription() {
		return topicDescription;
	}
	public void setTopicDescription(String topicDescription) {
		this.topicDescription = topicDescription;
	}
}
