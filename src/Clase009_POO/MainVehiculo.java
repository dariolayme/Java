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
		
	}

}
