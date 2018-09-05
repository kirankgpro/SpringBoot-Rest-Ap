package com.springboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>( Arrays.asList(
			new Topic(1, "Spring"," Spring framework"),
			new Topic(2, "java", "java lambda"),
			new Topic(3, "javascript", "javascript advance"),
			new Topic(4, "Html5", "Latest html5 concepts")));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(int id) {
		for(Topic topic : topics) {
			if(topic.getId()==(id))
				return topic;
		}
		return null;
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
		
	}
	
}
