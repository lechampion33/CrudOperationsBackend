package com.crickinfo.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.crickinfo.Entity.LandingEntity;
import com.crickinfo.Repo.LandingRepo;

import exception.PlayerNotFoundException;

@RestController
@CrossOrigin("http://localhost:3000")
public class LandingController {
@Autowired
 private LandingRepo lr;
 @PostMapping("/players")
 LandingEntity newPlayer(@RequestBody LandingEntity le) {
	 return lr.save(le);
 }
 @GetMapping("/getPlayers")
 List<LandingEntity> getPlayers(){
	 return lr.findAll();
 }
 @GetMapping("/players/{id}")
 LandingEntity getPlayerById(@PathVariable int id) {
	 return lr.findById(id)
			.orElseThrow(()->new PlayerNotFoundException(id)); 
 }
 @PutMapping("/players/{id}")
 LandingEntity update(@RequestBody LandingEntity le,@PathVariable int id) {
	 return lr.findById(id)
			 .map( LandingEntity->{
				 LandingEntity.setName(le.getName());
				 LandingEntity.setCountry(le.getCountry());
				 LandingEntity.setFranchise(le.getFranchise());
				 return lr.save( LandingEntity);
			 }).orElseThrow(()-> new PlayerNotFoundException(id));
 }
 @DeleteMapping("/players/{id}")
 String delete(@PathVariable int id) {
	 if(!lr.existsById(id)) {
		 throw new PlayerNotFoundException(id);
	 }
	 lr.deleteById(id);
	 return "Player with id "+id+" has been deleted";
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}
