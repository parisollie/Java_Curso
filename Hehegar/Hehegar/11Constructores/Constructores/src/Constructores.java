//11 Hehegar
/*Es un metodo que se llama automaticamente cada vez que sea un objeto de una 
  clase.La principal mision del constructor es reservar memoria e inicializar
  las variavles(atributos)miembros de la clase
Caracteriscas:
-Coincide con el nombre de la clase y no devuelve nada
-Una clase puede tener varios constructores,que se diferencian por el tipo y 
 numero de sus argumentos(sobrecarga)*/

public class Constructores {

    public static void main(String[] args) {
        //Creando Objetos
        //Ya le estoy dando los parametros
        Alumnos alu1 = new Alumnos(12345,"Panfilo","Gonzales Prieto"); 
        Alumnos alu2 = new Alumnos(67891,"Rafael","Ramo Jacobo"); 
        alu1.verDatos();
        alu2.verDatos();    
    }   
}
