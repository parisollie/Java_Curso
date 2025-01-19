
import javax.swing.JOptionPane;

//Paso 4
public class Pesimista extends Personalidad {
     //El número 1 significa : information message.
    @Override
    public void hablar(){
        JOptionPane.showMessageDialog(null,"Seguro hoy"
                + "Tendre un pesimo día","Qué pesimista soy",1);
    }
}
