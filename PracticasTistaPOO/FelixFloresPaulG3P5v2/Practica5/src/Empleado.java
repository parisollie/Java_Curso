
import javax.swing.JOptionPane;

//Super clase
public class Empleado {
    //Atributos
    double salarioBase;
    String nombre,apellido,puesto;
    
    //Constructor

    public Empleado(double salarioBase, String nombre, String apellido, String puesto) {
        this.salarioBase = salarioBase;
        this.nombre = nombre;
        this.apellido = apellido;
        this.puesto = puesto;
    }
    
    public void verDatos(){
        
    }
    
}
