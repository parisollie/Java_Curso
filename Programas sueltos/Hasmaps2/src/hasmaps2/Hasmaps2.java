
package hasmaps2;

import java.util.HashMap;

/**
 *
 * @author andro
 */
public class Hasmaps2 {

    public static void main(String[] args) {
        
        HashMap<Integer, String> lista = new HashMap<Integer,String>();
        //Agregar elementos
        lista.put(123,"Nick"); // Trbajamos con indices ya no es con hastable
        lista.put(12323,"Daz");
        lista.put(12983,"Andrew");
        lista.put(12783,"Genesis");
        
        //Para que me imprima el Tamaño de la lista
        //Tamaño
        int i = lista.size();
        System.out.println("Tamaño: "+i);
        
        System.out.println(lista);//Para imprimir los valores
        System.out.println(lista.keySet());// Para imprimir solo las llaves
        System.out.println(lista.values());//.values() Para que me imprima los valores independientemente
        
        //ContainsValue para si está alguien
        if(lista.containsValue("Anastacia")){
            System.out.println("Si contiene a Adam.");
        }else{
            System.out.println("No se encontro a Adam.");
        }
        
        //Cuando quiera eliminar un elemento
        lista.remove(123); //para qe me elimine a nick
        System.out.println(lista);
        
        //Obtener a la persona con el telefono 
        String Persona = lista.get(12983);
        System.out.println("Persona: "+ Persona);
        
        
   }   
        
    }
    

