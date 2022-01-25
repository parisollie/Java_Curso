
public class Alumnos {
    //Atributos
    int noControl;
    String nombre,apellidos;
    //Creando metodo constructor ,construye e inicializa los atributos de la clase
    //Recibiendo los parametros
    //Si mi clase se llama Alumnos asi se llama mi constructor
    //Siempre van en orden los parametros
    Alumnos(int nC,String nom,String ape){
        //Inicializando los atributos
        /*
        noControl =nC;
        nombre = nom;
        apellidos = ape;
        */
        
        //otraforma
        this.noControl=nC;
        this.nombre=nom;
        this.apellidos=ape;
        
    }
    //Metodos
    void verDatos(){
        System.out.println("No. Control "+ noControl);
        System.out.println("Nombre: "+ nombre);
        System.out.println("Apellidos: "+ apellidos);
    }
    
}
