package trabajo;

import java.time.LocalTime;

public class Socio extends Persona {

	public Socio(int codigo, String nombre, String direccion,LocalTime horaIngreso) {
		super(codigo, nombre, direccion,horaIngreso);
	
	}
	public String toString(){
		return "La Hora de ingreso del Socio " + nombre + " es " + horaIngreso + " por lo tanto llego" + llegada;
}
}
