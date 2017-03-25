package org.tutorials.springboot.topics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
	/**
	 * Return all topics.
	 * Note: uses Java 8 style method references
	 * @return
	 */
	public List<Topic> getAllTopics(){
		List<Topic> topics = new ArrayList<Topic>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	/**
	 * Return a topic for a given topic Id
	 * @param id
	 * @return
	 */
	public Topic getTopicById(String id){
		return topicRepository.findOne(id);
	}
	
	/**
	 * Add a new topic
	 * @param topic
	 */
	public void addTopic(Topic topic){
		topicRepository.save(topic);
	}
	
	/**
	 * Remove a topic from the list
	 * @param id
	 */
	public void removeTopic(String id){
		topicRepository.delete(id);
	}

	/**
	 * Update a topic with new details
	 * @param id
	 * @param topic
	 * @return
	 */
	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);
	}
}
