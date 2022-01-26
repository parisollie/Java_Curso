
package Automoviles.lujo;

import Automoviles.*;//importar todas las clases de personas
import javax.swing.JOptionPane;
public class Mercedes {
    String color;
    int modelo;

    public Mercedes(String color, int modelo) {
        this.color = color;
        this.modelo = modelo;
    }

    public void verDatos(){
        JOptionPane.showMessageDialog(null,"Color : " + color +"\nModelo: "
                + modelo," Datos de su mercedes",JOptionPane.INFORMATION_MESSAGE);
    }
}
