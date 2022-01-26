
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Archivos7 {

    public static void main(String[] args) {
        String texto = "";
        try {
            BufferedReader br;
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("EScribir el texto deseado: ");
            texto = br.readLine();
            System.out.println("\n\nEl texto separado por espacios es fue: " );
            StringTokenizer st = new StringTokenizer(texto);
            while(st.hasMoreTokens()){
                System.out.println(st.nextToken());
            }
        } catch (Exception e) {
            System.out.println("\n\nError al leer de teclado");
            e.printStackTrace();

        }
    }

}
