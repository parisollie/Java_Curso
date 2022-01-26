
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ArchivosBinarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int opcion;
        //Esto devuelve un string no se puede hacer y se debe transfromar a un entero
        opcion = 0;

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.De Texto a Binario \n"
                        + "2.De archivo binario a texto\n"
                        + "3.Salir\n"
                        + "Elige una opcion...", "Menu", JOptionPane.QUESTION_MESSAGE));

                switch (opcion) {

                    case 1:
                        //Para manipular al archivo.
                        File archivo;
                        //Para escribir en el archivo.
                        FileWriter escribir;
                        //Para escribir en el archivo.
                        PrintWriter linea;
                        String Palabra = "",
                         dir = "",
                         email = "";
                        //Preparamos al archivo
                        archivo = new File("usuarios.txt");
                        if (!archivo.exists()) {
                            try {
                                archivo.createNewFile();
                                Palabra = JOptionPane.showInputDialog(null, "Ingresa la palabra: ",
                                        "Solicitando datos", 3);
                                

                                escribir = new FileWriter(archivo, true);//true es para escriba al final de una rchivo ya existente
                                linea = new PrintWriter(escribir);//Escribir nos sirve para escribir en una línea de texto y Printwriter para escribir en varias líenas de texto
                                //Escribimos en el archivo
                                linea.println(Palabra);

                                linea.close();
                                escribir.close();

                                byte[] bytes = Palabra.getBytes();
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

                            } catch (IOException ex) {
                                Logger.getLogger(ArchivosBinarios.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else {
                            try {
                                archivo.createNewFile();
                                Palabra = JOptionPane.showInputDialog(null, "Ingresa la palabra: ",
                                        "Solicitando datos", 3);
                                System.out.println("Su palabra en archivo binario es : ");
                                escribir = new FileWriter(archivo, true);//true es para escriba al final de una rchivo ya existente
                                linea = new PrintWriter(escribir);//Escribir nos sirve para escribir en una línea de texto y Printwriter para escribir en varias líenas de texto
                                //Escribimos en el archivo
                                linea.println(Palabra);

                                linea.close();
                                escribir.close();

                                byte[] bytes = Palabra.getBytes();
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

                            } catch (IOException ex) {
                                Logger.getLogger(ArchivosBinarios.class.getName()).log(Level.SEVERE, null, ex);
                            }

                        }
                        break;

                    case 2:
                        JOptionPane.showMessageDialog(null, "De archivo binario a texto");
                        try {

                            // convert file to byte[]
                            byte[] bFile = readBytesFromFile("C:\\Users\\andro\\Desktop\\Practica11\\ArchivosBinarios\\usuarios.txt");

                            //java nio
                            //byte[] bFile = Files.readAllBytes(new File("C:\\temp\\testing1.txt").toPath());
                            //byte[] bFile = Files.readAllBytes(Paths.get("C:\\temp\\testing1.txt"));
                            // save byte[] into a file
                            Path path = Paths.get("\\Users\\andro\\Desktop\\Practica11\\ArchivosBinarios\\usuarios.txt");
                            Files.write(path, bFile);

                            System.out.println("Su numero binario leido desde el archivo es : ");

                            //Print bytes[]
                            for (int i = 0; i < bFile.length; i++) {
                                System.out.print((char) bFile[i]);
                            }

                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Aplicacion finalizada", "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "No se encuentra el numero");
                        break;
                }

            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
            }
        } while (opcion != 3);
    }

    private static byte[] readBytesFromFile(String filePath) {

        FileInputStream fileInputStream = null;
        byte[] bytesArray = null;

        try {

            File file = new File(filePath);
            bytesArray = new byte[(int) file.length()];

            //read file into bytes[]
            fileInputStream = new FileInputStream(file);
            fileInputStream.read(bytesArray);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

        return bytesArray;

    }
}
