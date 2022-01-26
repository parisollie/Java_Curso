import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class HashTable {
    public static void main(String[] args) { 
    	
    	Scanner scan = new Scanner (System.in);
    	
		Hashtable<String, String> TablaLibros = new Hashtable <String, String>(); 
		//Aca se crea la tabla de HashTable con parametros String,String
    	
    	int claveLibros = 1002; //Se usa de esta variable como contador para crear claves de forma continua.
		String clave, titulo, tituloIngresado, claveIngresada;

    	TablaLibros.put("1000", "Harry_Potter");
    	TablaLibros.put("1001", "Moby_Dick");
    	TablaLibros.put("1002", "El_Principito"); //Se agregan 3 libros iniciales a la tabla "TablaLibros"
		
        int opcion;
        do {
        	System.out.println("Bienvenido al menu de la libreria. Que quiere hacer?");
        	System.out.println("-1- Ver Libros");
        	System.out.println("-2- Agregar Libros");
        	System.out.println("-3- Buscar un Libro");
        	System.out.println("-4- Salir");
	    	opcion = scan.nextInt();
	    	switch(opcion)
	    	{
	    	case 1:
	    		Enumeration<String> claves = TablaLibros.keys(); //Variable de enumeracion para los valores llave de la tabla
	    		while(claves.hasMoreElements()) {	//El ciclo continua mientras existan mas llaves de tipo "Clave"
	    			clave = claves.nextElement();	//Se asigna como valor de "clave" el siguiente elemento de la tabla hash.
	    			titulo = TablaLibros.get(clave);	//Se obtiene el valor asignado a la llave de la posicion actual
	    			System.out.println("Clave : " + clave + "\tTitulo : " + titulo);
	    		}
	        	System.out.println();
	    	break;
	    	case 2:
	        	System.out.println("Cual sera el titulo del libro? (En vez de usar espacio vacio use '_') "); 
	        	//Si se usan espacios el programa no funciona correctamente
	        	tituloIngresado = scan.next();
	        	claveLibros++; //Avanza la variable de claveLibros para nunca repetir clave Hash
	        	TablaLibros.put(Integer.toString(claveLibros), tituloIngresado); 
	        	//Se asignan dos valores de tipo "String", uno como la clave automatica y el otro como el titulo del libro ingresado
	        	System.out.println();
	    	break;
	    	case 3:
	        	System.out.println("Ingrese la clave del libro para verificar si se encuentra en el sistema.");
	        	claveIngresada = scan.next(); //Variable de tipo String recibida que es la clave
	    		if(TablaLibros.containsKey(claveIngresada) == true) { 
	    			//Se revisa en toda la tabla Hash si la clave se encuentra dentro. 
		        	System.out.println("El libro si se encuentra en el sistema. Es '" + TablaLibros.get(claveIngresada) + "'.");
		        	//Si la clave se encuentra, se le aclara al usuario y se busca el titulo del libro de la clave asignada.
	    		}
	    		else { //Si no se encuentra libro, se imprime la aclaracion
		        	System.out.println("No hay libro en el sistema con la clave ingresada.");
	    		}
	        	System.out.println();
	    	break;
	    	case 4:
	        	System.out.println("Gracias por usar el programa.");
	    	break;
	    	default:
	        	System.out.println("Valor no valido. Regresando al menu.");
	    	break;
	    	}
        }while(opcion!=4);
		scan.close();
    }
}