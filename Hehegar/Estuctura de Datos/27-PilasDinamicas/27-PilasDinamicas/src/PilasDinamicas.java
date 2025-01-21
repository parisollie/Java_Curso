import javax.swing.JOptionPane;

public class PilasDinamicas {

    public static void main(String[] args) {

        int opcion = 0, elemento = 0;
        Pila pilis = new Pila();

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Empujar un elemeno en la Pila\n"
                                + "2. Sacar un elemento en la Pila\n"
                                + "3. La Pila est vacía?\n"
                                + "4. Que elemento esta en la cima?\n"
                                + "5. Tamaño de la pila\n"
                                + "6. Vaciar pila\n"
                                + "7. Salir\n"
                                + "Elige una opcion...",
                        "Menú de opciones", JOptionPane.QUESTION_MESSAGE));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, ""
                                + "Ingresa el elemento a empujar en la pila", "Apilando Datos",
                                JOptionPane.INFORMATION_MESSAGE));
                        pilis.empujar(elemento);
                        break;
                    case 2:
                        if (!pilis.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "El elemento obtenido es: "
                                    + pilis.sacar(),
                                    "Obteniendo datos de la pila", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia", "Pila vac�a"
                                    + "", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if (pilis.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La pila esta vacía",
                                    "Pila vacía", JOptionPane.INFORMATION_MESSAGE);

                        } else {
                            JOptionPane.showMessageDialog(null, "La pila no esta vacía",
                                    "La Pila contiene datos", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if (!pilis.estaVacia()) {
                            JOptionPane.showMessageDialog(null,
                                    "El elemento que se encuentra en la cima es: " + pilis.cima(),
                                    "Cima de la pila", JOptionPane.INFORMATION_MESSAGE);

                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "La pila no esta llena",
                                    "La Pila contiene espacio aún", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "El tamaño de la pila es: "
                                + pilis.tamanioPila(),
                                "Tamaño de la pila", JOptionPane.INFORMATION_MESSAGE);
                        break;

                    case 6:
                        if (!pilis.estaVacia()) {
                            pilis.limpiarPila();
                            JOptionPane.showMessageDialog(null, "La pila se ha vaciado ",
                                    "Vaciando pila", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacía ",
                                    "Pila vacía", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;

                    case 7:
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

        } while (opcion != 7);

    }

}
