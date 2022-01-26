//SuperClase es una clase abstracta
//Es un metodo abstracto porque no tenemos la informacion de la figura gemetrica

public abstract class FigurasGeometricas {
    //Atributos
    private String nombre;
    
    //Constructor

    public FigurasGeometricas(String nombre) { // Para decir cual es el area de la figura geometrica
        this.nombre = nombre;
    }
    
    
    //Métodos abstractos
    
    public abstract double area ();
    
    @Override
    public String toString(){ // Para que me imprima cada una de las areas
        
        return "Area de  "+nombre+" :"+area();//Invoca al metodo area dependiendo de la figura geomatrica
        
    }
    
    public String dameNombre(){
        return nombre;
    }
    
}
