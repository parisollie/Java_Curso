/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonachi;

import java.util.Scanner;

/**
 *
 * @author IlseDaniela
 */
public class Fibonachi {
int x;
    
   
    public static void main(String[] args) {
        Fibonachi S=new Fibonachi ();
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Ingresa hasta que numero quieres que llegue la serie");
        S.x=sc.nextInt();
        S.Fibo();
    }
    public void Fibo(){
        int anterior=0,guardado,actual=1,i;
        System.out.println("La serie es: ");
        for(i=0;i<x;i++){
            System.out.print(actual+",");
            guardado=actual;
            actual=actual+anterior;
            anterior=guardado;

        }
     
    }
     
    
            
}
