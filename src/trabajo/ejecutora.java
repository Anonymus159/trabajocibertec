package trabajo;

import java.time.LocalTime;

public class ejecutora {

	public static void main(String[] args) {
		Persona personas[] = new Persona[6];
		personas[0] = new Socio(2806,"Octavio","Los Jardines",LocalTime.parse("07:34:45"));
		personas[1] = new Socio(9870,"Enrique","Los Manglares",LocalTime.parse("08:34:45"));
		personas[2] = new Instructor(467,"Abby","Surco",LocalTime.parse("06:10:45"));
		personas[3] = new Instructor(574,"Annalucia","calle 4",LocalTime.parse("10:43:45"));
		personas[4] = new Trabajador(960,"Carlos","Los Manzanos",LocalTime.parse("11:34:45"));
		personas[5] = new Trabajador(888,"Ronald","calle 23 de abril",LocalTime.parse("07:23:19"));
		 
		 for (int i = 0; i < personas.length; i++) {
			 System.out.println(personas[i]);
		 }
		 Persona auxiliar;
		 for (int i = 0; i < personas.length-1; i++) {
		 for (int j = 0; j < personas.length-1; j++) {
			if(personas[j].getHoraIngreso().isAfter(personas[j+1].getHoraIngreso())) {
				auxiliar=personas[j];
				personas[j]=personas[j+1];
				personas[j+1] = auxiliar;
			}
		 }
		 }
		 for (int i = 0; i < personas.length; i++) {
			 System.out.println("Ingreso " +(i+1) +" " + personas[i].getHoraIngreso());
		 }

	}

}
