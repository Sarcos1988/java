import java.io.FileWriter;

public class Principal {

	public static void main(String[] args) {
		
		String texto = "Hola Jairo";
		String ruta = "/home/jairo/java/JavaEntradaSalida/src/";
		String nombreArchivo = "miArchivoPlatzi.txt";
		
		try {
			FileWriter archivo = new FileWriter(ruta+nombreArchivo);
			archivo.write(texto);
			archivo.close();
		} catch (Exception e) {
			
		}

	}

}