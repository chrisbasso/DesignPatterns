package AbstractFactory;

public class MotoElectrica extends Moto {

	public MotoElectrica(String modelo, String tipo, String color, int potencia, int tiempos) {

		super(modelo, tipo, color, potencia, tiempos);

	}

	@Override
	public void mostrarCaracteristicas() {
		
		System.out.println("Moto Electrica Modelo: " + modelo + " Tipo: " + tipo + " Color: " + color + " CV: "  + potencia + " Motor: " + tiempos + "tiempos");

	}

}
