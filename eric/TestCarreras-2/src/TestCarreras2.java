

//HipodromoMultiTarea
/*
Eric Felix Flores
*/
public class TestCarreras2 {

    public static void main(String[] args) {
    
    //Creamos los objetos 
    /*Creamos 3 instancias  que llamaran a la clase Caballo
      y cada una con sus parametros : Sylver, Pinto y Tornado
      A su vez creamos 3 hilos(Thready cada uno llamando al método start)
    */    
    
    Caballo caballo1 = new Caballo("Silver");
    Thread t1 = new Thread(caballo1);
    t1.start(); 
    Caballo caballo2 = new Caballo("Rayo");
    Thread t2 = new Thread(caballo2);
    t2.start();
    Caballo caballo3 = new Caballo("Arabela");
    Thread t3 = new Thread(caballo3);
    t3.start();
    }
    
}
