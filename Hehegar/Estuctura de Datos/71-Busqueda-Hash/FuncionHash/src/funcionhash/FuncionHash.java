
package funcionhash;

// Con eso se importa Arrays.fill
import java.util.Arrays;
import java.util.Scanner;

public class FuncionHash {

    // Declaramos atributos
    String[] arreglo;
    int tamanio, contador;

    // Creamos nuestro Constructor
    public FuncionHash(int tam) {
        // Inicializamos el tamaño
        tamanio = tam;
        arreglo = new String[tam];
        /*
         * LLenamos el arreglo le enviamos de parámetro nuestro arreglo y lo relleno con
         * -1 ( cuando tiene -1 significa que no tiene nada)
         */
        Arrays.fill(arreglo, "-1");
    }

    /*
     * Creamos un método void que no retorna nada
     * -Recibe de parámetros : un parámetro de tipo string llámado cadenaArreglo que
     * así lo llamamos
     * -Recibe otro párametro de tipo String llamado(arreglo)
     */
    public void funcionHashs(String[] cadenaArreglo, String[] arreglo) {

        int i;
        // Para buscar la clave
        for (i = 0; i < cadenaArreglo.length; i++) {
            /*
             * Se le asigna (al nuevo elemento) lo que tenga cadenaArreglo[i] en su
             * posicion i,es para buscar su clave.
             */
            String elemento = cadenaArreglo[i];

            /*
             * Hacemos un cast con Integer al elemento y le sacamos el módulo a
             * este (elemento), Si el tamaño es 8 el modulo séra 7
             */
            int indiceArreglo = Integer.parseInt(elemento) % 7;

            // El valor lo tenemos en el elemento
            System.out.println("\nEl índice es : " + indiceArreglo + " ,para el elemento : " + elemento);

            /*
             * Tratando las colisiones
             * Cuando ocurren las coliciones hacemos lo siguiente
             * ( cuando tiene -1 significa que no tiene nada)
             */
            while (arreglo[indiceArreglo] != "-1") {

                indiceArreglo++;
                System.out.println("-Ha ocurrido una colision en el índice: " + (indiceArreglo - 1)
                        + " cámbialo al índice " + indiceArreglo);
                // Para que me lo cambie al ídice siguiente,para volver a sacar el módulo
                indiceArreglo %= tamanio;
            }
            // Después que cálculo su índice ,exactamente en ese lugar ponme en el elemento.
            arreglo[indiceArreglo] = elemento;
        }
    }

    // Método para mostrar la tabla ,es solo para el esqueleto de la tabla
    public void mostrar() {

        int incremento = 0, i, j;
        System.out.println();
        for (i = 0; i < 1; i++) {
            incremento += 8;
            for (j = 0; j < 57; j++) {
                System.out.print("-");
            }
            System.out.println();
            for (j = incremento - 8; j < incremento; j++) {
                System.out.format("| %3s " + " ", j);
            }
            System.out.println("|");
            for (int n = 0; n < 57; n++) {
                System.out.print("-");
            }
            System.out.println();
            for (j = incremento - 8; j < incremento; j++) {
                if (arreglo[j].equals("-1")) {
                    System.out.print("|      ");
                } else {
                    System.out.print(String.format("| %3s " + " ", arreglo[j]));
                }
            }
            System.out.println("|");
            for (j = 0; j < 57; j++) {
                System.out.print("-");
            } // for mayor
            System.out.println();
        }
    }

    /*
     * Método para buscar la clave
     * Retorna un string y recibe de parámetro al elemento que quiero buscar
     * y me retorna la clave
     */
    public String buscarclave(String elemento) {

        int indiceArreglo = Integer.parseInt(elemento) % 7;
        int cont = 0;

        // Si es -1 significa que hay elementos que buscar
        while (!"-1".equals(arreglo[indiceArreglo])) {

            // Si arreglo en el indice arreglo al elemento que estoy buscando
            if (arreglo[indiceArreglo] == null ? elemento == null : arreglo[indiceArreglo].equals(elemento)) {

                // Quiere decir que ya lo encontré
                System.out.println("\n El elemento : " + elemento + " ,fue encontrado en el índice: " + indiceArreglo);
                System.out.println("\n");
                // Le Retornamos el string el elemento en el cual fue encontrado.
                return arreglo[indiceArreglo];
            }
            // Cuando no lo encuentra
            indiceArreglo++;
            indiceArreglo %= tamanio;
            // Para que vaya recorriendo toda la tabla
            cont++;
            // Para que no se cicle y o se vuelva infinito
            if (cont > 7) {
                break;
            }
        }
        // Returnamos un null para decirle al programa que esa clave no fue encontrada
        return null;

    }

    public static void main(String[] args) {

        /*
         * Con esto creamos a nuestro objeto y lo llamamos hash
         * 8 es el tamaño que le vamos a enviar
         */
        FuncionHash hash = new FuncionHash(8);

        /*
         * Para arreglo estatico
         * String[] elementos ={"20","33","21","10","12","14","56","100"};
         * hash.funcionHashs(arreglo, hash.arreglo);
         * hash.mostrar();
         * System.out.
         * println("Tus elementos a insertar son:20-33-21-10-12-10-12-14-56-100 \n");
         * String buscado = hash.buscarclave("33");
         * if (buscado == null) {
         * System.out.println("El Elemento no se encuentra en la tabla\n");
         * }
         * 
         */
        Scanner entrada = new Scanner(System.in);
        // Creamos un arreglo de 10 elementos int
        String arreglo[] = new String[8];
        System.out.println("\t.:Funcion Hash:.\t\n");
        System.out.println("Digite los números en el arreglo,serán 8: ");

        for (int i = 0; i < 8; i++) {
            System.out.print((i + 1) + ". Digite un número: ");
            arreglo[i] = entrada.next();
        }

        /*
         * hash.funcionHashs es nuestra funcion encargada de encontrar su índice
         * adecuado, le enviamos de parametros elementos que esta en la pos 82 y el
         * (arreglo) de nuestro constructor
         */
        hash.funcionHashs(arreglo, hash.arreglo);
        hash.mostrar();

        System.out.print("\n Digite el número a buscar en el arreglo: ");
        String nummer = entrada.next();// Para guardarlo

        String buscado = hash.buscarclave(nummer);

        if (buscado == null) {
            System.out.println("El Elemento no se encuentra en la tabla\n");
        }
    }
}
