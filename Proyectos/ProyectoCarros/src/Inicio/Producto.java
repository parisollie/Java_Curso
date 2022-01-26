
package Inicio;

import java.io.Serializable;

//Serializable- Nos permite guardar en codigo binario
//Ya que las fotos las debemos guardar en código binario
public class Producto  implements Serializable {
    //
    private int codigo;
    private String nombre;
    private int telefono;
    private Object direccion;
    private byte[] foto;
    private String color;
    private String piel;

    public Producto(){}
    //Constructor
    public Producto(int codigo, String nombre, int telefono, Object direccion,byte[]foto,String color,String piel){
        this.codigo = codigo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.foto = foto ;
        this.color = color ;
        this.piel = piel;
    }
  
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Object getDireccion() {
        return direccion;
    }

    public void setDireccion(Object direccion) {
        this.direccion = direccion;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPiel() {
        return piel;
    }

    public void setPiel(String piel) {
        this.piel = piel;
    }

}
