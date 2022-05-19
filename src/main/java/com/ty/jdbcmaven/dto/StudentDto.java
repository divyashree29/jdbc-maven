package com.ty.jdbcmaven.dto;

public class StudentDto {
    int id;
    String name;
    String email;
   
    public StudentDto()
    {
    	
    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public StudentDto(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
