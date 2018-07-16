package Prototype.Documentos;

public class PartidaDeNacimiento extends Documento {

	@Override
	public void imprime() {
		System.out.println("Partida de Nacimiento: " + contenido);
	}

}
