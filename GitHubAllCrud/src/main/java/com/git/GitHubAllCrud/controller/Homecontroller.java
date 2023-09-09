package com.git.GitHubAllCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.git.GitHubAllCrud.model.Student;
import com.git.GitHubAllCrud.serviceI.serviceInte;

@RestController
public class Homecontroller {	
	@Autowired
	
	serviceInte se;
	
	@PostMapping(value="/savedata")
	public ResponseEntity<Student> savestudent(@RequestBody Student s)
	{
		se.savestudent(s);
		return new ResponseEntity<>(s,HttpStatus.CREATED);
	}
	
	@GetMapping(value="/getdata")
	public ResponseEntity<List<Student>> getstudent()
	{
		List<Student> list=se.getstudent();
		
		return new ResponseEntity<List<Student>>(list,HttpStatus.OK);
	}
	
	@PutMapping(value="/updatedata/{id}")
	public ResponseEntity<Student> updatedata(@PathVariable int id, @RequestBody Student s)
	{
		se.savestudent(s);
		return new ResponseEntity<Student>(s,HttpStatus.OK);
	}
	
	@DeleteMapping(value="/deletedata/{id}")
	public ResponseEntity<Student> deletestudent(@PathVariable int id,@ModelAttribute Student s)
	{
		se.deletestudent(s);
		return new ResponseEntity<Student>(s,HttpStatus.NO_CONTENT);
	}
	
}
