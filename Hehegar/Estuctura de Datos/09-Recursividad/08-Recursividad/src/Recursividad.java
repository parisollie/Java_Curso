
public class Recursividad {

    public static void main(String[] args) {
        // Hago mi método.
        Recursividad objRec = new Recursividad();

        objRec.bajarEscalera(20);

    }

    // Creando un método para bajar una escalera de manera recursivas.
    public void bajarEscalera(int escalones) {
        if (escalones == 0) {
            // Caso base,respuesta explicita.
            System.out.println("Has terminado de bajar la escalaera");
        } else {
            // Dominio, división del problema original(problema - 1)
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("Bajando Escalon " + escalones);
            // Haciendo uso de la Recursividad
            bajarEscalera(escalones - 1);

        }

    }
}
