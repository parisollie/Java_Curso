
import javax.swing.JOptionPane;


public class Extrovertido extends Personalidad  {
    //1 es information message
    @Override
    public void hablar(){
        JOptionPane.showMessageDialog(null,"Hola, que gusto verte !"
                + "Ya te extrañaba ,no sabes que bien me ha ido....",
                "Qué extrovertido soy  hablo hasta siempre !",1);
    }
}
