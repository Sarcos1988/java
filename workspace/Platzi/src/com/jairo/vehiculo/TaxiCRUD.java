package com.jairo.vehiculo;

import java.sql.SQLException;
import java.sql.Statement;
import com.jairo.basededatos.*;

public class TaxiCRUD {
	
	public void agregar(Taxi taxi) throws SQLException{
		
		String query = "";
		Statement sentencia = null;
		
		query = "insert into vehiculo (matricula, marca) values (1313,'')";
		
		BaseDeDatos baseDatos =  new BaseDeDatos();
		sentencia = baseDatos.conectar().createStatement();
		
		if (sentencia.executeUpdate(query) > 0) {
			System.out.println("El registro se inserto correctamente");			
		} else {
			System.out.println("No se pudo insertar el regristro");
		}
	}

}
