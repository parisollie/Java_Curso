


import java.util.LinkedList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Edgar
 */
public class Division {
    
    String Nombre;
    String Zona;
    LinkedList<Batallon> LBatallones;
    
    public static Division crearDivision(){
        Scanner sc = new Scanner(System.in);
        String Nombre, Zona;
        Nombre=JOptionPane.showInputDialog(null,"Introduzca el nombre de la division: "
                ,"Solicitando nombre : ",3); 
        //System.out.print("Introduzca el nombre de la division: ");
        //Nombre = sc.nextLine();
        //sc.nextLine();
        Zona=JOptionPane.showInputDialog(null,"Introduzca el nombre de la zona de division: "
                ,"Solicitando la zona: ",3); 
        //System.out.print("Introduzca el nombre de la zona de division: ");
        //Zona =sc.nextLine();
        Division nuevaDivision = new Division(Nombre,Zona);
        int batallones=Integer.parseInt(JOptionPane.showInputDialog(null,
                "Introduce el numero de batallones de la division: "+Nombre),3);
        //System.out.println("Introduce el numero de batallones de la division: "+Nombre);
        //int batallones = sc.nextInt();
        nuevaDivision.agregarBatallonADivision(batallones);
    
        return nuevaDivision;    
    }
    
    public Division(String Nombre, String Zona){
        this.Nombre=Nombre;
        this.Zona=Zona;
        LBatallones = new LinkedList<>();
    }

    
    public void imprimirDivision(){
        
        JOptionPane.showMessageDialog(null,"Datos de la division: " +"\nEl nombre es: " +
                Nombre+ "\nLa zona es: "+ Zona ," Datos",
                JOptionPane.INFORMATION_MESSAGE);
        /*
        System.out.println("****************************************************************");
        System.out.println("Datos de la division:      ");
        System.out.println("El nombre es:"+this.Nombre);
        System.out.println("La zona es :"+this.Zona);*/
        
        
        System.out.println("Batallones de la division "+this.Nombre+":");
        for(Batallon Bactual : LBatallones){
            Bactual.imprimirBatallon();
        }
        
        JOptionPane.showMessageDialog(null,"Se crearon un total de: " + Batallon.numBatallon+
                " Batallones" +"\nSe crearon un total de: "+Militar.numMilitar+
                 " Militares"," Finalizo el programa",
                JOptionPane.INFORMATION_MESSAGE);
        /*
        System.out.println("****************************************************************");
        System.out.println("Se crearon un total de: "+Batallon.numBatallon+" Batallones");
        System.out.println("Se crearon un total de: "+Militar.numMilitar+" Militares");
        System.out.println("El programa finalizo correctamente");
        System.out.println("****************************************************************");
        */
    }
    
    public void agregarBatallonADivision(int num){
        for(int i=0; i<num;i++){
            Batallon nuevoBat = Batallon.CrearBatallon(this.Nombre,i+1);
            this.LBatallones.add(nuevoBat);
            System.out.println("Hasta ahora se han creado "+Batallon.numBatallon+" Batallones");
        }
            
    }
    
}
