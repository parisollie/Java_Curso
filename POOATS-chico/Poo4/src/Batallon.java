import java.util.LinkedList;
import java.util.Scanner;
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
        System.out.println("Militares del batallon de: "+this.categoria);
        System.out.println("********************");
        for(Militar MilActual : LMilitares){
            MilActual.imprimirMilitar();
        }
    }
    static Batallon CrearBatallon(String nomDivision,int num){
        Scanner sc = new Scanner(System.in);
        int id;
        String cate,edo;
        System.out.println("\n\nSe creará el batallon # "+num+" de la division ( "+nomDivision+" )");
        
        System.out.print("\n\nIntroduzca el identificador: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduzca la categoria:  ");
        cate= sc.nextLine();
        System.out.print("Introduzca la ubicacion (estado):  ");
        edo= sc.nextLine();
        Batallon miBat = new Batallon(id,cate,edo);
        System.out.print("Introduce el numero de militares del batallon de ( "+cate+" ): ");
        int militares = sc.nextInt();
        
        for(int i=0; i<militares;i++){
            Militar nuevoMilitar = Militar.crearMilitar();
            miBat.LMilitares.add(nuevoMilitar);
            System.out.println("Hasta el momento se han creado "+Militar.numMilitar+" militares");
            System.out.println("--------------------------------------------------");
        }
            
        return miBat;
    }
}
