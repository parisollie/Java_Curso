//26 Hehegar
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//import  java.io.*;//Para importar todo
//26-38 Haegar

        /*-------------------------txt----------------------------
        //Archivo de texto plano txt
        Algoritmo para escribir en un archivo desde Java:

        1.-Crear una variable de tipo File
        2.-Crear una variavle de tipo PrintWriter
        3.-Preparar al archivo
        4.-Verificar si el archivo no existe
           4.1.-Crear al archivo
        4.2.-En otro caso (else)
           4.2.1 Preparar al archivo para escribir
           4.2.2 Escribir en el archivo
           4.2.3 Cerrar el archivo
        
        */
public class ArchivoDeTexto {

    public static void main(String[] args) {
        String nombre;
        //Paso 1
        File miArchivo; // Para maipular al archivo
        //Paso 2
        PrintWriter escribir;//Para escribir en el archivo
        //Paso 3
        miArchivo= new File("ejemploEscritura.txt");//Preparando al archivo
        //Paso 4,metodo exists sirve para saber si existe o no
        if(!miArchivo.exists()){
            //4.1
            System.out.println("Archivo Creado OKurrrrr");
            try {
            // Si mi archivo no existe
            //4.2
            miArchivo.createNewFile();
            } catch (Exception e) {
               
            }
        //4.2   
        }else{
            try {
                //Paso 4.2.1
                System.out.println("El arcvhivo ya existe");
                //utf-8 =escribiendo en texto plano
                escribir = new PrintWriter(miArchivo,"utf-8");
                nombre = JOptionPane.showInputDialog(null,"Ingresa tu nombre:");
                //Lo que escribimos en el txt
                escribir.println("Hola "+nombre+" ,Bienvenido a la fiesta ");
                System.out.println("Hola "+nombre+" ,Bienvenido a la fiesta ");
                escribir.close();
            } catch (Exception e) {
                //Lo que hace es que me manda el error que pueda ocurrir
                e.printStackTrace();
            }           
        }
    }
    
}
