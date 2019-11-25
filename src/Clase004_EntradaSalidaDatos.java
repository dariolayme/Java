import java.util.*;

public class Clase004_EntradaSalidaDatos {
	
	//%% Por Consola %%
	
	 public static void main(String [] args) {
		 
		 //creamos un objeto del tipo Scanner. 
		 
		 //system.in sirve para capturar datos de la consola.
		 Scanner entrada = new Scanner(System.in); // creamos un objeto Entrada q va a ser igual a lo q se ingrese por consola.
		 /*q tipo de dato se va a ingresar lo vamos a definir con:
		  * 	-nextDouble() --- devuelve un Double
		  * 	-nextInt() ------ devuelve un Int
		  * 	-nextLine() ----- devuelve un String
		  * 	ETC.
		  * 
		  */
		 
		 
		 // los metodos NO estaticos necesitan de un OBJETO.
		 
		 System.out.println("Introduce un nombre: ");		 
		 String nombre=entrada.nextLine(); // conseguimos q la consola se qde a la espera de un valor de tipo STRING. Y lo almacenara en 'nombre'.
		 
		 System.out.println("Ingrese edad: ");
		 int edad = entrada.nextInt();// conseguimos q la consola se qde a la espera de un valor de tipo INT. Y lo almacenara en 'edad'.
		 
		 System.out.println("Hola "+ nombre + "\t edad: " + edad);
	 }
}
