//**se desea crear una aplicion para manejar la informacion de un empleado 
Un empleado tiene un nobre,Cedula, una direccion y un salario Asignado
la aplicacion debe permitir crear un nuevo empleado Incrementear el salario en un 10%
decrementar el salario en un porcentaje dado por el usuario
Imprimir la direccion del empleado y el salario.
ingresarInfo()
calcularSalario()
decrementar()
imprimir()
**//

package com.empresa;

public class Empleado {
	String nombre;
	String direccion;
	int cedula; 
	double salario;
	
	public String getNombre() {
		return nombre;
	}
	public Empleado(String nombre, int cedula, String direccion, double salario) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.direccion = direccion;
		this.salario = salario;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}