

import javax.swing.JOptionPane;

public class Gerente extends Directivo{
    
    //Atributos
    String area;
    int subordinados;

    public Gerente(String area, int subordinados, double salarioAdicional, double salarioBase, String nombre, String apellido, String puesto) {
        super(salarioAdicional, salarioBase, nombre, apellido, puesto);
        this.area = area;
        this.subordinados = subordinados;
    }
    public void verDatos(){
        JOptionPane.showMessageDialog(null,"Area: " + area +"\nSubordinados: " + subordinados +"\nSalario Base: "+
                salarioBase+ "\nNombre: "+ nombre + "\nApellido: "+ apellido +
                "\nPuesto: "+ puesto," Datos del Gerente",
                JOptionPane.INFORMATION_MESSAGE);
    }
    
    
     
    
}
