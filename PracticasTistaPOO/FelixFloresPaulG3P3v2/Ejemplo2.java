
import java.util.ArrayList;


public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Integer> arreglo = new ArrayList<Integer>(); // Creamos un objeto de la clase ArraList (enteros)
        arreglo.add(1); // añadimos numeros
        arreglo.add(8);
        arreglo.add(5);
        arreglo.add(1,9);
        System.out.println("Tamaño del array list "+ arreglo.size()); // no dara el tamaño del arreglo
        System.out.println("Elemento en la posicion 3: "+ arreglo.get(3));
        for(Integer elemento: arreglo){
            System.out.println(elemento);
        }
    }
    
}
