
import javax.swing.JOptionPane;


public class Analsta extends Informatico{
    
    /*Utilizando polimorfismo overload (sorecarga)
    Paso 3,Le estoy sobrecargando métodos con argumentos,sin embargo aqui le 
    meto incentivos*/
    
    public void sueldo(int horas,double pagoH,double incen){
         JOptionPane.showMessageDialog(null, "El pago es: "+((horas*pagoH)
                 + incen));
    }
    
    public void verdatos(String nom, String ape,String dir){
         
         JOptionPane.showMessageDialog(null, "Nombre: "+nom+"\nApellidos: "
                 +ape+"\nDireccion: "+dir);
        
    }
    
    public void labores(String lab,int horas){
        JOptionPane.showMessageDialog(null, "Soy analista y me dedico a: "+
                lab+"\nHoras: "+horas);
    }
}
