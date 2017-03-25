package org.tutorials.springboot.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("1","Struts 2"), new Topic("2", "Spring"), new Topic("3","Hibernate")));
	
	/**
	 * Return all topics
	 * @return
	 */
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	/**
	 * Return a topic for a given topic Id
	 * @param id
	 * @return
	 */
	public Topic getTopicById(String id){
		return topics.stream().filter( t -> t.getTopicId().equals(id)).findFirst().get();
	}
	
	/**
	 * Add a new topic
	 * @param topic
	 */
	public void addTopic(Topic topic){
		for(Topic eachTopic : topics){
			if(topic.getTopicId().equals(eachTopic.getTopicId())){
				return;
			}
		}
		topics.add(topic);
		return;
	}
	
	/**
	 * Remove a topic from the list
	 * @param id
	 */
	public void removeTopic(String id){
		topics.removeIf(t -> t.getTopicId().equals(id));
		return;
	}

	/**
	 * Update a topic with new details
	 * @param id
	 * @param topic
	 * @return
	 */
	public void updateTopic(String id, Topic topic) {
		for(int i= 0; i <topics.size(); i++){
			Topic currentTopic = topics.get(i);
			if(currentTopic.getTopicId().equals(id)){
				topics.set(i, topic);
				return;
			}
		}
	}
}
