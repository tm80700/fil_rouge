package com.books.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectorMysql {
	
			
		public Connection cnx = null;
		private String url = "jdbc:mysql://localhost:3306/books_com";
		private String username = "root";
		private String password = "root"; 
		

		public ConnectorMysql() {
			
			try {
				
				// 1- chargement du driver JDBC MySQL 
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				
				// 2 -  établissement de  la connexion.
				cnx = DriverManager.getConnection(url, username, password);
			
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	
		
		public Connection getCnx() {
			
			return this.cnx;
			
		}
		
	
	

}
