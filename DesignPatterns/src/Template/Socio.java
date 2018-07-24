package Template;

public class Socio extends Persona {

	private int nroSocio;

	public Socio(int nroSocio) {
		this.nroSocio = nroSocio;
	}

	@Override
	protected String getIdentificacion() {
		return String.valueOf(nroSocio);
	}

	@Override
	protected String getTipoId() {
		return "numero de Socio";
	}

	public int getNroSocio() {
		return nroSocio;
	}

	public void setNroSocio(int nroSocio) {
		this.nroSocio = nroSocio;
	}

}
