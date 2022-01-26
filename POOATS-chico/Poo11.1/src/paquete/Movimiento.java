/*
Ejercicio 2: Construir un programa que permita dirigir el movimiento
de un objeto dentro de un tablero y actualice su posicion dentro del mismo
Los movimientos posibles son ARRIBA,ABAJO,IZQUIERDA y DERECHA.
Tras cada movimiento el programa mostrará a nueva dirección elegida y las coordeadas
de situacion del objeto del tablero.
 */
package paquete;

/**
 *
 * @author andro
 */
public class Movimiento {
     //Atributos
    private static int ejeY;
    private static int ejeX;
    
    //Metodos

    public static void setEjeY(int ejeY) {
        Movimiento.ejeY = ejeY;
    }

    public static void setEjeX(int ejeX) {
        Movimiento.ejeX = ejeX;
    }

    public static int getEjeY() {
        return ejeY;
    }

    public static int getEjeX() {
        return ejeX;
    }
}


    

