
import javax.swing.JOptionPane;


public class Ejercico2 {

    
    public static void main(String[] args) {
        String nommat,ape,nom,puesto,dom;  //3 questionmessage
        int grado;
        
        Domicilio alu1 = new Domicilio("La estacion","Matemáticas","Moreno",1,"Diana");
        alu1.verDatos();
        alu1.setNombre("Historia");
        alu1.setDomicilio("Zaragoza");
        
        
        Domicilio alu2 = new Domicilio("La guayaba","Literatura","Felix",2,"Ivan");
        alu2.verDatos();
        alu2.setNombre("Espanol");
        alu2.setDomicilio("Montes");
        
        System.out.println("Obteniendo materia adicional del alumno 2..."+alu2.getNombre());
        System.out.println("Obteniendo el domicilio adicional del alumno 2..."+alu2.getDomicilio());
        
        
         
        Domicilio alu3 = new Domicilio("El tamarindo","Filosofia","Flores",3,"Paul");
        alu3.verDatos();
        alu3.setNombre("Computacion");
        alu3.setDomicilio("Pedregal");
        
        System.out.println("Obteniendo materia adicional del alumno 3..."+alu3.getNombre());
        System.out.println("Obteniendo el domicilio adicional del alumno 3..."+alu3.getDomicilio());
    }
    
}
