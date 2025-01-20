

public class Nodo {
    //Paso 1,Ponemos nuestras variables.
    public int dato;
    //Puntero enlazante para poder ir enlazando nuestros nodos.
    public Nodo siguiente;
    
    /*Paso 2,Constructor para insertar al final.
    Constructor llamado igual a nuestra clase.*/
    public Nodo(int d){
        this.dato=d;
        this.siguiente = null;
    }
    /*Paso 3,Constructor para insertar al inicio.
    Recibe 2 parámetros ,el dato como tal d y un puntero hacia nodo*/
    public Nodo(int d , Nodo n){ 
        dato=d;
        siguiente=n;
    }

  }
