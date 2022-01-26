
import java.util.Scanner;


//Realizar una mascota virtual
public class MascotaVirtual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int opcion = 0;
        do{
            opcion = opcionesInicio();
            
            if(opcion == 1){
                //Crear una mascota nueva
                System.out.println("");
                System.out.println("Ingrese el nombre de la mascota");
                String nombre = sc.next();
                MasVir mascota = new MasVir(nombre);//Le pasamos el nombre que ingresamos
                
                do{
                   opcion = opcionesMascotas();
                   if(opcion ==1){
                       System.out.println("Info");
                       System.out.println(mascota.getEstado());
                   }
                   if(opcion ==2){
                       System.out.println("Alimentar");
                       int alimento = opcionesAlimento();
                       System.out.println("Alimentando...");
                       System.out.println(mascota.alimentar(alimento));
                   }
                   if(opcion ==3){
                       System.out.println("Ejercitar");
                       int ejercicio = opcionesEjercicio();
                       System.out.println("Ejercitando...");
                       System.out.println(mascota.alimentar(ejercicio));
                   }
                   if(opcion ==4){
                       System.out.println("Estudiar");
                       
                       System.out.println(mascota.estudiar());
                   }
                }while(opcion !=0 && opcion !=9 && mascota.estaVivo()); // si la mscota no este vive no estare en el loop
                
                System.out.println(mascota.getEstado());
            }
            
        }while(opcion !=0);
            
    }
    
    public static int opcionesInicio(){
        Scanner sc = new Scanner (System.in);
        System.out.println("");
        System.out.println("Ingrese opciones: ");
        System.out.println("[1] Crear una Mascota Nueva");
        System.out.println("[0] Salir\n");
        return sc.nextInt(); // Retorno el valor del menu
    }
    
    public static int opcionesMascotas(){
        Scanner sc = new Scanner (System.in);
        System.out.println("");
        System.out.println("Ingrese opciones: ");
        System.out.println("[1] Mostar Estado");
        System.out.println("[2] Alimentar");
        System.out.println("[3] Ejercitar");
        System.out.println("[4] Estudiar");
        System.out.println("[9] Resetear Mascota\n");
        System.out.println("[0] Salir\n");
        
        return sc.nextInt(); // Retorno el valor del menu
    }
    public static int opcionesAlimento(){
        
        int opcion =0;
        Scanner sc = new Scanner (System.in);
        System.out.println("");
        do{
            System.out.println("Ingrese opciones: ");
            System.out.println("[1] Pan");
            System.out.println("[2] Fideos");
            System.out.println("[3] Mc Donald");
            opcion = sc.nextInt(); //Mientras no se eso  me quedare ahi
        }while(opcion < 1 || opcion >3);
        return opcion;
    }
    
    public static int opcionesEjercicio(){
        
        int opcion =0;
        Scanner sc = new Scanner (System.in);
        System.out.println("");
        do{
            System.out.println("Ingrese opciones: ");
            System.out.println("[1] Caminar");
            System.out.println("[2] Trotar");
            System.out.println("[3] Perseguir auto");
            opcion = sc.nextInt(); //Mientras no se eso  me quedare ahi
        }while(opcion < 1 || opcion >3);
        return opcion;
    }
    
}
