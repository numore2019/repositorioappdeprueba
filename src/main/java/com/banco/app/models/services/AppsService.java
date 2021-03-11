package com.banco.app.models.services;

import java.util.List;

import com.banco.app.models.entities.Apps;

public interface AppsService {

	public List<Apps>findAll();
	
	public Apps findById(Long id);
	
	public Apps save(Apps apps);
	
	public void delete(Long id);


}
