
//18 Hehegar -Polimorfismo overload y override
import javax.swing.JOptionPane;


public class PolimorfismoH {

    
    public static void main(String[] args) {
        //Objeto de tipo Programador
        Programador p1 = new Programador();
        Analsta an1= new Analsta ();
        AdministradorBD bd1 = new AdministradorBD ();
        ProgramadorOverrride p2 = new ProgramadorOverrride();
        AnalistaOverride an2 = new AnalistaOverride ();
        AdministradorBDOverride bd2 = new AdministradorBDOverride ();
        
        JOptionPane.showMessageDialog(null,"Aqui comienza Polimorfismo Overload");
        
        p1.verdatos("Juanito","Galvan");
        //24 hrs y 100 pesos
        p1.sueldo(24,100);
        p1.labores("Programar");
        
        an1.verdatos("Ivan","Moreno", "Sinaloa");
        //Horas ,Paro e Incentivo
        an1.sueldo(24, 100,100);
        //Es analizador de datos y trabaja 8 horas
        an1.labores("Analizar datos", 8);
        
        bd1.sueldo(4500);
        bd1.verdatos("Paul");
        bd1.labores("Administrador BD");
        
        JOptionPane.showMessageDialog(null,"Aqui comienza Polimorfismo Overrride");
        
        p2.verdatos("Daz");
        p2.sueldo(2400);
        p2.labores("Programar en serio");
        
        an2.verdatos("Nick");
        an2.labores("Analist");
        an2.sueldo(5000);
        
        bd2.verdatos("Andrew");
        bd2.labores("Administrar en serio");
        bd2.sueldo(7000);
       
        }
    
}
