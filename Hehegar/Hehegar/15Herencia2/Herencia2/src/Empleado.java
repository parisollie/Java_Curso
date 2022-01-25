//Subclase
import javax.swing.JOptionPane;

//La clase empleado hereda de persona.
public class Empleado extends Persona {
    
    //Atributos de esta clase
    double sueldo;
    String telefono,direccion;
    
    //Creando constructor
    public Empleado(String nombre,int edad,double suel,String tel,String dir){
        //Necesita los mismos atributos que hereda de persona.
        //Para emplear los atributos de otra clase se usa super y pone los
        //parametros que heredo
        super(nombre, edad);
        //Esto es de la propia clase
        this.direccion=dir;
        this.sueldo=suel;
        this.telefono=tel;
    }
    //Como herede debemos de sobreescribir con override
    @Override 
    public void verDatos(){
        //el null es por parte del JOptione
        JOptionPane.showMessageDialog(null,"Nombre: " + nombre +"\nEdad: " +
                edad+ "\nSueldo: "+ sueldo + "\nTelefono: "+ telefono +
                "\nDireccion: "+ direccion," Datos del empleado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
