


import java.util.LinkedList;
import java.util.Scanner;

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
        System.out.print("Introduzca el nombre de la division: ");
        Nombre = sc.nextLine();
   //     sc.nextLine();
        System.out.print("Introduzca el nombre de la zona de division: ");
        Zona =sc.nextLine();
        Division nuevaDivision = new Division(Nombre,Zona);
        System.out.println("Introduce el numero de batallones de la division: "+Nombre);
        int batallones = sc.nextInt();
        nuevaDivision.agregarBatallonADivision(batallones);
    
        return nuevaDivision;    
    }
    
    public Division(String Nombre, String Zona){
        this.Nombre=Nombre;
        this.Zona=Zona;
        LBatallones = new LinkedList<>();
    }

    
    public void imprimirDivision(){
        
        System.out.println("****************************************************************");
        System.out.println("Datos de la division:      ");
        System.out.println("El nombre es:"+this.Nombre);
        System.out.println("La zona es :"+this.Zona);
        
        System.out.println("Batallones de la division "+this.Nombre+":");
        for(Batallon Bactual : LBatallones){
            Bactual.imprimirBatallon();
        }
        System.out.println("****************************************************************");
        System.out.println("Se crearon un total de: "+Batallon.numBatallon+" Batallones");
        System.out.println("Se crearon un total de: "+Militar.numMilitar+" Militares");
        System.out.println("El programa finalizo correctamente");
        System.out.println("****************************************************************");

    }
    
    public void agregarBatallonADivision(int num){
        for(int i=0; i<num;i++){
            Batallon nuevoBat = Batallon.CrearBatallon(this.Nombre,i+1);
            this.LBatallones.add(nuevoBat);
            System.out.println("Hasta ahora se han creado "+Batallon.numBatallon+" Batallones");
        }
            
    }
    
}
