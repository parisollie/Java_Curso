
import javax.swing.JOptionPane;


public class Programador extends Informatico{
    //Utilizando polimorfismo overload (sobrecarga)
    
     //Paso 2, le estoy sobrecargando métodos con argumentos
     public void sueldo(int horas,double pagoH){
         //PagoH=Pagohoras
         JOptionPane.showMessageDialog(null, "El pago es: "+(horas*pagoH));
    }
     
    public void verdatos(String nom, String ape){
         
         JOptionPane.showMessageDialog(null, "Nombre: "+nom+"\nApellidos: "+ape);       
    }
    
    public void labores(String lab){
        JOptionPane.showMessageDialog(null, "Soy Programador y me dedico a:  "+lab);
    }
    
}
