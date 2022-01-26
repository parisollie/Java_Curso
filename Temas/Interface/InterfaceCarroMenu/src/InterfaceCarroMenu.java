//Este no guarda los archivos 
import java.util.Scanner;
import javax.swing.JOptionPane;

public class InterfaceCarroMenu {

    public static void main(String[] args) {

        Vehiculo vehiculos[] = new Vehiculo[6];
        int numSerieMotor = 0;
        int year = 0;
        int pasajeros = 0;
        int carga = 0;
        int ejes = 0;
        int rodadas = 0;
        double precio = 0;
        String marca = "";
        int dato = 0;

        do {
            try {
                dato = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.MINICopper\n"
                        + "2.Ferrari\n"
                        + "3.Camioneta\n"
                        + "4.Van\n"
                        + "5.Tesla\n"
                        + "6.Beetle\n"
                        + "7.Salir\n"
                        + "Elige una opcion...", "Menu del carro elegido", JOptionPane.QUESTION_MESSAGE));

                switch (dato) {

                    case 1:
                        JOptionPane.showMessageDialog(null, "MINICopper");
                        numSerieMotor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero de la serie del motor: ", "Solicitando los datos del MINICopper", 3));
                        marca = JOptionPane.showInputDialog(null, "Introduzca la marca del carro: ", "Solicitando la marca : ", 3);
                        year = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el año del carro: ", "Solicitando el año : ", 3));
                        precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el precio del carro: ", "Solicitando precio : ", 3));
                        pasajeros = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero de pasajeros: ", "Solicitando el numero de pasajeros: ", 3));

                        vehiculos[0] = new Ferrari(numSerieMotor, year, marca, precio, pasajeros);
                        vehiculos[0].verDatos();
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Ferrari");
                        numSerieMotor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero de la serie del motor: ", "Solicitando los datos del Ferrari", 3));
                        marca = JOptionPane.showInputDialog(null, "Introduzca la marca del carro: ", "Solicitando la marca : ", 3);
                        year = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el año del carro: ", "Solicitando el año : ", 3));
                        precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el precio del carro: ", "Solicitando precio : ", 3));
                        pasajeros = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero de pasajeros: ", "Solicitando el numero de pasajeros: ", 3));

                        vehiculos[1] = new MINICopper(numSerieMotor, year, marca, precio, pasajeros);
                        vehiculos[1].verDatos();
                        
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Camioneta");
                        numSerieMotor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero de la serie del motor: ", "Solicitando los datos de la camioneta", 3));
                        marca = JOptionPane.showInputDialog(null, "Introduzca la marca del carro: ", "Solicitando la marca: ", 3);
                        year = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el año del carro: ", "Solicitando el año del carro: ", 3));
                        precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el precio del carro: ", "Solicitando precio del carro: ", 3));
                        pasajeros = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero de pasajeros: ", "Solicitando el numero de pasajeros: ", 3));
                        rodadas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la cantidad de rodadas: ", "Solicitando el numero de rodadas: ", 3));
                        ejes = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la cantidad de ejes: ", "Solicitando el numero de ejes: ", 3));
                        carga = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la cantidad de carga: ", "Solicitando la carga: ", 3));
                        
                        
                        vehiculos[2] = new Camioneta(carga,ejes,rodadas,pasajeros,numSerieMotor, year, marca, precio);
                        vehiculos[2].verDatos();
                        
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Van");
                        numSerieMotor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero de la serie del motor: ", "Solicitando los datos de la vagoneta", 3));
                        marca = JOptionPane.showInputDialog(null, "Introduzca la marca del carro: ", "Solicitando la marca: ", 3);
                        year = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el año del carro: ", "Solicitando el año: ", 3));
                        precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el precio del carro: ", "Solicitando precio : ", 3));
                        pasajeros = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero de pasajeros: ", "Solicitando el numero de pasajeros: ", 3));

                        vehiculos[3] = new Vagoneta(numSerieMotor, year, marca, precio, pasajeros);
                        vehiculos[3].verDatos();
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Tesla");
                        numSerieMotor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero de la serie del motor: ", "Solicitando los datos del Tesla", 3));
                        marca = JOptionPane.showInputDialog(null, "Introduzca la marca del carro: ", "Solicitando la marca : ", 3);
                        year = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el año del carro: ", "Solicitando el año : ", 3));
                        precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el precio del carro: ", "Solicitando precio : ", 3));
                        pasajeros = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero de pasajeros: ", "Solicitando el numero de pasajeros: ", 3));

                        vehiculos[4] = new Tesla (numSerieMotor, year, marca, precio, pasajeros);
                        vehiculos[4].verDatos();
                        break;

                    case 6:
                        JOptionPane.showMessageDialog(null, "Beetle");
                        numSerieMotor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero de la serie del motor: ", "Solicitando los datos del Beetle", 3));
                        marca = JOptionPane.showInputDialog(null, "Introduzca la marca del carro: ", "Solicitando la marca : ", 3);
                        year = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el año del carro: ", "Solicitando el año : ", 3));
                        precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el precio del carro: ", "Solicitando precio : ", 3));
                        pasajeros = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero de pasajeros: ", "Solicitando el numero de pasajeros: ", 3));

                        vehiculos[5] = new Beetle(numSerieMotor, year, marca, precio, pasajeros);
                        vehiculos[5].verDatos();
                        break;

                    case 7:
                        JOptionPane.showMessageDialog(null, "Aplicacion finalizada", "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "No se encuentra el numero");
                        break;
                }

            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
            }
        } while (dato != 7);

    }

}

                        