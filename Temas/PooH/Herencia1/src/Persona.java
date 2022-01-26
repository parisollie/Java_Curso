
//Relación es un  todo alumno es una persona ,pero no toda persona es un alumno.
//Osea que si declaramos un objeto persona no podra accceder a los atributos de los alumnos.

public class Persona {
    
    //Atributos
    
    public String nombre;
    public int edad;
    
    //Métodos
    public void comer (){
        System.out.println("Método de la clase persona");
        System.out.println("Comiendo.");
    }
    public void dormir(){
        System.out.println("Método de la clase persona");
        System.out.println("Durmiendo...zzz");
    }
    
}
