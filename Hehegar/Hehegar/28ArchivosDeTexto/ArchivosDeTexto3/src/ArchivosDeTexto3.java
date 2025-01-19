/*28 HEHEGAR
Mantiene los datos y no los reemplaza en el archivo de texto
alt+chif+f ordenar codigo*/

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ArchivosDeTexto3 {

    public static void main(String[] args) {
        //Nuestras variables.
       
        //Para manipular al archivo.
        File archivo;
        //Para escribir en el archivo.
        FileWriter escribir;
        //Para escribir en el archivo.
        PrintWriter linea;

        String Nombre = "", dir = "", email = "";
        //Preparamos al archivo en donde vamos a meterlo
        archivo = new File("usuarios.txt");
        
        
        if (!archivo.exists()) {
            try {
                //Creamos el archivo.
                archivo.createNewFile();
                Nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre: ",
                         "Solicitando datos", 3);
                dir = JOptionPane.showInputDialog(null, "Ingresa la dirección: ",
                         "Solicitando datos", 3);
                email = JOptionPane.showInputDialog(null, "Ingresa el email: ",
                         "Solicitando datos", 3);

                /*true es para que escriba al final de una archivo ya existente,
                es decir si ya existe va escribir al final.*/
                escribir = new FileWriter(archivo, true);
                /*Escribir nos sirve para escribir en una línea de texto y 
                Printwriter para escribir en varias líenas de texto.*/
                linea = new PrintWriter(escribir);
                //Escribimos en el archivo
                linea.println(Nombre);
                linea.println(dir);
                linea.print(email);
                linea.close();
                escribir.close();

            } catch (IOException ex) {
                Logger.getLogger(ArchivosDeTexto3.class.getName()).
                        log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                System.out.println("Si deseas agregar mas usuarios "
                        + ",debes compilar el programa nuevamente.");
                Nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre: ",
                         "Solicitando datos", 3);
                dir = JOptionPane.showInputDialog(null, "Ingresa la direccion: ",
                         "Solicitando datos", 3);
                email = JOptionPane.showInputDialog(null, "Ingresa el email: ",
                         "Solicitando datos", 3);
                //true es para escriba al final de un archivo ya existente.
                escribir = new FileWriter(archivo, true);
                //Escribir nos sirve para escribir en una línea de texto.
                //y Printwriter para escribir en varias líenas de texto.
                linea = new PrintWriter(escribir);
                
                //Escribimos en el archivo.
                linea.println(Nombre);
                linea.println(dir);
                linea.println(email);
                linea.close();
                escribir.close();

            } catch (IOException ex) {
                Logger.getLogger(ArchivosDeTexto3.class.getName()).
                        log(Level.SEVERE, null, ex);
            }

        }

    }

}
