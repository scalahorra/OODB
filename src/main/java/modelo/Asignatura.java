package modelo;

public class Asignatura {

	public float codigo;
	public String nombre;
	
	
	//Constructores
	public Asignatura() {
		super();
	}
	
	public Asignatura(float codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
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

	
	//ToString
	@Override
	public String toString() {
		return "Asignaturas [codigo=" + codigo + ", nombre=" + nombre + "]";
	}
	
	
}
