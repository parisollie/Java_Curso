//Subclase
public class Empleado extends Persona{

    public Empleado() {
        
        super("Teresa");//aúnque no la pongamos ,está estara añadida y le ponemos el argumento para que no mande error
        /*Marca error,porque super() no tiene el argumento de invocar al constructor
        de la clase superior(Persona) lo hace sin ese argumento String
         */
        System.out.println("Constructor de la clase Empleado");
        
    }
    
    /*Al cear el objeto,se ejecuta el constructor de la clase Empleado,pero 
    este tiene la palabra clave super()en la primera línea ,y por eso, antes de ejecutarse la 
    linea del constructor empleado ,se eejecuta el constructor de la clase superior
    (persona).
   
    */
    
    
}
