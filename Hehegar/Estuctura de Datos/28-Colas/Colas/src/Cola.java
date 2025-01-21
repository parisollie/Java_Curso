public class Cola {
    NodoCola inicio, fin;
    int tama;

    // constructor
    public Cola() {
        inicio = fin = null;
        tama = 0;
    }

    // Método para si esta vacía
    public boolean estaVacia() {
        return inicio == null;
    }

    // Método para insertar
    public void insertar(int ele) {
        NodoCola nuevo = new NodoCola(ele);
        if (estaVacia()) {
            inicio = nuevo;
        } else {
            fin.siguiente = nuevo;
        }
        fin = nuevo;
        tama++;
    }

    // Método para quitar un elemento.
    public int quitar() {
        int aux = inicio.dato;
        inicio = inicio.siguiente;
        tama--;
        return aux;
    }

    // Método para saber quien esta al inicio de la cola
    public int inicioCola() {
        return inicio.dato;
    }

    // Método para saber el tamaño
    public int tamanioCola() {
        return tama;
    }
}
