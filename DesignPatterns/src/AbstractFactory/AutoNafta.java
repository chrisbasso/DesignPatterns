package AbstractFactory;

public class AutoNafta extends Automovil {

	public AutoNafta(String modelo, String tipo, String color, int potencia) {

		super(modelo, tipo, color, potencia);

	}

	@Override
	public void mostrarCaracteristicas() {

		System.out.println("Auto Nafta Modelo: " + modelo + " Tipo: " + tipo + " Color: " + color + " CV: "  + potencia);
	}

}
