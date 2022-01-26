
public class Hilos2 implements Runnable {
    
    public void run (){
        for(int i =0 ; i<5 ; i++){
            System.out.println("Iteracion "+ (i+1)+ " de "+ Thread.currentThread().getName());
        }
    }

    
    public static void main(String[] args) {
        
        new Thread (new Hilos2(),"Primer hilo").start();
        new Thread (new Hilos2(),"Segundo Hilo").start();
        System.out.println("Termina el hilo principal");
    }
    
}
