package AbstractFactory;




public class FabricaVehiculoElectrico implements FabricaVehiculo {

	@Override
	public Automovil creaAutomovil(String modelo, String tipo, String color, int potencia) {

		AutoElectrico auto = new AutoElectrico(modelo, tipo, color, potencia);

		return auto;

	}

	@Override
	public Moto creaMoto(String modelo, String tipo, String color, int potencia, int tiempos) {

		MotoElectrica moto = new MotoElectrica(modelo, tipo, color, potencia, tiempos);

		return moto;
	}

}
