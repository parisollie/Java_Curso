import java.io.File; 
import java.io.FileNotFoundException; 
import java.io.FileReader; 
 
public class Ejercicio3{ 
  
    public static void main(String args[])  { 
        try { 
  
            // Following file does not exist 
            File file = new File("C://Hola.txt");
            System.out.println("El archivo existe"); 
  
            FileReader fr = new FileReader(file); 
        } catch (FileNotFoundException e) { 
           System.out.println("El archivo no existe"); 
        } 
    } 
} 

