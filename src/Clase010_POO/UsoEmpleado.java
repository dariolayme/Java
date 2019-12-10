package Clase010_POO;
//------------------ Temas: CLASE Y METODO ABSTRACTO - Modificadores de ACCESO - ENUM  -------------------------------------

public class UsoEmpleado {
	
	enum Talla {
				mini, medi, grand, mGrand
	};
	
	
	//Otra manera de declarar un Enum
	enum Talla2{
		//Primero van las constantes enumeradas ya construidas con el constructor.
		Mini("s"),Medi("m"),Grande("l"),MuyGrande("xl");

		private String abreviatura;
		
		
		private Talla2(String abreviatura) {
			this.abreviatura = abreviatura;
		}
		
		public String abreviatura() {
			return abreviatura;
		}
		
	}	/*
		 * Se pueden usar tanto geters, setters y Constructores para los enum.
		 */
	
	//Los modificadores expresan su visibilidad. En Clase007 ----- Ampliamos
	public static void main(String[] args) {
		
		Empleado emp1 = new Empleado("asd",123,1);
		Alumno alum1 = new Alumno("qwe", 4);
		
		emp1.descripcion();
		alum1.descripcion();
		
		String talla;
		talla="Peq";
		talla="Med";
		talla="Gra";
		//Cuando surge la necesidad de crear una variable donde nos aseguremos un cantidad y tipo de valores determinados. Y nada diferente.
		//Hablamos de un tipo ENUM. 
		/*
		 * La cual esta compuesta por elementos/valores denominados "Constantes enumeradas".
		 */
		//talla = "Azul";//lo q no queremos 
		//Para esto tenemos el ENumerado. EL tipo Enum es una variable objeto donde solo se almaccenara un grupo de valores.
		
		/*
		 * El enum no se declara dentro del main.
		 * 
		 * Ya declaro el enum.
		 * 
		 */
		
		
		Talla s = Talla.mini;
		Talla m = Talla.medi;
		Talla l = Talla.grand;
		Talla xl = Talla.mGrand;
		//Talla xxl = muygrande; No nos deja.
		
		
		
	

	}

}
