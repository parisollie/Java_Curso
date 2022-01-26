//Memoria estatica
public class Pilitas {
    
    int vectorPila[];//para solicitar el tamaño al usuario
    int cima;//El objeto que se encuentra en la cima
    //Metodo constructor
    
    public Pilitas(int tamanio){
        vectorPila = new int [tamanio];
        cima = -1;// Se inicializa en -1 porque el vector empieza en cero y termina un numero antes
        
    }
    //Metodo push para empujar un elemento en la pila
    public void empujar(int dato){
        //incrementamos la cima 
        cima++;//Para que al momento de insertar ,lo inserte en la posicion cero y se vaya recorriendo
        vectorPila[cima] = dato; // Le metemos el dato
        
    }
    //Metodo pop(sacar un objeto)
    public int sacar (){//NO recibe parametros ,porque lo hara es sacar elemntos
        int fuera=vectorPila[cima]; //Le digo que me saque al numero que este en la cima
        cima--;//Decrementemos la cima
        return fuera; //Retornamos el valor que sacamos
    }
    //Metodo para saber si la pila esta vacia
    public boolean  estaVacia(){
        return cima==-1; // Recordar que cuando es -1 ,sabemos que la pila esta vacia
    }
    //Metodo cuando la pila esta llena
    public boolean estaLLena(){
        return vectorPila.length-1==cima;//Para sabe cuando la pila este llena retornara un true
    }
    //Metodo para saber que elemento se encuentra en la cima
    public int cimaPila(){
        return vectorPila[cima];//Retorname lo que esta en la cima
    }
    //Metodo para saber el tamaño de la pila
    public int tamanioPila(){
        return vectorPila.length;
    }
}
