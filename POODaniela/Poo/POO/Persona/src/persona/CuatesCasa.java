
package persona;

import java.util.Random;
import java.util.Scanner;


public class CuatesCasa extends Cuates {
    String delegación;
    int numCasa;
    static Scanner sc = new Scanner(System.in);
    
    
    public void cocinar()
    {
       
        Random aleatorio = new Random(System.currentTimeMillis());
        Aleatorio = aleatorio.nextInt(3)+1;
        switch(Aleatorio)
        {
            case 1:
                System.out.println(nombre+" "+apellido+" esta cocinando una rica sopa");
            break;
            
            case 2:
                 System.out.println(nombre+" "+apellido+" esta cocinando unas ricas enchiladas");
            break;
            
            case 3:
                 System.out.println(nombre+" "+apellido+" esta cocinando unos ricos tacos");
            break;
        }
    }
    
    public void peli()
    {
        Random aleatorio = new Random(System.currentTimeMillis());
        Aleatorio = aleatorio.nextInt(3)+1;
        switch(Aleatorio)
        {
            case 1:
                System.out.println(nombre+" "+apellido+" esta viendo una pelicula de terror");
            break;
            
            case 2:
                System.out.println(nombre+" "+apellido+" esta viendo una pelicula de Acción");
            break;
            
            case 3:
                System.out.println(nombre+" "+apellido+" esta viendo una pelicula romantica");
            break;
               
        }
    }
    
    public void music()
    {
        Random aleatorio = new Random(System.currentTimeMillis());
        Aleatorio = aleatorio.nextInt(3)+1;
        switch(Aleatorio)
        {
            case 1:
                System.out.println(nombre+" "+apellido+" esta escuchando Rock");
            break;
            
            case 2:
                System.out.println(nombre+" "+apellido+" esta escuchando Perreo intenso");
            break;
            
            case 3:
                System.out.println(nombre+" "+apellido+" esta escuchando Pop");
            break;
               
        }
    }
}
