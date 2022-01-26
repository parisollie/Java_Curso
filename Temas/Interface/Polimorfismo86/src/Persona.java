//Super Clase
public abstract class Persona {
    
    //Tiene un metodo abstracto
    
    public  abstract void comunicarse();
    
    static void hablar(Persona p){
        p.comunicarse();    // como es un método estático necesitamos a la clase persona para invocar al método hablar    
    }
    
}
