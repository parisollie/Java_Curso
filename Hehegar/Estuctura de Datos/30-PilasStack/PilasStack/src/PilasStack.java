import java.util.Stack;

public class PilasStack {

    public static void main(String[] args) {
        Stack pilita = new Stack<>();
        pilita.add(10);
        pilita.add(20);
        pilita.add(30);
        pilita.push(90);

        System.out.println("La cima es: " + pilita.peek());
        System.out.println("Sacando a un elemento de la pila: " + pilita.pop());
        System.out.println("Tamanio de la pila: " + pilita.size());
        System.out.println("La pila esta vacía?: " + pilita.empty());

    }

}
