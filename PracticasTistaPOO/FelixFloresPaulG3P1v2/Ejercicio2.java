public class Ejercicio2{
	public static void main(String args[]){
		System.out.println("Hola que tal");
		Manana hola1 = new Manana();
		hola1.Saludo();
		Noche hola2 = new Noche();
		hola2.Saludo();
	}

}

class Manana{
	public void Saludo(){
		System.out.println("Buenos dias");
	}
}

class Noche{
	public void Saludo(){
		System.out.println("Buenas noches");
	}

}