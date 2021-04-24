package trabajo;

import java.text.SimpleDateFormat;

import java.time.*;


public class Persona {
    
   protected int codigo;
    protected String nombre;
  protected  String direccion;
 
  protected LocalTime horaIngreso;
 
 protected String llegada;
 void ingreso() {
	System.out.println(nombre + " es un " + " , su codigo es " + codigo + " y su direccion es: " + direccion);
}
    public Persona() {    }   
    
    public Persona(int codigo, String nombre, String direccion, LocalTime horaIngreso) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.horaIngreso= horaIngreso;
        this.vertarde();
    }

	public String toString(){
		return "La Hora de ingreso de " + nombre + " es " + horaIngreso;
	} 
	public void vertarde() {
		if (horaIngreso.isAfter(LocalTime.parse("08:00:00"))) {
			
				llegada=" Tarde";}
		else { 
			
			llegada=" temprano";
		}
	}
	public LocalTime getHoraIngreso() {
		return horaIngreso;
	}
	public void setHoraIngreso(LocalTime horaIngreso) {
		this.horaIngreso = horaIngreso;
	}
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
    
   }