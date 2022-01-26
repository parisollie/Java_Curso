package practica6.personas.trabajo;
import practica6.personas.persona;
import practica6.automoviles.lujo.*;

public class gerente extends persona{

	int subordinados;
	String nombreArea;

	public gerente(){
		System.out.println("Se ha creado un gerente");
		audi nuevoaudi= new audi();
	}
}