
import java.util.LinkedList;
import java.util.List;

public class Division {
    //Atributos
    String Nombre;
    String Zona;
    List<Batallon> Batallones = new LinkedList<>();
    //Constructor
    public Division(String name, String zone){// mandando a pedir los parametros
        this.Nombre = name;
        this.Zona = zone;
    }
   //Creando metodos para imprimir
    public static void imprimirListaBatallon(List<Batallon> listaPrint){ // mandando a pedir los parametros
        System.out.println(listaPrint);
    }
    //metodo para ver los datos
    void verDatos(){
        System.out.println("No. Control "+ Nombre);
        System.out.println("Nombre: "+Zona);
        System.out.println("Apellidos: "+ Batallones);
    }
    
}
