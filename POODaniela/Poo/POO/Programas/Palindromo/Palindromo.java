/*
Clase que checa si una palabra es palindroma
usando pilas y colas
By (¯`·._.·[§RaMmS§]·._.·´¯) 
rammscorp@gmail.com
*/
import java.io.*;
class Cola
{
	char Cola[];
	int Frente;
	int Final;
	int Nulo;
	int MaxCola=20;
	public Cola()
	{
		Cola=new char[MaxCola+1];
		MaxCola=MaxCola-1;
		Nulo=-1;
		Frente=Nulo;
		Final=Nulo;
	}

	
	public void Meter(char Elemento)
	{
		if((Frente==0&&Final==MaxCola)||(Frente==(Final+1)))
		{
			System.out.println("Desbordamiento de memoria");
			return;
		}else
		{
			if(Frente==Nulo)
			{
				Frente=0;
				Final=0;
			}else if(Final==MaxCola)
				Final=0;
			else
				Final+=1;
			Cola[Final]=Elemento;
		}
	}

	public char Sacar()
	{
		char aux;
		if(Frente==Nulo)
		{
			System.out.println("Cola Vacia");
			return 0;
		}else
		{
			aux=Cola[Frente];
			if(Frente==Final)
			{
				Frente=Nulo;
				Final=Nulo;
			}else if(Frente==MaxCola)
				Frente=0;
			else
				Frente+=1;
	return aux;
		}
	}
}

class Pila{
	private static final int TAMPILA=20;
	private int cima;
	private char []listaPila;

	public Pila(){
		cima=-1;
		listaPila= new char[TAMPILA];
	}

	public void insertar(char elemento) throws Exception{
		if (pilaLlena()){
			throw new Exception("Desbordamiento pila");
		}
		cima++;
		listaPila[cima] = elemento;
	}

	public char quitar() throws Exception{
		char aux;
		if (pilaVacia()){
			throw new Exception ("pila vacia, no se puede extraer");
		}
		aux = listaPila[cima];
		cima--;
		return aux;
	}

	public boolean pilaVacia(){
		return cima == -1;
	}

	public boolean pilaLlena(){
		return cima == TAMPILA-1;
	}

}


class Palindromo{
	public static void main(String [] ramms){
		Pila pilaChar;
		Cola colaChar;
		char ch;
		boolean esPal=false;
		String pal;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			pilaChar = new Pila(); //crea pila vacia
			colaChar = new Cola(); //crea Cola Vacia
			System.out.print("Teclea la palabra a verificar si es palindromo:  ");
			System.out.flush();
			pal = entrada.readLine();
			for (int i=0; i<pal.length(); )
			{
				ch=pal.charAt(i++);
				pilaChar.insertar(ch);
				colaChar.Meter(ch);
			}
			//se comprueba si es palindromo
			for(int i=0;i<pal.length();i++)
			{
				if(pilaChar.quitar()==colaChar.Sacar())
				{
					esPal=true;
					break;
				}
				else
				{
					esPal=false;
					break;
				}
			}
						

			
			if (esPal)
				System.out.println("La palabra " + pal + " es un palindromo \n");
			else
				System.out.println("La palabra " + pal + " no es un palindromo \n");
		}
		catch (Exception er) {
			System.err.println("Exception: " + er);
		}
	}
}