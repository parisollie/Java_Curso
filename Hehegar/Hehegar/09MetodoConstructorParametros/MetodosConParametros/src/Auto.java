
public class Auto {
    //Atributos del auto,todos los metodos que yo haga lo tendran
    String marca,color;
    int modelo;
    double precio;

     //1 er metodo y le asignamos los parametros a recibir
    //Los parametros pueden ser igual a los que declaramos arriba o diferentes
    //por eso le pusimos "marka" para ver que funciona tambien
    void arrancaruto(String marka,String color){ 
        System.out.println("El Auto arranco "+ marka +" Color "+ color + 
                " Arranco ok ");
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

    
