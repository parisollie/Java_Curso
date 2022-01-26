
import java.util.Scanner;

/*16)La calificacion final de un estudiante de informatica se calcula con base a
las clificaciones de cuatro aspectos de su rendimiento academico:
parcipacion,primer examen ,segundo, examen final.Sabiendo que las calificaciones
anteriores entran a la calificacion finla con ponderaciones del 10%,25%,25% y 40%
Hacer un programa que calcule e imprima la calificacion obtenida del estudiante

*/
public class PromedioAlumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new  Scanner (System.in);
        float participacion,primerExamen, segundoExamen,examenFinal,notaFinal;
        
        System.out.println("Digita la nota de participacion: ");
        participacion = entrada.nextFloat();//Para guardr los datos
        System.out.println("Digita la nota del primer examen parcial: ");
        primerExamen = entrada.nextFloat();//Para guardr los datos
        System.out.println("Digita la nota del segundo examen parcial: ");
        segundoExamen = entrada.nextFloat();//Para guardr los datos
        System.out.println("Digita la nota del examen final: ");
        examenFinal = entrada.nextFloat();//Para guardr los datos
        
        //sacando los calculos
        participacion *= 0.10f; //asignando los porcentajes
        primerExamen *= 0.25f;
        segundoExamen *= 0.23f;
        examenFinal *= 0.40f;
        //sumando las notas
        notaFinal = participacion + primerExamen +segundoExamen +examenFinal;
        
        System.out.println("La nota final es: "+notaFinal);
        
    
    }
    
}
