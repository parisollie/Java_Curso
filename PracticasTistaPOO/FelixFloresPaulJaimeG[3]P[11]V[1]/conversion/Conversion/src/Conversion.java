
import java.util.Scanner;


public class Conversion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\t.:Texto a Binario:.\n\t");
        System.out.print("Ingresa el texto: ");
        String text = input.nextLine();

        byte[] bytes = text.getBytes();
        StringBuilder binary = new StringBuilder();
        
        for (byte b : bytes) {
            int val = b;
            for (int i = 0; i < 8; i++) {
                binary.append((val & 128) == 0 ? 0 : 1);
                val <<= 1;
                //System.out.println(binary);

            }

        }
        System.out.println(binary);
    }

}


