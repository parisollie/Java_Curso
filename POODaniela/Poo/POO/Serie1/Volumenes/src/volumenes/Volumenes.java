/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volumenes;

import java.util.Scanner;

/**
 *
 * @author IlseDaniela
 */
public class Volumenes {
double b,a,l,l2;
    public static void main(String[] args) {
          int opc;
          Volumenes V=new Volumenes();
          Scanner sc=new Scanner(System.in);
          System.out.println("Ingresa la opcion de la figura que deseas saber su volumen");
          System.out.println("1)Cubo");
          System.out.println("2)Esfera");
          System.out.println("3)Cilindro");
          System.out.println("4)Cono");
          System.out.println("5)Piramide");
          opc=sc.nextInt();
          switch(opc){
              case 1:
                  System.out.println("Ingresa la arista");
                  V.a=sc.nextDouble();
                  V.Cubo();
              break;
              case 2:
                  System.out.println("Ingresa el radio");
                  V.b=sc.nextDouble();
                  V.Esfera();
              break;
              case 3:
                  System.out.println("Ingresa el radio");
                  V.b=sc.nextDouble();
                  System.out.println("Ingresa la altura");
                  V.a=sc.nextDouble();
                  V.Cilindro();
              break;
              case 4:
                  System.out.println("Ingresa el radio");
                  V.b=sc.nextDouble();
                  System.out.println("Ingresa la altura");
                  V.a=sc.nextDouble();
                  V.Cono();
              break;
              case 5:
                  System.out.println("Ingresa la base");
                  V.b=sc.nextDouble();
                  System.out.println("Ingresa la altura");
                  V.a=sc.nextDouble();
                  V.Piramide();
              break;
           }
    }
    public void Cubo(){
        double V;
        V=a*a*a;
        System.out.print("El volumen es:");
        System.out.println(V);
    }
    public void Esfera(){
        double V,r;
        r=b*b*b;
        V=(4/3*(3.14*r));
        System.out.print("El volumen es:");
        System.out.println(V);
    }
    public void Cilindro(){
        double V,r;
        r=b*b;
        V=3.14*r*a;
        System.out.print("El volumen es:");
        System.out.println(V);
    }
    public void Cono(){
        double V,r;
        r=b*b;
        V=(1/3*(3.14*r*a));
        System.out.print("El volumen es:");
        System.out.println(V);
        
    }
     public void Piramide(){
        double V;
        V=(1/3*b*a);
        System.out.print("El volumen es:");
        System.out.println(V);
        
    }
}
