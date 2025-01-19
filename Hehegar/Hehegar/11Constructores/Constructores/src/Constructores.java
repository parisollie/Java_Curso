//11 Hehegar
/*Un constructor,es un metódo que se llama automáticamente cada vez que 
 se crea un objeto de una  clase.La principal misión del constructor es reservar
 memoria e inicializar las variavles(atributos)miembros de la clase.

Caracteríscas:

-Coincide con el nombre de la clase y no devuelve nada.
-Una clase puede tener varios constructores,que se diferencian por el tipo y 
 número de sus argumentos(sobrecarga)*/

public class Constructores {

    public static void main(String[] args) {
        /*Creando Objetos ,ya le estoy dando los parámetros*/
        Alumnos alu1 = new Alumnos(12345,"Juan Pablo","Niro Werito"); 
        Alumnos alu2 = new Alumnos(67891,"Rafael","Ramo Jacobo"); 
        alu1.verDatos();
        alu2.verDatos();    
    }   
}
