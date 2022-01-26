

import java.util.Scanner;

/**
 *
 * @author Edgar
 */
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
        System.out.println("****************************************************************");
        System.out.println("A continuacion se crearan los militares:");
        System.out.print("Introduzca la matrícula del militar: ");
        mat = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduzca el nombre completo del militar: ");
        nombre= sc.nextLine();
        System.out.print("Introduzca el nombre del grado del militar:  ");
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
