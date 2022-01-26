
package paquete;

import java.util.Scanner;

/**
 *
 * @author andro
 */
public class Movimiento {
    Scanner lectura = new Scanner(System.in);
    //atributos
    private int posicion;

    //constructores
    public Movimiento(int posicion) {

        this.posicion = posicion;

    }

    //metodos
    public void continuar(int posicion) {

        int contador = 0, centinela = -1;

        while (centinela != posicion) {

            System.out.print("Ingrese la posicion: (-1 para terminar):");
            posicion = lectura.nextInt();
            contador++;

            switch (posicion) {
                case 8:
                    System.out.println("Arriba\n");
                    break;
                case 5:
                    System.out.println("Abajo\n");
                    break;
                case 4:
                    System.out.println("izquierda\n");
                    break;
                case 6:
                    System.out.println("Derecha\n");
                    break;
                default:
                   // System.out.println("No se a donde moverme!!");
                    break;
            }
            
            
        }

    }

    public int salir(int posicion) {
        System.out.println("Gracias por jugar");
        return 0;
    }


    
}
