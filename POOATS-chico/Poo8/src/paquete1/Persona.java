
//69.-Constantes se mantienen inalterables a lo largo del programa
package paquete1;

public class Persona {
    
    private final String nombre; // final  es para hacerlo constante
    private int edad;

    
    //Generamos el constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void mostarDatos(){
        System.out.println("El nombres es: "+nombre);
        System.out.println("La edad es : "+edad);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
