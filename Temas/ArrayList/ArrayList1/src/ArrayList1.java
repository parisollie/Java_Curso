//ArrayList 49-chica-

import java.util.ArrayList;
public class ArrayList1 {

    
    public static void main(String[] args) {
        
        ArrayList<String > lista = new ArrayList<>();
        
        //Metodos add
        lista.add("Andrew");
        lista.add("Ivan");
        lista.add("Diana");
        
        System.out.println("Elementos de mi lista: "+lista.toString());
        //Eliminar elemento
        lista.remove(1);
        System.out.println("Elementos de mi lista sin  Ivan: "+lista.toString());
        
        //Método size
        System.out.println("Numero de elementos de la lista: "+lista.size());
        
        //Método get
        System.out.println("Elementos en el indice 0: "+lista.get(0));
        //Metodo contains
        if(lista.contains("Diana")){
            System.out.println("El elemento se encuenta en el arreglo");
        }else{
            System.out.println("El elemento no se encuenra");
        }
        
        /*
       //Metodo borrar todo
        lista.clear();
        System.out.println("El arreglo esta vacio: "+lista.toString());*/
    
        /*//Metodo isEmpty
        
        System.out.println("Esta vacia nuestra lista: "+lista.isEmpty());*/
        
        //mostrando los elemntos de la lista
        for(String mostar:lista){
            System.out.println("Elementos "+mostar);
        }
    
}
}
