package Clase009_POO;


//JAVA no admite HERENCIA multiple.
/*
 * En java se pueden tener mas de 1 constructor.
 */


// con el Modificador FINAL evitamos la herencia sobre la Clase Furgoneta.	
final class Furgoneta extends Coche {
	
	private int capacidadCarga;
	private int plazasExtra;
	
	
	//constructor Furgoneta:
	public Furgoneta(int pExtra, int capCarga) {
		super(); // llamar a la misma funcion del padre.
		capacidadCarga = capCarga;
		plazasExtra = pExtra;
		
	}
	
	public void mostrarDatos() {
		super.mostrarDatos(); // para reutilizar el codigo de un metodo de la clase superior se antepone la palabra reservada SUPER seguido de un punto.
		System.out.print("Extra: "+ capacidadCarga +" " + plazasExtra);
	}
}	
