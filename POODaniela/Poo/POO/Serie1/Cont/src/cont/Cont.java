/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cont;

import java.util.Scanner;

/**
 *
 * @author IlseDaniela
 */
public class Cont {

String contrasena;
 
public static void main(String args[]) {
        Cont  C=new Cont();
        Scanner sr=new Scanner(System.in);
        System.out.println("Ingresa la contraseña");
        C.contrasena=sr.next();
        C.Contrasena();
       
       
    }
      public void Contrasena(){
     
          if("Floffy".equals(contrasena)){
          System.out.println("La contrasena es correcta");
          }
          else{
          System.out.println("La contrasena es incorrecta");
      }
     
     
 }
    
}
