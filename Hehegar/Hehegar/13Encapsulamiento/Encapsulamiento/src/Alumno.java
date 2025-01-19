
public class Alumno {
    
    //Paso 1, ponemos los atributos
    
    /*Tipo de atributo privado,para encapsular se pone private.*/
    private int noControl;
    private String email;
    public String nombre,apellidos;
    
    //Paso 2, creando los metódos Get and Set para acceder a los atributos de tipo private.
    void setNoControl(int NC){
        this.noControl=NC;
    }
    /*
    Retornara el No de control ,alla arriba en setControl lo va asignar 
    cuando quieran acceder a mis atributos privados 
    y aqui abajo cuando lo quieran obtener se los datos*/
    int getNoControl(){ 
        return noControl;
    }
    
    void setEmail(String EM){
        this.email=EM;
    }
    String getEmil(){
        return email;
    }
    //Paso 3,creando el método para mostrar los datos.
    
    void verDatos(){
        System.out.println("No. de control: "+noControl);
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellidos: "+apellidos);
        System.out.println("Email: "+email);
    }
    
}
