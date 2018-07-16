package Prototype.JugadoresFutbol;

public class Cliente {

	public static void main(String[] args) throws Exception {

		JugadorPrototype jugadorPrototipo = new JugadorPrototype();

		Jugador jugadorDelantero = (Jugador) jugadorPrototipo.prototipo("Delantero");

		System.out.println(jugadorDelantero.getNombre());
		System.out.println(jugadorDelantero.getPosicion());
		System.out.println(jugadorDelantero.getEquipo());

	}

}
