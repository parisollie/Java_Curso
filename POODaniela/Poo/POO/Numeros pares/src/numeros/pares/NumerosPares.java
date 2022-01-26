/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros.pares;
import java.util.Scanner;
/**
 *
 * @author IlseDaniela
 */
public class NumerosPares {
     double x;
     

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NumerosPares N=new NumerosPares();
        Scanner sc=new Scanner(System.in);
    
        System.out.println("Dame un numero:");
        N.x=sc.nextDouble();
        N.pares();
        // TODO code application logic here
    }
     public void pares(){
        int i,j,s=0,m=0;
        if(x%2!=0){
           
            for(i=(int) (x-1);i>0;i--){
                m=m*i;
            }
             System.out.println("La multiplicacion de los numeros anteriores es"+m);
        }
        else{
            for(i=(int) (x-1);i>0;i--){
                s=s+i;
            }
            System.out.println("La suma de los numeros anteriores es"+s);
        }
        }
}
