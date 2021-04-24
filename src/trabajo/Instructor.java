package trabajo;

import java.time.LocalTime;

public class Instructor extends Persona {

	public Instructor(int codigo, String nombre, String direccion, LocalTime horaIngreso) {
		super(codigo, nombre, direccion, horaIngreso);
		// TODO Auto-generated constructor stub
	}
	public String toString(){
		return "La Hora de ingreso del Instructor " + nombre + " es " + horaIngreso + " por lo tanto llego" + llegada;
}
}
