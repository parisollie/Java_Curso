
import javax.swing.JOptionPane;


public class Practica5 {

    
    public static void main(String[] args) {
        
        String nom,ape,puesto,area,turno;  //3 questionmessage
        double suelBas,suelAdic;
        int subordinados,jornadaLaboral;
        
        suelAdic=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa el sueldo adicional del director: ","Solicitando sueldo base: ",3));
        suelBas=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa el sueldo base del director: ","Solicitando sueldo base: ",3));
        nom=JOptionPane.showInputDialog(null,"Ingresa el nombre del director: ","Solicitando nombre: ",3); 
        ape=JOptionPane.showInputDialog(null,"Ingresa el apellido del director: ","Solicitando apellido: ",3); 
        puesto=JOptionPane.showInputDialog(null,"Ingresa el puesto director: ","Solicitando puesto: ",3); 
        area=JOptionPane.showInputDialog(null,"Ingresa el area del director: ","Solicitando area: ",3);
        subordinados=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el numero de subordinados: ","Solicitando el # de subordinados: ",3));
        
        Directivo emp1 = new Directivo(suelAdic,suelBas,nom,ape,puesto);
        
        Gerente ger1 = new Gerente("dos",2,12343.99,1253.99,"Diana","Garcia","Administradora");
        Gerente ger2 = new Gerente("dos",2,14673.99,1982.99,"Denisse","Miranda","Administradora");
        Operativos oper1 = new Operativos("Matutino",8,"tres",1,1200.99,100.99,"Ivan","Moreno","Cargador");
        Operativos oper2 = new Operativos("Vespertino",24,"tres",1,1250.99,500.99,"Guillermo","Flores","Supervisor");
        Operativos oper3 = new Operativos("Nocturno",12,"tres",1,1250.99,500.99,"Alejandra","Martinez","Guardia de seguridad");
        
        emp1.verDatos();
        ger1.verDatos();
        ger2.verDatos();
        oper1.verDatos();
        oper2.verDatos();
        oper3.verDatos();
        
        
        
    }
    
}
