//27 Hehegar
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
(Algoritmo para leer un archivo en Java.
1.-Declarar una variable de tipo File.
2.-Declarar una variable de tipo FileReader.
3.-Declarar una variable de tipo String.
4.-Preparar el archivo.
5.-Crear una instancia de tipo FileReader(lector).
6.-Crear una instancia de tipo BufferedReader.
7.-Inicializar la variable de tipo cadena a nada.
8.-Crear un ciclo que se repita mientras la variable de tipo cadena sea diferente
   de nula.
   8.1-Asignar a la variable de tipo cadena buffer.readLine().
   8.2-Si la variable de tipo cadena es diferente de nulo.
   mostrar su contenido.
9.-Cerrar el buffer.
10.-Cerrar el lector.
*/

public class ArchivosDeTexto2 {

    public static void main(String[] args) {
        
        try {
            //Paso 1,variabale para manipular al archivo.
            File miArchivo;
            //Paso 2,variabale para leer.
            FileReader leer;
            //Paso 3,para ir recuperando las cadenas de texto de nuestro archivo.
            String cadena;
            //Paso 4,le pasamos el nombre del archivo.
            miArchivo = new File("RequisitosLectura.txt");
            String cads="";
            //Paso 5
            leer = new FileReader(miArchivo);
            /*Paso 6
            El bufferReader = Almacena todo lo que lee.
            Le pasamos como parámetro la variable de tipo fileReader.*/
            BufferedReader almacenamiento = new BufferedReader(leer);
            
            /*Paso 7 ,la inicializamos en null,ya que la cadena se almacenara 
            y al final todo será null.*/
            cadena = "";
            // Paso 8,Hasta que me lea todo.
            while(cadena!=null){
                try {
                    //Paso 8.1,que me almacene una línea de texto y se lo asignamos a cadena.
                    cadena = almacenamiento.readLine();
                    //8.2
                    if (cadena!= null){
                        //Mostramos la cadena.
                        System.out.println(cadena);
                        // Alcenando la primera línea.
                        cads = cads +  cadena + "\n"; 
                    }
                } catch (IOException ex) {
                    Logger.getLogger(ArchivosDeTexto2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            JOptionPane.showMessageDialog(null,cads,"Mostrando los datos del archivo ",1);
            try {
                //Paso 9,cierra el buffer,cada vez que cierra se necesitan los try-catch
                almacenamiento.close();
                //Paso 10
                leer.close();
            } catch (IOException ex) {
                Logger.getLogger(ArchivosDeTexto2.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivosDeTexto2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
}
