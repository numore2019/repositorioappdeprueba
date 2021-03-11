package com.banco.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.banco.app.models.entities.Apps;

public interface AppsDao extends CrudRepository<Apps, Long>{

}
