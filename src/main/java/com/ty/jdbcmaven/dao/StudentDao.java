package com.ty.jdbcmaven.dao;
import com.ty.jdbcmaven.util.*;
import com.ty.jdbcmaven.dto.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class StudentDao 
{
    public int saveStudent(StudentDto student)
    {
    	String sql = "INSERT INTO student VALUES(?,?,?)";
    	Connection connection = ConnectionHelper.getConnection();
    	try {
    	PreparedStatement preparedStatement = connection.prepareStatement(sql);
    	preparedStatement.setInt(1, student.getId());
    	preparedStatement.setString(2, student.getName());
    	preparedStatement.setString(3, student.getEmail());
    	System.out.println("Data Inserted");  
    	return preparedStatement.executeUpdate();
    	
    	}
    	catch(SQLException e)
    	{
    		e.printStackTrace();
    	}
    	return 0 ;
    }
    public void getStudentById(int id) {
    	String sql = "SELECT * FROM student WHERE id=?";
    	Connection connection = ConnectionHelper.getConnection();
    	try {
    		 PreparedStatement preparedstatement = connection.prepareStatement(sql);
    		preparedstatement.setInt(1, id);
    		ResultSet resultSet = preparedstatement.executeQuery();
    		while(resultSet.next())
    			System.out.println(resultSet.getInt(1));
    		    System.out.println(resultSet.getString(2));
    		    System.out.println(resultSet.getString(3));
    		    System.out.println("student id is getted");
    	}
    	catch(SQLException e) {
    		e.printStackTrace();
    	}
    	}
}
