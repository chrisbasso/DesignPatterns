package FactoryMethod;

public class Isosceles extends Triangulo {

	public Isosceles(double ladoA, double ladoB, double ladoC) {
		super(ladoA, ladoB, ladoC);
	}

	@Override
	public String getDescripcion() {
		return "Triangulo Isosceles";
	}

	@Override
	public double getArea() {

		double base;

		if (getLadoA() == getLadoB()) {
			base = getLadoC();
		} else if (getLadoA() == getLadoC()) {
			base = getLadoB();
		} else {
			base = getLadoA();
		}
		
		double area = (base * (Math.sqrt(getLadoA()*getLadoA() - ((base * base )/4))))/2;
		
		return area;

	}

}
