package com.javamultiplex.springbootquickstart.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> getAllTopics() {
		List<Topic> list=new ArrayList<>();
		topicRepository.findAll().forEach(list::add);
		return list;
	}

	
	public Topic getTopic(String id) {
		return topicRepository.findOne(id);
	}


	public void addTopic(Topic topic) {
		topicRepository.save(topic);
		
	}


	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);
	}


	public void deleteTopic(String id) {
		topicRepository.delete(id);
	}
}
