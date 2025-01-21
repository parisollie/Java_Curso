public class NodoLC {
    int dato;
    NodoLC siguiente;

    public NodoLC(int d) {
        dato = d;
        // Apunta al mismo nodo.
        siguiente = this;
    }

}
