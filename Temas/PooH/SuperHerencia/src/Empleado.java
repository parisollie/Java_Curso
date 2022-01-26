//Super clase
public class Empleado {
    
    //Atributos
    private String nombre;
    private double sueldo;
    
    //Constructor

    public Empleado(String nom, double sue) {
        this.nombre = nom;
        this.sueldo = sue;
        System.out.println("El nombre del cocinero es: "+nombre);
        System.out.println("El sueldo es : "+sueldo);
    }
    
    
    
}
