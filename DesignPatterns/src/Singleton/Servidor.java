package Singleton;

public class Servidor {

	private static Servidor instance = new Servidor();
	private String nombre;

	private Servidor() {

	}

	public static Servidor getInstance() {
		return instance;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
