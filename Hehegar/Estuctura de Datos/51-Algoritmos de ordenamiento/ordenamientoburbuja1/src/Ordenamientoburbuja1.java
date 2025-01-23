import javax.swing.JOptionPane;

public class Ordenamientoburbuja1 {

    public static void main(String[] args) {
        // Creamos una instancia
        AlgortimosOrdenamiento ordenar = new AlgortimosOrdenamiento();

        //
        int vector1[] = { 5, 6, 3, 44, 22, 1 };
        int vector2[] = { 51895, 1114, 2243, 2143, 2231, 1982 };
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

        System.out.println("Arreglo original");
        ordenar.mostrarArreglo(vector3);
        ordenar.shell(vector3);

        /*
         * ordenar.mostrarArreglo(vector2);
         * //el 10 es el numero a encontrar
         * int indice=ordenar.busquedabinaria(vector2, 11);
         * 
         * if(indice!=-1){ // que no lo encontro el -1
         * System.out.println("Elemento 10 encontrado en el indice "+indice);
         * 
         * }else{
         * System.out.println("Elemento 10 no encontrado");
         * }
         */
        /*
         * ordenar.mostrarArreglo(vector2);
         * int indice=ordenar.busquedasecuencial(vector2, 43);//Mi metodo de busqueda
         * secuencial retorna un entero //int indice...
         * if(indice !=-1){ // si es -1 es logico que si lo encontro
         * System.out.println("Elemento 43 encontrado en el indice-"+indice);
         * }else{
         * System.out.println("Elemento 43 no encontrado ");
         * }
         */

        /*
         * mezcla directa
         * System.out.println("Arreglo vector2 Original: ");
         * ordenar.mostrarArreglo(vector1);
         * 
         * System.out.println("\nArreglo original con Mezcla directa: \n");
         * vector1=ordenar.mezclaDirecta(vector1);// En el vector 2 se guarda lo que me
         * devuelva mezcla directa
         * 
         * ordenar.mostrarArreglo(vector1);
         * 
         * 
         */
        /*
         * Mezcla Natural
         * System.out.println("Arreglo vector2 Original: ");
         * ordenar.mostrarArreglo(vector1);
         * System.out.println("Arreglo original con Mezcla Natural");
         * ordenar.mezclaNatural(vector1);
         * ordenar.mostrarArreglo(vector1);
         */

        /*
         * Radix
         * System.out.println("Radix");
         * System.out.println("Arreglo Orginal");
         * ordenar.mostrarArreglo(vector2); //Para que me muestre el vector original
         * ordenar.radix(vector2);
         */
    }
}