/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cua;

/**
 *
 * @author IlseDaniela
 */
public class Cua {
private String Nombre;
   private int Telefono;
   Cua() {
        
    }
    public Cua(String nombre, int telefono){
        this.Nombre=nombre;
        this.Telefono=telefono;
    }

    

   

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }
    
}
