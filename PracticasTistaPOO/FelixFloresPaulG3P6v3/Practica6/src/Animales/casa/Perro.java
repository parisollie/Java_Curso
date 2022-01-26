
package Animales.casa;

import Animales.*;//importar todas las clases de personas
import javax.swing.JOptionPane;
public class Perro {
    String name,sexo;

    public Perro(String name, String sexo) {
        this.name = name;
        this.sexo = sexo;
    }

    
    public void verDatos(){
        JOptionPane.showMessageDialog(null," Nombre : " + name +"\nSexo: "
                + sexo," Datos de su perro",JOptionPane.INFORMATION_MESSAGE);
    }
}