import javax.swing.JOptionPane;

public class ListasSimEnlazadas {

    public static void main(String[] args) {
        //Paso 8
        Lista listita= new Lista();

        // Paso 9
        int opcion = 0, el;

        //Paso 10, creamos el do con las opciones.
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.Agregar un elemento al inicio de la lista.\n"
                                + "2.Agregar un elemento al final de la lista.\n"
                                + "3.Mostrar los datos de la lista.\n"
                                + "4.Eliminar un elemento del inicio de la lista.\n"
                                + "5.Eliminar un elemento al final de la lista.\n"
                                + "6.Eliminar un elemento en específico.\n"
                                + "7.Buscar un elemento en la lista.\n"
                                + "8.Salir.",
                        "Menú de Opciones", 3));

                //Paso 11, ponemos un switch con los casos
                switch (opcion) {
                    case 1:
                        try {
                            el = Integer.parseInt
                      (JOptionPane.showInputDialog(null, "Ingresa el elemento:",
                                    "Insertando al Inicio", 3));
                            //Agregando al nodo
                            listita.agregarAlInicio(el);

                        } catch (NumberFormatException n) {
                             JOptionPane.showMessageDialog(null, "Error " 
                                     + n.getMessage());
                        }

                        break;
                    case 2:
                        try {
                            el = Integer.parseInt
                      (JOptionPane.showInputDialog(null, "Ingresa el elemento:",
                                    "Insertando al final", 3));
                            //Agregando al nodo
                            listita.agregarAlFinal(el);

                        } catch (NumberFormatException n) {
                             JOptionPane.showMessageDialog(null, "Error " 
                                     + n.getMessage());
                        }
                        break;
                    case 3:
                         listita.mostrarLista();
                        break;
                    case 4:
                        //Llamamos para que elimine
                        el = listita.borrarDelInicio();
                        JOptionPane.showMessageDialog(null, 
                                "El elemento eliminado es " + el,
                                                "Eliminanddo nodo del inicio", 
                                                JOptionPane.INFORMATION_MESSAGE
                                        );
                        break;
                    case 5:
                        el = listita.borrarDelFinal();
                        JOptionPane.showMessageDialog(null, 
                                "El elemento eliminado es " + el,
                                                "Eliminanddo nodo al final", 
                                                JOptionPane.INFORMATION_MESSAGE
                                        );
                      
                        break;
                    case 6:
                        el = Integer.parseInt
                      (JOptionPane.showInputDialog(null, "Ingresa el elemento a "
                              + "eliminar:",
                                    "Eliminando nodos en especifíco", 
                                    JOptionPane.INFORMATION_MESSAGE));
                        
                        if(listita.estaEnLaLista(el)){
                            listita.eliminar(el);
                            JOptionPane.showMessageDialog(null, 
                                "El elemento eliminado es " + el,
                                "Eliminando nodo en especifico",
                                JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, 
                                    "El elemento " + el + ",No esta en la lista",
                                                    "Nodo no encontrado", 
                                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        
                        break;
                    case 7:
                         el = Integer.parseInt
                      (JOptionPane.showInputDialog(null, "Ingresa el elemento a "
                              + "buscar:",
                                    "Buscando nodos en la lista", 
                                    JOptionPane.INFORMATION_MESSAGE));
                          
                          
                        if (listita.estaEnLaLista(el) == true) {
                            JOptionPane.showMessageDialog(null, "El elemento " 
                                    + el + " ,Si esta en la lista",
                           "Nodo encontrado", JOptionPane.INFORMATION_MESSAGE);

                        } else {
                           JOptionPane.showMessageDialog(null, "El elemento "
                                   + el + ",No esta en la lista",
                         "Nodo no encontrado", JOptionPane.INFORMATION_MESSAGE);
                        }

                        break;

                    case 8:
                        JOptionPane.showMessageDialog(null, "Programa Finalizado.");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opción Incrrecta,intenta de nuevo :P");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }

        } while (opcion != 8);
    }
}
