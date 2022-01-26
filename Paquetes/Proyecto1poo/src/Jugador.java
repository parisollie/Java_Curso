


import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author carlos
 */
public class Jugador implements Comparable<Jugador> {//Objeto Jugador
    String name;
    String posicion;
    int dorsal;
    
    
    public Jugador(String nombre,String posicion, int num){//constructor prueba
        this.name=nombre;
        this.posicion=posicion;
        this.dorsal=num;
    }
    
    public int getDorsal(){
        return dorsal;
    }
    
    public void setAge(int numero){
        this.dorsal=numero;
    }
    public String getNombre(){
        return name;
    }
    public void setNombre(String nombre){
        this.name=nombre;
    }
    
    public String getPosicion(){
        return posicion;
    }
    
    public void setPosicion(String posicion){
        this.posicion=posicion;
    }
    public int compareTo(Jugador j){//Nos permite ordenarlos con el atributo dorsal
        return dorsal-j.dorsal;
    }/*Ademas si lo vemos de la manera en la que existe un equipo, no se puede repetir 
    el dorsal, de esta manera ya no se pueden repetir los datos de dorsal, se limita 
    de esta manera datos repetidos */
    /*Si se le pasa el numero de dorsal repetido, regresara un false si el jugador ya existe
    si regresa un true signiifica que se pudo crear con exito*/
    
    
    public static Jugador opcionJugador(){//Nos sirve para incializar o para elminar, puesto que se tuvieron 
        Scanner sc=new Scanner(System.in);
        String name,pos;
        int dorsal;
        System.out.println("Ingresa el nombre del jugador");
        name=sc.nextLine();
        System.out.println("Ingresa la posicion del jugador");
        pos=sc.next();
        System.out.println("Ingresa la edad del jugador");
        dorsal=sc.nextInt();
        Jugador jug=new Jugador(name,pos,dorsal);
        return jug;
    }/*Algo con lo que tambien se puede eliminar solo es ingresando el dorsal,pero
    decidí dejar el nombre y la posicion para que se vea más formal*/
}