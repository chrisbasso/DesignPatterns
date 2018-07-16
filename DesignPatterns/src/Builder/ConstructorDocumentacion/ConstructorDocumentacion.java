package Builder.ConstructorDocumentacion;

public abstract class ConstructorDocumentacion {

	protected Documentacion documentacion;

	public abstract void construyeSolicitudPedido(String nombreCliente);

	public abstract void construyeSolicitudMatriculacion(String nombreSolicitante);

	public Documentacion resultado() {
		return documentacion;
	}

}
