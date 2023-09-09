package com.git.GitHubAllCrud.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Student {
	@Id
	private int id;
	private String name;
	private String addr;
	private String college;
	private int marks;
	
}
