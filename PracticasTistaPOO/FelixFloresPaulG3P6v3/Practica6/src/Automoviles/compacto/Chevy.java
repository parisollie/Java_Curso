
package Automoviles.compacto;
import Automoviles.*;
import javax.swing.JOptionPane;
public class Chevy {
    String color;
    int modelo;

    public Chevy(String color, int modelo) {
        this.color = color;
        this.modelo = modelo;
    }

    public void verDatos(){
        JOptionPane.showMessageDialog(null,"Color : " + color +"\nModelo: "
                + modelo," Datos de su chevy",JOptionPane.INFORMATION_MESSAGE);
    }
}
