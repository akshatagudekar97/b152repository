package com.git.WebserviceCrudGitHub.serviceImple;

import java.util.List;

import javax.servlet.annotation.WebFilter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.git.WebserviceCrudGitHub.model.Student;
import com.git.WebserviceCrudGitHub.repository.repository;
import com.git.WebserviceCrudGitHub.serviceI.serviceInte;


@Service
public class serviceImple implements serviceInte{
	
	@Autowired
	
	
	repository re;
	
	@Override
	public void savestudent(Student s) {
		re.save(s);
	}

	@Override
	public List<Student> getstudent() {
		List<Student> list=(List<Student>) re.findAll();
		return list;
	}

	@Override
	public void deletestudent(Student s) {
		re.delete(s);
	}

}
