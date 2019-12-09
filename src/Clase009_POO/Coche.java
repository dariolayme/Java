package Clase009_POO;

<<<<<<< HEAD
//------------------ Temas: HERENCIA - SUPER - INSTANCIAR OBJETO INICIADO - CONSTRUCTOR - Casting - Clases FINAL  -------------------------------------
=======
//------------------ Temas: HERENCIA - SUPER -  -------------------------------------
>>>>>>> f6ae5f55120c24ea0f5c6d8bdf638241dba37be7


public class Coche {
	
	private final int ruedas; 
	private final int largo;
	
	private final int ancho;
	private String motor;
	private final int peso;
	private String color;
	
	//Getters y Setters Auto generados:  Source -> generate Getters and Setters.
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getRuedas() {
		return ruedas;
	}
	public int getLargo() {
		return largo;
	}
	public int getAncho() {
		return ancho;
	}
	public int getPeso() {
		return peso;
	}
	//Constructor
	public Coche() {
		ruedas = 4;
		largo = 2;
		ancho = 1;
		motor = "v1";
		peso = 2000;
		color = "Blanco";
	}
	
	public int velocidadMaxima() {
		return ancho*peso;
	}
	
<<<<<<< HEAD
	
=======
>>>>>>> f6ae5f55120c24ea0f5c6d8bdf638241dba37be7
	public void mostrarDatos() {
		System.out.println("Datos: " + ruedas +" "+ motor+" " + peso );
	}

}
