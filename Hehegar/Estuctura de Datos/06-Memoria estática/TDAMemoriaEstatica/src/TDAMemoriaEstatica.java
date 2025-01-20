
import java.util.Arrays;

import javax.swing.JOptionPane;

public class TDAMemoriaEstatica {

    public static void main(String[] args) {
        int numeros[] = new int[5];
        String palabras[] = new String[5];
        // Le decimos que el tamaño será del de números.
        int numerotes[] = new int[numeros.length];
        int i;

        for (i = 0; i < 5; i++) {
            numeros[i] = Integer.parseInt(
                    JOptionPane.showInputDialog(null,
                            "Ingresa el elemento del índice " + i));
        }
        // Mostrando los datos como los Ingresamos.
        System.out.println("Los datos sin ordenar son:");
        for (i = 0; i < 5; i++) {
            System.out.println("[" + numeros[i] + "]");
        }
        System.out.println("\nLos datos ordenados son:");
        // Hacemos el ordenamiento.
        Arrays.sort(numeros);
        for (i = 0; i < 5; i++) {
            System.out.println("[" + numeros[i] + "]");
        }
        // Rellenando al arreglo palabras.
        Arrays.fill(palabras, "Binvenido a la Fiesta");
        System.out.println("Elementos del arreglo palabras");
        for (i = 0; i < 5; i++) {
            System.out.println("[" + palabras[i] + "]");
        }
        // Copiando los elementos del arreglo numeros a numerotes.
        System.arraycopy(numeros, 0, numerotes, 0, numeros.length);
        System.out.println("Elementos del arreglo numerotes");
        for (i = 0; i < 5; i++) {
            System.out.println("[" + numerotes[i] + "]");
        }

    }

}
