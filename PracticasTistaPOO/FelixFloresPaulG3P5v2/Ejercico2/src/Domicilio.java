
import javax.swing.JOptionPane;


public class Domicilio extends Alumno{
    String domicilio;
    //Constructor
    public Domicilio(String domicilio, String nom, String apellido, int grado, String nombre) {
        super(nom, apellido, grado, nombre);
        this.domicilio = domicilio;
    }
    //Getters and setters
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getDomicilio() {
        return domicilio;
    }
    
    
    @Override // Sobreescribimos
    public void verDatos(){
        JOptionPane.showMessageDialog(null,"Domicilio del alumno : " + domicilio +"\nNombre de la materia: " +
                nom+ "\nApellido del alumno: "+ apellido + "\nGrado: "+ grado +
                "\nNombre del alumno: "+nombre," Datos del alumno",
                JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    
}
