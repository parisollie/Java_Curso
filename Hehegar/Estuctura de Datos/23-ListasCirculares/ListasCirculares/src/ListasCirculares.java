import javax.swing.JOptionPane;

public class ListasCirculares {

    public static void main(String[] args) {
        ListaLC listita = new ListaLC();
        int opcion = 0, elemento;
        boolean eliminado = false;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(
                        null, "1. Agregar un nodo a la lista circular.\n"
                                + "2. Eliminar un nodo de la lista circular.\n"
                                + "3. Mostar los datos de la lista circular.\n"
                                + "4. Salir\n"
                                + "¿Qué deseas hacer?",
                        "Menu de opciones", JOptionPane.INFORMATION_MESSAGE));

                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento del Nodo",
                                "Agregando nodo a la lista circular", JOptionPane.INFORMATION_MESSAGE));
                        listita.insertar(elemento);
                        break;
                    case 2:
                        if (!listita.estaVacia()) {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingresa el elemento del Nodo a eliminar",
                                    "Eiminando nodo de la lista circular", JOptionPane.INFORMATION_MESSAGE));
                            eliminado = listita.eliminar(elemento);

                            if (eliminado) {
                                JOptionPane.showMessageDialog(null, "El elemento eliminado es: " + elemento,
                                        "Eliminando nodos...", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "El elemento " + elemento + ", no esta en la lista",
                                        "Intenta de nuevo :p", JOptionPane.INFORMATION_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay nodos aún",
                                    "Lista vacía", JOptionPane.INFORMATION_MESSAGE);
                        }

                        break;
                    case 3:
                        if (!listita.estaVacia()) {
                            listita.mostrarLista();
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay nodos aún",
                                    "Lista vacía", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;

                    case 4:
                        JOptionPane.showMessageDialog(null, "Aplicación finalizada",
                                "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "La opción no esta en el menú",
                                "Incorrecto", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }

            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
            }
        } while (opcion != 4);
    }

}
