//19 Hehegar Variables Polimorficas
public class VariablesPolimorficas {

    public static void main(String[] args) {
        /*
        Una variable polimorfica contiene un objeto
        */
        
        Optimista op = new Optimista ();
        Pesimista ps = new Pesimista ();
        Extrovertido ex = new Extrovertido ();
        Introvertido in = new Introvertido ();
        
        //Creando mi variable polimorfica
        
        //Contiene las 4 personalidades y lo metemos en un arreglo []
        Personalidad objetoPersonalidades [] = new Personalidad[4];
        // en su poscion 0 tiene al optimista
        objetoPersonalidades [0]=op; 
        objetoPersonalidades [1]=ps;
        objetoPersonalidades [2]=ex;
        objetoPersonalidades [3]=in;
        
        //Poniendo a trabajar a nuestra variable polimorfica
        objetoPersonalidades [0].hablar();
        objetoPersonalidades [1].hablar();
        objetoPersonalidades [2].hablar();
        objetoPersonalidades [3].hablar();        
    }
    
}
