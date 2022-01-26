
import java.io.*;


public class Archivos5 {

    
    public static void main(String[] args) {
        
        String texto = "";
        try{
            BufferedReader br;
            br = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Escribir Texto");
            texto = br.readLine();
            FileWriter fw = new FileWriter("archivos.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter (bw);
            salida.println(texto);
            salida.close();
        }catch(IOException ioe){
            System.out.println("\n\nErrror al abrir o guardar el archivo");
            ioe.printStackTrace();
        }catch(Exception e){
            System.out.println("\n\n");
        }
    }
    
}
