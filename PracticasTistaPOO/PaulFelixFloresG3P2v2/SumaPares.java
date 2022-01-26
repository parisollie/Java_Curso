
import java.util.Scanner;



/**
 *
 * @author andro
 */
public class SumaPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion devariables
        int n1 ,n2;
        int suma = 0;
        int mayor ,menor;
        Scanner sc = new Scanner (System.in);
        //Pedir datos al usuario
        System.out.println("Por favor introduzca un numero entero");
        n1 = sc.nextInt();
        System.out.println("Por favor introduzca otro numero entero");
        n2 = sc.nextInt();
        //Validar cual numero es mayor y menor
        if (n1 > n2){
            mayor = n1;
            menor = n2;
            
        }else{
            mayor = n2;
            menor = n1;
            
        }
        for(int i = menor ;i <= mayor ;i++){
            //validar si para sumarlo
            if(i%2 == 0){
                suma+=i;
            }
        }
        //Imprimir resultado
        System.out.println("La suma de los pares entre "+n1+" y "+n2+" es "+ suma);
        sc.close();
        
    }
    
}
