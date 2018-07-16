package Prototype.Documentos;

import java.util.ArrayList;

public class DocumentacionEnBlanco extends Documentacion {

	private static DocumentacionEnBlanco _instance = null;

	private DocumentacionEnBlanco() {
		documentos = new ArrayList<Documento>();
	}

	public static DocumentacionEnBlanco Instance() {

		if (_instance == null)
			_instance = new DocumentacionEnBlanco();

		return _instance;
	}

	public void agregaDocumento(Documento doc) {
		documentos.add(doc);
	}

	public void eliminaDocumento(Documento doc) {
		documentos.remove(doc);
	}

}
