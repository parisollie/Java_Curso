
package Animales.salvajes;

import Animales.*;//importar todas las clases de personas
import javax.swing.JOptionPane;
public class Jaguar {
    String name,sexo;

    public Jaguar(String name, String sexo) {
        this.name = name;
        this.sexo = sexo;
    }

    
    public void verDatos(){
        JOptionPane.showMessageDialog(null," Nombre : " + name +"\nSexo: "
                + sexo," Datos de su gato",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
