package com.banco.app.models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="apps")
public class Apps implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idapps")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String appnombre;
	
	private Double appprecio;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAppnombre() {
		return appnombre;
	}

	public void setAppnombre(String appnombre) {
		this.appnombre = appnombre;
	}

	public Double getAppprecio() {
		return appprecio;
	}

	public void setAppprecio(Double appprecio) {
		this.appprecio = appprecio;
	}
	
	
	 
}
