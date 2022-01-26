
import javax.swing.JFrame;



//Esta clase esta  obligada a implementar todos los métodos que tiene la clase Iterface1
public class ClaseOperaciones extends JFrame implements Interface1,Interface3 {
    
    @Override
    public void multiplicar(){
        System.out.println("Multipliando");
    }
    
    @Override
    public void dividir (){
        System.out.println("Dividiento");
    }
    
    
    @Override
     public void sumar(){
        System.out.println("Sumar");
    }
    
    @Override
    public void restar(){
        System.out.println("Rstar");
    }
}
