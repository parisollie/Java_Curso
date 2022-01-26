import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pedirfecha {
    public static void main (String[]args) {

        System.out.println("Introduzca la fecha con formato dd/mm/yyyy");
        
        Scanner sc = new Scanner(System.in);
        String fecha = sc.nextLine();
        
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date cambiarFecha = null;
        String date = fecha;
        try{
            cambiarFecha = df.parse(date);
            System.out.println("Ahora hemos creado un objeto date con la fecha indicada, "+cambiarFecha);
            
            
        
        } catch (Exception e){ System.out.println("Fecha incorrecta");}

        if (!df.format(cambiarFecha).equals(date)){
            System.out.println("Fecha invalida!!");
        } else {
            System.out.println("Fecha validada");
        }

    }
}