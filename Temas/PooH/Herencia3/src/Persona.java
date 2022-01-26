
import javax.swing.JOptionPane;


public class Persona {
    
    //Atributos
    private String nombre;
    private int edad;
    
    //Métodos
    
    public void IntroduceDatos(){
        nombre = JOptionPane.showInputDialog("Introduce el nombre: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad: "));//Cambiamos de string a int
    }
    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null, "El nombre es: "+nombre);
        JOptionPane.showMessageDialog(null, "La edad es: "+edad);
    }
}
