package modelo;

import java.util.*;

public class Centro {

	public float codigo;
	public String nombre;
	public float director;
	public String direeccion;
	public String localidad;
	public String provincia;
	public List <Profesor> profesores;
	
	
	//Constructores
	public Centro() {
		super();
	}
	public Centro(float codigo, String nombre, float director, String direeccion, String localidad, String provincia) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.director = director;
		this.direeccion = direeccion;
		this.localidad = localidad;
		this.provincia = provincia;
	}
	
	
	//Getter Setter
	public float getCodigo() {
		return codigo;
	}
	public void setCodigo(float codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getDirector() {
		return director;
	}
	public void setDirector(float director) {
		this.director = director;
	}
	public String getDireeccion() {
		return direeccion;
	}
	public void setDireeccion(String direeccion) {
		this.direeccion = direeccion;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	
	//ToString
	@Override
	public String toString() {
		return "Centros [codigo=" + codigo + ", nombre=" + nombre + ", director=" + director + ", direeccion="
				+ direeccion + ", localidad=" + localidad + ", provincia=" + provincia + "]";
	}
	
	
}
