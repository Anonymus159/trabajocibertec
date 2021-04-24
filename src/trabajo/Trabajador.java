package trabajo;

import java.time.LocalTime;

public class Trabajador extends Persona {

	public Trabajador(int codigo, String nombre, String direccion, LocalTime horaIngreso) {
		super(codigo, nombre, direccion, horaIngreso);
		
	}
	public String toString(){
		return "La Hora de ingreso del Trabajador " + nombre + " es " + horaIngreso + " por lo tanto llego" + llegada;
}
}
