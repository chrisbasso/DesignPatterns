package FactoryMethod;

public class Cliente {

	public static void main(String[] args) {

		TrianguloFactoryMethod factory = new TrianguloFactory();

		Triangulo triangulo = factory.crearTriangulo(3, 4, 5);
		System.out.println(triangulo.getDescripcion());
		System.out.println(triangulo.getArea());

		triangulo = factory.crearTriangulo(3, 3, 5);
		System.out.println(triangulo.getDescripcion());
		System.out.println(triangulo.getArea());

		triangulo = factory.crearTriangulo(4, 4, 4);
		System.out.println(triangulo.getDescripcion());
		System.out.println(triangulo.getArea());

	}

}
