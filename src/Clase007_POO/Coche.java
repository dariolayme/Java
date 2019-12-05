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
	 * 
	 * 		
	 * 	Clase: Su misma clase 	
	 * 	SubClase: Cualquier subclase que est� en otro paquete	
	 * 	Paquete: Cualquier clase que est� en el mismo paquete	
	 * 	Todos:  Cualquier otra clase que est� en otro paquete	
	 * 	+------------------------------------------------------------------+
		|Especificador     |   Clase   | SubClase  |  Paquete  |   Todos   |
		+------------------+-----------+-----------+-----------+-----------|
		| public           |     s�    |    s�     |     s�    |    s�     |
		+------------------+-----------+-----------+-----------+-----------|
		| protected        |     s�    |    si     |     si    |    no     |
		+------------------+-----------+-----------+-----------+-----------|
		| private	       |     s�    |    no     |     no    |    no     |
		+------------------+-----------+-----------+-----------+-----------|
		| no declarado     |     s�    |    no     |     s�    |    no     |
		+------------------+-----------+-----------+-----------+-----------+
	 */
	private int ruedas; //Agregando PRIVATE estamos encampsulando esta variable esa propiedad.
	private int largo;
	int ancho;			// NO esta encapsulada. Por tanto es visible y modificable en otra clase.
	int motor;
	int peso;
	String color;
	
	public String getColor() {//GETTER
		return color;
	}
	public void setColor(String unColor) {//SETTER
		color = unColor;
	}

	
	//Metodo Constructor: siempre tiene el mismo nombre q el de su clase.
	public Coche(){
		ruedas = 4;
		ancho= 300;
		largo = 123;
		color = "rojo";
		
		
	}
	public int ruedas() {
		return ruedas;
	}
	
	

}
