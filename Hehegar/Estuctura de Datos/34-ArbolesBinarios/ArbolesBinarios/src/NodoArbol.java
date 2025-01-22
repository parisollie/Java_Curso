

public class NodoArbol {
    //Creamos nuestros atributos.
    int dato;
    String nombre;
    // Nuestros punteros.
    NodoArbol hijoIzquierdo,hijoDerecho; 
    
    //Creando nuetro constructor
    public NodoArbol(int d ,String nom){
        
        this.dato=d;
        this.nombre=nom;
        //Al principio no tienen ningun nodo.
        this.hijoDerecho=null;
        this.hijoIzquierdo=null;
        
    }
    //tosString...Nos muestra el valor de todos sus atributos.
    public String toString(){
        return nombre + " ,sus datos son: " + dato;
    }
    
}

