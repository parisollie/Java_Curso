/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

/**
 *
 * @author Edgar
 */
public class Asignatura {

    String nombre;
    int clave;
    String Horario;
    int creditos;
       
    Asignatura(String nombre, int clave, String Horario, int creditos) {
        this.nombre=nombre;
        this.clave=clave;
        this.Horario=Horario;
        this.creditos=creditos;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", clave=" + clave + ", Horario=" + Horario + ", creditos=" + creditos + '}';
    }

    
    
    
}
