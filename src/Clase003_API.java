//Aca van los Imports:
import java.util.*; // el * permite usar en esta clase todas las clases del Paquete Java.Util
import java.util.Scanner; // en este caso solo se va importar la clase Scanner en espesifico.


public class Clase003_API {
	//Clase 13Y

	//En Java las clases de la api de java estan organizadas en Packetes.
	
	//Los paquetes sirven para organizar las clases y evita conflictos de nombres.
	//y Para controlar la VISIBILIDAD de las clases.
	/* Ejemplo:
	 * 	el Paquete: Java.Lang contiene:
	 * 	- String
	 * 	- Math
	 * 	- Etc.
	 */
	
	/*
	 * Cada vez q se crea una clase se tiene q especificar el paquete donde se guardar
	 * En caso de no especificarlo lo q hace es guardarla en el paquete por defecto SRC.
	 * 
	 * 		Package = Paquete
	 * 
	 * El paquete por defecto contiene las mas usadas como String, Math, etc. Pero no todas.
	 * 
	 */
	public static void main(String[] args) {
		String nombre; //el paquete por defecto contiene la clase String
		//Scanner miObjeto; // en este caso "java.lang" no contiene la Clase 'Scanner'.
		
		//En Java para Utilizar una clase que no pertenece al paquete por defecto.
		/*
		 * Se usa 'import' nombreDelPaquete.*;
		 * 
		 * Al comienzo del Codigo. (*)
		 * 
		 * Otra forma de importar q nos ofrece Java/Eclipse es el de:
		 * 	- Source -> Organize Imports 
		 * Eclipse detecta a que paquetes de clases q no puedas usar y las importa automaticamente.
		 */
		Scanner nombre1;

	}

}
