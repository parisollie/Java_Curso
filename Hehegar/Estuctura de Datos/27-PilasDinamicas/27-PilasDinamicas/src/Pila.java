
public class Pila {
    private NodoPila cima;
    int tama;

    // Constructor
    public Pila() {
        cima = null;
        tama = 0;
    }

    // Método para saber cuando la pila está vacía.
    public boolean estaVacia() {
        return cima == null;
    }

    // Método para empujar un elemento en la pila.
    public void empujar(int elem) {
        // creamos un nuevo puntero nodo
        NodoPila nuevo = new NodoPila(elem);
        nuevo.siguiente = cima;
        cima = nuevo;
        tama++;
    }

    // Método para sacar un elemento de la pila.
    public int sacar() {
        int auxiliar = cima.dato;
        cima = cima.siguiente;
        tama--;
        return auxiliar;
    }

    // Método para saber quien esta en la cima de la pila.
    public int cima() {
        return cima.dato;
    }

    // Método para saber el tamaño de la pila.
    public int tamanioPila() {
        return tama;
    }

    // Método para limpiar la pila
    public void limpiarPila() {
        while (!estaVacia()) {
            sacar();
        }

    }

}
