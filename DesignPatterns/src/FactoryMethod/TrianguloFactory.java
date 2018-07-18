package FactoryMethod;

public class TrianguloFactory implements TrianguloFactoryMethod {

	@Override
	public Triangulo crearTriangulo(double ladoA, double ladoB, double ladoC) {

		if ((ladoA == ladoB) && (ladoA == ladoC)) {
			return new Equilatero(ladoA, ladoB, ladoC);
		} 
		else if ((ladoA != ladoB) && (ladoA != ladoC) && (ladoB != ladoC)) {
			return new Escaleno(ladoA, ladoB, ladoC);
		} 
		else {
			return new Isosceles(ladoA, ladoB, ladoC);
		}
	}

}
