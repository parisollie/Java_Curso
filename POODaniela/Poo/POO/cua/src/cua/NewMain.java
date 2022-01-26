//Funciona
package cua;

import java.util.Scanner;


public class NewMain {

  
    public static void main(String[] args) {
        int op,i=0,n=1;
        Cua cuate1= new Cua();
        Cua cuate2= new Cua();
        Cua cuate3= new Cua();
        Cua cuate4= new Cua();
        Cua cuate5= new Cua();
        Scanner sc = new Scanner(System.in);
        while(n==1){
             System.out.println("Ingresa la opcion deseada");
             System.out.println("1)Ingresar contacto");
             System.out.println("2)Ver contacto");
             System.out.println("3)Llamar");
             op = sc.nextInt();
            switch (op)
            {
                
                case 1:
                    System.out.println("Cual es el telefono de tu cuate 1");
                    cuate1.setTelefono(sc.nextInt());
                
                    System.out.println("Cual es el telefono de tu cuate 2");
                    cuate2.setTelefono(sc.nextInt());
              
                    System.out.println("Cual es el telefono de tu cuate 3");
                    cuate3.setTelefono(sc.nextInt());
               
                    System.out.println("Cual es el telefono de tu cuate 4");
                    cuate4.setTelefono(sc.nextInt());
                
                    System.out.println("Cual es el telefono de tu cuate 5");
                    cuate5.setTelefono(sc.nextInt());
                    i=i+1;
                    break;
                 case 2:
                    if(i>0){
                        System.out.println("A cual de tus 5 cuates buscas");
                        op = sc.nextInt();
                        switch(op){
                            
                            case 1:
                                                
                                System.out.println("Tel:"+cuate1.getTelefono());
                            break;
                            case 2:
                                System.out.println(cuate2.getTelefono()+"Tel:");
                            break;
                            case 3:
                                System.out.println(cuate3.getTelefono()+"Tel:");
                            break;
                            case 4:
                                System.out.println(cuate4.getTelefono()+"Tel:");
                            break;
                            case 5:
                                System.out.println(cuate5.getTelefono()+"Tel:");
                            break;
                        
                    }
                    
                }
                    else{
                        System.out.println("No has in gresado nada");
                    }
                 
               
            break;
            case 3:
                if(i>0){
                        System.out.println("A cual de tus 5 cuates buscas");
                        op = sc.nextInt();
                        switch(op){
                            
                            case 1:
                                                
                                System.out.println("LE ESTAS LLAMANDO AL CUATE 1: "+cuate1.getTelefono());
                            break;
                            case 2:
                                System.out.println("LE ESTAS LLAMANDO AL CUATE 2: "+cuate1.getTelefono());
                            break;
                            case 3:
                                System.out.println("LE ESTAS LLAMANDO AL CUATE 3: "+cuate1.getTelefono());
                            break;
                            case 4:
                                System.out.println("LE ESTAS LLAMANDO AL CUATE 4: "+cuate1.getTelefono());
                            break;
                            case 5:
                                System.out.println("LE ESTAS LLAMANDO AL CUATE 5: "+cuate1.getTelefono());
                            break;
                        
                    }
                        
                    
                }
                else{
                        System.out.println("No has ingresado nada");
                    }
                
            break;
    }
            
        System.out.println("Ingresa 1 si quieres regresar al menu");
        n=sc.nextInt();
        }
    
}
}
