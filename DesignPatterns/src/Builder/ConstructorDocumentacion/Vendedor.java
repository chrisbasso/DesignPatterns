package Builder.ConstructorDocumentacion;

public class Vendedor {

	protected ConstructorDocumentacion constructor;

	public Vendedor(ConstructorDocumentacion constructor) {

		this.constructor = constructor;

	}

	public Documentacion construye(String nombreCliente) {

		constructor.construyeSolicitudPedido(nombreCliente);
		constructor.construyeSolicitudMatriculacion(nombreCliente);
		Documentacion documentacion = constructor.resultado();

		return documentacion;

	}

}
