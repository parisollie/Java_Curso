/*12 Hehegar
Sirven para obtener y asignar(modificar) los atributos de una clase.
Get(Obtiene) y Set (asigna)*/
public class GetandSet {

    public static void main(String[] args) {
        
        /*Paso 5,creando objetos
        Ya le estoy dando los parámetros*/
        Alumnos alu1 = new Alumnos(12345,"Juan Pablo","Nieto Prieto"); 
        Alumnos alu2 = new Alumnos(67891,"Rafael","Ramo Jacobo"); 
        
        alu1.verDatos();
        alu2.verDatos();
        
        //LLamando a los metódos get
        System.out.println("Obteniendo el nombre del alumno 1: "+alu1.getNombre());
        /*Asignando un nombre al que antes era Juan Pablo.
         Asiganale un nuevo nombre al alumno 2.*/
        alu2.setControl("Rodrigo");
        //Le cambiamos el número de control al alumno 2.
        alu2.setControl(98856); 
        System.out.println("Obteniendo el nombre del alumno 2 que antes era "
                + "Rafael: "+alu2.getNombre());
        alu2.verDatos();
    }
    
}
