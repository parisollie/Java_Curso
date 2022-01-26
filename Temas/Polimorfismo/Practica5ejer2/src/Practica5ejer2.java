
public class Practica5ejer2 {

   
    public static void main(String[] args) {

        Alumno alu1 = new Alumno("juan", "perez", 31, "falsa", 123, "siempreviva");
        Asignatura materia1 = new Asignatura("eda2", 1323, "15:00-17:00", 6);
        alu1.addMateria(materia1);
        
        Asignatura materia2 = new Asignatura("poo", 1317, "11:00-13:00", 6);
        alu1.addMateria(materia2);
        //System.out.println(materia1.toString());
        System.out.println(alu1.toString());
        for (Asignatura actual : alu1.materias) {
            System.out.println("Nombre Asignatura:  " + actual.nombre);
            System.out.println("Clave: " + actual.clave);
            System.out.println("Horario  " + actual.Horario);
        }
    }

}

