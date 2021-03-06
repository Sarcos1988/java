package cuenta;

public class Cuenta {
	
	private double saldo; //varible de instancia que almacena el saldo
	
	//constructor
	public Cuenta (double saldoInicial) 
	{	
		//valida que el saldo inicial sea mayor a 0.0
		//si no lo es, saldo se inicializa con el valor predeterminado 0.0
		
		if (saldoInicial > 0.0) 
		{	
			saldo = saldoInicial;
		}
	}
	
	//abona (suma) un monto de la cuenta
	public void abonar (double monto) 
	{
		saldo = saldo + monto;	
	}
	
	//devuelve el saldo de la cuenta
	public double obtenerSaldo () 
	{		
		return saldo;
	}
	
	
}