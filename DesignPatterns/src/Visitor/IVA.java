package Visitor;

public class IVA implements Visitor{
	
	private final double impuestoNormal = 1.21;
	private final double impuestoDescuento = 1.105;

	@Override
	public double visit(ProductoNormal normal) {
		return normal.getPrecio() * impuestoNormal;
	}

	@Override
	public double visit(ProductoDescuento reducido) {
		return reducido.getPrecio() * impuestoDescuento;
	}

}
