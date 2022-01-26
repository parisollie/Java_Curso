public class Estudiante {
	 String nombre;
	 String codigo;
	 Double nota;
	 Double nota2;
	 
	 
	 public Estudiante(String nombre, String codigo, Double nota, Double nota2) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.nota = nota;
		this.nota2 = nota2;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Double getNota() {
		return nota;
	}
	public void setNota(Double nota) {
		this.nota = nota;
	}
	public Double getNota2() {
		return nota2;
	}
	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}
	
}