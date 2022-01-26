
package Animales.granja;
import Animales.*;//importar todas las clases de personas
import javax.swing.JOptionPane;

public class Pato {
    String name,sexo;

    public Pato(String name, String sexo) {
        this.name = name;
        this.sexo = sexo;
    }

    
    public void verDatos(){
        JOptionPane.showMessageDialog(null," Nombre : " + name +"\nSexo: "
                + sexo," Datos de su pato",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
