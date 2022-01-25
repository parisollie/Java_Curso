//23 Hehegar
import javax.swing.JOptionPane;

public class ErroresDeExcepciones {

    public static void main(String[] args) {
        
        //Exepciones: son problemas o errores
        //que pueden ocurrir mientras se ejecuta nuestra app
        
        int x,y,i=0;
        int vector [] = {1,4,6,3,2};
        // Para que nos diga si ocurrio algun error
        boolean errores=false; 
        
        try{
            //Código donde puede ocurrir una execpcion o un error
            //lo almacenamos en x
            x=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un número entero: ",
            "Solicitando Datos",3));
            
            y=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa otro número entero: ",
            "Solicitando Datos",3));
            
            JOptionPane.showMessageDialog(null, "La divicion de " + x + "/"+
                     y+ " es " + (x/y),"Mostrando resultado",1);
            // i<=5 Un indice en donde la posicion no existe
            //int vector [] = {1,4,6,3,2};, aqui no hay 5
            for(i=0 ; i<=5 ; i++){ 
                System.out.println("["+vector [i]+"]");
            }
         //Va el tipo de error ahí   
        }catch(NumberFormatException n){ 
            //n.printStackTrace();// Nos manda el tipo de error que ocurre
            //Le pones true si hubo un error
            errores=true;
            //Nos mandara el error que obtubvimos osea una letra
            System.out.println(n.getMessage() + " Nos es un numero entero"); 
          //Capturamos otra excepcion dentro de esta para que no dividamos entre cero 
        }catch(ArithmeticException a){
            errores=true;
            System.out.println(a.getMessage() + " No se puede dividir entre cero");
        }catch(ArrayIndexOutOfBoundsException ar){
            errores=true;
            System.out.println(ar.getMessage() + " El indice "+i+" No Existe !");
        // Puede llevar o no llevar finally
        }finally{ 
            
            if(errores ==false){
                System.out.println();
                System.out.println("Todo concluyo ok");
            }else{
                System.out.println("Todo concluyo con errores");
            }
        }        
    }
    
}
