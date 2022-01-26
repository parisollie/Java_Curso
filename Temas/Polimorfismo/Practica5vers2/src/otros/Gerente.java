
package otros;

import altos.Empleado;

public class Gerente extends Empleado{
    private String area;
    private int numSubordinados;
    
    
    public Gerente(String Nombre, String Apellido) {
        super(Nombre, Apellido);
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getNumSubordinados() {
        return numSubordinados;
    }

    public void setNumSubordinados(int numSubordinados) {
        this.numSubordinados = numSubordinados;
    }


    public double getSalarioSubordinado(Operativo operativo){
        return operativo.getsalarioBase();
    }
    
 }