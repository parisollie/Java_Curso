
import java.util.Enumeration;
import java.util.Hashtable;


public class Ejemplo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hashtable<String, Integer> miTabla = new Hashtable <String, Integer>(); //Objeto mi tabla de la clase Hashtable
        miTabla.put("uno",1); //añade una coleccion
        miTabla.put("dos",2);
        miTabla.put("cinco",5);
        
        String clave;
        Integer valor;
        Enumeration<String> claves = miTabla.keys(); //creamos un objeto de la clase Enumeration
        
        while(claves.hasMoreElements()){
            clave = claves.nextElement();//Nos dara a clave
            valor = miTabla.get(clave); // Devuelve el valor que tiene asociado la clave que se indica
            System.out.println("Clave: "+clave+"\tvalor: "+valor);
        
        }
                
    }
}
    
