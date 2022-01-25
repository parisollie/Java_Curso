//Subclase
import javax.swing.JOptionPane;
//La clase empleado hereda de persona
//Cuando ponemos (implements) estamos poniendo una interface
public class Empleado extends Persona implements Enfermo { 
    // Si agregamos otra interface solo ponemos (,) implements Enfermo,Accidente
    double sueldo;
    String telefono,direccion;
    
    //Creando constructor
    //Necesita los mismosatributos que hereda de persona
    public Empleado(String nombre,int edad,double suel,String tel,String dir){
        // para emplear los atributos de otra clase 
        super(nombre, edad);
        this.direccion=dir;
        this.sueldo=suel;
        this.telefono=tel;
    }
    
    @Override // Sobreescribimos
    public void verDatos(){
        JOptionPane.showMessageDialog(null," Nombre: " + nombre +"\nEdad: " +
                edad+ "\nSueldo: "+ sueldo + "\nTelefono: "+ telefono +
                "\nDireccion: "+ direccion," Datos del empleado",
                JOptionPane.INFORMATION_MESSAGE);
    }
    
    @Override
    public void tos(){
        JOptionPane.showMessageDialog(null,"Estoy enfermo de tos, coof ,coof");
    }
    
    @Override
    public void diarrea(){
        JOptionPane.showMessageDialog(null,"Estoy enfermo de diarrea, snif,snif");
    }
}