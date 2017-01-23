package com.mdamine.classifiedsv2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mdamine.classifiedsv2.dao.ClassifiedMapper;
import com.mdamine.classifiedsv2.model.Classified;

@Service
public class ClassifiedService {

	@Autowired
	private ClassifiedMapper classifiedMapper;

	public List<Classified> getAll() {
		return classifiedMapper.getAll();
	}

	public void save(Classified c) {
		classifiedMapper.save(c);
	}

	public void update(Classified c) {
		classifiedMapper.update(c);
	}

	public void delete(Long id) {
		classifiedMapper.delete(id);
	}

}