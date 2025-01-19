
public class Alumnos {
    //Paso 1,ponemos atributos.
    int noControl;
    String nombre,apellidos;
    
    /*Paso 2,creando metódo constructor ,construye e inicializa los atributos de la clase
    Recibiendo los parámetros.
    -Si mi clase se llama "Alumnos" así se llama mi constructor.
   - Siempre van en orden los parámetros*/
    Alumnos(int nC,String nom,String ape){
        //Inicializando los atributos
        /*
        noControl =nC;
        nombre = nom;
        apellidos = ape;
        */
        
        //otra forma de hacer el constructor.
        
        this.noControl=nC;
        this.nombre=nom;
        this.apellidos=ape;
        
    }
    //Paso 3, ponemos los metoódos.
    void verDatos(){
        System.out.println("No. Control "+ noControl);
        System.out.println("Nombre: "+ nombre);
        System.out.println("Apellidos: "+ apellidos);
        System.out.println("----------------------------");
    }
    
}
