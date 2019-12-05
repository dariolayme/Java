package Clase007_POO;

public class Uso_Coche {
	
	//cuando tenemos un programa en java con varios archivos. En java tenemos una que va a ser la Principal.
	//La cual va a ser la q tenga el MAIN.  y es ahi donde empieza la ejecucion del programa.

	public static void main(String[] args) {// los metodos del tipo VOID no devuelve ningun valor.
		
		
		Coche coche01 = new Coche();//Instanciar una Clase. De la clase Coche.
		
		System.out.println("Este coche tiene " + coche01.ruedas() +" ruedas.");
		coche01.setColor("verde");
		System.out.println(coche01.getColor());

	}
 
}
