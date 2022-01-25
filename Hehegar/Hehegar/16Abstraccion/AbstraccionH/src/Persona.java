//Super clase
/* Una clase abastracta contiene al menos un método que no ha sido especificado,
es decir ,esté será heredado para sobreescribirse.
*/
//Haciendo la clase abstracta  para evitar que sea instanciada.
//Se pone abstract
public abstract class Persona {
    //Atributos
    String nombre;
    int edad;
    
    //Creamos sus constructores
    public Persona(String nombre,int edad){ // Le pasamos los parámetros.
        this.nombre = nombre;
        this.edad=edad;
    }
    //Creando al metodo que no ha sido abstracto
    /*
    Si la clase es abtrastacta ,entonces no tiene cuerpo.
    */
    abstract public void verDatos();
    
}