package Prototype.Documentos;

public abstract class Documento implements Cloneable {

	protected String contenido = new String();

	public Documento duplica() {

		Documento resultado;

		try {
			resultado = (Documento) this.clone();
		} 
		catch (CloneNotSupportedException exception) {
			return null;
		}

		return resultado;
	}

	public void setContenido(String informacion) {
		contenido = informacion;
	}

	public abstract void imprime();

}
