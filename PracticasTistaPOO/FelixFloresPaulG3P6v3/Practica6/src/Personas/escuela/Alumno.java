
package Personas.escuela;
import Personas.*;//importar todas las clases de personas


import javax.swing.JOptionPane;

public class Alumno  {
   
    String nombre;
    int edad;

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


        public void verDatos(){
        JOptionPane.showMessageDialog(null,"Nombre del alumno: " + nombre +"\nEdad: "
                + edad," Datos del alumno",JOptionPane.INFORMATION_MESSAGE);
    }
}
