

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Ejercicio3b {

    public static void main(String[] args) throws IOException { 
        manejoDeArchivos();
    }

    private static void manejoDeArchivos() throws FileNotFoundException, IOException {
       
        try { 
  
            // Following file does not exist 
            BufferedReader fileInput;
            FileReader file = new FileReader("C://Hola.txt");
            System.out.println("El archivo existe"); 
        } catch (FileNotFoundException e) { 
           System.out.println("El archivo no existe"); 
        } 
        //Archivo original
        /* 
        BufferedReader fileInput;
        FileReader file = new FileReader("C://Hola.txt"); 
        fileInput = new BufferedReader(file); 
          
        for (int counter = 0; counter < 3; counter++)  {
            System.out.println(fileInput.readLine()); 
            fileInput.close(); 
        }*/
    }
        
} 





 

