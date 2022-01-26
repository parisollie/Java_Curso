/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bits2;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author andro
 */
public class Bits2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileInputStream fis = null;

        DataInputStream entrada = null;

        int n;

        try {

            fis = new FileInputStream("C:\\Users\\andro\\Desktop\\ESCOMCU\\Poo\\InterfacesGraficas\\Bits\\minic.dat");

            entrada = new DataInputStream(fis);

            while (true) {    

                n = entrada.readInt();  //se lee  un entero del fichero

                System.out.println(n);  //se muestra en pantalla

            }

        } catch (FileNotFoundException e) {

            System.out.println(e.getMessage());

        } catch (EOFException e) { 

            System.out.println("Fin de fichero");

        } catch (IOException e) {

            System.out.println(e.getMessage());

        } finally {

            try {

                if (fis != null) {

                    fis.close();

                }

                if (entrada != null) {

                    entrada.close();

                }

            } catch (IOException e) {

                System.out.println(e.getMessage());

            }

        }

    }
    }
    

