import java.util.*;

import javax.swing.JOptionPane;

public class Clase006_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] paises= new String[4];
		
		Scanner datoIngresado = new Scanner(System.in);
		
		
		for (int i = 0; i < paises.length; i++) {
			/*
			//Introducimos en el Vector con la CONSOLA.
			System.out.println("Ingrese pais:");
			paises[i]=datoIngresado.nextLine();
			*/
			
			//Introduciomos en el vector con el JOptionPanel.
			paises[i]=JOptionPane.showInputDialog("Ingrese pais: ");
		}
		
		//FOR Extendido o For Each en Java:
		/*
		 * El cual consiste en declarar un variable q tendra q ser del mismo tipo q el array a usarse.
		 * esto simplifica su uso ya q automaticamente conoce el tamaño.
		 * sin necesidad de definir el número de elementos a recorrer.
		 */
		for (String elemento:paises) {
			System.out.println("Pais: " + elemento);

		}
		
		//Matriz en Java
		/*
		 * int [][] nombre = new int[CantidadDeFIlas][CantidadDeCOlumnas];
		 * 
		 * al recorrer la matriz o cualquier otro array arranca de 0.
		 * 
		 * esta Matriz graficamente qdaria asi:
		 * 		a00	a01	a02 ... a0CantidadDeColumnas
		 * 		a10	a11	a12	... a1CantidadDeColumnas
		 * 		 *	 * 	 * 		  		*
		 * 		aF0 aF1 aF2 ... aCantidadDeFilas.CantidadDeColumnas
		 */
		int [][] matrix = new int[4][3];
		
		matrix [0][0]=15;
		matrix [0][1]=20;
		matrix [0][2]=23;
		
		matrix [1][0]=18;
		matrix [1][1]=44;
		matrix [1][2]=42;
	
		
		matrix [2][0]=14;
		matrix [2][1]=18;
		matrix [2][2]=21;
		
		matrix [3][0]=41;
		matrix [3][1]=82;
		matrix [3][2]=76;
		
		
		//Usando FOR tradicional:
		
		for (int i = 0; i < 4; i++) {
			System.out.println();
			for (int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j] + " ");
			}
		}  
		
		//Usando FOR Each:
		System.out.println();

		 
		for (int[] fila : matrix) {
			System.out.println();
			for (int datosColumna : fila) {
				System.out.print(datosColumna + " " );
			}
		}
		
	}

}
