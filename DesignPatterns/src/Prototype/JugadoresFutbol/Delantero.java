package Prototype.JugadoresFutbol;

public class Delantero extends Jugador {

	private int cantGoles;

	public Delantero(String nombre, int numero, String posicion, String nacionalidad, String equipo, int cantGoles) {
		super(nombre, numero, posicion, nacionalidad, equipo);
		this.cantGoles = cantGoles;
	}

	public int getCantGoles() {
		return cantGoles;
	}

}
