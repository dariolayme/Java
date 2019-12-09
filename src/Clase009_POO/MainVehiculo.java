package Clase009_POO;

public class MainVehiculo {

	public static void main(String[] args) {
		
		Coche c1;//objeto sin iniciar
		Coche coche1 = new Coche(); // objeto inicializado por el constructor.
		Furgoneta furgoneta1 = new Furgoneta(7,580);
		
		coche1.setColor("Rojo"); // cambiamos de Color a rojo.
		
		furgoneta1.velocidadMaxima(); // no esta definido en Furgoneta pero lo entiende por q un Coche lo entiende.
		
		coche1.mostrarDatos();
		furgoneta1.mostrarDatos();
		
<<<<<<< HEAD
		//ENLAZADO DINAMICO
		/*
		 * La MV de java es capas en tiempo de ejecucion de saber aq metodo perteneciente a la clase padre 
		 * o hija tiene q llamar. 
		 */
		
		//CASTING
		/*
		 * Para cambiar el tipo de un objeto por ej. : de double a int o entre objetos de distintas clases Ej.:
		 * 
		 * 				Coche nuevoCoche = (Furgoneta) new Furgoneta(132, 23);
		 */
		
		//Clases FINAL
		/*
		 * Al declarar a una clase como tipo FINAL evitamos q otras clases puedan eredar de esta.
		 * 
		 * 
		 */
		
		//Metodos FINAL
		/*
		 * Este modificador en un metodo no permite q cualquier otra clase q erede de la suya, sobre escriba este Metodo.
		 * muy usados en la API de JAVA. 
		 * 
		 * 	Ej : 	public final metodo()
		 */
		
		
	}

}


=======
	}

}
>>>>>>> f6ae5f55120c24ea0f5c6d8bdf638241dba37be7
