
import javax.swing.JOptionPane;


public class Operativos extends Gerente {
    
    //Atributos
    String turno;
    int jornadaLaboral;
    //Costructor

    public Operativos(String turno, int jornadaLaboral, String area, int subordinados, double salarioAdicional, double salarioBase, String nombre, String apellido, String puesto) {
        super(area, subordinados, salarioAdicional, salarioBase, nombre, apellido, puesto);
        this.turno = turno;
        this.jornadaLaboral = jornadaLaboral;
    }
    
    
     public void verDatos(){
        JOptionPane.showMessageDialog(null,"Turno: " + turno +"\nJornada laboral: " + jornadaLaboral +
                "\nArea: " + area +"\nSubordinados: " + subordinados +"\nSalario Base: "+
                salarioBase+ "\nNombre: "+ nombre + "\nApellido: "+ apellido +
                "\nPuesto: "+ puesto," Datos del operativo",
                JOptionPane.INFORMATION_MESSAGE);
    }
     

}

