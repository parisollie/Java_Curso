
import javax.swing.JOptionPane;

//Superclase
public class Alumno extends Asignatura {
    //Atributos
    
    String nom,apellido;
    int grado;

    public Alumno(String nom, String apellido, int grado, String nombre) {
        super(nombre);
        this.nom = nom;
        this.apellido = apellido;
        this.grado = grado;
    }
    
    
    

    
}
