//Paso 1, creamos la super clase.
public class Persona {
    
    //Paso 2, ponemos sus atributos.
    String nombre;
    int edad;
    
    //Paso 3,creamos su constructor.
    // Le pasamos los parámetros que va a heredar a la otra clase.
    public Persona(String nombre,int edad){ 
        this.nombre = nombre;
        this.edad=edad;
    }
    /*Paso 4,método ver datos, que no ha sido especificado*/
    public void verDatos(){ 
    }
}
