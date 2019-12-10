package Clase010_POO;

abstract class Persona {
	
	
	private String nombre;
	
	public Persona(String unNombre) {
		nombre = unNombre;
	}
	
	//asi se declara un metodo ABSTRACTO.
	public abstract void descripcion();
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
