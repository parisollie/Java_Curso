
public class TorresHanoi {

    public static void main(String[] args) {
        TorresHanoi objHanoi = new TorresHanoi();
        objHanoi.torresHanoi(3, 1, 2, 3);
        System.out.println("Juego completado");

    }

    // Creando el método recursivo para solucionar las Torres de Hanoi.
    public void torresHanoi(int discos, int torre1, int torre2, int torre3) {
        // Caso Base.
        if (discos == 1) {
            System.out.println("Mover disco de torre " + torre1 + " a torre " + torre3);
        } else {
            // Dominio
            torresHanoi(discos - 1, torre1, torre3, torre2);
            System.out.println("Mover disco de torre " + torre1 + " a torre " + torre3);
            torresHanoi(discos - 1, torre2, torre1, torre3);
        }

    }

}
