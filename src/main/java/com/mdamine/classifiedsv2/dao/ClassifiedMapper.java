package com.mdamine.classifiedsv2.dao;

import java.util.List;

import com.mdamine.classifiedsv2.model.Classified;

public interface ClassifiedMapper {

	public void save(Classified c);

	public void update(Classified c);

	public void delete(Long id);

	public List<Classified> getAll();
}
