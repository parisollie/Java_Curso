
package Animales.granja;
import Animales.*;//importar todas las clases de personas
import javax.swing.JOptionPane;

public class Vaca {
    String name,sexo;

    public Vaca(String name, String sexo) {
        this.name = name;
        this.sexo = sexo;
    }

    
    public void verDatos(){
        JOptionPane.showMessageDialog(null," Nombre : " + name +"\nSexo: "
                + sexo," Datos de su vaca",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
