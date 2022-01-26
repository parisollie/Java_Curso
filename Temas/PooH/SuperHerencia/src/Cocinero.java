
//Relacion "es un" Un cocinero es un empleado
public class Cocinero extends Empleado {

   
     //Atributo propio del cocinero
    private String tipoCocina;
    //Constructor
    
     public Cocinero(String nom, double sue,String tc) { // aqui es d´donde copia a donaji
        super(nom, sue);
        /* La palabra super necesita argumentos de la clase empleado. 
        Para invocar al constructor de la clase empleado*/
        
        //Después de ejecutarse de la clase cocinero este invoca al constructor de la clase empleado y despues el suyo
        tipoCocina = tc;
         System.out.println("El tipo de coina es:  "+tipoCocina);
    }
    
}
