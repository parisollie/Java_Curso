import javax.swing.JOptionPane;

public class ListaLC {
    NodoLC ultimo;

    // Constructor
    public ListaLC() {
        // apunta a nullo ,porque no tiene nada.
        ultimo = null;
    }

    // Método para saber cuando la lista esta vacía.
    public boolean estaVacia() {
        // checame si el ultimo es nulo
        return ultimo == null;
    }

    // Método para insertar Nodos.
    public ListaLC insertar(int elemento) {
        NodoLC nuevo = new NodoLC(elemento);
        if (ultimo != null) {
            nuevo.siguiente = ultimo.siguiente;
            ultimo.siguiente = nuevo;
        }
        ultimo = nuevo;
        return this;
    }

    // Método para mostrar la lista.
    public void mostrarLista() {
        NodoLC auxiliar = ultimo.siguiente;
        String cadena = "";
        do {
            cadena = cadena + "[" + auxiliar.dato + "]->";
            auxiliar = auxiliar.siguiente;

        } while (auxiliar != ultimo.siguiente);
        JOptionPane.showMessageDialog(null, cadena,
                "Mostrando La lista circular",
                JOptionPane.INFORMATION_MESSAGE);

    }

    // Método para eliminar de la lista.
    public boolean eliminar(int elemento) {
        // creamos un nodo actual.
        NodoLC actual;
        boolean encontrado = false;
        actual = ultimo;
        while (actual.siguiente != ultimo && !encontrado) {
            encontrado = (actual.siguiente.dato == elemento);
            if (!encontrado) {
                actual = actual.siguiente;

            }
        }
        encontrado = (actual.siguiente.dato == elemento);
        if (encontrado) {
            NodoLC auxiliar = actual.siguiente;
            if (ultimo == ultimo.siguiente) {
                ultimo = null;
            } else {
                if (auxiliar == ultimo) {
                    ultimo = actual;
                }
                actual.siguiente = auxiliar.siguiente;
            }
            auxiliar = null;
        }
        return encontrado == true;
    }

}
