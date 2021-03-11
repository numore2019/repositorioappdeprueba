package com.banco.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banco.app.models.entities.Apps;
import com.banco.app.models.services.AppsService;

/*@CrossOrigin(origins= {"http://localhost:4200"})*/
@RestController
@RequestMapping("/api")
public class AppsRestController {

	@Autowired
	private AppsService appsSer;
	
	@GetMapping("/apps")
	public List<Apps> index() {
		return appsSer.findAll();
	}
	
	@GetMapping("/apps/{id}")
	public Apps Show(@PathVariable Long id){
		return appsSer.findById(id);
	}
	
	@PostMapping("/apps")
	public Apps create(@RequestBody Apps apps) {
		return appsSer.save(apps);
	}
	
	@PutMapping("/apps/{id}")
	public Apps update(@RequestBody Apps apps, @PathVariable Long id) {
		Apps appsactual = appsSer.findById(id);
		appsactual.setAppnombre(apps.getAppnombre());
		/* appsactual.setAppprecio(apps.getAppprecio()); */
		return appsSer.save(appsactual);
		
	}
	
	
	@DeleteMapping("/apps/{id}")
	public void delete(@PathVariable Long id){
		appsSer.delete(id);
	}
	
	//Funciono
}
