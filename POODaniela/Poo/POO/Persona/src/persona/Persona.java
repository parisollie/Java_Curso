
package persona;

import java.util.Random;


public class Persona {
    String nombre;
    String apellido;
    int Aleatorio;
    int edad; // Me falta utilizar este atributo
     
    // No se puedo utilizar estos metodos
    
    public void gustos()
    {
        Random aleatorio = new Random(System.currentTimeMillis());
        Aleatorio = aleatorio.nextInt(3)+1;
        switch(Aleatorio)
        {
            case 1:
                System.out.println(nombre+" "+apellido+" le gusta ir al cine");
            break;
            
            case 2:
                 System.out.println(nombre+" "+apellido+" le gusta comer");
            break;
            
            case 3:
                 System.out.println(nombre+" "+apellido+" le gusta comer");
            break;
        }
        
    }
    
    public void pensar()
    {
        Random aleatorio = new Random(System.currentTimeMillis());
        Aleatorio = aleatorio.nextInt(3)+1;
        switch(Aleatorio)
        {
            case 1:
                System.out.println(nombre+" "+apellido+" piensa en su futuro");
            break;
            
            case 2:
                 System.out.println(nombre+" "+apellido+" piensa en lo que hara maniana");
            break;
            
            case 3:
                 System.out.println(nombre+" "+apellido+" piensa en su amor");
            break;
        }
        
    }
    
    public void golpear()
    {
        Random aleatorio = new Random(System.currentTimeMillis());
        Aleatorio = aleatorio.nextInt(3)+1;
        switch(Aleatorio)
        {
            case 1:
                System.out.println(nombre+" "+apellido+" es violento");
            break;
            
            case 2:
                 System.out.println(nombre+" "+apellido+" no es violento");
            break;
            
            case 3:
                 System.out.println(nombre+" "+apellido+" le gusta ser golpeado");
            break;
        }
        
    }
    
   
    
}
