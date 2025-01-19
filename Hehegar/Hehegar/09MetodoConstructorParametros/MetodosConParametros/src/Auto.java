
public class Auto {
    //Paso 1,atributos del auto,todos los metódos que yo haga tendran los atributos.
    String marca,color;
    int modelo;
    double precio;

    /*1er metódo,le asignamos los parámetros a recibir
    Los parámetros pueden ser igual a los que declaramos arriba o diferentes
    por eso le pusimos "marka" para ver que funciona también*/
    void arrancaruto(String marka,String color){ 
        System.out.println("El Auto arranco "+ marka +" Color "+ color + 
                " Arranco ok");
    }
    void apagarauto(String marka){
        System.out.println("El auto se apago");
    }
    void acelerarauto(String marka,String color){
        System.out.println("El auto esta acelerando "+ marka +" Color "+color 
                + " Arranco ok");
    }
    void frenarauto(String marka){
        System.out.println("El auto freno");
    }
}

    
