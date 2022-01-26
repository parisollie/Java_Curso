package ejercicio1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Archivos {
    public static boolean createFile(String name){
        File aux = new File(name);
        try{
            return aux.createNewFile();
        }catch(IOException e){
            return false;
        }
    }
    
    public static boolean overwrite(String name, String nuevoTexto){
        try{
            FileWriter writer = new FileWriter(name);
            PrintWriter printer = new PrintWriter(writer);
            printer.println(nuevoTexto);
            printer.close();
            writer.close();
            return true;
        }catch(IOException e){
            return false;
        }
    }
    
    public static boolean editFile(String name, String textoAAgregar){
        try{
            FileWriter writer = new FileWriter(name,true);
            PrintWriter printer = new PrintWriter(writer);
            printer.println(textoAAgregar);
            printer.close();
            writer.close();
            return true;
        }catch(IOException e){
            return false;
        }
    }
    
    public static boolean removeFile(String name){
        File aux = new File(name);
        return aux.delete();
    }
}
