//37 chica
public class Herencia1 {

    public static void main(String[] args) {
        
        Alumno alu1 = new Alumno();
        alu1.nombre = "Aban";
        alu1.edad = 25;
        alu1.comer();
        alu1.dormir();
        
        
        Empleado em1 = new Empleado();
        em1.nombre="Ciro";//Eso fue heredado
        em1.edad=18;////Eso fue heredado
        em1.comer();
        em1.dormir();
        
    }
    
}
