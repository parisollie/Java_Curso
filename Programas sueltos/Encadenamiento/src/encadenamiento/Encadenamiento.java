
package encadenamiento;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author andro
 */
public class Encadenamiento {
    LinkedList<LinkedList<Integer>> lista;
    static Scanner sc = new Scanner(System.in);
    
    /**
     * Crea la instancia del objeto e inicializa la lista de listas.
     */
    Encadenamiento(){
        lista = new LinkedList<LinkedList<Integer>>();
        for(int i = 0; i < 15; i++)
            lista.add(new LinkedList<Integer>());
    }
    
    /**
     * Genera un número aleatorio entre 0 y 15.
     * @return 
     */
    public static int randomNumber(){
        return (int)( Math.round(Math.random() * 15));
    }
    
    /**
     * Agrega el elemento a la lista en el índice correspondiente.
     * @param x
     * @param list 
     */
    public static void addElement(int x, LinkedList<LinkedList<Integer>> list){
        int pos = randomNumber();
        list.get(pos).add(x);
        System.out.println("El elemento se agrego en : " + pos);
    }
    
    /**
     * Imprime la lista.
     * @param list 
     */
    public static void printList(LinkedList<LinkedList<Integer>> list){
        System.out.println("Estado actual de la lista : ");
        for(int v = 0; v < 15 ; v++){
            System.out.println("Posicion " + v);            
            for(Integer n: list.get(v))
                System.out.print(n+", " );
            System.out.println("");
        }
        
    }
    
    /**
     * Imprime el menú de opciones.
     */
    public static void showMenu(){
        System.out.println("Elija una opcion: ");
        System.out.println("\t1)Agregar un elemento");
        System.out.println("\t2)Salir");
    }
    
    /**
     * Evalua la opcion elegida por el usuario.
     * @param x 
     */
    public void chooseOption(int x){
        if(x == 1){
            System.out.println("Ingrese el elemento que desee ingresar: ");
            int a = sc.nextInt();
            addElement(a,lista);
            printList(lista);
        }
        else if(x==2)
            System.out.println("Regresando al menu anterior...");
        else
            System.out.println("Opcion invalida");
    }

    
    public static void main(String[] args) {
         int r;
        Encadenamiento func = new Encadenamiento();
        do{
            showMenu();
            r = sc.nextInt();
            func.chooseOption(r);
        }while(r!=2);
    }
    
}




  