
package persona;

import java.util.Random;
import java.util.Scanner;

// En alguno casos no utilizo por completo los atributos de cada clase, solo alguno

public class PrinCuates {
    static Scanner sc = new Scanner(System.in);
    
   
    public static void main(String[] args) { 
       int selec;
       System.out.println("Crear un objeto (cuate nuevo) de la clase...");
       
        System.out.println("1.- Cuates casa \n2.- Cuates FI");
       selec = sc.nextInt();
       switch(selec)
       {
           case 1: 
               CuateCasa();
           break;
           
           case 2:
               CuateFI();
           break;
           
           default:
               System.out.println("No existe esa opción");
           break;
       }
       
       
       
       
        
       
    }
    
    
    /* En el objeto de la clase CuatesCasa solamente utilice los atributos 
        nombre, apellido, delegación, numero de casa */
    static void CuateCasa()
    {
       
       int opc,Aleatorio;
       CuatesCasa c1 = new CuatesCasa();
       System.out.println("Nombre de tu cuate: ");
       c1.nombre = sc.next();
       System.out.println("Su apellido: ");
       c1.apellido = sc.next();
       System.out.println("Su edad: ");
       c1.edad = sc.nextInt();
       System.out.println("Delegación de tu cuate: ");
       c1.delegación = sc.next();
       System.out.println("Numero de casa: ");
       c1.numCasa = sc.nextInt();
       System.out.println("Quieres saber sobre tu cuate? ingresa 1 si no ingresa otro numero ");
       opc = sc.nextInt();
       if (opc==1)
       {
        Random aleatorio = new Random(System.currentTimeMillis());
        Aleatorio = aleatorio.nextInt(3)+1;
        switch(Aleatorio)
            {
                 case 1:
                     
                     c1.gustos();
                     c1.golpear();
                     c1.pensar();
                     c1.cocinar();
                     break;
                 case 2:
                     c1.gustos();
                     c1.golpear();
                     c1.pensar();
                     c1.peli();
                     break;
                 case 3:
                     c1.gustos();
                     c1.golpear();
                     c1.pensar();
                     c1.music();
                     break;
          }
       }
     
    }
    
    /* En el cuate de la clase CuatesFI solamente utilice nombre, apellido, semestre y materia */
    static void CuateFI()
    {
        int opc,Aleatorio;
        CuatesFI c2 = new CuatesFI();
        System.out.println("Nombre de tu cuate: ");
        c2.nombre = sc.next();
        System.out.println("Apodo: ");
        c2.apodo = sc.next();
        System.out.println("Semestre de tu cuate: ");
        c2.semestre = sc.nextInt();
        System.out.println("Materia favorita: ");
        c2.materia = sc.next();
        System.out.println("Quieres saber sobre tu cuate? ingresa 1 si no ingresa otro numero ");
        opc = sc.nextInt();
        if(opc==1){
            Random aleatorio = new Random(System.currentTimeMillis());
            Aleatorio = aleatorio.nextInt(3)+1;
            switch(Aleatorio)
           {
                case 1:
                    c2.LeerLibro();
                    c2.hablar();
                    c2.relaciones();
                    c2.tomaclase();
                break;
                case 2:
                    c2.LeerLibro();
                    c2.hablar();
                    c2.relaciones();
                    c2.saltarclase();
                break;
                case 3:
                    c2.LeerLibro();
                    c2.hablar();
                    c2.relaciones();
                    c2.estudiar();
                break;
           }
            
        }
         
        
    }
    
}
