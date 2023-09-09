package com.git.GitHubAllCrud.serviceI;

import java.util.List;

import com.git.GitHubAllCrud.model.Student;

public interface serviceInte {
    
	public void savestudent(Student s);
	public List<Student> getstudent();
	public void deletestudent(Student s);
	
	
}
