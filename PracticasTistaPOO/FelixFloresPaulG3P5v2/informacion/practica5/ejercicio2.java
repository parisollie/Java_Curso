/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

/**
 *
 * @author Edgar
 */
public class ejercicio2{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Alumno alu1=new Alumno("juan","perez",31,"falsa",123,"siempreviva");
            Asignatura materia1 = new Asignatura("eda2",1323,"15:00-17:00",6);
            alu1.addMateria(materia1);
            Asignatura materia2 = new Asignatura("poo",1317,"11:00-13:00",6);
            alu1.addMateria(materia2);
            //System.out.println(materia1.toString());
          System.out.println(alu1.toString());
            for(Asignatura actual : alu1.materias){
                System.out.println("Nombre Asignatura:  "+actual.nombre);
                System.out.println("Clave: "+actual.clave);
                System.out.println("Horario  "+actual.Horario);
            }
    }

}
