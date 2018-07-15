package Builder;

public class Cliente {

	public static void main(String[] args) {

		ConstructorDocumentacion constructor;

		constructor = new ConstructorDocumentacionHTML();
		Vendedor vendedor = new Vendedor(constructor);
		Documentacion documentacion = vendedor.construye("Carloncho");
		documentacion.imprime();

		constructor = new ConstructorDocumentacionPDF();
		vendedor = new Vendedor(constructor);
		documentacion = vendedor.construye("Jaimito");
		documentacion.imprime();

	}

}
