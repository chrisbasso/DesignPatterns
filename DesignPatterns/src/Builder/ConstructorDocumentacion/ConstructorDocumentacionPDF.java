package Builder.ConstructorDocumentacion;

public class ConstructorDocumentacionPDF extends ConstructorDocumentacion {

	public ConstructorDocumentacionPDF() {

		documentacion = new DocumentacionPDF();

	}

	@Override
	public void construyeSolicitudPedido(String nombreCliente) {

		String documento;
		documento = "<PDF>Solicitud de pedido Cliente: " + nombreCliente + "</PDF>";
		documentacion.agregaDocumento(documento);

	}

	@Override
	public void construyeSolicitudMatriculacion(String nombreSolicitante) {

		String documento;
		documento = "<PDF>Solicitud de Matriculacion Solicitante: " + nombreSolicitante + "</PDF>";
		documentacion.agregaDocumento(documento);

	}

}
