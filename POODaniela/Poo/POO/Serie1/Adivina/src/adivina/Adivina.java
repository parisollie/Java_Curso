/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivina;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author IlseDaniela
 */
public class Adivina {
 int Aleatorio;
    public static void main(String[] args) {
        Adivina A=new Adivina();
        Random aleatorio = new Random(System.currentTimeMillis());
        A.Aleatorio = aleatorio.nextInt(10)+1;
        A.Adiv();
   }
    public void Adiv(){
        int x;
        Scanner sr=new Scanner(System.in);
        System.out.println("Adivina el numero que estoy pensando del 1 al 10");
        x=sr.nextInt();
        if(x==Aleatorio){
            System.out.println("Adivinaste el numero");
        }        
        else{
            System.out.print("Perdiste era el numero ");
            System.out.println(Aleatorio);
        }
        
    }
}
