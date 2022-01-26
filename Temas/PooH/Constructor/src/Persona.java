
//Superclase
public class Persona {

    public Persona(String nombre) {
        
        super();//Super se encuentra ahi,un costructor llama a otro constructor con la palabra super.
        //los constructores no se heredan en jerarquía de clase.
        System.out.println("Constructor de la clase persona");
        System.out.println("Me llamo: "+ nombre); // Nos agrega lo que tiene Empleado
    }
    
    
    
}
