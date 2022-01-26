
import javax.swing.JOptionPane;

//Clase Hija
public class Directivo extends Empleado{
    
    private double salarioAdicional;
    
    //Constructores

    public Directivo(double salarioAdicional, double salarioBase, String nombre, String apellido, String puesto) {
        super(salarioBase, nombre, apellido, puesto);
        this.salarioAdicional = salarioAdicional;
    }
    @Override // Sobreescribimos
    public void verDatos(){
        JOptionPane.showMessageDialog(null,"Salario Adicional: " + salarioAdicional +"\nSalario base: " +
                salarioBase+ "\nNombre: "+ nombre + "\nApellido: "+ apellido +
                "\nPuesto: "+ puesto," Datos del Directivo",
                JOptionPane.INFORMATION_MESSAGE);
    }
   
   
    
}
