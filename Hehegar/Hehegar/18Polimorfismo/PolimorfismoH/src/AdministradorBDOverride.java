
import javax.swing.JOptionPane;

//Paso 7,Heradamos de informáticos.
public class AdministradorBDOverride extends InformaticosOverride {
    
   
    @Override
     // No le podemos poner otro parámetro ,porque la clase principal no lo tiene
    public void sueldo(double pago){
       JOptionPane.showMessageDialog(null, "El pago del administrador es:$ "+pago); 
    }
    
    @Override
    public void verdatos(String nom){
        JOptionPane.showMessageDialog(null, "El nombre del administrador es: "+nom); 
    }
    
    @Override
    public void labores(String labor){
        JOptionPane.showMessageDialog(null, "Las labores del administrador son: "+labor); 
        
    }
}
