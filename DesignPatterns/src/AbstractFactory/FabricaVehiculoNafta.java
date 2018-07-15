package AbstractFactory;




public class FabricaVehiculoNafta implements FabricaVehiculo {

	@Override
	public Automovil creaAutomovil(String modelo, String tipo, String color, int potencia) {

		AutoNafta auto = new AutoNafta(modelo, tipo, color, potencia);

		return auto;

	}

	@Override
	public Moto creaMoto(String modelo, String tipo, String color, int potencia, int tiempos) {

		MotoNafta moto = new MotoNafta(modelo, tipo, color, potencia, tiempos);

		return moto;

	}

}
