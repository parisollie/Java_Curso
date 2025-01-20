public class NodoDoble {
    // Paso 1
    public int dato;
    // Nuestros punteros.
    NodoDoble siguiente, anterior;

    // Paso 2, Constructor para cuando aun ya no hay nodos.
    public NodoDoble(int el) {
        this(el, null, null);
    }

    // Paso 3, Constructor para cuando ya hay nodos.
    public NodoDoble(int el, NodoDoble s, NodoDoble a) {
        dato = el;
        siguiente = s;
        anterior = a;
    }

}
