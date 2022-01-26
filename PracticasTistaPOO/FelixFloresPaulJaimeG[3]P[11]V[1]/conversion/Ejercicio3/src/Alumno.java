
import java.util.LinkedList;
import java.io.Serializable;
import java.util.Scanner;

public class Alumno implements Serializable {

    private String nombre;
    private String Apellido;
    private int edad;
    Domicilio direccion;
    LinkedList<Asignatura> materias;

    public Alumno(int i) {
        setAlumno(i);
    }

    public Alumno(String nombre, String apellido, int edad, String calle, int numero, String Colonia) {
        this.nombre = nombre;
        this.Apellido = apellido;
        this.edad = edad;
        this.direccion = new Domicilio(calle, numero, Colonia);
        troncoComun();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    private void troncoComun() {

        Scanner teclado;
        teclado = new Scanner(System.in);
        String nomMateria, horario;
        int clave, grupo;

        this.materias = new LinkedList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Escriba el nombre de la materia " + i + 1);
            nomMateria = teclado.nextLine();
            System.out.println("Escriba la clave de la materia " + i + 1);
            clave = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Escriba el horario de la materia " + i + 1);
            horario = teclado.nextLine();
            System.out.println("Escriba el grupo de la materia " + i + 1);
            grupo = teclado.nextInt();
            teclado.nextLine();
            Asignatura materia = new Asignatura(nomMateria, clave, horario, grupo);
            materias.add(materia);
        }
        teclado.close();
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", Apellido=" + Apellido + ""
                + ", edad=" + edad + ", direccion=" + direccion.toString() + '}';
    }

    public void setAlumno(int i) {
        nombre = "nombre" + i;
        Apellido = "pellido" + i;
        edad = i;

    }
}
