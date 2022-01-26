/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primo;

import java.util.Scanner;

/**
 *
 * @author IlseDaniela
 */
public class Primo {
int x;
     public static void main(String args[]){
         Primo P=new Primo ();
         Scanner sc=new Scanner(System.in);
        
         System.out.println("Ingresa un numero para saber si es primo");
         P.x=sc.nextInt();
         P.Prim();
     
     }
     public void Prim(){
         int n=0,i;
         for(i=1;i<=x;i++){
             if(x%i==0){
                 n=n+1;
             }
         }
         if(n==2){
             System.out.println("Es primo");
         }
         else
             System.out.println("No es primo");
     }
}
