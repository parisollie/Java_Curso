/*
  Excepciones: son problemas o errores que pueden ocurrir mientras se 
  ejecutan en nuestra app.
*/
import javax.swing.JOptionPane;

public class Ejercicio1 {

    public static void main(String[] args) {

        
        int x, y, i = 0, tryCount = 0;
        // Para que nos diga si ocurrió algun error
        boolean errores = false;

        //Código dónde puede ocurrir una excepción o un error
        //Para contar las 3 oportunidades que tendra el usuario
        while (tryCount < 3) {
            tryCount++;

            try {

                //Se almacena en  x el valor entrado por el usuario.
                x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un"
                        + " número entero: ",
                        "Solicitando datos", 3));
                //Se almacena en  y el valor entrado por el usuario.
                y = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa otro"
                        + " número entero: ",
                        "Solicitando datos", 3));
                JOptionPane.showMessageDialog(null, "La división de: " + x + "/"
                        + y + " es " + (x / y), "Mostrando resultado", 1);
                System.out.println("\n-Te ha salido la divición.....Hurray!");
                break;

            } catch (NumberFormatException n) {
                //Aquí va el  tipo de error dentro del catch.
                errores = true;
                System.out.println(n.getMessage() + " No es un número entero!");
                /*Nos mandará el error que obtuvimos osea una letra.
                Capturamos otra excepción dentro de está para que no dividamos 
                entre cero. */
                System.out.println("Intenta nuevamente...");
            } catch (ArithmeticException a) {
                errores = true;
                System.out.println(a.getMessage() + "-No se puede dividir entre "
                        + "cero!");
                System.out.println("Intenta nuevamente...");

            }/* finally { // Puede llevar o no llevar finally.

                if (errores == true) {
                    System.out.println();
                    System.out.println("Concluyó con errores.");

                }*/
        }
    }
}
//}
