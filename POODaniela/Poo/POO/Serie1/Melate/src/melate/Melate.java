/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package melate;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author IlseDaniela
 */
public class Melate {

    int Al1,Al2,Al3,Al4,Al5,Al6,p;
    int[] arreglo=new int[30];
    public static void main(String[] args) {
        int opc,n,p;
        Melate M=new Melate();
        Scanner sr=new Scanner(System.in);
        System.out.println("Ingresa cuantas de las 5 casillas de la boleta vas a llenar");
        n=sr.nextInt();
        if(n<=5){
            M.p=n*6;
            for (int i=0; i<M.p;i++){
                System.out.println("Ingresa el "+(i+1)+" numero");
                M.arreglo[i]=sr.nextInt();
            }
            M.Mela();
        }
    }      

        
    public void Mela(){
        Random aleatorio = new Random(System.currentTimeMillis());
        int[] arr=new int[6];
        int sum;
        sum=0;
        Al1 = aleatorio.nextInt(10)+1;
        arr[0]=Al1;
        Al2 = aleatorio.nextInt(20)+1;
        arr[1]=Al2;
        Al3 = aleatorio.nextInt(30)+1;
        arr[2]=Al3;
        Al4 = aleatorio.nextInt(40)+1;
        arr[3]=Al4;
        Al5 = aleatorio.nextInt(50)+1;
        arr[4]=Al5;
        Al6 = aleatorio.nextInt(56)+1;
        arr[5]=Al6;
        
        for (int i=0; i<p;i++){
            
            if(arr[0]==arreglo[i]){
                sum=sum+1;
                
            } 
            else{
                if(arr[1]==arreglo[i]){
                    sum=sum+1;
                
            }
                else{
                if(arr[2]==arreglo[i]){
                    sum=sum+1;
                
            }
                else{
                if(arr[3]==arreglo[i]){
                    sum=sum+1;
                
            }
                else{
                if(arr[4]==arreglo[i]){
                    sum=sum+1;
                
            }
                else{
                if(arr[5]==arreglo[i]){
                    sum=sum+1;
                
            }
            }
            }
            }
            }
            }
           
       
        }
        System.out.println("Le atinaste a " +sum+" de "+p+" numeros que escogiste");
        if(sum==6){
            System.out.println("Ganaste el primer lugar");
        }
        else{
            if(sum==5){
            System.out.println("Ganaste el segundo lugar");
            }
            else{
                if(sum==4){
                    System.out.println("Ganaste el tercer lugar");
            }
                else{
                    if(sum==3){
                         System.out.println("Ganaste el cuarto lugar");
                    } 
                    else{
                        if(sum==2){
                            System.out.println("Ganaste el quinto lugar");
                        }
                        else{
                            
                            System.out.println("Ganaste el sexto lugar");
                       }
                    }
               }
           }
        }
        
        System.out.println("Estos fueron los numeros ganadores");
        for (int i=0; i<6;i++){
            System.out.println(arr[i]);
                          
            }    
        
          for (int i=0; i<p;i++){
              System.out.println("Estos fueron tus numeros");
              System.out.println(arreglo[i]);
                          
            } 
        }
        
    
}
