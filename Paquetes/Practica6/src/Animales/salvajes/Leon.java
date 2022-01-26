
package Animales.salvajes;

import javax.swing.JOptionPane;


public class Leon {
    String name,sexo;

    public Leon(String name, String sexo) {
        this.name = name;
        this.sexo = sexo;
    }

    
    public void verDatos(){
        JOptionPane.showMessageDialog(null," Nombre : " + name +"\nSexo: "
                + sexo," Datos de su gato",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
