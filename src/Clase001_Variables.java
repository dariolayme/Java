
public class Clase001_Variables {
	public static void main(String [] args) {
		
		
		/*Eclipse nos ofrece unos menus de ayuda, a los entornos de Desarrollo,
		 * IDE se los denomine INTELLISENSE.
		 *  
		 */
		
		//JAva es un lenguaje de programacion orientado a objetos.
		/*
		 * todo en java es un objeto, asi como la consola q usamos para estos ejemplos.
		 */
		
		//Los objetos tienen PROPIEDADES Y METODOS.
		/*Ejemplo:
		 * Auto ---------- Objeto
		 * Propiedades --- color, ruedas, temperatura (caracteristicas)
		 * Metodos ------- girar, arrancar, etc (Cosas q puede hacer/entender)
		 * */
		
		int edad;
		edad=35;
		
		//sysout es como un printf o cout, etc
		//print ---- imprime sin salto de linea
		//println -- imprime con salto de linea
		System.out.println(edad);
		/*
		 * La consola OUT (objeto)
		 * del Sistema (System)
		 * imprima (println) la edad.
		 */
		
		//Constante
		/*
		 * Es un espacio en la memoria del ordenador donde se almacenara un valor que no
		 * podra cambiar durante la ejecucion del programa.
		 */
		//Sintaxis
		final double pulgada=2.54;
		double cm = 6;
		double resultado = cm/pulgada;
		
		System.out.println("En " + cm + " cm hay " + resultado + " pulgadas.");
		
		
	}

}
