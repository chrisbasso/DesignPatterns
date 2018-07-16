package Builder.ConstructorDocumentacion;

public class DocumentacionPDF extends Documentacion {

	@Override
	public void agregaDocumento(String documento) {

		if (documento.startsWith("<PDF>"))
			contenido.add(documento);

	}

	@Override
	public void imprime() {

		System.out.println("Documento PDF");

		for (String string : contenido) {
			System.out.println(string);
		}

	}

}
