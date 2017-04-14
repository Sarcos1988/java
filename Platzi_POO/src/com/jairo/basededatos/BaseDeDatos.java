package com.jairo.basededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDeDatos {
	
	private final String URL 		= "jdbc:mysql://localhost:3306/";
	private final String DB 		= "testing";
	private final String USUARIO	= "root";
	private final String PASSWORD 	= "root";
	
	public Connection conexion = null;
	
	public Connection conectar(){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection(URL+DB,USUARIO, PASSWORD);
			if (conexion != null) {
				System.out.println("La conexion se ejecuto exitosamente");
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally{
			
			return conexion;			
		}
		
	}

}
