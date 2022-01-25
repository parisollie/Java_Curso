
import javax.swing.JOptionPane;


public class Pesimista extends Personalidad {
    //1 es information message
    @Override
    public void hablar(){
        JOptionPane.showMessageDialog(null,"Seguro hoy"
                + "Tendre un pesimo día","Qué pesimista soy",1);
    }
}
