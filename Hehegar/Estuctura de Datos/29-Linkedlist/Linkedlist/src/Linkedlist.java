import java.util.LinkedList;

public class Linkedlist {

    // Es algo que ya esta implementado.
    public static void main(String[] args) {

        LinkedList listita = new LinkedList();
        listita.add(10);
        listita.add(14);
        listita.add(14);
        listita.add(153);
        listita.add(145);

        int tamanio = listita.size();
        int i = 0;
        while (i < tamanio) {
            System.out.print("[" + listita.get(i) + "]->");
            i++;
        }
        listita.remove(2);
        listita.add(3, 300);
        i = 0;
        tamanio = listita.size();
        System.out.println();
        while (i < tamanio) {
            System.out.println("[" + listita.get(i) + "]->");
            i++;
        }

    }

}
