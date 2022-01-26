package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        do{
            System.out.println("Seleccione una opción: ");
            System.out.println("1. Crear un archivo");
            System.out.println("2. Sobreescribir un archivo");
            System.out.println("3. Editar un archivo");
            System.out.println("4. Eliminar un archivo");
            System.out.println("5. Salir");
            try{
                opc = sc.nextInt();
            }catch(InputMismatchException e){
                System.out.println("Dato incorrecto");
                sc.nextLine();
            }
            decision(opc);
        }while(opc != 5);
    }
    
    public static void decision(int opc){
        Scanner sc = new Scanner(System.in);
        switch(opc){
            case 1:
                System.out.println("Ingrese el nombre del archivo a crear "
                        + "(incluyendo su extensi\u00e1n): ");
                System.out.println("Si desea que el archivo se encuentre en otra"
                        + " carpeta, escriba la ruta completa seguida del nombre"
                        + " y extensión del archivo");
                String name1 = sc.next();
                sc.nextLine();
                System.out.println(Archivos.createFile(name1));
                System.out.println("Ingrese el texto inicial del archivo");
                String contenidoNuevo = sc.nextLine();
                System.out.println(Archivos.overwrite(name1, contenidoNuevo));
                break;
            case 2:
                System.out.println("Ingrese el nombre del archivo a modificar "
                        + "(incluyendo su extension.txt): ");
                System.out.println("Si el archivo se encuentra en otra"
                        + " carpeta, escriba la ruta completa");
                String name2 = sc.next();
                sc.nextLine();
                System.out.println("Ingrese el nuevo texto que contendra"
                        + "el archivo");
                String nuevoTexto = sc.nextLine();
                System.out.println(Archivos.overwrite(name2, nuevoTexto));
                break;
            case 3:
                System.out.println("Ingrese el nombre del archivo a modificar "
                        + "(incluyendo su extension.txt): ");
                System.out.println("Si el archivo se encuentra en otra"
                        + " carpeta, escriba la ruta completa");
                String name3 = sc.next();
                sc.nextLine();
                System.out.println("Ingrese el texto a agregar");
                String nuevoTexto1 = sc.nextLine();
                System.out.println(Archivos.editFile(name3, nuevoTexto1));
                break;
            case 4:
                System.out.println("Ingrese el nombre (con la extension) "
                        + "del archivo a elimnar: ");
                System.out.println("Si el archivo no esta en la carpeta "
                        + "del programa, ingrese la ruta completa.");
                String name4 = sc.next();
                System.out.println(Archivos.removeFile(name4));
                break;
            case 5:
                System.out.println("Bye");
                break;
            default:
                System.out.println("Opcion invalida");
        }
    }
}
