//Hipodromo
/*
Eric Felix Flores
*/
public class TestCarreras {

    
    public static void main(String[] args) {
    //Creamos los objetos 
    /*Creamos 3 instancias  que llamaran a la clase Caballo
      y cada una con sus parametros : Sylver, Pinto y Tornado
     */
    Caballo caballo1 = new Caballo("Silver");
    caballo1.carrera(); //Llamamos al método carrera.
    Caballo caballo2 = new Caballo("Pinto");
    caballo2.carrera();//Llamamos al método carrera.
    Caballo caballo3 = new Caballo("Tornado");
    caballo3.carrera();//Llamamos al método carrera.
    }
}



