
import javax.swing.JOptionPane;


public class Introvertido extends Personalidad {
    //1 es information message
    @Override
    public void hablar(){
        JOptionPane.showMessageDialog(null,"Hola"
                ,"Soy Intovertido",1);
    }
    
}
