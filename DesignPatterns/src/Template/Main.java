package Template;

public class Main {

	public static void main(String[] args) {

		Persona persona = new Cliente(5454);
		System.out.println(persona.idenficarse());

		Persona persona2 = new Socio(545466);
		System.out.println(persona2.idenficarse());

		Persona persona3 = new Empleado("5648");
		System.out.println(persona3.idenficarse());

	}

}
