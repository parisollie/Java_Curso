//Código muestra como obtener los días de diferencia entre dos fechas dadas
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Fechas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws ParseException  {

   SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date fechaInicial = dateFormat.parse("2019-02-14"); //damos las fechss
        Date fechaFinal = dateFormat.parse("2019-01-20");
        System.out.println("1.-Entre las fechas : 2019-02-14 & 2019-01-20 ");
        int dias = (int) ((fechaFinal.getTime() - fechaInicial.getTime()) / 86400000); //Restamos las fechas
        System.out.println("Hay: " + dias + " dias de diferencia");
        System.out.println("2.-Calculando 50 días despues apartir de la fecha de hoy");
        Calendar hoy = Calendar.getInstance();//Creamos un objeto llamado hoy de la clase mañana
        hoy.add(Calendar.DATE, +50); //Aumentamos los 50 dias
        System.out.println(hoy.getTime()); //Obtenemos el dia con los 50 dias más


        Date Hoy = Calendar.getInstance().getTime();

        // Construye un SimpleDateFormat usando el patrón dado
        SimpleDateFormat Cambiarnombre = new SimpleDateFormat("MMM dd yyyy HH:mm:ss.SSS zzz");

        // format () formatea una fecha en una cadena de fecha / hora
        String tiempoActual = Cambiarnombre.format(Hoy);
        System.out.println("Tiempo actual = " + tiempoActual);

        try {

            // parse () analiza el texto desde el principio de la cadena dada para producir una fecha.
            Date fecha = Cambiarnombre.parse(tiempoActual);

            // getTime () devuelve el número de milisegundos desde el 1 de enero de 1970, 00:00:00 GMT representado por este objeto Fecha.
            long epoch = fecha.getTime();

            System.out.println("Tiempo en Epoch: " + epoch);

        } catch (ParseException e) {
            e.printStackTrace();
        }
}
}

