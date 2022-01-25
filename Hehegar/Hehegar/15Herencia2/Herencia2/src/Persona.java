//Super clase
public class Persona {
    
    //Atributos
    String nombre;
    int edad;
    
    //Creamos sus constructores
    // Le pasamos los parámetros que va a heredar la otra clase
    public Persona(String nombre,int edad){ 
        this.nombre = nombre;
        this.edad=edad;
    }
    //Método ver datos
    //Método que no ha sido especificado
    public void verDatos(){ 
    }
}
