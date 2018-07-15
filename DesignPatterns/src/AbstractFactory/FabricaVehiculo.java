package AbstractFactory;



public interface FabricaVehiculo {

	Automovil creaAutomovil(String modelo, String tipo, String color, int potencia);

	Moto creaMoto(String modelo, String tipo, String color, int potencia, int tiempos);

}
