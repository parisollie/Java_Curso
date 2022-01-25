//Subclase
import javax.swing.JOptionPane;
//La clase empleado hereda de persona.
public class Empleado extends Persona {
    //Atributos.
    double sueldo;
    String telefono,direccion;
    
    //Creando constructor.
    //necesita los mismos atributos que hereda de persona
    public Empleado(String nombre,int edad,double suel,String tel,String dir){
        // para emplear los atributos de otra clase
        super(nombre, edad); 
        this.direccion=dir;
        this.sueldo=suel;
        this.telefono=tel;
    }
    /*
    Al hacer una clase abstracta obligamos al método a sobreescribir.
    No le hereda nada ,le obliga a crear su método para que le ponga de su parte
    */
    // Sobreescribimos
    @Override 
    public void verDatos(){
        JOptionPane.showMessageDialog(null,"Nombre: " + nombre +"\nEdad: " +
                edad+ "\nSueldo: "+ sueldo + "\nTelefono: "+ telefono +
                "\nDireccion: "+ direccion," Datos del empleado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}