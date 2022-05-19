package com.ty.jdbcmaven.controller;
import com.ty.jdbcmaven.dao.*;
import com.ty.jdbcmaven.dto.*;
public class TestStudent 
{
    public static void main(String[] args) 
    {
		StudentDao sd = new StudentDao();
		sd.saveStudent(new StudentDto(25,"divi","div@gmail.com"));
		sd.getStudentById(25);
	}
}
