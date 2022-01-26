
package polimorfismo;

/**
 *
 * @author Edgar
 */
public class Empleado extends Persona{
    int salario;
    int renta;

    public Empleado(){
//        System.out.println("se ha creado un empleado");
    }
    
    public Empleado(int salario, int renta, int id, String Nombre, String Apellido) {
        super(id, Nombre, Apellido);
        this.salario = salario;
        this.renta = renta;
    }
    
    @Override
    public void Saludar(){
        System.out.println("Buenos dias Licenciado");
    }
    
    public void caminar(){
        System.out.println("Yo estoy caminando??");
    }
    
}
