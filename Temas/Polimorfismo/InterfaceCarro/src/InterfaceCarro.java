
import java.util.Scanner;


public class InterfaceCarro {

    
    public static void main(String[] args) {
        
        Vehiculo vehiculos[] = new Vehiculo[4];
        int numSerieMotor = 0;
        int year = 0;
        int pasajeros = 0;
        int carga = 0;
        int ejes = 0;
        int rodadas = 0;
        double precio = 0;
        String marca = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t.:Introduzca los datos del auto de lujo:.\n\t");
        System.out.print("Introduzca el número de serie del motor: ");
        numSerieMotor = sc.nextInt();
        System.out.print("Introduzca la marca: ");
        marca = sc.next();
        System.out.print("Introduzca el año: ");
        year = sc.nextInt();
        System.out.print("Introduzca el precio: ");
        precio = sc.nextDouble();
        System.out.print("Introduzca la cantidad de pasajeros: ");
        pasajeros = sc.nextInt();

        vehiculos[0] = new AutoCompacto(numSerieMotor, year, marca, precio, pasajeros);
        System.out.println(vehiculos[0].toString());

        System.out.println("\n\t.:Introduzca los datos de la camioneta:.\n\t");
        System.out.print("Introduzca el número de serie del motor: ");
        numSerieMotor = sc.nextInt();
        System.out.print("Introduzca la marca: ");
        marca = sc.next();
        System.out.print("Introduzca el año: ");
        year = sc.nextInt();
        System.out.print("Introduzca el precio: ");
        precio = sc.nextDouble();
        System.out.print("Introduzca la cantidad de carga: ");
        carga = sc.nextInt();
        System.out.print("Introduzca la cantidad de ejes: ");
        ejes = sc.nextInt();
        System.out.print("Introduzca la cantidad de rodadas: ");
        rodadas = sc.nextInt();
        vehiculos[1] = new Camioneta(numSerieMotor, year, marca, precio, carga, ejes, rodadas);
        System.out.println(vehiculos[1].toString());
        
        
        System.out.println("\n\t.:Introduzca los datos de la Vagoneta:.\n\t");
        System.out.print("Introduzca el número de serie del motor: ");
        numSerieMotor = sc.nextInt();
        System.out.print("Introduzca la marca: ");
        marca = sc.next();
        System.out.print("Introduzca el año: ");
        year = sc.nextInt();
        System.out.print("Introduzca el precio: ");
        precio = sc.nextDouble();
        System.out.print("Introduzca la cantidad de pasajeros: ");
        pasajeros = sc.nextInt();

        vehiculos[2] = new Vagoneta(numSerieMotor, year, marca, precio, pasajeros);
        System.out.println(vehiculos[2].toString());

    }
}
    

