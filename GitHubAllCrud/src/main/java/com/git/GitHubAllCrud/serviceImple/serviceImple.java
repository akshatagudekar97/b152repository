package com.git.GitHubAllCrud.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.git.GitHubAllCrud.model.Student;
import com.git.GitHubAllCrud.repository.repository;
import com.git.GitHubAllCrud.serviceI.serviceInte;

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
