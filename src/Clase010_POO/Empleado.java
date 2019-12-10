package Clase010_POO;

class Empleado extends Persona {
	private int sueldo;
	private int id;
	
	public Empleado(String nombre, int sueldo, int id) {
		super(nombre);
		this.sueldo = sueldo;
		this.id = id;
	}
	
	//Toda metodo abstracto tiene q ser sobreescrito en las clases q se heredan.
	public void descripcion() {
		System.out.println( this.getNombre() + " sueldo:"+sueldo);
	}
}
