package Ejercicio4;

public class Contenedor {
    private int contenido;
    private boolean contenedorlleno = Boolean.FALSE;
 
    public synchronized int get() //Al agregar synchronized, solo puede ser accesado por un hilo a la vez.
    {
        while (!contenedorlleno) //Se repite mientras el contenedor tiene algo, ya que se obtiene algo (Gracias al return)
        {   			//Se espera en un ciclo while para que los hilos tengan tiempo de hacer operaciones
            try
            {
                wait();
            } 
            catch (InterruptedException e) 
            {
                System.err.println("Contenedor: Error en get -> " + e.getMessage());
            }
        }
        contenedorlleno = Boolean.FALSE; //Se cambia el contenedor para que ahora este vacio
        notify();
        return contenido; //Se regresa el valor del contenido
    }
 
    public synchronized void put(int value) //Solo puede ser accesado por un hilo a la vez por el syncrhonized
    {
        while (contenedorlleno) //Se repite mientras el contenedor este vacio, ya que se coloca algo
        {
            try
            {
                wait();
            } 
            catch (InterruptedException e) 
            {
                System.err.println("Contenedor: Error en put -> " + e.getMessage());
            }
        }
        contenido = value; //Se le asigna el valor del metodo en la variable "value"
        contenedorlleno = Boolean.TRUE; //Se cambia el contenedor para que ahora este lleno
        notify();
    }
}