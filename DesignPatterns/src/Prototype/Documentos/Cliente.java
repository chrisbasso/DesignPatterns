package Prototype.Documentos;

public class Cliente {

	public static void main(String[] args) {
		
		DocumentacionEnBlanco documentacionEnBlanco = DocumentacionEnBlanco.Instance();
		documentacionEnBlanco.agregaDocumento(new DNI());
		documentacionEnBlanco.agregaDocumento(new PartidaDeNacimiento());
		
		DocumentacionPersona docPersona1 = new DocumentacionPersona("Carloncho");
		
		docPersona1.imprime();

	}

}
