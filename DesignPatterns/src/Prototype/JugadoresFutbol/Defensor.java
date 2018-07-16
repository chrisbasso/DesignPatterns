package Prototype.JugadoresFutbol;

public class Defensor extends Jugador {

	private int cantRecuperaciones;

	public Defensor(String nombre, int numero, String posicion, String nacionalidad, String equipo, int cantRecuperaciones) {

		super(nombre, numero, posicion, nacionalidad, equipo);
		this.cantRecuperaciones = cantRecuperaciones;

	}

	public int getCantRecuperaciones() {
		return cantRecuperaciones;
	}

}
