package Builder.ConstructorDeAutos;

public class ConstructorChevrolet extends ConstructorAuto {

	@Override
	public void construyeMotor() {

		Motor motor = new Motor();
		motor.setNumero(456774);
		motor.setMarca("Chevrolet");
		motor.setPotencia(150);

		auto.setMotor(motor);

	}

	@Override
	public void construyeMarca() {
		auto.setMarca("Chevrolet");
	}

	@Override
	public void construyeModelo() {
		auto.setModelo("Vectra");
	}

	@Override
	public void construyePuertas() {
		auto.setCantPuertas(5);
	}

}
