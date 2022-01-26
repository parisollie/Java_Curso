
package ClasesYObjetos;

/**
 *
 * @author andro
 */

//Creamos a nuestro main
public class Main {
    public static void main(String[] args){
        
        Operacion op = new Operacion();//Creamos un objeto operacion
        
        op.leerNumeros(); //Leemos los numeros
        
        op.divicion();
        op.multiplicacion();
        op.resta();
        op.sumar();
        op.mostrarresultados();
        
        
    }
}
