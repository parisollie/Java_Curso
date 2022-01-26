import java.util.LinkedList;
import java.util.Scanner;
public class Militar {
    
    public static int numMilitar;
    int matricula;
    String Nombre;
    String GradoMil;
    
    public Militar(int matricula, String Nombre, String GradoMil) {
        numMilitar++;
        this.matricula=matricula;
        this.Nombre=Nombre;
        this.GradoMil = GradoMil;
        
    }

    
    
    public static Militar crearMilitar() {
        Scanner sc = new Scanner(System.in);
        int mat;
        String nombre,grado;
        System.out.println("\n\t.:Introduciendo a los militares:.\t\n");
        System.out.print("Introduzca la matrícula: ");
        mat = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduzca el nombre completo: ");
        nombre= sc.nextLine();
        System.out.print("Introduzca el grado:  ");
        grado = sc.nextLine();
        Militar nuevo = new Militar(mat,nombre,grado);
        return nuevo;
    }

    public void imprimirMilitar() {
       
        System.out.println("Nombre: "+this.Nombre);
        System.out.println("Matricula: "+this.matricula);
        System.out.println("Grado: "+this.GradoMil);
        
    }
}
