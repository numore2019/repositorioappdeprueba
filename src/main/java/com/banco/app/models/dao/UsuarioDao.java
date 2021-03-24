package com.banco.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.banco.app.models.entities.Usuario;

public interface UsuarioDao extends CrudRepository<Usuario, Long>{

}
