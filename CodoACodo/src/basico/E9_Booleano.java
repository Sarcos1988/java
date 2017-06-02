package basico;


public class E9_Booleano {
	
	public static void main(String[] args) {
		
//		Dise�ar un algoritmo que recorra las butacas de una sala de cine y determine cu�ntas butacas desocupadas hay en la sala. 
//		Suponga que inicialmente tiene un array (arreglo) con valores booleanos que si es verdadero(verdadero) implica que est� ocupada y 
//		si es falso(falso) la butaca est� desocupada. 
//		Tenga en cuenta que el array deber� ser creado e inicializado al principio del algoritmo.
		
		boolean[] butacas = {false, true, false, true};
		
		int butacasVacias = 0; //contador que guarda las butacas vacias
		
//		for (int i = 0; i < butacas.length; i++) {
//			
//			if (butacas[i] ==  false) {
//				butacasVacias++; //suma 1 al valor de la variable butacasVacias
//				
//			}
//		}
		
		for (boolean b : butacas) {
			
			if(b == false){
				butacasVacias++;
			}
			
		}
		
		System.out.println("La cantidad de Butacas vac�as en la sala es " + butacasVacias);
		
	}

}