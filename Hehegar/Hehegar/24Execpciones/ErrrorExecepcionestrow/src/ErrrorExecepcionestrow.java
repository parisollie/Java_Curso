
//24 Hehegar excepciones throw.
import javax.swing.JOptionPane;

public class ErrrorExecepcionestrow {

    public static void main(String[] args) {
        
        //Ponemos nuestras variables.
        int x,y;
        
        try {
            x=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un número entero: ",
            "Solicitando Datos",3));
            
            y=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa otro número entero: ",
            "Solicitando Datos",3));
            
            //Manejando excepciones mediante throw.
            if(y==0){
                /*Creando una exception de tipo throw
                 Lanza una execption*/
                throw new ArithmeticException("Error en Y = "+y); 
            }else{
                JOptionPane.showMessageDialog(null, "La divicion de " + x + "/"+
                     y+ " es " + (x/y),"Mostrando resultado",1);
            }
            
        }catch ( ArithmeticException ar){
            System.out.println(ar.getMessage () + " ,No se puede dividir entre cero");
        }catch ( Exception e){ 
            /*Generalizando las excepciones ,cuando no sepas que excepción ocurrira
            Por ejemplo ,le pongo una letra me mandará solo error y no el porque
            sucedio esta*/
            System.out.println(e.getMessage () +"Error");
        }
    }
    
}
