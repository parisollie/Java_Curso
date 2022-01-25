
import javax.swing.JOptionPane;

//Subclase
public class Optimista extends Personalidad {
    //1 es information message
    @Override
    public void hablar(){
        JOptionPane.showMessageDialog(null,"Seguro hoy "
                + "Tendre un excelente día","Qué optimista soy",1);
    }
    
}
