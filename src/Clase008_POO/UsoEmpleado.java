package Clase008_POO;

public class UsoEmpleado {

	public static void main(String[] args) {
		 
		Empleado em1 = new Empleado("dardo",100000,2015,6,6);
		Empleado em2 = new Empleado("dard2o",50000,2001,2,5);
		Empleado em3 = new Empleado("dard3o",70000,2015,5,3);
		Empleado em4 = new Empleado("miguel");//creamos un empleado pero iniciado con solo un nombre ya iniciado con los minimos segun Empleado(nombre)
		Empleado[] empleados = {em1,em2,em3,em4};
		
		
		for(Empleado empleado : empleados) {
			empleado.subirSueldo(5);
		}
		
		for(Empleado empleado : empleados) {
			System.out.println("id " + empleado.getIdEmpleado() + "--\tNombre: "+ empleado.getNombre() + "\tSueldo Actual: "+ empleado.getSueldo()+ "\tfecha: "+ empleado.getAltaContrato());
			
		}

	}

}
