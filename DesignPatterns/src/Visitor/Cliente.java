package Visitor;

public class Cliente {

	public static void main(String[] args) {

		ProductoDescuento producto1 = new ProductoDescuento();
		producto1.setPrecio(100);
		ProductoNormal producto2 = new ProductoNormal();
		producto2.setPrecio(100);

		IVA iva = new IVA();

		double resultado1 = producto1.accept(iva);
		double resultado2 = producto2.accept(iva);

		System.out.println(resultado1);
		System.out.println(resultado2);

	}

}
