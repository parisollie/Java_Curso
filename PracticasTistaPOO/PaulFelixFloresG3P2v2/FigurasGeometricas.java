
import java.util.Scanner;



/**
 *
 * @author andro
 */
public class FigurasGeometricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float area;
        int opcion;
        final float PI =3.1416f;
        Scanner sc = new Scanner (System.in);
        do{
            System.out.println("Elige la opcion");
            System.out.println("1.-Area del circulo");
            System.out.println("2.-Area del triangulo");
            System.out.println("3.-Area del cuadrado");
            System.out.println("4.-Salir");
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                    //circulo
                    System.out.println("Seleccionó círculo");
                    float radio = 15;
                    area = PI * radio*radio;
                    break;
                case 2:
                    //Triángulo
                    System.out.println("Selecciono Triángulo");
                    float base = 8 ,altura =5;
                    area = (base* altura)/2;
                    break;
                case 3:
                    //Cuadrado
                    System.out.println("Selecciono cuadrado");
                    float lado = 10;
                    area =lado *lado;
                    break;
                case 4 :
                    //Salir
                     System.out.println("Hasta luego !");
                     continue;
                default :
                    // ninguno de los anteriores
                    System.out.println("Su eleccion no es correcta");
                    continue;
             
            }
            System.out.println("El area es: "+area);
            
        }while(opcion !=4);
        sc.close();
        
    }
    
}
