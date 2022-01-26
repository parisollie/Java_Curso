import java.util.Hashtable;


public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hashtable<String, Integer> miTabla = new Hashtable <String, Integer>();
        miTabla.put("uno",1);
        miTabla.put("dos",2);
        miTabla.put("cinco",5);
        
        System.out.println("Cotiene a cuatro ?"+ miTabla.containsKey("cuatro"));//Veremos si se encunetra la clave
        
        for(String clave : miTabla.keySet()){// mandamos a imprimir las claves
            System.out.println(clave);
        }
        for(Integer valor: miTabla.values()){ //Imprimimos los valores de la tabla
            System.out.println(valor);
        }
                
    }
    
}
