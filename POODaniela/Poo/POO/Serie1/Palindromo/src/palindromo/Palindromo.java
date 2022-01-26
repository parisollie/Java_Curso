/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;

import java.util.Scanner;

/**
 *
 * @author IlseDaniela
 */
public class Palindromo {
String palabra, palabrav="";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Palindromo P=new Palindromo();
       Scanner sc=new Scanner(System.in);
       System.out.println("Escribe una palabra o una frase sin espacios");
       P.palabra=sc.nextLine();
       P.Pal();
       
    }
    public void Pal(){
        for(int i=palabra.length()-1;i>=0;i--){
          palabrav+=palabra.charAt(i);
       }
       if(palabra.equals(palabrav)){
           System.out.println("Es palindromo");
       }
       else
            System.out.println("No es palindromo");
        
    }
    
}
