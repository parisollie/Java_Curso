
public class Asignatura {

    String nombre;
    int clave;
    String Horario;
    int creditos;

    Asignatura(String nombre, int clave, String Horario, int creditos) {
        this.nombre = nombre;
        this.clave = clave;
        this.Horario = Horario;
        this.creditos = creditos;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", clave=" + clave + ", Horario=" + Horario + ", creditos=" + creditos + '}';
    }
}
