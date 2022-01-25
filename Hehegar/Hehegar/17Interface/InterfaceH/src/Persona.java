//Super clase
/* Una clase abastracta contiene al menos un método que no ha sido especificado,
es decir ,este sera heredado para sobreescribirse
*/
//Haciendo la clase abstracta  para evtar que sea instanciada
public abstract class Persona {
    //Atributos
    
    String nombre;
    int edad;
    
    //Creamos sus constructores
    public Persona(String nombre,int edad){ // Le pasamos los parametros
        this.nombre = nombre;
        this.edad=edad;
    }
    //Creando al metodo que no ha sido abstracto
    abstract public void verDatos();
    }