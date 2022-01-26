package Ejercicio1;

public class MiHilo2 implements Runnable{

	Thread hilo;
	
    MiHilo2(String nombre){
         hilo= new Thread(this,nombre);
    }
    
    public static MiHilo2 crearYComenzar (String nombre){
         MiHilo2 miHilo=new MiHilo2(nombre);
         miHilo.hilo.start();
         return miHilo;
    }
    //Punto de entrada de hilo.
    public void run(){
         System.out.println(hilo.getName()+" iniciando.");
         try {
             for (int count=0; count<10;count++){
                 Thread.sleep(1000);
                 System.out.println("En "+hilo.getName()+ ", el recuento es "+count);
             }
         }catch (InterruptedException exc){
             exc.getMessage();
         }
         System.out.println(hilo.getName()+" terminado.");
    }
}

