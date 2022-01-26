/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author IlseDaniela
 */
public class Pila {
Stack pila = new Stack();
int elem;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc,cont=1;
        Scanner sc=new Scanner(System.in);
        Pila P=new Pila();
        
            P.pila.push(1);
            P.pila.push(2);
            P.pila.push(3);
            P.pila.push(4);
            P.pila.push(5);
            P.pila.push(6);
        while(cont==1)
        {
            System.out.println(P.pila);
            System.out.println("Escoge una opcion:");
            System.out.println("1) Agregar elemento");
            System.out.println("2) Eliminar elemento");
            System.out.println("3) Buscar elemento");
            System.out.println("4) Mostrar primer elemento");
       

            opc=sc. nextInt();

            switch(opc)
            {
                case 1:
                    P.Agregar();
                    break;
                case 2:
                    P.Eliminar();
                    
                    break;
                case 3:
                    P.Buscar();
                    break;
                case 4:
                    P.Buscar();
                    break;
                         
            }
            System.out.println("Si desas regrresar al Menu ingresa 1");
            System.out.println("Si desas salir ingresa otro numero");
            cont=sc.nextInt();
        }
    }
    public void Agregar()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Escribe el elemento:");
        elem=sc.nextInt();
        pila.push(elem);
    }
    public void Eliminar()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("El ultimo elemento en la pila sera eliminado");
        if(pila.empty()==false){
        pila.pop();
        }
        else
        System.out.println("La pila esta vacia.");
    }
    public void Buscar()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Escribe el elemento a buscar: ");
        elem=sc.nextInt();
        System.out.println("Esta en la posicion: "+pila.search(elem));
    }
    public void Mostrar()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Primer elemento: ");
        System.out.println("+pila.peek()");
    }
    
}
