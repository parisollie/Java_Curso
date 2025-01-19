
import javax.swing.JOptionPane;

//Paso 6
public class Extrovertido extends Personalidad  {
     //El número 1 significa : information message.
    @Override
    public void hablar(){
        JOptionPane.showMessageDialog(null,"Hola, que gusto verte !"
                + "Ya te extrañaba ,no sabes que bien me ha ido....",
                "Qué extrovertido soy  hablo hasta siempre !",1);
    }
}
