package Builder.ConstructorDeAutos;

public class Motor {

	private int numero;
	private String marca;
	private int potencia;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Motor [numero=" + numero + ", marca=" + marca + ", potencia=" + potencia + "]";
	}

}
