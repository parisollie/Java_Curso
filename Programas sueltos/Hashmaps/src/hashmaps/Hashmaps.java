
package hashmaps;

import java.util.HashMap;

/**
 *
 * @author andro
 */
public class Hashmaps {

    /**
     * @param args the command line arguments
     */
    
        public static void main (String[] args) {
   
   HashMap<String, String> lista = new HashMap<>();
   //Agregar elementos
   lista.put("Pedro","4443321");
   lista.put("Luis","4463341");
   lista.put("Martha","4223311");
   lista.put("Carlos","4456321");
   
   //Tamaño
   int i = lista.size();
   System.out.println("Tamaño: "+i);
   
   //Obtener
   String telefono = lista.get("Pedro");
   System.out.println("Telefono: "+ telefono);
      
   //Remover
   lista.remove("Carlos");
   int y = lista.size();
   System.out.println("Tamaño: "+y);
   
   //Determinar si hay elementos
   boolean mt = lista.isEmpty();
   System.out.println("Tiene elementos? : "+ mt);
   
   //Limpiar
   lista.clear();
   int z = lista.size();
   System.out.println("Tamaño: "+z);
   
   
   
   }    
    }
    

