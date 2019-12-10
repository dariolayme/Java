package Clase010_POO;

class Alumno extends Persona{
	
	private int nota;
	
	public Alumno(String unNombre, int unNota) {
		super(unNombre);
		nota=unNota;
		
	}
	
	@Override
	public void descripcion() {
		System.out.println(this.getNombre() + " Nota: "+ nota);
		
	}
	
	

}
