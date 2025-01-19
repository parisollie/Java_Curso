
import javax.swing.JOptionPane;

//paso 5
public class Introvertido extends Personalidad {
     //El número 1 significa : information message.
    @Override
    public void hablar(){
        JOptionPane.showMessageDialog(null,"Hola"
                ,"Soy Intovertido",1);
    }
    
}
