package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	@Autowired
	private TopicRepository topicRepository;
	
	/*
	 * private List<Topic> topics = new ArrayList<>( Arrays.asList( new
	 * Topic("spring","spring framework","spring framework description"), new
	 * Topic("spring1","spring framework1","spring framework description1") ));
	 */
	public List<Topic> getAllTopics(){
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}

	public void addTopic(Topic topic) {
		 topicRepository.save(topic);
	}
}
