
package Practicaseis;


import Personas.escuela.Alumno;
import Personas.escuela.Profesor;
import Automoviles.compacto.Chevy;
import Automoviles.lujo.Audi;
import Automoviles.lujo.Mercedes;
import Personas.trabajo.empleado;
import Personas.trabajo.gerente;
import Animales.casa.Gato;
import Animales.casa.Perro;
import Animales.granja.Vaca;
import Animales.granja.Pato;

public class Practicasix {
     public static void main(String[] args) {
         //Creando la instancias de las clases
         
        Alumno alu1 = new Alumno("Juan Perez ",23);
        alu1.verDatos();
        Gato mas = new Gato("Detox ","Hembra");
        mas.verDatos();
        Chevy car1 = new Chevy("Rojo ",1);
        car1.verDatos();
        
        
        
        Profesor pro2 = new Profesor("Andrew ",30);
        pro2.verDatos();
        Perro mas1 = new Perro("Chencha ","hembra");
        mas1.verDatos();
        Chevy car2 = new Chevy("Azul ",2);
        car2.verDatos();
        
        empleado pro3 = new empleado("Nick ",30);
        pro3.verDatos();
        Pato mas2 = new Pato("yellow ","hembra");
        mas2.verDatos();
        Audi car3 = new Audi("turquesa ",3);
        car3.verDatos();
        
        gerente pro4 = new gerente("Oliver ",30);
        pro4.verDatos();
        Vaca mas3 = new Vaca("Gamora ","hembra");
        mas3.verDatos();
        Mercedes car4 = new Mercedes("verde ",3);
        car4.verDatos();
        
        
        
        
    }
    
}
