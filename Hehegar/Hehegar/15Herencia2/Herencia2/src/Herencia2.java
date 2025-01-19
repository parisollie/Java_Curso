//15 Hehegar Herencia

import javax.swing.JOptionPane;


public class Herencia2 {

    public static void main(String[] args) {
        //3 questionmessage va por defecto
        String nom,tel,dir,nomb,telf,dire,noms,tels,dirs;  
        double suel,sueld,suels;
        int edad,eda,edads;
        
        nom=JOptionPane.showInputDialog(null,"Ingresa el nombre del empleado no 1: "
                ,"Solicitando nombre: ",3); 
        edad=Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingresa la edad del empleado: ","Solicitando la edad: ",3));
        suel=Double.parseDouble(JOptionPane.showInputDialog(null,
                "Ingresa el sueldo del empleado: ","Solicitando sueldo: ",3));        
        tel=JOptionPane.showInputDialog(null,
                "Ingresa el telefono del empleado: ","Solicitando el teléfono: ",3);
        dir=JOptionPane.showInputDialog(null,
                "Ingresa la direccion del empleado: ","Solicitando la dirección: ",3); 
        
        nomb=JOptionPane.showInputDialog(null,
                "Ingresa el nombre del empleado no 2: ","Solicitando nombre: ",3); 
        eda=Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingresa la edad del empleado: ","Solicitando la edad: ",3));
        sueld=Double.parseDouble(JOptionPane.showInputDialog(null,
                "Ingresa el sueldo del empleado: ","Solicitando sueldo: ",3));        
        telf=JOptionPane.showInputDialog(null,
                "Ingresa el telefono del empleado: ","Solicitando el teléfono: ",3);
        dire=JOptionPane.showInputDialog(null,
                "Ingresa la direccion del empleado: ","Solicitando la dirección: ",3);
        
        noms=JOptionPane.showInputDialog(null,
                "Ingresa el nombre del empleado no 3: ","Solicitando nombre: ",3); 
        edads=Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingresa la edad del empleado: ","Solicitando la edad: ",3));
        suels=Double.parseDouble(JOptionPane.showInputDialog(null,
                "Ingresa el sueldo del empleado: ","Solicitando sueldo: ",3));        
        tels=JOptionPane.showInputDialog(null,
                "Ingresa el telefono del empleado: ","Solicitando el teléfono: ",3);
        dirs=JOptionPane.showInputDialog(null,
                "Ingresa la direccion del empleado: ","Solicitando la dirección: ",3);
        
        //Paso 8,ponemos los objeto empleado.
        Empleado emp1 = new Empleado(nom,edad,suel,tel,dir);
        Empleado emp2 = new Empleado(nomb,eda,sueld,telf,dire);
        Empleado emp3 = new Empleado(noms,edads,suels,tels,dirs);
        
        /*
        Estatico
        Empleado emp1 = new Empleado("Rafel Ramo ",23,5000,"16728362","Miami #18");
        Empleado emp2= new Empleado("Nick Bransby ",25,9000,"987654321","Iztapalapa #18");
        Empleado emp3= new Empleado("Ivan Moreno ",21,1000,"22222","Los Mochis #542");
        */
        emp1.verDatos();
        emp2.verDatos();
        emp3.verDatos();
    }
    
}
