package Builder.ConstructorDeAutos;

public class FabricaDeAutos {
	
	private ConstructorAuto constructor;
	
	public void construirAuto() {
		
		constructor.construyeMarca();
		constructor.construyeModelo();
		constructor.construyeMotor();
		constructor.construyePuertas();
		
	}
	
	public void setConstructor(ConstructorAuto constructorAuto) {
		constructor = constructorAuto;
	}
	
	public Auto getAuto() {
		Auto auto = constructor.getAuto();
		return auto;
	}

}
