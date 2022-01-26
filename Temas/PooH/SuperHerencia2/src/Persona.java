
public class Persona {
    
    //Atributos
    
    private String nombre,apellidos;
    private int edad;

    //Constructor
    
    public Persona(String no, String ape, int ed) {
        this.nombre = no;
        this.apellidos = ape;
        this.edad = ed;
        System.out.println("Se ejecuta el constructor de persona");
        System.out.println("El nombre es: "+nombre);
        System.out.println("Los appellido son: "+apellidos);
        System.out.println("La edad es: "+edad);
    }

    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
