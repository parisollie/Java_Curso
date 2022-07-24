//Código muestra como obtener los días de diferencia entre dos fechas dadas
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Fechas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws ParseException  {

   SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

		Date fechaInicial=dateFormat.parse("2019-02-14");
		Date fechaFinal=dateFormat.parse("2019-01-20");
                System.out.println("Entre las fechas : 2019-02-14 & 2019-01-20 ");
                int dias=(int) ((fechaFinal.getTime()-fechaInicial.getTime())/86400000);
                System.out.println("Hay: "+dias+" dias de diferencia");
}
}


