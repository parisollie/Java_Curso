//Super Clase
public abstract class Persona implements Inter {
    
    //Tiene un metodo abstracto
    
    public  abstract void comunicarse();
    
     static  void hablar (Inter p){ //Tiene un un argumento de tipo interface llamado p
        p.comunicarse();
    }
 
    
}