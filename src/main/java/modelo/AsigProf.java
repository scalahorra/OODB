package modelo;

public class AsigProf {

	public float codigo;
	public String asignatura;
	public String profesor;
	
	
	//Constructores
	public AsigProf() {
		super();
	}
	public AsigProf(float codigo, String asignatura, String profesor) {
		super();
		this.codigo = codigo;
		this.asignatura = asignatura;
		this.profesor = profesor;
	}
	
	
	//Getter Setter
	public float getCodigo() {
		return codigo;
	}
	public void setCodigo(float codigo) {
		this.codigo = codigo;
	}
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	public String getProfesor() {
		return profesor;
	}
	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
	
	
	//ToString
	@Override
	public String toString() {
		return "AsigProf [codigo=" + codigo + ", asignatura=" + asignatura + ", profesor=" + profesor + "]";
	}
	
	
}
