
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MiVentana3 extends JFrame {
    
    //Constructor
    public  MiVentana3 (){
        
        
        JLabel eti = new JLabel ("Hola");
        setSize(400,400);
        setVisible(true);
        add(eti);// Le pasamos lo que tiene JLabel
    }
}
