import java.util.Queue;
import java.util.LinkedList;

public class ColasQueue {

    public static void main(String[] args) {

        Queue<Integer> colita = new LinkedList<Integer>();

        colita.add(10);
        colita.add(20);
        colita.add(30);
        colita.add(40);
        colita.add(50);

        System.out.println("El inicio de la cola es: " + colita.peek());

        int tamanio = colita.size();

        System.out.println("Vaciando la cola");
        colita.clear();

        while (!colita.isEmpty()) {
            System.out.println("Despachando al elemento: " + colita.remove());
        }

    }

}
