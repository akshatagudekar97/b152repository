package com.git.WebserviceCrudGitHub.serviceI;

import java.util.List;

import org.springframework.stereotype.Service;

import com.git.WebserviceCrudGitHub.model.Student;


public interface serviceInte {
    
	public void savestudent(Student s);
	public List<Student> getstudent();
	public void deletestudent(Student s);
	
	
}
