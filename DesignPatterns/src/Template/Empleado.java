package Template;

public class Empleado extends Persona {

	private String legajo;

	public Empleado(String legajo) {
		this.legajo = legajo;
	}

	@Override
	protected String getIdentificacion() {
		return legajo;
	}

	@Override
	protected String getTipoId() {
		return "numero de legajo";
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

}
