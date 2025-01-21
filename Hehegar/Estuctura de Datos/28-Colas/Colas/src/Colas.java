import javax.swing.JOptionPane;

public class Colas {

    public static void main(String[] args) {
        int opcion = 0, elemento = 0;
        Cola colita = new Cola();

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Insertar un elemento en la cola\n"
                                + "2. Quitar un elemento de la cola\n"
                                + "3. La cola est vacía?\n"
                                + "4. Que elemento esta al inicio de la cola?\n"
                                + "5. Tamaño de la cola\n"
                                + "6. Salir\n"
                                + "Elige una opcion...",
                        "Menú de opciones", JOptionPane.QUESTION_MESSAGE));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, ""
                                + "Ingresa el elemento a empujar en la cola", "Insertando Datos",
                                JOptionPane.INFORMATION_MESSAGE));
                        colita.insertar(elemento);
                        break;
                    case 2:
                        if (!colita.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "El elemento obtenido es: "
                                    + colita.quitar(),
                                    "Obteniendo datos de la pila", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La cola esta vacia", "Cola vacía"
                                    + "", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if (colita.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La cola esta vacía",
                                    "Cola vacía", JOptionPane.INFORMATION_MESSAGE);

                        } else {
                            JOptionPane.showMessageDialog(null, "La cola no esta vacía",
                                    "La cola contiene datos", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if (!colita.estaVacia()) {
                            JOptionPane.showMessageDialog(null,
                                    "El elemento que se encuentra en el inicio de la cola es: " + colita.tamanioCola(),
                                    "Cola vacía", JOptionPane.INFORMATION_MESSAGE);

                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "La cola no esta llena",
                                    "La cola contiene espacio aún", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "El tamaño de la cola es: "
                                + colita.tamanioCola(),
                                "Tamaño de la cola", JOptionPane.INFORMATION_MESSAGE);
                        break;

                    case 6:
                        JOptionPane.showMessageDialog(null, "Aplicación finalizada", "Fin"
                                + "", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion Incorrecta", "Fin"
                                + "", JOptionPane.INFORMATION_MESSAGE);
                }

            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error " + n.getMessage());

            }

        } while (opcion != 6);

    }

}
