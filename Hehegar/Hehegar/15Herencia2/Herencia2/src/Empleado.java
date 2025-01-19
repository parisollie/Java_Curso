//Paso 4, creamos la subclase
import javax.swing.JOptionPane;

//Paso 5,la clase empleado hereda de persona.
public class Empleado extends Persona {
    
    //Paso 6, atributos de esta clase.
    double sueldo;
    String telefono,direccion;
    
    //Paso 7,creando constructor.
    //Nceesita tener String e int ,porque los esta heredando
    public Empleado(String nombre,int edad,double suel,String tel,String dir){
        /*Necesita los mismos atributos que hereda de persona.
        Para emplear los atributos de otra clase se usa super y pone los
        parámetros que heredó.*/
        super(nombre, edad);
        //Esto es de la propia clase.
        this.direccion=dir;
        this.sueldo=suel;
        this.telefono=tel;
    }
    //Paso 8,como herede un metódo,debemos de sobreescribir con override.
    @Override 
    public void verDatos(){
        //el null es por parte del JOptione
        JOptionPane.showMessageDialog(null,"Nombre: " + nombre +"\nEdad: " +
                edad+ "\nSueldo: "+ sueldo + "\nTeléfono: "+ telefono +
                "\nDirección: "+ direccion," Datos del empleado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
