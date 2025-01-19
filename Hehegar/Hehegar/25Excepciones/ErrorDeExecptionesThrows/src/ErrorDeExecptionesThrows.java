//25 Hehegar excepciones throw con métodos.
import javax.swing.JOptionPane;

public class ErrorDeExecptionesThrows {
    // para no nos marque error
    static int x,y; 

    public static void main(String[] args) {
        try {
            sumar();
            dividir(5,0);
            
        } catch (ArithmeticException a) {
            System.out.println(a.getMessage());
        }catch(NumberFormatException n){
            System.out.println(n.getMessage());
        }    
    }
    
    //Método para sumar
    public static void sumar ()throws NumberFormatException{
        x = Integer.parseInt(JOptionPane.showInputDialog
        (null,"Ingresa x: ","Solicitando Datos",3));
        y = Integer.parseInt(JOptionPane.showInputDialog
        (null,"Ingresa y: ","Solicitando Datos",3));
        
        JOptionPane.showMessageDialog(null, "El resultado de "
                + x +"+"+ y +" ,es: "+(x+y),"Mostrando Resultado",1);
    }
    
    //Método para dividir
    public static void dividir (int x ,int y)throws NumberFormatException{
        //Manejo excepciones mediante throw
        // No se puede dividir entre cero
        if(y==0){
            // Lanzamos una nueva excepcion de tipo throw
            throw new ArithmeticException("Error, no se puede dividir entre cero");     
        }else
            JOptionPane.showMessageDialog(null, "La divición de " + x + "/" +y+
                    " ,es: "+ (x/y),"Mostrando resultado",1);
    }
    
}
