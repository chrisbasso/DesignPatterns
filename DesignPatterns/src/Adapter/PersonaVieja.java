package Adapter;

import java.util.Date;

public class PersonaVieja implements IPersonaVieja {

	private String nombre;
	private String apellido;
	private Date fechaDeNacimiento;

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;

	}

	@Override
	public String getApellido() {
		return apellido;
	}

	@Override
	public void setApellido(String apellido) {
		this.apellido = apellido;

	}

	@Override
	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	@Override
	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;

	}

}
