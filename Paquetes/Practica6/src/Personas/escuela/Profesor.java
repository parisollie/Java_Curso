
package Personas.escuela;
import Personas.*;//importar todas las clases de personas
import javax.swing.JOptionPane;


public class Profesor {
    String nombre;
    int edad;

    public Profesor(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


        public void verDatos(){
        JOptionPane.showMessageDialog(null,"Nombre del profesor: " + nombre +"\nEdad: "
                + edad," Datos del profesor",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
