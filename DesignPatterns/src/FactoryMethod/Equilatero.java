package FactoryMethod;

public class Equilatero extends Triangulo {

	public Equilatero(double ladoA, double ladoB, double ladoC) {
		super(ladoA, ladoB, ladoC);

	}

	@Override
	public String getDescripcion() {
		return "Triangulo Equilatero";
	}

	@Override
	public double getArea() {

		double area = (Math.sqrt(3) * (getLadoA() * getLadoA())) / 4;

		return area;
	}

	

}
