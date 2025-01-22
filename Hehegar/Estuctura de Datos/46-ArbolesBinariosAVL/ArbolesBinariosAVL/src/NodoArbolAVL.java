public class NodoArbolAVL {
    // fe , factor de equilibrio
    int dato, fe;
    NodoArbolAVL hijoIzquierdo, hijoDerecho;

    // Constructor.
    public NodoArbolAVL(int d) {
        this.dato = d;
        // No sabemos que tiene al principio.
        this.fe = 0;
        this.hijoDerecho = null;
        this.hijoIzquierdo = null;
    }
}
