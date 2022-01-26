
import java.util.ArrayList;

public class Extra {
    //Almacenando todos mis tipos en un arraylist.
    ArrayList<SerVivo> lista = new ArrayList();//Creando un objeto de tipo lista.
    
    //Constructor
    public Extra (){ //add para agregar
        lista.add(new Animal("Felino"));//Creando mi objeto de tipo animal e invocamos el objeto add,se pasa com argumento felino.
        lista.add(new Animal("Pez"));
        lista.add(new Humano("Masculino"));
        lista.add(new Humano("Femenino"));
        lista.add(new Planta("Flor"));
        lista.add(new Planta("Cactus"));
        lista.add(new Planta("Carnivora"));
    }
    //Motrar datos
    public void invocar(){ // Creando el método para invocarlos
        
        for(SerVivo sb:lista){ //For each  me recorre objetos de tipo ser vivo  ,sb = variable temporal y me recorre la lista
            sb.alimentarse();//La variable sb invoca al método alimentarse.
            //Cómo es un método  sobreescrito ,es diferente en cada iteración los invoca y nos dirá de que tipo es el objeto(animal,planta,humano )
        }
    }
    
    
    
    
   
    
    
    
}
