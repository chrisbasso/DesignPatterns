package FactoryMethod;

public class Escaleno extends Triangulo {

	public Escaleno(double ladoA, double ladoB, double ladoC) {
		super(ladoA, ladoB, ladoC);
	}

	@Override
	public String getDescripcion() {
		return "Triangulo Escaleno";
	}

	@Override
	public double getArea() {

		double s = (getLadoA() + getLadoB() + getLadoC()) / 2; // SemiPerimetro

		double area = Math.sqrt(s * (s - getLadoA()) * (s - getLadoB()) * (s - getLadoC()));

		return area;

	}

}
