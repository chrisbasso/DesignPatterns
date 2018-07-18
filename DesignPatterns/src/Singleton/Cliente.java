package Singleton;

public class Cliente {

	public static void main(String[] args) {
		
		Servidor servidor = Servidor.getInstance();
		servidor.setNombre("Servidor de Jaimito");
		System.out.println(servidor.getNombre());
		
		
		servidor.setNombre("Servidor de Charly");
		Servidor mismoServidor = Servidor.getInstance();
		System.out.println(mismoServidor.getNombre());
		
		
	}

}
