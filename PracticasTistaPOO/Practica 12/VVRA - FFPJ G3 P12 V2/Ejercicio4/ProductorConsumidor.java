package Ejercicio4;

public class ProductorConsumidor 
{
	//Variables estaticas para el contenedor, el productor y los consumidores, ya que siempre seran los mismos
    private static Contenedor contenedor; 
    private static Thread productor;
    private static Thread [] consumidores;
    private static final int CANTIDADCONSUMIDORES = 5; //Aca se coloca el numero de hilos de consumidores (Empresas) que se piensan usar.
     
    public static void main(String[] args) 
    {
        contenedor = new Contenedor(); //Se inicializa el constructor del contenedor
        productor = new Thread(new Granjero(contenedor, 1)); //Se crea un hilo de productor, solo 1 granjero sincronizado con el contenedor.
        consumidores = new Thread[CANTIDADCONSUMIDORES]; //Se crea una cantidad de hilos de consumidores (Empresas) que se piensan usar
 
        for(int i=0; i<CANTIDADCONSUMIDORES; i++){
            consumidores[i] = new Thread(new Consumidor(contenedor, i)); //Aca se crean y empiezan los hilos equivalentes a los consumidores
            consumidores[i].start();									//Tales consumidores estan sincronizados con el mismo contenedor
        }
         
        productor.start(); //Empieza el productor granjero en su método de "run"
    }    
}