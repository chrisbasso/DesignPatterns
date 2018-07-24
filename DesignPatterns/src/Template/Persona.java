package Template;

public abstract class Persona {

	private String nombre;
	private String tipoId;

	public String idenficarse() {

		String frase = "Me identifico con: ";
		frase = frase + getTipoId();
		frase = frase + ". El numero es: ";
		frase = frase + getIdentificacion();

		return frase;

	}

	protected abstract String getIdentificacion();

	protected abstract String getTipoId();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getId() {
		return tipoId;
	}

	public void setId(String tipoId) {
		this.tipoId = tipoId;
	}

}
