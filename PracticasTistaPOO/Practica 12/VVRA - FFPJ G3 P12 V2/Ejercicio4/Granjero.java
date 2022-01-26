package Ejercicio4;

import java.util.Random;

public class Granjero implements Runnable
{
    private final Random aleatorio;
    private final Contenedor contenedor;
    private final int idproductor;
    private final int TIEMPOESPERA = 2000; //Se esperan 2 segundos entre cada operacion para que los hilos tengan tiempo de actuar
 
    public Granjero(Contenedor contenedor, int idproductor) //Constructor que recibe una variable de contenedor y una variable entera
    {
        this.contenedor = contenedor; //Se asignan los valores de los atributos que fueron recibidos
        this.idproductor = idproductor;
        aleatorio = new Random(); //Se usa el valor de Random para crear un valor al azar
    }
 
    public void run() 
    {
        while(Boolean.TRUE)
        {
            int poner = aleatorio.nextInt(50); //Se crea un numero al azar de productos creados por el granjero
            contenedor.put(poner); //Tales productos se colocan en el contenedor que esta sincronizado
            System.out.println("El granjero #" + idproductor + " exporta " + poner + " verduras.");
            try
            {
                Thread.sleep(TIEMPOESPERA); //Se espera para que los hilos puedan actuar sin problema
            } 
            catch (InterruptedException e) 
            {
                System.err.println("Productor " + idproductor + ": Error en run -> " + e.getMessage());
            }
        }
    }
}