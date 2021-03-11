package com.banco.app.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.app.models.dao.AppsDao;
import com.banco.app.models.entities.Apps;

@Service
public class AppsServiceImpl implements AppsService {

	@Autowired
	private AppsDao appsDaos;
	
	@Override
	public List<Apps> findAll() {
		return (List<Apps>)appsDaos.findAll();
	}

	@Override
	public Apps findById(Long id) {
		return appsDaos.findById(id).orElse(null);
	}

	@Override
	public Apps save(Apps apps) {
		return appsDaos.save(apps);
	}

	@Override
	public void delete(Long id) {
		appsDaos.deleteById(id);
	}



}
