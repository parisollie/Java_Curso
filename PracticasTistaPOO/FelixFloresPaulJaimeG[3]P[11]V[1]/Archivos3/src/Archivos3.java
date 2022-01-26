
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivos3 {

    public static void main(String[] args) {

        FileInputStream fis = null;
        byte[] buffer = new byte[81];
        int nbytes;
        try {

            fis = new FileInputStream("leer.txt");
            nbytes = fis.read(buffer, 0, 81);
            String texto = new String(buffer, 0, nbytes);
            System.out.println(texto);
        } catch (IOException ioe) {

            System.out.println("Error: " + ioe.toString());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(Archivos3.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Error al cerrar el archivo");
            }
        }
    }

}
