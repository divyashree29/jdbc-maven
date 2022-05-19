package com.ty.jdbcmaven.util;


	import java.sql.Connection;
	import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
	//import static com.ty.visitor.util.AppConstants.*;

	public class ConnectionHelper {
		static String DRIVER="com.mysql.cj.jdbc.Driver";
		static String URL="jdbc:mysql://localhost:3306/javabatch";
		 static String USER="root";
		 static String PASSWORD="root";
		static Connection connection;
		
		
			
			
			public static Connection getConnection() {
				try {
					Class.forName(DRIVER);
					connection = DriverManager.getConnection(URL,USER,PASSWORD);
					return connection;
				}catch (ClassNotFoundException e) {
					e.printStackTrace();
	             }    catch(SQLException e){
					e.printStackTrace();
				}
				return null;
			}




			public static PreparedStatement prepareStatement(String sql) {
				// TODO Auto-generated method stub
				return null;
			}
		}


