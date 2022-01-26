/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chicharronero;

import java.util.Scanner;

/**
 *
 * @author IlseDaniela
 */
public class Chicharronero {
double a,b,c,d;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Chicharronero C=new Chicharronero();
        Scanner sc = new Scanner(System.in);
        
        int opc;
        System.out.println("Ingresa la opcon que desas: ");
        System.out.println("1) Ecuacion de 2o. Grado");
        System.out.println("2) Ecuacion de 3er. Grado");
        opc = sc.nextInt();
        switch(opc)
        {
            case 1:
                System.out.println("Ingresa los valores de:");
                System.out.println("ax^2: ");
                C.a = sc.nextDouble();
                System.out.println("bx: ");
                C.b = sc.nextDouble();
                System.out.println("c: ");
                C.c = sc.nextDouble();
                C.segundo();
            break;
            
            case 2:
                System.out.println("Ingresa los valores de:");
                System.out.println("ax^3: ");
                C.a = sc.nextDouble();
                System.out.println("bx^2: ");
                C.b = sc.nextDouble();
                System.out.println("cx: ");
                C.c = sc.nextDouble();
                System.out.println("d: ");
                C.d = sc.nextDouble();
                C.tercer();
            break;
        }
    }
    
    
    public void segundo()
    {
        double w = (b*b)-4*a*c;
        double m = Math.pow(w,0.5);
        System.out.println(w);
        if(a != 0 && w > 0)
        {   
            double x1 = (-b+m)/(2*a);
            double x2 = (-b-m)/(2*a);
            System.out.println("Raiz: x1= "+x1);
            System.out.println("Raiz: x2= "+x2);
        }
        else
            if(a != 0 && w < 0)
            {
                double e = Math.abs(w);
                double i = (Math.pow(e,0.5))/(2*a);
                double x1 = -b/(2*a);
                System.out.println("Raiz: x1= "+x1+" + "+i+"i");
                System.out.println("Raiz: x2= "+x1+" - "+i+"i");
                 
            }
    }
    
    public void tercer()
    {
        double m = -(b/3*a);
        double n = (Math.pow(2,0.3))*(-(Math.pow(-b, 2))+(3*a*c));
        double q = -(2*(b*b*b))+(9*a*b*c)-(27*(a*a)*d);
        double r = 4*Math.pow(-(b*b)+3*(a*c),3)+(-2*(b*b*b)+9*a*b*c-27*(a*a)*d);
        double x1 =(n/3*a*Math.pow(q+Math.pow(r,0.5),0.3))-m+(-2*(b*b*b)+9*a*b*c-27*(a*a)*d+Math.pow(r,0.3));
    }
    
}
