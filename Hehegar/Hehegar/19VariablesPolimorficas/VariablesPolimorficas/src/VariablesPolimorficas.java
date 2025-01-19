//19 Hehegar Variables Polimórficas.
public class VariablesPolimorficas {

    public static void main(String[] args) {
        /*
        Una variable polimórfica es aquella que contiene un objeto.
        */
        //Paso 7, creamos objetos
        Optimista op = new Optimista ();
        Pesimista ps = new Pesimista ();
        Extrovertido ex = new Extrovertido ();
        Introvertido in = new Introvertido ();
        
        //Paso 8, Creando mi variable polimórfica
        
        /*Paso 9, creo un objeto que contiene las 4 personalidades y
        lo metemos en un arreglo [],esto es mi variable polimorfica*/
        Personalidad objetoPersonalidades [] = new Personalidad[4];
        // En su poscion 0 tiene al optimista
        objetoPersonalidades [0]=op; 
        objetoPersonalidades [1]=ps;
        objetoPersonalidades [2]=ex;
        objetoPersonalidades [3]=in;
        
        // Poniendo a trabajar a nuestra variable polimórfica.
        objetoPersonalidades [0].hablar();
        objetoPersonalidades [1].hablar();
        objetoPersonalidades [2].hablar();
        objetoPersonalidades [3].hablar();        
    }
    
}
