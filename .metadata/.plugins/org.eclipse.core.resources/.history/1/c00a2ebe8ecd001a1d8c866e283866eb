package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topics = new ArrayList<>( Arrays.asList(
			new Topic("spring","spring framework","spring framework description"),
			new Topic("spring1","spring framework1","spring framework description1")
			));
	
	public List<Topic> getAllTopics(){
		return topics;
	}

	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		topics.add(topic);
	}
}
