

//68.-Encapsulamiento y métodos accesores(Getters y Setters)
/*Set = establecer
  get = obtener o mostrar
*/

package paquete1;

public class clase1 {
    
   private int edad; // Creamos un  atributo tipo entero llamado edad
   private String nombre;
   
   //Estoy estableciendo la edad que me mande el usuario
   
   //Método setter Establecemos edad
   public void setEdad(int edad){//Se llama setedad
       this.edad = edad ;
       
   } 
   
   //Método Getter mostramos la edad
   public int GetEdad(){
       return edad;
   }
   /*
   click derech insert codec insertar get and setter e inserta ambos
   */ 
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
   
    
}
