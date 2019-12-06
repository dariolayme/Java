package Clase008_POO;

// ------------------ Temas: STATIC  - FINAL - CONSTRUCTOR - Tipo DATE - SobreCarga de Constructores - This -------------------------------------


// importamos la clase apropiada para usar el tipo DATE. La cual nos la aporta la clase java.util.*;
import java.util.*;

//esta nos sirve para usarla con instrucciones en SQL.
//import java.sql.Date;

class Empleado {
	//para declara una variable CONSTANTE osea q no se va a modificar anteponemos la palabra reservada FINAL. 
	//oBS: los atributos final no tienen setter justamente por q no se pueden modificar.
	private final String nombre;
	private double sueldo;
	private Date altaContrato;	
	private static int id = 1; //automaticamente eclipse diferencia con el formato Cursiva a una variable statica.
	private int idEmpleado ; // creamos un Id la cual va a depender de la ID STATICA.
	
	
	public int getIdEmpleado() {
		return idEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public Date getAltaContrato() {
		return altaContrato;
	}

	public void setAltaContrato(Date altaContrato) {
		this.altaContrato = altaContrato;
	}

	
	//CONSTRUCTOR//	
	/*
	 * Lleva el mismo nombre que el de su clase.
	 * No lleva ni Void ni devueve ningun dato.
	 * Una clase debe tener un Constructor.
	 * Una clase puede tener varios COnstructores pero no debe coincidir es la conjunción de 3 factores en cuanto a los parámetros: (nº, tipo y orden)
	 * 		ej: se puede tener (int,char) (char,int) (char,char) (int,int) (int,string,char) (int, char, string)
	 * Esto surge cuando se quiere iniciar un objeto de distantas formas.
	 */
	public Empleado(String unNombre, double unSueldo, int anio, int mes, int dia ) {
		idEmpleado = id;
		nombre=unNombre;
		sueldo=unSueldo;
		GregorianCalendar calendario= new GregorianCalendar(anio, mes-1, dia);
		altaContrato = calendario.getTime();//getTIme nos devuelve un objeto del tipo DATE.
		incrementarId();
	}
	
	//creamos otro costructor (solo con un nombre):
	
	//cuando usamos THIS en un constructor llama al otro constructor, si hay mas llamara al q tenga la misma cantidad de parametros.
	public Empleado(String unNombre) {
		this(unNombre,30000,2000,1,1);
	}
	
	public void subirSueldo(double porcentaje) {
		double aumento= sueldo*porcentaje/100;
		sueldo += aumento;
	}
	
	public int incrementarId() {
		return id++;
	}
	
	//METODO STATICO//
	public static String idSiguiente() {
		return "El Id siguiente sera:"+ id;
	}
	/*
	 * STATIC:
	 * 	esta palabra reservada se puede aplicar a var constantes o en metodos. q se los denomina metodos de clase.
	 * 
	 * 	Campo STATIC:	
	 * 			es un copia unica la cual todos los objetos van a compartir. 
	 * 				ej.: la asignacion de ID 
	 */
	
	/*
	 * Los metodos STATIC no trabajan a partir de Objetos sino con la clase. No actua sobre ningun metodo.
	 * 	EJ.: 	
	 * 			Clase.metodoStatico();
	 * 
	 * --estos metodos no actuan nunca sobre campos de EJEMPLAR o campos de CLASE. Osea q un metodo statico nunca podria acc
	 * acceder a los campos de una clase a no ser q la const o variable sea STATIC.
	 * 
	 * Resumen:
	 * 
	 * 		-	No actuan sobre objetos.
	 * 		-	No acceden a campos de ejemplar(var/const declaradas en la clase), a menos q estas seam tambien estaticas.
	 * 		-	Para llamarlas se utiliza 	nombreClase.nombreMetodoStatico();
	 */
	
	// Un ejemplo es la clase MAIN no devuelve nada es publico para q se pueda acceder y es STATIC por q no actua sobre ningun metodo,
}
