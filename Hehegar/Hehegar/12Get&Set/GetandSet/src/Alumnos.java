
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
    //Creando los metodos get and set
    //Obtengo el numero de control
    //Los get retornan 
    int getControl(){ 
        return this.noControl;
    }
    //Para obtener el nombre
    String getNombre(){
        return this.nombre;
    }
    String getApellido(){
        return this.apellidos;
    }
    
    //Creando sets ,casi no deuelven nada
    //Recibe parametros
    void setControl(int NC){
        //Estamos asignando
        this.noControl=NC;
        
    }
    void setControl(String NOM){
        //Estamos asignando
        this.nombre=NOM;
    }
    void setApelldos(String AP){
        this.apellidos =AP;           
    }
    
}
