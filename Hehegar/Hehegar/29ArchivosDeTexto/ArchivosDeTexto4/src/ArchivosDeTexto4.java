//29 Master Haeggar
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class ArchivosDeTexto4 {

    
    public static void main(String[] args) {
        
        File archivo;
        FileReader leer;
        //Nuestro contador para que lea los tres
        int registros =1;
        //Para que almacenemos los datos
        String cadena,nombre = "",dir = "",email = "" ;
        BufferedReader almacenamiento;
        archivo =new File("usuarios.txt");
        try {
            leer = new FileReader(archivo);
            almacenamiento = new BufferedReader(leer);
            //Inicializamos la cadena de null,para que lea todo
            cadena ="";
            while(cadena!=null){
                try {
                    //Se leen las tres cosas
                    cadena = almacenamiento.readLine();
                    nombre = cadena;
                    cadena = almacenamiento.readLine();
                    dir = cadena;
                    cadena = almacenamiento.readLine();
                    email = cadena;
                    //Si la cadena ya no es nula,entonces mostramos los datos
                    if(cadena!=null){
                        JOptionPane.showMessageDialog(null, "Nombre: " + nombre +
                                 "\nDirección: "+ dir + "\nEmail: "+email,
                                "Mostrando datos del registro # "+registros,1);
                        registros++;
                    }
                    
                } catch (IOException ex) {
                    Logger.getLogger(ArchivosDeTexto4.class.getName()).log(Level
                            .SEVERE, null, ex);
                }
            }
            
            try {
                //Empezamos a cerrar
                almacenamiento.close();
                leer.close();
            } catch (IOException ex) {
                Logger.getLogger(ArchivosDeTexto4.class.getName()).log(Level
                        .SEVERE, null, ex);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivosDeTexto4.class.getName()).log(Level.SEVERE
                    , null, ex);
        }
        
    }
    
}
