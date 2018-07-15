package AbstractFactory;

public abstract class Moto {

	protected String modelo;
	protected String tipo;
	protected String color;
	protected int potencia;
	protected int tiempos;

	public Moto(String modelo, String tipo, String color, int potencia, int tiempos) {

		this.modelo = modelo;
		this.tipo = tipo;
		this.color = color;
		this.potencia = potencia;
		this.tiempos = tiempos;

	}
	
	public abstract void mostrarCaracteristicas();

}
