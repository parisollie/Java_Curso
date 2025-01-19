//26 Hehegar- archivos de Texto.
import java.io.File;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
//Para importar todo
//import  java.io.*;
//26-38 Haegar

        /*-------------------------txt----------------------------
        //Archivo de texto plano txt
        Algoritmo para escribir en un archivo desde Java:

        1.-Crear una variable de tipo File
        2.-Crear una variavle de tipo PrintWriter( para escribir en el archivo)
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
        //Paso 1,para maipular al archivo.
        File miArchivo; 
        //Paso 2,para escribir en el archivo.
        PrintWriter escribir;
        //Paso 3,preparando al archivo.Se guarda en el proyecto.
        miArchivo= new File("ejemploEscritura.txt");
        /*Paso 4,metodo exists sirve para saber si existe o no.
        Si mi archivo no existe, ponemos el !.*/
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
