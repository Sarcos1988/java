package com.jairo.conductor;

import com.jairo.vehiculo.Bus;

public class ConductoBus extends Conductor {
	
	public ConductoBus(String nombre, String tipoLicencia, Bus bus) {
		super(nombre, tipoLicencia);
		this.bus = bus;
	}

	private Bus bus;

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	@Override
	public void mostrarVehiculo() {
		super.mostrarVehiculo();
		System.out.println(getBus().getMarca());
	}
	
	

}