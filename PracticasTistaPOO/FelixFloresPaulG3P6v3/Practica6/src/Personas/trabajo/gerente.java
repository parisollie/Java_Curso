
package Personas.trabajo;
import Personas.*;//importar todas las clases de personas
import javax.swing.JOptionPane;
public class gerente {
    String nombre;
    int edad;

    public gerente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


        public void verDatos(){
        JOptionPane.showMessageDialog(null,"Nombre del gerente: " + nombre +"\nEdad: "
                + edad," Datos del gerente",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
