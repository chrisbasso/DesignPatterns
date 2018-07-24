package Template;

public class Cliente extends Persona {

	private int nroCliente;

	public Cliente(int nroCliente) {
		this.nroCliente = nroCliente;
	}

	@Override
	protected String getIdentificacion() {
		return String.valueOf(nroCliente);
	}

	@Override
	protected String getTipoId() {
		return "numero de cliente";
	}

	public int getNroCliente() {
		return nroCliente;
	}

	public void setNroCliente(int nroCliente) {
		this.nroCliente = nroCliente;
	}

}
