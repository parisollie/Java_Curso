//Super clase
/* Una clase abastracta contiene al menos un método que no ha sido especificado,
es decir ,esté será heredado para sobreescribirse.
Haciendo la clase abstracta ,para evitar que sea instanciada.
Se pone abstract*/

//Paso 1.
public abstract class Persona {
    //Atributos.
    String nombre;
    int edad;
    
    //Paso 2,creamos su constructor.
    public Persona(String nombre,int edad){ // Le pasamos los parámetros.
        this.nombre = nombre;
        this.edad=edad;
    }
    /*Paso 3, Creando al metódo abstracto.
    Si la clase es abtrastacta ,entonces no tiene cuerpo.*/
    abstract public void verDatos();
    
}