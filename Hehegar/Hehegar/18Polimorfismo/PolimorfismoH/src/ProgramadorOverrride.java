
import javax.swing.JOptionPane;

//Polimorfismo override ,responde multiples formas a lo que yo reutilice
public class ProgramadorOverrride extends InformaticosOverride {
    // Necesito sobreescribir eso a fuerzas
    @Override 
    public void sueldo(double pago){
       JOptionPane.showMessageDialog(null, "El pago del programador es:$ "+pago); 
    }
    @Override
    public void verdatos(String nom){
        JOptionPane.showMessageDialog(null, "El nombre del programador es: "+nom); 
    }
    
    @Override
    public void labores(String labor){
        JOptionPane.showMessageDialog(null, "Las labores del programador son: "+labor); 
        
    }
}
        
    

