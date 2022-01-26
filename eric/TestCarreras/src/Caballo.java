/*
Eric Felix Flores
*/
//Aqui tenemos a la clase caballo.
public class Caballo {
  //Los atributos de nuestro  caballo.  
  String nombre;
  int metrosRecorridos;
  //Aquí estamos recibiendo el nombre de nuestro caballo.
  public Caballo(String n){
  	nombre = n;
  }
  //Método carrera.
  public void carrera() {
    metrosRecorridos = 0;
    /*
    Llamamos al método caballo , el cual asignará el nombre del caballo que 
    estamos dando "Sylver, Pinto y Tornado" y este asignará los metros que 
    recorren desde 0 hasta 50 y no los mostrará en pantalla.
    */
    while (true) {
      System.out.println("Caballo " + nombre + " -> " + metrosRecorridos +
              " metros");
      if ( metrosRecorridos++ == 50 ) {
		break;
      }
    }
  }
}
