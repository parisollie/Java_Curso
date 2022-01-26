import javax.swing.JOptionPane;

public class Materia {
	// llamar clase Estudiante
	private Estudiante E1;
	
	/**
	 *  Metodo main
	 * @param args
	 */
	public static void main(String[] args) {
		new Materia();
	}
	public Materia(Estudiante e1) {
		super();
		E1 = e1;
	}
	public Estudiante getE1() {
		return E1;
	}
	public void setE1(Estudiante e1) {
		E1 = e1;
	}
	/**
	 * Constructor
	 */
	public Materia() {
		super();
		String nombre = leerDatos("Ingrese Nombre");
		String codigo = leerDatos("Ingrese Codigo");
		double nota = Double.parseDouble(leerDatos("Ingrese Nota1"));
		double nota2 = Double.parseDouble(leerDatos("Ingrese Nota2"));
		E1 = new Estudiante(nombre, codigo, nota, nota2);
		imprimir(promediar());
	}
	public static String leerDatos(String msj) {
		String valor = JOptionPane.showInputDialog(msj);
		return valor;
	}
	public void  imprimir(double nota) {
		{
			System.out.println(E1.codigo+" : "+E1.nombre+ " nota: " +nota);
		}
	}
	public Double  promediar() {
		{
			double promedio = (E1.nota+E1.nota2)/2;
			return promedio;
		}
	}
}
