package Builder.ConstructorDeAutos;

public class Cliente {

	public static void main(String[] args) {

		FabricaDeAutos fabrica = new FabricaDeAutos();

		fabrica.setConstructor(new ConstructorChevrolet());

		fabrica.construirAuto();

		Auto auto = fabrica.getAuto();

		System.out.println(auto.getMarca());
		System.out.println(auto.getModelo());
		System.out.println(auto.getMotor());
		System.out.println(auto.getCantPuertas() + " puertas");

	}

}
