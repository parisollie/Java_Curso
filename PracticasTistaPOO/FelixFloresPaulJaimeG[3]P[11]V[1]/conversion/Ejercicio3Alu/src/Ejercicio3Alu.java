
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Ejercicio3Alu {

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
                        "1.Agregar \n"
                        + "2.Mostrar Datos\n"
                        + "3.Salir\n"
                        + "Elige una opcion...", "Menu", JOptionPane.QUESTION_MESSAGE));

                switch (opcion) {

                    case 1:
                        JOptionPane.showMessageDialog(null, "Agregando datos");
                        //Para manipular al archivo.
                        File archivo;
                        //Para escribir en el archivo.
                        FileWriter escribir;
                        //Para escribir en el archivo.
                        PrintWriter linea;
                        String Nombre = "",
                         dir = "",
                         email = "",
                         mater1 = "",
                         mater2 = "",
                         hor1 = "",
                         hor2 = "";

                        //Preparamos al archivo
                        archivo = new File("usuarios.txt");
                        if (!archivo.exists()) {
                            try {
                                archivo.createNewFile();
                                Nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre: ",
                                        "Solicitando datos", 3);
                                dir = JOptionPane.showInputDialog(null, "Ingresa la direccion: ",
                                        "Solicitando datos", 3);
                                email = JOptionPane.showInputDialog(null, "Ingresa el email: ",
                                        "Solicitando datos", 3);
                                mater1 = JOptionPane.showInputDialog(null, "Ingresa la materia: ",
                                        "Solicitando datos", 3);
                                hor1 = JOptionPane.showInputDialog(null, "Ingresa el horario de la materia 1: ",
                                        "Solicitando datos", 3);
                                mater2 = JOptionPane.showInputDialog(null, "Ingresa la materia: ",
                                        "Solicitando datos", 3);
                                hor2 = JOptionPane.showInputDialog(null, "Ingresa el horario de la materia 2: ",
                                        "Solicitando datos", 3);

                                escribir = new FileWriter(archivo, true);//true es para escriba al final de una rchivo ya existente
                                linea = new PrintWriter(escribir);//Escribir nos sirve para escribir en una línea de texto y Printwriter para escribir en varias líenas de texto
                                //Escribimos en el archivo
                                linea.println(Nombre);
                                linea.println(dir);
                                linea.println(email);
                                linea.println(mater1);
                                linea.println(hor1);
                                linea.println(mater2);
                                linea.println(hor2);

                                linea.close();
                                escribir.close();

                            } catch (IOException ex) {
                                Logger.getLogger(Ejercicio3Alu.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else {
                            try {

                                Nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre: ",
                                        "Solicitando datos", 3);
                                dir = JOptionPane.showInputDialog(null, "Ingresa la direccion: ",
                                        "Solicitando datos", 3);
                                email = JOptionPane.showInputDialog(null, "Ingresa el email: ",
                                        "Solicitando datos", 3);
                                mater1 = JOptionPane.showInputDialog(null, "Ingresa la materia: ",
                                        "Solicitando datos", 3);
                                hor1 = JOptionPane.showInputDialog(null, "Ingresa el horario de la materia 1: ",
                                        "Solicitando datos", 3);
                                mater2 = JOptionPane.showInputDialog(null, "Ingresa la materia: ",
                                        "Solicitando datos", 3);
                                hor2 = JOptionPane.showInputDialog(null, "Ingresa el horario de la materia 2: ",
                                        "Solicitando datos", 3);
                                escribir = new FileWriter(archivo, true);//true es para escriba al final de una rchivo ya existente
                                linea = new PrintWriter(escribir);//Escribir nos sirve para escribir en una línea de texto y Printwriter para escribir en varias líenas de texto
                                //Escribimos en el archivo
                                linea.println(Nombre);
                                linea.println(dir);
                                linea.println(email);
                                linea.println(mater1);
                                linea.println(hor1);
                                linea.println(mater2);
                                linea.println(hor2);

                                linea.close();
                                escribir.close();

                            } catch (IOException ex) {
                                Logger.getLogger(Ejercicio3Alu.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }

                        break;

                    case 2:
                        JOptionPane.showMessageDialog(null, "Mostrando datos");
                        try {
                            //Paso 1
                            //Variabale para manipular al archivo.
                            File miArchivo;
                            //Paso 2
                            //Variabale para leer.
                            FileReader leer;
                            //Paso 3
                            //Para ir recuperando las cadenas de texto de nuestro archivo.
                            String cadena;
                            //Paso 4
                            miArchivo = new File("usuarios.txt");
                            String cads = "";

                            //Paso 5
                            leer = new FileReader(miArchivo);
                            //Paso 6
                            //Almacena todo lo que lee el bufferReader.
                            BufferedReader almacenamiento = new BufferedReader(leer);// Le pasamos como parámetro la variable de tipo fileReader.
                            //Paso 7
                            cadena = "";//La inicializamos en null,ya que cadena almacenara y al final todo será null.
                            // Paso 8
                            while (cadena != null) {
                                try {
                                    //Paso 8.1
                                    cadena = almacenamiento.readLine();//Qué me almacene una línea de texto.
                                    //8.2
                                    if (cadena != null) {
                                        System.out.println(cadena);//Mostramos la cadena
                                        cads = cads + cadena + "\n"; // Alcenandome la primera línea.
                                    }
                                } catch (IOException ex) {
                                    Logger.getLogger(Ejercicio3Alu.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            JOptionPane.showMessageDialog(null, cads, "Mostrando los datos del archivo ", 1);
                            try {
                                //Paso 9
                                // Cada vez que cierra se necesitan los try catch
                                almacenamiento.close();
                                //Paso 10
                                leer.close();
                            } catch (IOException ex) {
                                Logger.getLogger(Ejercicio3Alu.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } catch (FileNotFoundException ex) {
                            Logger.getLogger(Ejercicio3Alu.class.getName()).log(Level.SEVERE, null, ex);
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
}
