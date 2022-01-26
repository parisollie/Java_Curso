package Ejercicio4;

public class Consumidor implements Runnable
{
    private final Contenedor contenedor;
    private final int idconsumidor;
 
    public Consumidor(Contenedor contenedor, int idconsumidor) 
    {
        this.contenedor = contenedor; //En el constructor se reciben y asignan los datos recibidos,
        this.idconsumidor = idconsumidor; //Estos datos son el contenedor sincronizado para todos y solo una id para diferenciar empresas
    }
 
    public void run() 
    {
        while(Boolean.TRUE)
        {
            System.out.println("La empresa #" + idconsumidor + " compra " + contenedor.get() + " vegetales.");
            //Los hilos al tener la misma prioridad son elegidos al azar entre ellos, por lo que las empresas cambian constantemente entre
            //cual y cual se piensa usar para la compra de verduras
        }
    }
}