
import java.util.LinkedList;
import java.util.List;


public class Batallon {
     
    //Atributos
    static int numBata;
    int num;
    String categ;
    String location;
    List <Militar> militares = new LinkedList <>();
    
//Constructor
    public Batallon(int clave,String categoria, String ubicacion){
        this.num= clave;
        this.categ = categoria;
        this.location = ubicacion;
    }
    
    public static void imprimirListaMilitar(List<Militar> listaPrint){
        System.out.println(listaPrint);
    }
    
}
