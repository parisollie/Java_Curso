
public class Hilos4 extends Thread{
    
    private static long saldo = 0;
     public Hilos4(String nombre){
         super(nombre);
     }
     public void run (){
         if(getName().equals("Deposito 1") || getName().equals("Deposito 2")){
             this.depositardinero(100);
         }else{
             this.extraerDinero(50);
         }
         System.out.println("Termina el " +getName());
     }
     
     public synchronized void depositardinero(int cantidad){
         saldo+=cantidad;
         System.out.println("Se depositaron "+ cantidad + " pesos ");
         notifyAll();
     }
     
     public synchronized void extraerDinero(int cantidad){
         try{
             if(saldo <= 0){
                 System.out.println(getName()+ " espera deposito "+ "\nSaldo = " + saldo);
                 sleep (5000);
             }
         }catch(InterruptedException e){
                     System.out.println(e);
                     }
         saldo -= cantidad;
         System.out.println(getName() + " extrajo " + cantidad + " Pesos.\n Saldo restante = " + saldo);
         notifyAll();
     }
    
    
    public static void main(String[] args) {
        new Hilos4 ("Acceso 1").start();
        new Hilos4 ("Acceso 2").start();
        new Hilos4 ("Deposito 1").start();
        new Hilos4 ("Deposito 2").start();
        System.out.println("Termina el hilo principal");
    }
    
}
