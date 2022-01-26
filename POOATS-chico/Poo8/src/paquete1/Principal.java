
package paquete1;

public class Principal {
    
    public static void main(String[] args){
        
    //Creando Objetos 
    Persona persona1 = new Persona("Regina Mia Colucci Selena",14);
    /*
    La edad aumenta porque la podemos cambiar cuando nosotros
    queramos exepetos los que son constantes
    */
    persona1.setEdad(15);//Sólo le estamos cambiando la edad porque es variable
    persona1.mostarDatos();
    }
    
}
