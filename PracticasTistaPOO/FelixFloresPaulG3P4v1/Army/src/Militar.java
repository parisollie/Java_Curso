
import java.util.LinkedList;
import java.util.List;

public class Militar {
     //Variable estatica
    static int numMil;
    //Atributos
    int Matricula;
    String Nombre;
    String GradoMil;
    List<Militar> Batallones = new LinkedList<>();
    
    //Creando el constructor
    public Militar(int a, String name, String ocup){ // mandando a pedir los parametros
        this.Matricula = a;
        this.Nombre = name;
        this.GradoMil = ocup;
    }
    public static void imprimirListaBatallon(List<Militar> listaPrint){
        System.out.println(listaPrint);
    }
    
}
