import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.LinkedList;

public class Ejercicio3 {

    public static void main(String[] args) {

        int opcion, contadorAlu = 0;
        Scanner teclado;
        teclado = new Scanner(System.in);
        LinkedList<Alumno> alumnos;
        alumnos = new LinkedList<>();
        Alumno alu[] = new Alumno[2];

        String nombre, apellido, calle, colonia;
        int edad, numero;

        Ejercicio3 ej2 = new Ejercicio3();

        do {
            System.out.println("¿Que desea hacer?");
            System.out.println("-1- Agregar alumno a la lista actual");
            System.out.println("-2- Guardar lista actual a un archivo");
            System.out.println("-3- Abrir lista desde un archivo");
            System.out.println("-4- Salir");
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion) {

                case 1:
                    System.out.println("Escriba el nombre del alumno");
                    nombre = teclado.nextLine();
                    System.out.println("Escriba el apellido del joven " + nombre);
                    apellido = teclado.nextLine();
                    System.out.println("Escriba la edad del joven " + nombre);
                    edad = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Escriba la calle de la residencia del joven " + nombre);
                    calle = teclado.nextLine();
                    System.out.println("Escriba el numero de la calle ");
                    numero = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Escriba la colonia donde recide el joven " + nombre);
                    colonia = teclado.nextLine();
                    alu[contadorAlu] = new Alumno(nombre, apellido, edad, calle, numero, colonia);
                    alumnos.add(alu[contadorAlu]);
                    contadorAlu++;
                    break;

                case 3:
                    ej2.escribeFichero("C:\\Users\\andro\\Desktop\\Prueba.txt", contadorAlu);
                    ej2.anhadeFichero("C:\\Users\\andro\\Desktop\\Prueba.txt", contadorAlu);
                    break;

                case 4:
                    ej2.leeFichero("C:\\Users\\andro\\Desktop\\Prueba.txt");
                    break;

                case 5:
                    System.out.println("Gracias por usar el programa.");
                    teclado.close();
                    break;

                default:
                    System.out.println("Valor no valido.");
                    break;
            }

        } while (opcion != 5);

        /* Alumno alu1=new Alumno("juan","perez",31,"falsa",123,"siempreviva");
            Asignatura materia1 = new Asignatura("eda2",1323,"15:00-17:00",6);
            alu1.addMateria(materia1);
            Asignatura materia2 = new Asignatura("poo",1317,"11:00-13:00",6);
            alu1.addMateria(materia2);
            * //System.out.println(materia1.toString());
            System.out.println(alu1.toString());
            for(Asignatura actual : alu1.materias){
                System.out.println("Nombre Asignatura:  "+actual.nombre);
                System.out.println("Clave: "+actual.clave);
                System.out.println("Horario  "+actual.Horario);
         */
    }

    public void escribeFichero(String fichero, int contadorAlu) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero));
            for (int i = 0; i < contadorAlu; i++) {
                Alumno al = new Alumno(i);
                oos.writeObject(al);
            }
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void anhadeFichero(String fichero, int contadorAlu) {
        
        
        try {
            // Se usa un ObjectOutputStream que no escriba una cabecera en
            // el stream.
            MiObjectOutputStream oos = new MiObjectOutputStream(FileOutputStream(fichero, true));
            // Se hace el new fuera del bucle, sólo hay una instancia de persona.
            // Se debe usar entonces writeUnshared().
            Alumno al = new Alumno();
            for (int i = 0; i < contadorAlu; i++) {
                al.setAlumno(i);   // Se rellenan los datos de Persona.
                oos.writeUnshared(al);
            }
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void leeFichero(String fichero) {
        try {
            // Se crea un ObjectInputStream
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream(fichero));

            // Se lee el primer objeto
            Object aux = ois.readObject();

            // Mientras haya objetos
            while (aux != null) {
                if (aux instanceof Alumno) {
                    System.out.println(aux);
                }
                aux = ois.readObject();
            }
            ois.close();
        } catch (EOFException e1) {
            System.out.println("Fin de fichero");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
