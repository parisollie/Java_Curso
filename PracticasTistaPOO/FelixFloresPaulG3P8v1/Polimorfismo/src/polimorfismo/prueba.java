
package polimorfismo;

public class prueba {
    public static void main(String[] args) {
       
        System.out.println("***   PRIMERA PARTE   *********");
        
        Persona persona1 = new Persona();
        persona1.Saludar();
        Persona persona2 = new Empleado();
        persona2.Saludar();
        Persona persona3 = new Estudiante();
        persona3.Saludar();
        
        System.out.println("\n \n *** SEGUNDA PARTE  ********");
        
        Estudiante estudiante1 = new Estudiante();
        Empleado empleado1  = new Empleado();
        
        persona3 = empleado1;
        persona3.Saludar();
    
        System.out.println("\n \n *** TERCERA PARTE  ********");
         
        
        Persona persona4;
        persona4 = estudiante1;
        persona4.Saludar();
        persona4 = empleado1;
        persona4.Saludar();
        persona4 = persona1;
        persona4.Saludar();

        System.out.println("\n \n *** Casting entre Objetos  ********");
        //Instrucciones de casting entre objetos
        Persona persona5 = new Persona();// = estudiante1;
        
        //Estudiante estudiante2 = (Estudiante)persona5; 
        Persona estudiante2 = (Persona)persona5; 
        persona5 = estudiante2;
        persona5.Saludar();
        Persona persona6 = new Estudiante();
        
        //Estudiante estudiante3 = (Estudiante)persona6;
        Persona estudiante3 = (Estudiante)persona6;
         persona6 = estudiante3;
         persona6.Saludar();
    }
}
