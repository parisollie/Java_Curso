
public class Ejercicio2 {
 
   private static final String CLASS_TO_LOAD = "java.util.Calendar2";
 
    public static void main(String[] args){
        Entrada();
    
        
    }
    
    public static void Entrada(){
        System.out.println("Bienvenido al programa");
        System.out.println("Vamos a buscar la clase...");
        buscarClase();
    }

    private static void buscarClase() {
        
        try {
            //Class loadedClass =Class.forName(CLASS_TO_LOAD);
            //System.out.println("Class " + loadedClass + " found successfully!");
            
            /*Quitar los comentarios en la clase de arriba y ponerlos en la clase demo 
            ´para el funcionamiento correcto.
            
            */
            Class.forName("Demo");
            System.out.println("Class found successfully!");
            
        } catch (ClassNotFoundException e) {
            System.out.println("Unabel to load class due to "+e);
        }
        
    }

}


/*
//Ejercicio original
public class Ejercicio2 {
 
    private static final String CLASS_TO_LOAD = "java.util.Calendar2";
 
    public static void main(String[] args){
        Entrada();
    }
    
    public static void Entrada(){
        System.out.println("Bienvenido al programa");
        System.out.println("vamos a buscar la clase");
        buscarClase();
    }

    private static void buscarClase() {
        Class loadedClass = Class.forName(CLASS_TO_LOAD);
        System.out.println("Class " + loadedClass + " found successfully!");
    }

}*/