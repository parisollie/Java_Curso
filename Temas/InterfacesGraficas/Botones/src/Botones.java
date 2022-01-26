//83 chica
import javax.swing.JFrame;
import javax.swing.JButton;

public class Botones extends JFrame {
    public Botones (){
        JButton boton = new JButton ("Da click");
        //Coordenadas del boton y el ancho
        boton.setBounds(200, 150, 160, 80);// 
        add(boton);//Agreamos al boton
        setSize(500,500);//Tamaño al frame
        setLayout(null);
        setVisible(true);//aparecer ventanas
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Para que al salir se cierre la app
    }

   
    public static void main(String[] args) {
        Botones btn = new Botones ();
    }
    
}
