
package persona;
import java.util.Random;
import java.util.Scanner;

// Toda la clase esta completa
public class CuatesFI extends Cuates {
    String materia; 
    int semestre;
    
    static Scanner sc = new Scanner(System.in);
   
    public void tomaclase()
    {
        
        Random aleatorio = new Random(System.currentTimeMillis());
        Aleatorio = aleatorio.nextInt(3)+1;
        switch(Aleatorio)
        {
            case 1:
                System.out.println(apodo+" esta en clase de calculo");
            break;
            
            case 2:
                System.out.println(apodo+" esta en clase de algebra");
            break;
            
            case 3:
                System.out.println(apodo+" esta en clase de quimica");
            break;
        }
    }
    
    
    public void saltarclase()
    {
        Random aleatorio = new Random(System.currentTimeMillis());
        Aleatorio = aleatorio.nextInt(3)+1;
        switch(Aleatorio)
        {
            case 1:
                System.out.println(apodo+" no se presento a la clase de calculo");
            break;
            
            case 2:
                System.out.println(apodo+" no se presento a la clase de algebra");
            break;
            
            case 3:
                System.out.println(apodo+" no se presento a la clase de quimica");
            break;
        }
    }
    
    
    public void estudiar()
    {
        Random aleatorio = new Random(System.currentTimeMillis());
        Aleatorio = aleatorio.nextInt(3)+1;
        switch(Aleatorio)
        {
            case 1:
                System.out.println(apodo+" estudia algebra");
            break;
            
            case 2:
                System.out.println(apodo+" estudia POO");
            break;
            
            case 3:
                System.out.println(apodo+" estudia mecanica");
            break;
        }
    }

    
    
}