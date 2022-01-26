/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;

import java.util.Scanner;

/**
 *
 * @author IlseDaniela
 */
public class Suma {
  double x,y;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Suma S=new Suma();
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Dame un numero:");
    S.x=sc.nextDouble();
    
    System.out.println("Dame otro numero:");
    S.y=sc.nextDouble();
    System.out.println("La suma es"+(S.x+S.y));
        // TODO code application logic here
    }
    

}
