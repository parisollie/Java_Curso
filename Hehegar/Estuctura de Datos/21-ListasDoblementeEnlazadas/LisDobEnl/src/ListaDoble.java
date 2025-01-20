import javax.swing.JOptionPane;

public class ListaDoble {
    private NodoDoble inicio, fin;

    // creamos el constructor.
    public ListaDoble() {
        inicio = fin = null;
    }

    // Método para saber cuanto la lista esta vacía
    public boolean estaVacia() {
        // si inicio es null es true, forma mas corta.
        return inicio == null;
    }

    // método para agregar nodos al final.
    public void agregarAlFinal(int el) {
        if (!estaVacia()) {
            fin = new NodoDoble(el, null, fin);
            fin.anterior.siguiente = fin;
        } else {
            inicio = fin = new NodoDoble(el);
        }
    }

    // Método para agregar al inicio.
    public void agregarAlInicio(int el) {
        if (!estaVacia()) {
            inicio = new NodoDoble(el, inicio, null);
            inicio.siguiente.anterior = inicio;
        } else {
            inicio = fin = new NodoDoble(el);
        }
    }

    // Método para mostrar la lista de inicio a fin.
    public void mostrarListaInicioFin() {
        if (!estaVacia()) {
            String datos = "<=>";
            NodoDoble auxiliar = inicio;
            while (auxiliar != null) {
                datos = datos + "[" + auxiliar.dato + "]<=>";
                auxiliar = auxiliar.siguiente;
            }
            JOptionPane.showMessageDialog(null, datos, "Mostrando Lista de inicio a fin",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Método para mostar la lista de fin a inicio.
    public void mostrarListaFinInicio() {
        if (!estaVacia()) {
            String datos = "<=>";
            NodoDoble auxiliar = fin;
            while (auxiliar != null) {
                datos = datos + "[" + auxiliar.dato + "]<=>";
                auxiliar = auxiliar.anterior;
            }
            JOptionPane.showMessageDialog(null, datos, "Mostrando Lista de fin a inicio",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Método para eliminar un nodo del inicio.
    public int eliminarDelInicio() {
        int elemento = inicio.dato;
        if (inicio == fin) {
            inicio = fin = null;
        } else {
            inicio = inicio.siguiente;
            inicio.anterior = null;
        }
        return elemento;
    }

    // Método para eliminar del final
    public int eliminarDelFinal() {
        int elemento = fin.dato;
        if (inicio == fin) {
            inicio = fin = null;
        } else {
            fin = fin.anterior;
            fin.siguiente = null;
        }
        return elemento;
    }

}
