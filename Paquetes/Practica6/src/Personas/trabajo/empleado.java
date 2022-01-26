
package Personas.trabajo;
import Personas.*;//importar todas las clases de personas
import javax.swing.JOptionPane;
public class empleado {
    String nombre;
    int edad;

    public empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


        public void verDatos(){
        JOptionPane.showMessageDialog(null,"Nombre del empleado: " + nombre +"\nEdad: "
                + edad," Datos del empleado",JOptionPane.INFORMATION_MESSAGE);
    }
}
