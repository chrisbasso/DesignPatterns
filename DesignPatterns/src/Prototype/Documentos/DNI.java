package Prototype.Documentos;

public class DNI extends Documento{
	
	@Override
	public void imprime() {
		System.out.println("DNI: " + contenido);
	}

}
