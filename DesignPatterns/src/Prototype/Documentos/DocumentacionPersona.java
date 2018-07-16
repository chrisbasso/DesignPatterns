package Prototype.Documentos;

import java.util.ArrayList;
import java.util.List;

public class DocumentacionPersona extends Documentacion {

	public DocumentacionPersona(String informacion) {

		documentos = new ArrayList<Documento>();

		DocumentacionEnBlanco documentacionEnBlanco = DocumentacionEnBlanco.Instance();

		List<Documento> docEnBlanco = documentacionEnBlanco.getDocumentos();

		for (Documento documento : docEnBlanco) {

			Documento copiaDocumento = documento.duplica();
			copiaDocumento.setContenido(informacion);
			documentos.add(copiaDocumento);

		}

	}

	public void imprime() {
		for (Documento documento : documentos) 
			documento.imprime();
	}

}
