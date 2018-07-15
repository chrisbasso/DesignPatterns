package Builder;

public class DocumentacionHTML extends Documentacion {

	@Override
	public void agregaDocumento(String documento) {

		if (documento.startsWith("<HTML>"))
			contenido.add(documento);

	}

	@Override
	public void imprime() {

		System.out.println("Documento HTML");

		for (String string : contenido)
			System.out.println(string);

	}

}
