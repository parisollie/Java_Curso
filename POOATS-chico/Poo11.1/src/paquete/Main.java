
package paquete;

import java.util.Scanner;

/**
 *
 * @author andro
 */
public class Main {
     public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        char movimiento;
        int ejeX = 0;
        int ejeY = 0;
        
        System.out.print("| W | -----Utilizas las teclas para desplazarte-----\n" + "|ASD| -----------Presiona |X| para salir------------\n" + "Tecla: ");
        movimiento = entrada.nextLine().charAt(0);
        
        while(movimiento != 'x'){
            switch(movimiento){
                case 'W': 
                case 'w':{
                    ejeY++;
                    Movimiento.setEjeY(ejeY);
                    break;
                }
                case 'S':
                case 's':{
                    ejeY--;
                    Movimiento.setEjeY(ejeY);
                    break;
                }
                case 'A':
                case 'a':{
                    ejeX--;
                    Movimiento.setEjeX(ejeX);
                    break;
                }
                case 'D':
                case 'd':{
                    ejeX++;
                    Movimiento.setEjeX(ejeX);
                    break;
                }
            }
            
            System.out.println("Coordenadas (" + Movimiento.getEjeX() + "," + Movimiento.getEjeY() + ")");
            System.out.println("");
            
            System.out.print("| W | -----Utilizas las teclas para desplazarte-----\n" + "|ASD| -----------Presiona |X| para salir------------\n" + "Tecla: ");
            movimiento = entrada.nextLine().charAt(0);
        }
    }
    
}
