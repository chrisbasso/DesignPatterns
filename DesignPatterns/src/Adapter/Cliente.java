package Adapter;

import java.util.Date;
import java.util.GregorianCalendar;

public class Cliente {

	public static void main(String[] args) {


		PersonaVieja personaVieja = new PersonaVieja();
		personaVieja.setApellido("Basso");
		personaVieja.setNombre("Christian");
		
		GregorianCalendar c = new GregorianCalendar();
		c.set(1989, 01, 01);
		Date d = c.getTime();
		personaVieja.setFechaDeNacimiento(d);
		
		System.out.println(personaVieja.getNombre());
		System.out.println(personaVieja.getFechaDeNacimiento());
		
		ViejaToNuevaAdapter personaNueva = new ViejaToNuevaAdapter(personaVieja);
		
		System.out.println(personaNueva.getNombre());
		System.out.println(personaNueva.getEdad());
		
		personaNueva.setEdad(34);
		personaNueva.setNombre("Juan Perez");
		
		System.out.println(personaNueva.getNombre());
		System.out.println(personaNueva.getEdad());
		

	}

}
