package Builder.ConstructorDeAutos;

public class ConstructorFord extends ConstructorAuto {

	@Override
	public void construyeMotor() {

		Motor motor = new Motor();
		motor.setNumero(5584484);
		motor.setMarca("Ford");
		motor.setPotencia(120);

		auto.setMotor(motor);

	}

	@Override
	public void construyeMarca() {
		auto.setMarca("Ford");
	}

	@Override
	public void construyeModelo() {
		auto.setModelo("Fiesta");
	}

	@Override
	public void construyePuertas() {
		auto.setCantPuertas(4);
	}

}
