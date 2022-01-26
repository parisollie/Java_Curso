
//61
package ClasesYObjetos;

/**
 *
 * @author andro
 */
public class Coche { //mi clase pertenece a mi paquete Clases y objetos
    
    //Creamos atributos de mi clase "Coche"
    String color;
    String marca;
    int km;
    
    //Creamos este metodo
    public static void main(String[] args){
        
        Coche coche1 = new Coche();// new es un comando para crear objetos en java
        // El coche1 tiene todos los atribut0s que tiene la marca (Coche)
        
       //LLenamos los atributos
       coche1.color = "Turquesa";
       coche1.km = 34;
       coche1.marca= " Minie copper ";
       
        System.out.println("El color del coche1 es: "+coche1.color);
        System.out.println("La marca del coch1 es: "+coche1.marca);
        System.out.println("El km del coche1 es: "+coche1.km);
        // Nos marcara error al principio de ejecutar ,lo guardamos y lo ejecutamos y le damos aceptar al cuadro y compilara
        
        Coche coche2 = new Coche();
        
        coche2.color = "Rojo";
        coche2.km = 0;
        coche2.marca= " WBW ";
        
        System.out.println("\nEl color del coche2 es: "+coche2.color);
        System.out.println("La marca del coche2 es: "+coche2.marca);
        System.out.println("El km del coche2 es: "+coche2.km);
        
    }
    
    
    
}
