
import javax.swing.JOptionPane;


public class AnalistaOverride extends InformaticosOverride{
    //Solo se pueden usar los paramaetros que fueron hechos en la clase abtrasta
    //Esa es la diferencia
     @Override
    public void sueldo(double pago){
       JOptionPane.showMessageDialog(null, "El pago del analista es:$ "+pago); 
    }
    @Override
    public void verdatos(String nom){
        JOptionPane.showMessageDialog(null, "El nombre del analista es: "+nom); 
    }
    
    @Override
    public void labores(String labor){
        JOptionPane.showMessageDialog(null, "Las labores del analista son: "+labor); 
        
    }
    
}
