
import java.util.LinkedList;


public class Alumno {
    private String nombre;
    private String Apellido;
    private int edad;
    Domicilio direccion;
    LinkedList<Asignatura> materias;
    
    
    public Alumno(String nombre, String apellido, int edad, String calle, int numero, String Colonia){
        this.nombre=nombre;
        this.Apellido=apellido;
        this.edad=edad;
        this.direccion = new Domicilio(calle,numero,Colonia);
        troncoComun();
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre){
        this.nombre=Nombre;
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
    
    private void troncoComun(){
        this.materias = new LinkedList<>();
        Asignatura materia1 = new Asignatura("calculo",1234,"7:00-9:00",6);
        Asignatura materia2 = new Asignatura("fundamentos",2312,"9:00-11:00",6);
        Asignatura materia3 = new Asignatura("quimica",2214,"11:00-13:00",4);
      
        materias.add(materia1);
        materias.add(materia2);
        materias.add(materia3);
        
    }
    
    
    public void addMateria(Asignatura materia){
        this.materias.add(materia);
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", Apellido=" + Apellido + ", edad=" + edad + ", direccion=" + direccion.toString() + '}';
    }

    
}
