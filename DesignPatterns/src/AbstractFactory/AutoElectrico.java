package AbstractFactory;

public class AutoElectrico extends Automovil {

	public AutoElectrico(String modelo, String tipo, String color, int potencia) {
		
		super(modelo, tipo, color, potencia);

	}

	@Override
	public void mostrarCaracteristicas() {
		
		System.out.println("Auto Electrico Modelo: " + modelo + " Tipo: " + tipo + " Color: " + color + " CV: "  + potencia);

	}

}
