package arraybidimensional.ui;

public class NotasAlumnos {
	
	public static void main(String[] args) {
		
		int nAlumnos = 4, nEvaluaciones = 4;
		
		int [][] notas;
		
		String[] nombreAlumnos = {"Pedro", "Maria", "Juana", "Carlos"};
		String buscarNombre;
		
		BidimensionalHelper helper  = new BidimensionalHelper();
		notas = helper.llenarArreglo(nAlumnos, nEvaluaciones);
		helper.mostrarNotasAlumnos(nombreAlumnos, notas, nAlumnos, nEvaluaciones);
		helper.buscarAlumnoPorNombre(nombreAlumnos, "Juana");
		
		Vista view = new Vista();
		
		buscarNombre = view.ingresaValor();
		
		int posicionAlumno = helper.buscarAlumnoPorNombre(nombreAlumnos, buscarNombre);
		
		if (posicionAlumno == 0 && !buscarNombre.equalsIgnoreCase(nombreAlumnos[0])) {
			view.mostrarMensaje("Disculpe el nombre es incorrecto, no se encuentra en nuestra base de datos");
			
		} else {
			view.mostrarMensaje(nombreAlumnos[posicionAlumno]);			
		}
		
	}

}