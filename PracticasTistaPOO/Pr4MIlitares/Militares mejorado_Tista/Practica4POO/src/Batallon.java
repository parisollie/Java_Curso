

import java.util.LinkedList;
import java.util.Scanner;
/**
 *
 * @author Edgar
 */
public class Batallon {
    public static int numBatallon;
    int identificador;
    String categoria;
    String ubicacion;
    LinkedList<Militar> LMilitares;
    
    public Batallon(int identificador, String categoria, String ubicacion){
        numBatallon++;
        this.identificador=identificador;
        this.categoria=categoria;
        this.ubicacion=ubicacion;
        this.LMilitares=new LinkedList();
    }
            
    
    public void imprimirBatallon() {
        
        System.out.println("El id único es:"+this.identificador);
        System.out.println("La categoria :"+this.categoria);
        System.out.println("La ubicacion es: "+this.ubicacion);
        System.out.println("****************************************************************");
        System.out.println("Militares del batallon de: "+this.categoria);
        
        for(Militar MilActual : LMilitares){
            MilActual.imprimirMilitar();
            System.out.println("----------------------------------------------------------------");
        }
    }
    static Batallon CrearBatallon(String nomDivision,int num){
        Scanner sc = new Scanner(System.in);
        int id;
        String cate,edo;
        System.out.println("****************************************************************");
        System.out.println("Se creará el batallon: "+num+" de la division: "+nomDivision);
        System.out.println("****************************************************************");
        System.out.print("Introduzca el numero del identificador: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduzca el nombre de la  categoria:  ");
        cate= sc.nextLine();
        System.out.print("Introduzca la ubicacion (estado):  ");
        edo= sc.nextLine();
        Batallon miBat = new Batallon(id,cate,edo);
        System.out.println("Introduce el numero de militares del batallon de: "+cate);
        int militares = sc.nextInt();
        for(int i=0; i<militares;i++){
            Militar nuevoMilitar = Militar.crearMilitar();
            miBat.LMilitares.add(nuevoMilitar);
            System.out.println("****************************************************************");
            System.out.println("Hasta el momento se han creado: "+Militar.numMilitar+" militares");
        }
            
        return miBat;
    }
    
    
}
