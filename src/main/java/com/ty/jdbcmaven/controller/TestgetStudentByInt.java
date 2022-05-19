package com.ty.jdbcmaven.controller;

import com.ty.jdbcmaven.dao.StudentDao;
import com.ty.jdbcmaven.dto.StudentDto;

public class TestgetStudentByInt {
 
	public static void main(String[] args) {
		StudentDao sd = new StudentDao();
		sd.getStudentById(1);
	}
}
