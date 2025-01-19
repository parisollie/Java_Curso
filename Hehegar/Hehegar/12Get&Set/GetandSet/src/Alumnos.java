
public class Alumnos {

    //Paso 1, Atributos.
    int noControl;
    String nombre,apellidos;
   
    //Paso 2, creamos el constructor.
    Alumnos(int nC,String nom,String ape){
        //Inicializando los atributos
        
        //otraforma
        this.noControl=nC;
        this.nombre=nom;
        this.apellidos=ape;
        
    }
    //Paso 3, ponemos los metódos.
    void verDatos(){
        System.out.println("No. Control "+ noControl);
        System.out.println("Nombre: "+ nombre);
        System.out.println("Apellidos: "+ apellidos);
        System.out.println("----------------------");
    }
    /*Paso 4, Creando los metódos get and set.
     -Obtengo el numero de control.
     -Los get retornan. */
    
    int getControl(){ 
        return this.noControl;
    }
    //Para obtener el nombre.
    String getNombre(){
        return this.nombre;
    }
    String getApellido(){
        return this.apellidos;
    }
    
    //Creando sets ,casi no deuelven nada, por eso son void.
    //Recibe parámetros.
    void setControl(int NC){
        //Estamos asignando.
        this.noControl=NC;
        
    }
    void setControl(String NOM){
        this.nombre=NOM;
    }
    void setApelldos(String AP){
        this.apellidos =AP;           
    }
    
}
