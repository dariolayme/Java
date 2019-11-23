
public class Clase002_ClaseMath {
	//Clase 9Y

	public static void main(String[] args) {
		/*
		 * Java tiene CLases PREDEFINIDAS: son clases propias de java,
		 * q estan definidas para usarse en nuestros programas, como:
		 * 	-String
		 * 	-Math 
		 * 	-Array
		 * 	-Trhead
		 * 	-etc. 
		 * Y despues tenemos las PROPIAS q definimos nostros.
		 * 
		 * Para las clase PREDEFINIDAS existe una biblioteca de clase
		 * o una biblioteca de Java llamada API JAVA.
		 * 		https://docs.oracle.com/javase/8/docs/api/ 
		 */
		
		// clase Math
		int numero = 213;
		double raizCuadrada = Math.sqrt(numero);
		System.out.println(raizCuadrada);
		
		//Refundiciones:
		/*
		 * es un cambio de tipo. 
		 */
		int resultadoRefundado = (int)Math.sqrt(numero);//refundamos un valor del tipo double a int.
		System.out.println(resultadoRefundado);
		
		
	}

}
