//Subclase
import javax.swing.JOptionPane;
//Paso 4,la clase empleado hereda de persona.
public class Empleado extends Persona {
    //Paso 5,le ponemos sus atributos.
    double sueldo;
    String telefono,direccion;
    
    //Paso 6, creando constructor.
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
    //Paso 7, sobreescribimos con el @Override.
    //No te gastes el dinero y haz mas de lo que hice de lo heredado.
    @Override 
    public void verDatos(){
        JOptionPane.showMessageDialog(null,"Nombre: " + nombre +"\nEdad: " +
                edad+ "\nSueldo: "+ sueldo + "\nTelefono: "+ telefono +
                "\nDireccion: "+ direccion," Datos del empleado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}