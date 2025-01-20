
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MemoDinamica {

    public static void main(String[] args) {
        // creando un objeto o instancia de tipo ArrayList,tenemos dos formas de hacerlo
        // ArrayList <String> frases = new ArrayList<String>();

        ArrayList<String> cadenas;
        cadenas = new ArrayList<String>();
        String frase, respuesta;
        do {
            frase = JOptionPane.showInputDialog(null, "Ingresa la frase: ");
            // Agregando la frase a la lista
            cadenas.add(frase);
            respuesta = JOptionPane.showInputDialog(null, "¿Deseas ingresar otra frase(SI/NO)");
            // convertimos la respesta a miniscula
            respuesta = respuesta.toUpperCase();

        } while (!respuesta.equals("NO"));
        // Mostrando el contenido de cadenas
        System.out.println("Frases originales");
        for (int i = 0; i < cadenas.size(); i++) {
            System.out.println(cadenas.get(i));
        }
        // Utilizando el metodo set
        cadenas.set(1, "la que modifique");
        System.out.println("Frases modificadas");
        for (int i = 0; i < cadenas.size(); i++) {
            System.out.println(cadenas.get(i));
        }
        // Utilizando el metodo set
        cadenas.remove(0);
        System.out.println("Frases que nos quedan");
        for (int i = 0; i < cadenas.size(); i++) {
            System.out.println(cadenas.get(i));
        }
    }

}
