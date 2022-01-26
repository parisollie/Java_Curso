
package paquete1;

public class clase2 {
    
    public static void main (String[] args){
        
        clase1 objeto1 = new clase1();
        objeto1.setEdad(10);
        System.out.println("La edad es: "+objeto1.GetEdad());
        
        objeto1.setNombre("Paul");
        System.out.println("El nombre es: "+objeto1.getNombre());
    }
    
}
