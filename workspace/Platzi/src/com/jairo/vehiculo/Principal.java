package com.jairo.vehiculo;

import java.sql.SQLException;
//import java.util.ArrayList;
import com.jairo.basededatos.BaseDeDatos;

public class Principal {

	public static void main(String[] args) throws SQLException {
		
		//Tipo de dato nombreobjt
		
		Vehiculo miVehiculo = new Vehiculo("AAA123", "Hiundai");
		/*
		miVehiculo.arrancar();
		miVehiculo.frenar();
		miVehiculo.reverza();
		miVehiculo.arrancar();
		*/
		
//		ArrayList<Vehiculo> vehiculos = new ArrayList<>();	
//		vehiculos.add(miVehiculo);
//		vehiculos.add(new Vehiculo("BBB123", "Chevrolet"));
//		vehiculos.add(new Vehiculo("CCC123", "Mercedez Benz", "s10", 2014));
//		
//		for (Vehiculo vehiculo : vehiculos) {
//			
//			System.out.println(vehiculo.getMatricula());
//			System.out.println(vehiculo.getMarca());
//			System.out.println(vehiculo.getModelo());
//			System.out.println(vehiculo.getAnio());
//			
//			System.out.println("------------------");
//			
//		}
		
		BaseDeDatos baseDatos = new BaseDeDatos();
		baseDatos.conectar();
		
//		Taxi taxi = new Taxi("AAA123", "Hiundai", "i10",1990);
//		taxi.setAnio(2000);
//		
//		TaxiCRUD taxiCRUD = new TaxiCRUD();
//		taxiCRUD.agregar(taxi);
//		

	}

}
