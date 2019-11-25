package Clase007_POO;

public class Coche {
	
	//Para Encapsular las variables de la Clase COCHE agregamos el Modificador de Nivel de Acceso:
	/*
	 * Los cuales Pueden Ser:
	 * 	-public
	 * 	-private
	 * 	-protected
	 * 	-ninguno.
	 * 
	 * La siguiente tabla muestra el acceso a los miembros permitido por cada modificador:
	 * 	+------------------------------------------------------------------+
		|Especificador     |   Clase   | SubClase  |  Paquete  |   Todos   |
		+------------------+-----------+-----------+-----------+-----------|
		| public           |     sí    |    sí     |     sí    |    sí     |
		+------------------+-----------+-----------+-----------+-----------|
		| private          |     sí    |    no     |     no    |    no     |
		+------------------+-----------+-----------+-----------+-----------|
		| protected        |     sí    |    sí     |     sí    |    no     |
		+------------------+-----------+-----------+-----------+-----------|
		| no declarado     |     sí    |    no     |     sí    |    no     |
		+------------------+-----------+-----------+-----------+-----------+
	 */
	private int ruedas; //Agregando PRIVATE estamos encampsulando esta variable esa propiedad.
	private int largo;
	int ancho;			// NO esta encapsulada. Por tanto es visible y modificable en otra clase.
	int motor;
	int peso;
	//Metodo Constructor: siempre tiene el mismo nombre q el de su clase.
	
	//este ejemplo no es el
	public Coche(){
		ruedas = 4;
		ancho= 300;
		largo = 123;
		
		
	}
	public int ruedas() {
		return ruedas;
	}
	

}
