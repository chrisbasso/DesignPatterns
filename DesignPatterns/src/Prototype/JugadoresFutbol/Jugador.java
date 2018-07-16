package Prototype.JugadoresFutbol;

public abstract class Jugador implements Cloneable {

	private String nombre;
	private int numero;
	private String posicion;
	private String nacionalidad;
	private String equipo;

	public Jugador(String nombre, int numero, String posicion, String nacionalidad, String equipo) {

		this.nombre = nombre;
		this.numero = numero;
		this.posicion = posicion;
		this.nacionalidad = nacionalidad;
		this.equipo = equipo;

	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

}
