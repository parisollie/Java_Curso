import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivos1 {

    
    public static void main(String[] args) {
        
        try {
            File archivo = new File("archivo.txt");
            System.out.println(archivo.exists());
            boolean seCreo = archivo.createNewFile();
            System.out.println(seCreo);
            System.out.println(archivo.exists());
        } catch (IOException ex) {
            Logger.getLogger(Archivos1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
