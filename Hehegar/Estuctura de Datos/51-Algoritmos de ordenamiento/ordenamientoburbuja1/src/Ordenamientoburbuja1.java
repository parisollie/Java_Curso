import javax.swing.JOptionPane;

public class Ordenamientoburbuja1 {

    public static void main(String[] args) {
        // Creamos una instancia
        AlgortimosOrdenamiento ordenar = new AlgortimosOrdenamiento();

        //
        int vector1[] = { 5, 6, 3, 44, 22, 1 };
        int vector2[] = { 55, 4, 43, 2, 10, 4567, 638, 3, 0, -5, -9 };
        int vector3[] = { 5, 2, 1, 8, 3, 9, 7 };

        // ------------------------- Método Burbuja -----------------------------

        /*
         * System.out.println("\nArreglo Orginal");
         * ordenar.mostrarArreglo(vector1);
         * 
         * System.out.println("\nArreglo ordenado con Burbuja 1");
         * ordenar.burbuja1(vector1);
         * ordenar.mostrarArreglo(vector1);
         * 
         * System.out.println("\nArreglo Orginal");
         * ordenar.mostrarArreglo(vector2);
         * 
         * System.out.println("\nArreglo ordenado con Burbuja 2");
         * ordenar.burbuja2(vector2);
         * ordenar.mostrarArreglo(vector2);
         */

        // ------------------------Método Radix---------------------------------

        /*
         * Radix
         * System.out.print("Arreglo Orginal: ");
         * // Para que me muestre el vector original
         * ordenar.mostrarArreglo(vector2);
         * // Ordena el vector con el mótodo Radix
         * ordenar.radix(vector2);
         */

        // ------------------------Método Quick---------------------------------
        // System.out.print("Arreglo Orginal: ");
        // ordenar.mostrarArreglo(vector3);
        // System.out.println("Arreglo ordenado con quick");
        // ordenar.quick(vector3, 0, vector3.length - 1);
        // ------------------------Método Inserción.----------------------------
        // int tam;
        // tam = Integer.parseInt(JOptionPane.showInputDialog(null,
        // "Ingresa el tamaño del arreglo;"));
        // int vectorcito[] = new int[tam];
        // for (int i = 0; i < tam; i++) {
        // vectorcito[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
        // "Ingresa el elemento del índice " + i));
        // ordenar.insercion(vectorcito, i + 1);
        // }

        // ------------------------Método shell.----------------------------

        // System.out.println("Arreglo vector 1 original");
        // ordenar.mostrarArreglo(vector1);
        // ordenar.shell(vector3);

        // ------------------------Método inserción.----------------------------

        // System.out.println("Arreglo vector 1 original");
        // ordenar.mostrarArreglo(vector1);

        // System.out.println("Arreglo vector 3 original");
        // ordenar.mostrarArreglo(vector3);

        // ordenar.burbuja1(vector1);
        // ordenar.burbuja1(vector3);
        // ordenar.intercalacion(vector1, vector3);

        // ------------------------Mézcla directa.----------------------------

        // // mezcla directa
        // System.out.println("Arreglo vector1 Original: ");
        // ordenar.mostrarArreglo(vector2);

        // System.out.println("Arreglo original con Mezcla directa: ");
        // // En el vector 2 se almacena y le digo que me lo guarde en vector2
        // vector2 = ordenar.mezclaDirecta(vector2);
        // // devuelva mezcla directa
        // ordenar.mostrarArreglo(vector2);

        // ------------------------Mézcla Natural.----------------------------

        // Mezcla Natural
        // System.out.println("Arreglo vector2 Original: ");
        // ordenar.mostrarArreglo(vector2);
        // System.out.println("Arreglo original con Mezcla Natural");
        // ordenar.mezclaNatural(vector2);
        // ordenar.mostrarArreglo(vector2);

        // ---------------------Búsqueda secuencual.----------------------------
        // ordenar.mostrarArreglo(vector2);
        // int indice = ordenar.busquedasecuencial(vector2, -9);
        // if (indice != -1) {
        // System.out.println("Elemento encontrado en el indice : " + indice);
        // } else {
        // System.out.println("Elemento no encontradp");
        // }

        // ---------------------Búsqueda Binaria.----------------------------

        ordenar.mostrarArreglo(vector2);
        ordenar.mezclaNatural(vector2);
        ordenar.mostrarArreglo(vector2);
        // el 10 es el numero a encontrar
        int indice = ordenar.busquedabinaria(vector2, -9);

        if (indice != -1) { // que no lo encontro el -1
            System.out.println("Elemento encontrado en el indice: " + indice);

        } else {
            System.out.println("Elemento no encontrado");
        }

    }
}