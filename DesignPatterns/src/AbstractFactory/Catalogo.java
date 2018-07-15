package AbstractFactory;

import java.util.ArrayList;
import java.util.List;


public class Catalogo {

	public static void main(String[] args) {

		FabricaVehiculo fabrica;

		List<Automovil> autos = new ArrayList<Automovil>();
		List<Moto> motos = new ArrayList<Moto>();

		fabrica = new FabricaVehiculoElectrico();
		autos.add(fabrica.creaAutomovil("Tesla Roadster", "Coupe", "Rojo", 300));
		motos.add(fabrica.creaMoto("Honda E", "Naked", "Azul", 20, 4));

		fabrica = new FabricaVehiculoNafta();
		autos.add(fabrica.creaAutomovil("Chvrolet Camaro", "Coupe", "Amarillo", 550));
		motos.add(fabrica.creaMoto("Kawasaki Ninja", "Deportiva", "Verde", 80, 4));

		for (Moto moto : motos) {
			moto.mostrarCaracteristicas();
		}

		for (Automovil auto : autos) {
			auto.mostrarCaracteristicas();
		}

	}

}
