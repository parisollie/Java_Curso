
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Archivos6 {

    public static void main(String[] args) {

        try {
            String texto = "";
            BufferedReader br;
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("EScribir el texto deseado: ");
            texto = br.readLine();
            System.out.println("El texto escrito fue: " + texto);
        } catch (IOException ioe) {
            System.out.println("\n\nError al abrir o guardar el archivo");

        }
    }

}
