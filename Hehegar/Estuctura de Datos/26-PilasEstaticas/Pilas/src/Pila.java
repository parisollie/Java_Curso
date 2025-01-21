
public class Pila {
   int[] vectorPila;
   int cima;

   //Creamos el constructor.
   public Pila(int tamanio) {
      vectorPila = new int[tamanio];
      cima = -1;
   }
   //Método push
   public void empujar(int dato) {
       //Para que nos inserte la posicion 0
      cima++;
      //Le pongo un objeto en la cima
      vectorPila[cima] = dato;
   }
   //Método para sacar
   public int sacar() {
      int fuera = vectorPila[cima];
      cima--;
      return fuera;
   }
   //Método para saber si la pila esta vacía.
   public boolean estaVacia() {
       //retorna true
      return cima == -1;
   }
   //Método para saber si la pila esta llena
   public boolean estaLLena() {
      return vectorPila.length - 1 == cima;
   }
   //Método para saber la cima de la pila.
   public int cimaPila() {
      return vectorPila[cima];
   }
    //Método para saber el tamaño de la pila
   public int tamanioPila() {
      return vectorPila.length;
   }
}
