package Builder.ConstructorDeAutos;

public abstract class ConstructorAuto {

	protected Auto auto = new Auto();

	public Auto getAuto() {
		return auto;
	}

	public abstract void construyeMotor();

	public abstract void construyeMarca();

	public abstract void construyeModelo();

	public abstract void construyePuertas();

}
