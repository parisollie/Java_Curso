
package ClasesYObjetos;

/**
 *
 * @author andro
 */
public class Persona {
    //Creamos atributos de la clase persona
    String nombre;
    int edad;
    String dni;
    
    //Métodos
    //Sobrecarga de constructores cuando hay mas de  constructor
    public Persona(String nombre, int edad) { // Los metodos constructores se ponen de manera publica y no se ponen valores de retorno
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String dni) {
        this.dni = dni;
    }
    
    public void correr (){
        System.out.println("Soy "+nombre+", tengo "+edad+" Corro la maraton");
    }
    public void correr (int km){ // se diferencian en que le ponemos a este parametro o el tipo de parametros
        System.out.println("He corrido: "+km+" kilometros");
    }
    /*
    Java no diferencia los métodos por lo que retorne return
    sino por sobrecarga de metodos, el diferente tipo de datos.
    */
    
    
}
