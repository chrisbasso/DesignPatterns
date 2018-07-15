package Builder;

public class ConstructorDocumentacionHTML extends ConstructorDocumentacion {

	public ConstructorDocumentacionHTML() {

		documentacion = new DocumentacionHTML();

	}

	@Override
	public void construyeSolicitudPedido(String nombreCliente) {

		String documento;
		documento = "<HTML>Solicitud de pedido Cliente: " + nombreCliente + "</HTML>";
		documentacion.agregaDocumento(documento);

	}

	@Override
	public void construyeSolicitudMatriculacion(String nombreSolicitante) {

		String documento;
		documento = "<HTML>Solicitud de Matriculacion Solicitante: " + nombreSolicitante + "</HTML>";
		documentacion.agregaDocumento(documento);

	}

}
