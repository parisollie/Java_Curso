
//16 Hehegar
import javax.swing.JOptionPane;


public class AbstraccionH {

    public static void main(String[] args) {
        //3 questionmessage va por defecto
        String nom,tel,dir;  
        double suel;
        int edad;
        /*
        nom=JOptionPane.showInputDialog(null,"Ingresa el nombre del empleado: ","Solicitando nombre: ",3); 
        edad=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa la edad del empleado: ","Solicitando la edad: ",3));
        suel=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa el sueldo del empleado: ","Solicitando sueldo: ",3));        
        tel=JOptionPane.showInputDialog(null,"Ingresa el telefono del empleado: ","Solicitando el telefono: ",3);
        dir=JOptionPane.showInputDialog(null,"Ingresa la direccion del empleado: ","Solicitando la direccion: ",3); 
        
        Empleado emp1 = new Empleado(nom,edad,suel,tel,dir);
        Empleado emp2 = new Empleado(nom,edad,suel,tel,dir);
        Empleado emp3 = new Empleado(nom,edad,suel,tel,dir);
        
        */
         
        //Paso 8,Estático
        Empleado emp1 = new Empleado("Rafel Ramo ",23,5000,"16728362","Miami #18");
        Empleado emp2= new Empleado("Nick Bransby ",25,9000,"987654321","Inglaterra #18");
        Empleado emp3= new Empleado("Ivan Moreno ",21,1000,"22222","Los Mochis #542");
        
        emp1.verDatos();
        emp2.verDatos();
        emp3.verDatos();
    }
    
}
