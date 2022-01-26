
package conjuntosprueba;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ConjuntosPrueba {

    public static void main(String[] args) {
        int menu;
        menu =0;
        String name,name1,name2,name4,pos;
        int num;
        Jugador player;
        Scanner leer=new Scanner(System.in);
        TreeSet<Jugador> trest=new TreeSet<>();/*El tree set almacena objetos de tipo jugador*/
        do{
            try{ //Try catch es por si tenemos errores
                menu = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.Anadir un jugador Set\n2.Remover del Set\n"
                        + "3.Existencia del elemento\n"
                        + "4.Limpiar el Set(Borrar)\n"
                        + "5.Elimina el primer Jugador\n"
                        + "6.Eliminar el ultimo Jugador\n"
                        + "7.Esta vacia\n"
                        + "8.Imprimir todo el Set\n"
                        + "9.Tamanio del Set\n"
                        + "10.Salir", "Menu de Opciones", 3)); // 3 de question
                switch (menu) {

                    case 1:
                        System.out.println("Ingresa el nombre del jugador");
                        name = leer.next();
                        System.out.println("Ingresa la posicion del jugador");
                        pos = leer.next();
                        System.out.println("Ingresa el numero del jugador");
                        num = leer.nextInt();
                        Jugador jug = new Jugador(name, pos, num);
                        System.out.println(trest.add(jug));
                        break;
                    case 2:
                        player = Jugador.opcionJugador();
                        trest.remove(player);
                        break;
                    case 3:
                        player = Jugador.opcionJugador();
                        System.out.println(trest.contains(player));

                        break;
                    case 4:

                        trest.clear();
                        break;
                    case 5:
                        trest.pollFirst();
                        break;
                    case 6:
                        trest.pollLast();

                        break;
                    case 7:
                        System.out.println(trest.isEmpty());

                        break;
                    case 8:
                        for (Jugador juga : trest) {
                            System.out.println(juga.dorsal + "    " + juga.name + "    " + juga.posicion);
                        }
                        break;
                    case 9:
                        System.out.println(trest.size());
                        
                        break;

                    case 10:
                        JOptionPane.showMessageDialog(null, "Programa Finalizado ");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opcion Incrrecta ");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
            }

        } while (menu != 10); //Mientras no este en nuestras opciones
    }
    }
    
       
    


 
