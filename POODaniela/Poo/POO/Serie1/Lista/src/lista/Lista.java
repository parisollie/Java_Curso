/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author IlseDaniela
 */
public class Lista {
List<Integer> list = new ArrayList<>();
int pos,elem; /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc,cont=1;
        Scanner sc=new Scanner(System.in);
        Lista L=new Lista();
        System.out.println("Simulador de lista");
            L.list.add(1);
            L.list.add(2);
            L.list.add(3);
            L.list.add(4);
            L.list.add(5);
            L.list.add(6);
        while(cont==1)
        {            
            System.out.println(L.list);
            System.out.println("Elije una opcion:");
            System.out.println("1) Agregar elementos al final");
            System.out.println("2) Agregar elementos");
            System.out.println("3) Eliminar elementos ");
            System.out.println("4) Mostrar elemento");
            System.out.println("5)Mostrar un indice dando el elemento");
          
            opc=sc. nextInt();

            switch(opc)
            {
                case 1:
                    L.AgregarF();
                    break;
                case 2:
                    L.Agregar();
                    break;
                case 3:
                    L.Eliminar();
                    break;
                case 4:
                    L.Motrar();
                    break;
                case 5:
                    L.MostrarI();
                    break;
                
            
            }
            System.out.println("Si desas regrresar al Menu ingresa 1.");
            System.out.println("Si desas salir ingresa otro numero");
            cont=sc.nextInt();
        }
    }
    public void AgregarF(){
         Scanner sc=new Scanner(System.in);
         System.out.println("Escribe el elemento:");
         elem=sc.nextInt();
         list.add(elem);
         System.out.println(list);
    }
    public void Agregar(){
         Scanner sc=new Scanner(System.in);
         System.out.println("Escribe el elemento y la posicion: ");
         elem=sc.nextInt();
         pos=sc. nextInt();
         list.add(pos, elem);
         System.out.println(list);  
        
    }
    public void Eliminar(){
         Scanner sc=new Scanner(System.in);
         System.out.println("Escribe la posicion para eliminar: ");
         pos=sc. nextInt();
         list.remove(pos);
         System.out.println(list);
    }
    public void Motrar(){
         Scanner sc=new Scanner(System.in);
         System.out.println("Escribe la posicion a mostrar: ");
         pos=sc.nextInt();
         list.get(pos);
         System.out.println(list.get(pos));
    }
    public void MostrarI(){
         Scanner sc=new Scanner(System.in);
         System.out.println("Escribe el elemento para mostrar en indice: ");
         elem=sc.nextInt();
         list.indexOf(elem);
         System.out.println(list.indexOf(elem));
    }
}
