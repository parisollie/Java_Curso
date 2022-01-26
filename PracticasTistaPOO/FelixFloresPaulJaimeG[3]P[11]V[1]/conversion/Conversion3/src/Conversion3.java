import java.io.*;
public class Conversion3 {

     public static void main(String[] args) {

    File file = new File("C:\\Users\\andro\\Desktop\\Hola.txt");

    try (Reader reader = new InputStreamReader(new FileInputStream(file))) {
        System.out.println("\n\t.:Binario a Texto:.\n\t");
        System.out.print("La traduccion del codigo  binario que se ha leído es: ");
        int c = 0;
        int count = 0;
        for (int readChar = reader.read(); readChar != -1; readChar = reader.read()) {
            switch (readChar) {
                case '0':
                case '1':
                    c <<= 1;
                    c |= readChar - '0';
                    count++;
                    break;
                default:
            }
            if (count == 8) {
                System.out.print((char) c);
                c = 0;
                count = 0;
            }
        }
        System.out.println();
    } catch (IOException e) {
        System.out.println("Ha ocurrido un error");
        e.printStackTrace();
    }
}
    
}
