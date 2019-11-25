import javax.swing.*; //para usar JOptionPane


public class Clase005_EntradaSalidaJOP {

	public static void main(String[] args) {
		String nombre= JOptionPane.showInputDialog("Introduce un Nombre:"); // con esto construimos una ventana con un cuadro de texto para ingresar, con botones.
		// el texto q se ingrese se guardara en la variable 'nombre'-
		String edad = JOptionPane.showInputDialog("Introduce Edad:");// es del tipo String porq el metodo showInputDialog retorna un String.
		
		
		int edadUsuario = Integer.parseInt(edad); //INTEGER es una clase. y parseInt() es del tipo STATIC q sirve para cambiar el tipo a int.
		//double edadDouble = Double.parseDouble(edad); // lo mismo q parseInt()
		edadUsuario++;
		System.out.println("hola "+ nombre + ". El año q viene tendras: " + edadUsuario + ".");
		
		//printf muestra con formato por ej a un numero con muchos decimales solo le pido q muestre solo 2 decimales, funcion similar a C o C++.
	}

}
