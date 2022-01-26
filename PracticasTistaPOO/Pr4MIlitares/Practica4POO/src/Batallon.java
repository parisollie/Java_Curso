

import java.util.LinkedList;
import java.util.Scanner;
import javax.swing.JOptionPane;
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
            
        }
    }
    static Batallon CrearBatallon(String nomDivision,int num){
        Scanner sc = new Scanner(System.in);
        int id;
        String cate,edo;
        System.out.println("****************************************************************");
        System.out.println("Se creará el batallon: "+num+" de la division: "+nomDivision);
        System.out.println("****************************************************************");
        //System.out.print("Introduzca el numero del identificador: ");
        //id = sc.nextInt();
        id=Integer.parseInt(JOptionPane.showInputDialog(null,
                "Introduzca el numero del identificador: "),3);
        //sc.nextLine();
        //System.out.print("Introduzca el nombre de la  categoria:  ");
        //cate= sc.nextLine();
        cate=JOptionPane.showInputDialog(null,"Introduzca el nombre de la  categoria: "
                ,"Solicitando la categoria: ",3); 
        edo=JOptionPane.showInputDialog(null,"Introduzca la ubicacion: "
                ,"Solicitando el estado: ",3); 
        
        //System.out.print("Introduzca la ubicacion (estado):  ");
        //edo= sc.nextLine();
        
        Batallon miBat = new Batallon(id,cate,edo);
        
        int militares=Integer.parseInt(JOptionPane.showInputDialog(null,
                "Introduce el numero de militares del batallon de: "+cate),3);
        
        //System.out.println("Introduce el numero de militares del batallon de: "+cate);
        //int militares = sc.nextInt();
        
        
        for(int i=0; i<militares;i++){
            Militar nuevoMilitar = Militar.crearMilitar();
            miBat.LMilitares.add(nuevoMilitar);
            System.out.println("****************************************************************");
            System.out.println("Hasta el momento se han creado: "+Militar.numMilitar+" militares");
        }
            
        return miBat;
    }
    
    
}
