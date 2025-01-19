
import javax.swing.JOptionPane;


public class AdministradorBD extends Informatico{
    
    /*Paso 4, Utilizando polimorfismo overload (sobrecarga)
    Le estoy sobrecargando métodos con argumentos*/
     public void sueldo(double pago){
         JOptionPane.showMessageDialog(null, "El pago es: "+pago);
    }
     
    public void verdatos(String nom){
         
         JOptionPane.showMessageDialog(null, "Nombre: "+nom);        
    }
    
    public void labores(String lab){
        JOptionPane.showMessageDialog(null, "Soy admistrador BD y me dedico a programar ");
    }
    
}
