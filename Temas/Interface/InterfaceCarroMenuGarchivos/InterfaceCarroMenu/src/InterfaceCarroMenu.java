//Este guarda los archivos

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class InterfaceCarroMenu implements Serializable {
    static File bin_list;
    static FileInputStream rd;
    static ObjectInputStream obj = null;

    public static void main(String[] args) throws FileNotFoundException, IOException{

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
                        MINICopper mn = new MINICopper (numSerieMotor, year, marca, precio, pasajeros);
                        ArrayList<MINICopper> min = new ArrayList<>();
                        min.add(mn);
                        String fichero = "minic.dat";
                        File archivo;
                         		
                        FileOutputStream mk;
                        ObjectOutputStream obj = null;
                        try{
                            mk = new FileOutputStream(fichero);
                            obj = new ObjectOutputStream(mk); 
                            obj.writeObject(min);
                        }catch(IOException e){
                            e.printStackTrace();
        		}
                        finally{
                            try{
				archivo = new File(fichero);
				if (archivo.exists())
                                JOptionPane.showMessageDialog(null, "Archivo Creado", "Fin", JOptionPane.INFORMATION_MESSAGE);
				obj.close();
			}catch(IOException e){
				e.printStackTrace();
			}
                            JOptionPane.showMessageDialog(null, "Coche guardado correctamente", "Fin", JOptionPane.INFORMATION_MESSAGE);
                        }
                        
                        //Archivos ar = new Archivos();
                        //ar.Cargar(fichero);
                 
                        //vehiculos[0] = new Ferrari(numSerieMotor, year, marca, precio, pasajeros);
                        //vehiculos[0].verDatos();
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Ferrari");
                        numSerieMotor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero de la serie del motor: ", "Solicitando los datos del Ferrari", 3));
                        marca = JOptionPane.showInputDialog(null, "Introduzca la marca del carro: ", "Solicitando la marca : ", 3);
                        year = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el año del carro: ", "Solicitando el año : ", 3));
                        precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el precio del carro: ", "Solicitando precio : ", 3));
                        pasajeros = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero de pasajeros: ", "Solicitando el numero de pasajeros: ", 3));
                        
                        Ferrari fer = new Ferrari (numSerieMotor, year, marca, precio, pasajeros);
                        ArrayList<Ferrari>ferra = new ArrayList<>();
                        ferra.add(fer);
                        String fichero1 = "ferrari.dat";
                        File archivo1;
                         
                        obj = null;
                        try{
                            mk = new FileOutputStream(fichero1);
                            obj = new ObjectOutputStream(mk); 
                            obj.writeObject(ferra);
                        }catch(IOException e){
                            e.printStackTrace();
        		}
                        finally{
                            try{
				archivo1 = new File(fichero1);
				if (archivo1.exists())
                                JOptionPane.showMessageDialog(null, "Archivo Creado", "Fin", JOptionPane.INFORMATION_MESSAGE);
				obj.close();
			}catch(IOException e){
				e.printStackTrace();
			}
                            JOptionPane.showMessageDialog(null, "Coche guardado correctamente", "Fin", JOptionPane.INFORMATION_MESSAGE);
                        }
                        //vehiculos[1] = new MINICopper(numSerieMotor, year, marca, precio, pasajeros);
                        //vehiculos[1].verDatos();
                        
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

                        Camioneta cam = new Camioneta (carga, ejes, rodadas, pasajeros, numSerieMotor, year, marca, precio);
                        ArrayList<Camioneta>cami = new ArrayList<>();
                        cami.add(cam);
                        String fichero2 = "camioneta.dat";
                        File archivo2;
                         
                        obj = null;
                        try{
                            mk = new FileOutputStream(fichero2);
                            obj = new ObjectOutputStream(mk); 
                            obj.writeObject(cami);
                        }catch(IOException e){
                            e.printStackTrace();
        		}
                        finally{
                            try{
				archivo2 = new File(fichero2);
				if (archivo2.exists())
                                JOptionPane.showMessageDialog(null, "Archivo Creado", "Fin", JOptionPane.INFORMATION_MESSAGE);
				obj.close();
			}catch(IOException e){
				e.printStackTrace();
			}
                            JOptionPane.showMessageDialog(null, "Coche guardado correctamente", "Fin", JOptionPane.INFORMATION_MESSAGE);
                        }
                        
                        //vehiculos[2] = new Camioneta(carga,ejes,rodadas,pasajeros,numSerieMotor, year, marca, precio);
                        //vehiculos[2].verDatos();
                        
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Van");
                        numSerieMotor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero de la serie del motor: ", "Solicitando los datos de la vagoneta", 3));
                        marca = JOptionPane.showInputDialog(null, "Introduzca la marca del carro: ", "Solicitando la marca: ", 3);
                        year = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el año del carro: ", "Solicitando el año: ", 3));
                        precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el precio del carro: ", "Solicitando precio : ", 3));
                        pasajeros = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero de pasajeros: ", "Solicitando el numero de pasajeros: ", 3));
    
                        Vagoneta van = new Vagoneta (numSerieMotor, year, marca, precio, pasajeros);
                        ArrayList<Vagoneta> vag = new ArrayList<>();
                        vag.add(van);
                        String fichero3 = "van.dat";
                        File archivo3;
                         
                        obj = null;
                        try{
                            mk = new FileOutputStream(fichero3);
                            obj = new ObjectOutputStream(mk); 
                            obj.writeObject(vag);
                        }catch(IOException e){
                            e.printStackTrace();
        		}
                        finally{
                            try{
				archivo3 = new File(fichero3);
				if (archivo3.exists())
                                JOptionPane.showMessageDialog(null, "Archivo Creado", "Fin", JOptionPane.INFORMATION_MESSAGE);
				obj.close();
			}catch(IOException e){
				e.printStackTrace();
			}
                            JOptionPane.showMessageDialog(null, "Coche guardado correctamente", "Fin", JOptionPane.INFORMATION_MESSAGE);
                        }
                        
                        //vehiculos[3] = new Vagoneta(numSerieMotor, year, marca, precio, pasajeros);
                        //vehiculos[3].verDatos();
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Tesla");
                        numSerieMotor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero de la serie del motor: ", "Solicitando los datos del Tesla", 3));
                        marca = JOptionPane.showInputDialog(null, "Introduzca la marca del carro: ", "Solicitando la marca : ", 3);
                        year = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el año del carro: ", "Solicitando el año : ", 3));
                        precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el precio del carro: ", "Solicitando precio : ", 3));
                        pasajeros = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero de pasajeros: ", "Solicitando el numero de pasajeros: ", 3));
                        
                        Tesla tes = new Tesla (numSerieMotor, year, marca, precio, pasajeros);
                        ArrayList<Tesla> tesl = new ArrayList<>();
                        tesl.add(tes);
                        String fichero4 = "tesla.dat";
                        File archivo4;
                         
                        obj = null;
                        try{
                            mk = new FileOutputStream(fichero4);
                            obj = new ObjectOutputStream(mk); 
                            obj.writeObject(tesl);
                        }catch(IOException e){
                            e.printStackTrace();
        		}
                        finally{
                            try{
				archivo4 = new File(fichero4);
				if (archivo4.exists())
                                JOptionPane.showMessageDialog(null, "Archivo Creado", "Fin", JOptionPane.INFORMATION_MESSAGE);
				obj.close();
			}catch(IOException e){
				e.printStackTrace();
			}
                            JOptionPane.showMessageDialog(null, "Coche guardado correctamente", "Fin", JOptionPane.INFORMATION_MESSAGE);
                        }
                        //vehiculos[4] = new Tesla (numSerieMotor, year, marca, precio, pasajeros);
                        //vehiculos[4].verDatos();
                        break;

                    case 6:
                        JOptionPane.showMessageDialog(null, "Beetle");
                        numSerieMotor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero de la serie del motor: ", "Solicitando los datos del Beetle", 3));
                        marca = JOptionPane.showInputDialog(null, "Introduzca la marca del carro: ", "Solicitando la marca : ", 3);
                        year = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el año del carro: ", "Solicitando el año : ", 3));
                        precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el precio del carro: ", "Solicitando precio : ", 3));
                        pasajeros = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero de pasajeros: ", "Solicitando el numero de pasajeros: ", 3));
 
                        Beetle bet = new Beetle (numSerieMotor, year, marca, precio, pasajeros);
                        ArrayList<Beetle>bee = new ArrayList<>();
                        bee.add(bet);
                        String fichero5 = "beetle.dat";
                        File archivo5;
                         
                        obj = null;
                        try{
                            mk = new FileOutputStream(fichero5);
                            obj = new ObjectOutputStream(mk); 
                            obj.writeObject(bee);
                        }catch(IOException e){
                            e.printStackTrace();
        		}
                        finally{
                            try{
				archivo5 = new File(fichero5);
				if (archivo5.exists())
                                JOptionPane.showMessageDialog(null, "Archivo Creado", "Fin", JOptionPane.INFORMATION_MESSAGE);
				obj.close();
			}catch(IOException e){
				e.printStackTrace();
			}
                            JOptionPane.showMessageDialog(null, "Coche guardado correctamente", "Fin", JOptionPane.INFORMATION_MESSAGE);
                        }
                        //vehiculos[5] = new Beetle(numSerieMotor, year, marca, precio, pasajeros);
                        //vehiculos[5].verDatos();
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

                        