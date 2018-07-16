package Prototype.JugadoresFutbol;

import java.util.HashMap;

public class JugadorPrototype {

	private HashMap<String, Jugador> prototipos = new HashMap<String, Jugador>();

	public JugadorPrototype() {

		Jugador defensor = new Defensor("Otamendi", 30, "Defensor", "Argentina", "Manchester City", 10);
		Jugador delantero = new Delantero("Maradona", 10, "Delantero", "Argentina, ", "Boca", 20);

		agregarPrototype("Defensor", defensor);
		agregarPrototype("Delantero", delantero);

	}
	
	public Object prototipo(String tipo) throws CloneNotSupportedException{
		return prototipos.get(tipo).clone();
	}

	public void agregarPrototype(String posicion, Jugador jugador) {
		prototipos.put(posicion, jugador);
	}

	public void removerPrototype(String posicion) {

		if (prototipos.containsKey(posicion))
			prototipos.remove(posicion);

	}

}
