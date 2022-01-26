
package persona;

import java.util.Random;
import static persona.CuatesFI.sc;


public class Cuates extends Persona {
    String apodo;
    int cuenta;
    
   
    // No se donde utilizar estos metodos
    
    public void LeerLibro()
    {
     Random aleatorio = new Random(System.currentTimeMillis());
        Aleatorio = aleatorio.nextInt(3)+1;
        switch(Aleatorio)
            {
            case 1:
                System.out.println("A "+apodo+" le gusta leer Harry Potter");
            break;
            
            case 2:
                System.out.println("A "+apodo+" le gusta leer  Cien años de Soledad");
            break;
            
            case 3:
                System.out.println("A "+apodo+" le gusta leer  El principito");
            break;
        }   
    }
    
    public void hablar()
    {
          Random aleatorio = new Random(System.currentTimeMillis());
        Aleatorio = aleatorio.nextInt(3)+1;
        switch(Aleatorio)
        {
            case 1:
                System.out.println("A "+apodo+" le gusta hablar de Perros");
            break;
            
            case 2:
                System.out.println("A "+apodo+" le gusta hablar de Mujeres");
            break;
            
            case 3:
                System.out.println("A "+apodo+" le gusta hablar de Hombres");
            break;
        }   
    }
        
    
    
    public void relaciones()
    {
        Random aleatorio = new Random(System.currentTimeMillis());
        Aleatorio = aleatorio.nextInt(3)+1;
        switch(Aleatorio)
        {
            case 1:
                System.out.println(apodo+" es Soltero");
            break;
            
            case 2:
                System.out.println(apodo+" tiene Novio(a)");
            break;
            
            case 3:
                System.out.println(apodo+" es Complicado");
            break;
        }   
    }
    }

