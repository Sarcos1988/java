package cuenta;

import java.util.Scanner;

public class PruebaCuenta {
	
	// el metodo main empieza la ejecucion de la aplicacion Java
	public static void main(String[] args) {

		Cuenta cuenta1 = new Cuenta(50.00); // crea objeto cuenta
		Cuenta cuenta2 = new Cuenta(-7.53); // crea objeto cuenta

		// muestra el saldo inicial de cada objeto

		System.out.printf("Saldo de cuenta1:$%.2f\n", cuenta1.obtenerSaldo());
		System.out.printf("Saldo de cuenta2: $%.2f\n\n", cuenta2.obtenerSaldo());

		// crea objeto Scanner para obtener la entrada de la ventana de comandos
		Scanner entrada = new Scanner(System.in);
		
		double montoDeposito; // desposita el monto escrito por el usuario

		System.out.println("Escriba el monto a depositar para cuenta1: ");
		montoDeposito = entrada.nextDouble(); // obtiene entrada del usuario
		System.out.printf("\nsumando %.2f al saldo de cuenta1\n\n", montoDeposito);
		cuenta1.abonar(montoDeposito); // suma al saldo de cuenta1

		// muestra los saldos
		System.out.printf("Saldo de cuenta1: $%.2f\n", cuenta1.obtenerSaldo());
		System.out.printf("Saldo de cuenta2: $%.2f\n\n", cuenta2.obtenerSaldo());

		System.out.println("Escriba el monto a depositar para cuenta2: ");
		montoDeposito = entrada.nextDouble(); // obtiene entrada del usuario
		System.out.printf("\nsumando %.2f al saldo de cuenta2\n\n", montoDeposito);
		cuenta2.abonar(montoDeposito); // suma al saldo de cuenta1

		// muestra los saldos
		System.out.printf("Saldo de cuenta1: $%.2f\n", cuenta1.obtenerSaldo());
		System.out.printf("Saldo de cuenta2: $%.2f\n\n", cuenta2.obtenerSaldo());

	}

}