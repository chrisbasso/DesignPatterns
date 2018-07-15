package AbstractFactory;

public class MotoNafta extends Moto{

	public MotoNafta(String modelo, String tipo, String color, int potencia, int tiempos) {

		super(modelo, tipo, color, potencia, tiempos);

	}

	@Override
	public void mostrarCaracteristicas() {
		
		System.out.println("Moto Nafta Modelo: " + modelo + " Tipo: " + tipo + " Color: " + color + " CV: "  + potencia + " Motor: " + tiempos + "tiempos");

	}

}
