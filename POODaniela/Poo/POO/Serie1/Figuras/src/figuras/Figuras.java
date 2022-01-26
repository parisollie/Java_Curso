/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import java.util.Scanner;

/**
 *
 * @author IlseDaniela
 */
public class Figuras {
double b,a,l,l2;
    public static void main(String[] args) {
          int opc;
          Figuras F=new Figuras();
          Scanner sc=new Scanner(System.in);
          System.out.println("Ingresa la opcion de la figura que deseas saber su area y perimetro");
          System.out.println("1)Cuadrado");
          System.out.println("2)Rectangulo");
          System.out.println("3)Triangulo");
          System.out.println("4)Circunferencia");
          opc=sc.nextInt();
          switch(opc){
              case 1:
                  System.out.println("Ingresa el lado");
                  F.l=sc.nextDouble();
                  F.Cuadrado();
              break;
              case 2:
                  System.out.println("Ingresa la base");
                  F.b=sc.nextDouble();
                  System.out.println("Ingresa la altura");
                  F.a=sc.nextDouble();
                  F.Rectangulo();
              break;
              case 3:
                  System.out.println("Ingresa el lado");
                  F.l=sc.nextDouble();
                  System.out.println("Ingresa el lado");
                  F.l2=sc.nextDouble();
                  System.out.println("Ingresa la base");
                  F.b=sc.nextDouble();
                  System.out.println("Ingresa la altura");
                  F.a=sc.nextDouble();
                  F.Triangulo();
              break;
              case 4:
                  System.out.println("Ingresa el diametro");
                  F.b=sc.nextDouble();
                  F.Circulo();
              break;
           }
    }
    public void Cuadrado(){
        double A,P;
        A=l*l;
        P=l*4;
        System.out.print("El area es:");
        System.out.println(A);
        System.out.print("El perimetro es:");
        System.out.println(P);
    }
    public void Rectangulo(){
        double A,P;
        A=b+a;
        P=(2*b)+(2*a);
        System.out.print("El area es:");
        System.out.println(A);
        System.out.print("El perimetro es:");
        System.out.println(P);
    }
    public void Triangulo(){
        double A,P;
        A=(b*a)/2;
        P=b+l+l2;
        System.out.print("El area es:");
        System.out.println(A);
        System.out.print("El perimetro es:");
        System.out.println(P);
    }
    public void Circulo(){
        double A,P,Pi=3.1416,r;
        r=b/2;
        A=Pi*(r*r);
        P=Pi*b;
        System.out.print("El area es:");
        System.out.println(A);
        System.out.print("El perimetro es:");
        System.out.println(P);
        
    }
}
