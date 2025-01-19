
import javax.swing.JOptionPane;

//Paso 3,Subclase
public class Optimista extends Personalidad {
    //El número 1 significa : information message.
    @Override
    public void hablar(){
        JOptionPane.showMessageDialog(null,"Seguro hoy "
                + "Tendre un excelente día","Qué optimista soy",1);
    }
    
}
