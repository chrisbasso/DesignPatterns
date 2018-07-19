package Adapter;

import java.util.GregorianCalendar;

public class ViejaToNuevaAdapter implements IPersonaNueva {

	private IPersonaVieja vieja;

	public ViejaToNuevaAdapter(IPersonaVieja vieja) {

		this.vieja = vieja;
	}

	@Override
	public String getNombre() {
		return vieja.getNombre() + " " + vieja.getApellido();
	}

	@Override
	public void setNombre(String nombreCompleto) {
		String[] nombre = nombreCompleto.split(" ");
		vieja.setNombre(nombre[0]);
		vieja.setApellido(nombre[1]);

	}

	@Override
	public int getEdad() {
		GregorianCalendar c = new GregorianCalendar();
		GregorianCalendar c2 = new GregorianCalendar();
		c2.setTime(vieja.getFechaDeNacimiento());
		return c.get(1) - c2.get(1);

	}

	@Override
	public void setEdad(int edad) {
		GregorianCalendar c = new GregorianCalendar();
		int anioActual = c.get(1);
		c.set(1, anioActual - edad);
		vieja.setFechaDeNacimiento(c.getTime());
	}

}
