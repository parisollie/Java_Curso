import javax.swing.JOptionPane;

public class LisDobEnl {

    public static void main(String[] args) {

        ListaDoble listita = new ListaDoble();
        int opcion = 0, elemento;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(
                        null, "1. Agregar un nodo al inicio\n"
                                + "2. Agregar un nodo al final\n"
                                + "3. Mostar la lista de inicio a fin\n"
                                + "4. Mostrar la lista de fin a inicio\n"
                                + "5. Eliminar un nodo del inicio\n"
                                + "6. Eliminar un nodo del final\n"
                                + "7. Salir\n"
                                + "¿Qué deseas hacer?",
                        "Menu de opciones", JOptionPane.INFORMATION_MESSAGE));

                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento del Nodo",
                                "Agregando nodo al inicio", JOptionPane.INFORMATION_MESSAGE));
                        listita.agregarAlInicio(elemento);
                        break;
                    case 2:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento del Nodo",
                                "Agregando nodo al final", JOptionPane.INFORMATION_MESSAGE));
                        listita.agregarAlFinal(elemento);

                        break;
                    case 3:
                        if (!listita.estaVacia()) {
                            listita.mostrarListaInicioFin();
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay nodos aún",
                                    "Lista vacía", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if (!listita.estaVacia()) {
                            listita.mostrarListaFinInicio();
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay nodos aún",
                                    "Lista vacía", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        if (!listita.estaVacia()) {
                            elemento = listita.eliminarDelInicio();
                            JOptionPane.showMessageDialog(null,
                                    "El elemento eliminado es " + elemento,
                                    "Eliminando nodo del inicio", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay nodos aún",
                                    "Lista vacía", JOptionPane.INFORMATION_MESSAGE);
                        }

                        break;
                    case 6:
                        if (!listita.estaVacia()) {
                            elemento = listita.eliminarDelFinal();
                            JOptionPane.showMessageDialog(null,
                                    "El elemento eliminado es " + elemento,
                                    "Eliminando nodo del final", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay nodos aún",
                                    "Lista vacía", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 7:
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
        } while (opcion != 7);
    }

}
