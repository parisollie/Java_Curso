//Chica 83
import javax.swing.JTextField;
import javax.swing.JFrame;
public class CamposDeTexto extends JFrame {
    
    public  CamposDeTexto (){
        
       JTextField ct = new JTextField (" Introduce algo aqui: ");
       ct.setBounds(180, 200, 150, 60);//Para agregar introduce
       add(ct);//Agregamos el campo de texto
       ct.setText("Modificar Texto");//Con esto modificamos el texto de introdu
        System.out.println("En la caja de texto dice: "+ct.getText());//Para que me averigue que ay en la caja de texto
       setSize(500,500);//Ventana
       setLayout(null);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Para que al salir se cierre la app
       setVisible(true);//aparecer ventanas
    }
    public static void main(String[] args) {
        CamposDeTexto  campos = new CamposDeTexto  ();
    }
    
}