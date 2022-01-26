/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cola;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author IlseDaniela
 */
public class Cola {
int elem;
Queue<Integer> cola = new LinkedList<>();    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        int opc,cont=1;
        Scanner sc=new Scanner(System.in);
        Cola C=new Cola();
        System.out.println("Simulador de Cola");
            C.cola.add(1);
            C.cola.add(2);
            C.cola.add(3);
            C.cola.add(4);
            C.cola.add(5);
            C.cola.add(6);
        while(cont==1)
        {            
            System.out.println(C.cola);
            System.out.println("Elije una opcion:");
            System.out.println("1) Aniadir elemento por tail");
            System.out.println("2) Ver a head");
            System.out.println("3) Eliminar elemento");
            System.out.println("4) Eliminar el elemento de head");
            

            opc=sc. nextInt();

            switch(opc)
            {
                case 1:
                    C.Agregar();
                    break;
                case 2:
                    C.MostrarH();
                    break;
                case 3:
                    C.Eliminar();
                    break;
                case 4:
                    C.EliminarH();
                    break;
                
            
            }
            System.out.println("Si desas regrresar al Menu ingresa 1.");
            System.out.println("Si desas salir ingresa otro numero");
            cont=sc.nextInt();
        }
    }
    public void Agregar(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Escribe el elemento:");
        elem=sc.nextInt();
        cola.add(elem);
    }
    public void MostrarH(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Head por element: " +cola.element());
        System.out.println("Mostrara null si la cola esta vacia.");
        System.out.println("Head por peek: " +cola.peek());
    }
    public void Eliminar(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Escribe el elemento a eliminar: ");
        elem=sc.nextInt();
        cola.remove(elem);
    }
    public void EliminarH(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Se eliminara el elemento de head");
        cola.poll();
    }
    
}
