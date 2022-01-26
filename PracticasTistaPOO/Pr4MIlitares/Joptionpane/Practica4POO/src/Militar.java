

import java.util.Scanner;
import javax.swing.JOptionPane;

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
        System.out.println("A continuacion se crearan los militares:");
        mat=Integer.parseInt(JOptionPane.showInputDialog(null,
                "Introduzca la matrícula del militar: "),3);
        //System.out.print("Introduzca la matrícula del militar: ");
        //mat = sc.nextInt();
        //sc.nextLine();
        nombre=JOptionPane.showInputDialog(null,"Introduzca el nombre completo del militar: "
                ,"Solicitando el nombre: ",3); 
        
        //System.out.print("Introduzca el nombre completo del militar: ");
        //nombre= sc.nextLine();
        grado=JOptionPane.showInputDialog(null,"Introduzca el nombre del grado del militar: "
                ,"Solicitando el grado: ",3); 
        //System.out.print("Introduzca el nombre del grado del militar:  ");
        //grado = sc.nextLine();
        
        Militar nuevo = new Militar(mat,nombre,grado);
        return nuevo;
    }

    public void imprimirMilitar() {
       
         JOptionPane.showMessageDialog(null,"Datos del militar: " +"\nEl nombre es: " +
                Nombre+ "\nLa matricula es: "+ matricula+"\nSu grado es: " + GradoMil," Datos",
                JOptionPane.INFORMATION_MESSAGE);
        
        /*
        System.out.println("Nombre: "+this.Nombre);
        System.out.println("Matricula: "+this.matricula);
        System.out.println("Grado: "+this.GradoMil);
        */
    }
    
}
