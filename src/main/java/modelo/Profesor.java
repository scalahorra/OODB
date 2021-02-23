package modelo;

import java.util.*;

public class Profesor {

	public float codigo;
	public String apellidos;
	public String nombre;
	public String fechaNacimiento;
	public String sexo;
	public float centro;
	public List<Asignatura> asignaturas;
	
	
	//Constructores
	public Profesor() {
		super();
	}
	public Profesor(float codigo, String apellidos, String nombre, String fechaNacimiento, String sexo, float centro,
			List<Asignatura> asignaturas) {
		super();
		this.codigo = codigo;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.sexo = sexo;
		this.centro = centro;
		this.asignaturas = asignaturas;
	}
	
	
	//Getter Setter
	public float getCodigo() {
		return codigo;
	}
	public void setCodigo(float codigo) {
		this.codigo = codigo;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public float getCentro() {
		return centro;
	}
	public void setCentro(float centro) {
		this.centro = centro;
	}
	public List<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	
	
	//ToString
	@Override
	public String toString() {
		return "Profesores [codigo=" + codigo + ", apellidos=" + apellidos + ", nombre=" + nombre + ", fechaNacimiento="
				+ fechaNacimiento + ", sexo=" + sexo + ", centro=" + centro + ", asignaturas=" + asignaturas +"]";
	}
	
	
	
}
