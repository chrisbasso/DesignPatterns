package AbstractFactory;

public abstract class Automovil {

	protected String modelo;
	protected String tipo;
	protected String color;
	protected int potencia;

	public Automovil(String modelo, String tipo, String color, int potencia) {

		this.modelo = modelo;
		this.tipo = tipo;
		this.color = color;
		this.potencia = potencia;
	}
	
	public abstract void mostrarCaracteristicas();

}
